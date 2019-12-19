package com.vcic.dao;

import java.util.List;

import com.vcic.bean.VcicUser;

public interface VcicUserDao {
	List<VcicUser>   getVcicUserList();
	/** ���Ա����Ϣ */
    int   insertUser(VcicUser vcicUser);
    VcicUser insertUserView(VcicUser vcicUser);
    
    /** ����staffCode  ��ѯԱ��  */
    VcicUser   getVcicUserBystaffCode(int id);
    /** ����userid  ɾ��Ա��  */
    int deleteVcicUserById(int id);
    /** ���� Ա����Ϣ  */
    int updateVcicUserById(VcicUser  account);
}
