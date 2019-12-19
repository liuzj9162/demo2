package com.vcic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vcic.bean.VcicUser;
import com.vcic.service.VcicUserService;

@Controller
public class VcicAccountController {

	@Autowired
	private  VcicUserService  accountService;
	@RequestMapping("/toVcicAccount.do")
    public  String  toAccountList(){
    	return  "account_list";
    }
	
	@RequestMapping("/accountList.do")
	@ResponseBody
    public  List<VcicUser>  accountList(){
    	return  accountService.listAll();
    }
	
	@RequestMapping(value="/account/{id}",method=RequestMethod.POST)
	@ResponseBody
    public  VcicUser  addAccount3(VcicUser account,
    	@PathVariable("id") int id){
		System.out.println("id="+id);
		System.out.println("rest  post ·½·¨");
		return   accountService.createAccountView(account); 
    }
}
