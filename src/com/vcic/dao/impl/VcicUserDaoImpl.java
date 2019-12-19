package com.vcic.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.vcic.bean.VcicUser;
import com.vcic.dao.VcicUserDao;
import com.vcic.mapper.VcicUserRowMapper;

@Repository("vcicUser")
public class VcicUserDaoImpl implements VcicUserDao {
	
	@Autowired
	private   JdbcTemplate  jdbcTemplate;
	
	@Override
	public List<VcicUser> getVcicUserList() {
		String sql = "select * from VCICUSERINFO";
		return jdbcTemplate.query(sql, new VcicUserRowMapper());
	}

	@Override
	public int insertUser(VcicUser vcicUser) {
		String  sql = "insert into VCICUSERINFO values(?,?,?,?,?,?,?)";
		//System.out.println(UUID.randomUUID().toString());
		try {
			return jdbcTemplate.update(sql,vcicUser.getUserId(),vcicUser.getStaffCode(),
					vcicUser.getStaffName(),vcicUser.getAge(),vcicUser.getGender(),vcicUser.getDepartment(),new Date());
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public VcicUser insertUserView(final VcicUser vcicUser) {
		try {
			final String  sql = "insert into  VCICUSERINFO "
					+ "values(seq_vcic_user_info_userid.nextval,"
					+ "?,?,?,?,?,?)";
			KeyHolder key=new GeneratedKeyHolder();

			jdbcTemplate.update(new PreparedStatementCreator() {
				
				@Override
				public PreparedStatement createPreparedStatement(Connection conn) throws SQLException 
				 {
					PreparedStatement preState=conn.prepareStatement(sql,
						new String[]{"userId"});
					preState.setInt(1,vcicUser.getStaffCode());
					preState.setString(2,vcicUser.getStaffName());
			        preState.setInt(3, vcicUser.getAge());
			        preState.setString(4, vcicUser.getGender());
			        preState.setString(5, vcicUser.getDepartment());
			        preState.setTimestamp(6,new Timestamp(System.currentTimeMillis()));
					return preState;
				
				}
			},key);
			vcicUser.setUserId(key.getKey().intValue());
			System.out.println("account:"+vcicUser);
			return vcicUser;
		} catch (InvalidDataAccessApiUsageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public VcicUser getVcicUserBystaffCode(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteVcicUserById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateVcicUserById(VcicUser account) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
}
