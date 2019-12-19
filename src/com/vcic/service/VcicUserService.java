package com.vcic.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.vcic.bean.VcicUser;
import com.vcic.dao.VcicUserDao;

@Service("userService")
public class VcicUserService {

	@Resource
	VcicUserDao vcicUserDao;
	
	public  List<VcicUser>  listAll(){
		return   vcicUserDao.getVcicUserList();
	}
	
	public  boolean  createAccount(VcicUser vcicUser){
		return  vcicUserDao.insertUser(vcicUser) ==1 ? true : false;
	}
	
	public  VcicUser  createAccountView(VcicUser vcicUser){
		return  vcicUserDao.insertUserView(vcicUser);
	}
}
