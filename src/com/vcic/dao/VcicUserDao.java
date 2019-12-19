package com.vcic.dao;

import java.util.List;

import com.vcic.bean.VcicUser;

public interface VcicUserDao {
	List<VcicUser>   getVcicUserList();
	/** 添加员工信息 */
    int   insertUser(VcicUser vcicUser);
    VcicUser insertUserView(VcicUser vcicUser);
    
    /** 根据staffCode  查询员工  */
    VcicUser   getVcicUserBystaffCode(int id);
    /** 根据userid  删除员工  */
    int deleteVcicUserById(int id);
    /** 更新 员工信息  */
    int updateVcicUserById(VcicUser  account);
}
