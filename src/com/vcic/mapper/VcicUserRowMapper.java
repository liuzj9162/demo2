package com.vcic.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.vcic.bean.VcicUser;

public class VcicUserRowMapper implements RowMapper<VcicUser> {

	@Override
	public VcicUser mapRow(ResultSet rs, int arg1) throws SQLException {
		return  new  VcicUser(rs.getInt("userId"), rs.getInt("staffCode"),
				rs.getString("staffName"), rs.getInt("age"), rs.getString("gender"),
				rs.getString("department"), rs.getTimestamp("onBordingDate"));
	}

}
