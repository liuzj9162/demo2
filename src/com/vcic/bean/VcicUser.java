package com.vcic.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class VcicUser implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int userId;
	private int staffCode;
	private String staffName;
	private int age;
	private String gender;
	private String department;
	private Timestamp onBordingDate;
	
	public VcicUser() {
		super();
	}

	public VcicUser(int userId, int staffCode, String staffName, int age, String gender, String department,
			Timestamp onBordingDate) {
		super();
		this.userId = userId;
		this.staffCode = staffCode;
		this.staffName = staffName;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.onBordingDate = onBordingDate;
	}
	
	

	public VcicUser(int userId, int staffCode, String staffName, int age, String gender, String department) {
		super();
		this.userId = userId;
		this.staffCode = staffCode;
		this.staffName = staffName;
		this.age = age;
		this.gender = gender;
		this.department = department;
	}

	
	public VcicUser(int staffCode, String staffName, int age, String gender, String department) {
		super();
		this.staffCode = staffCode;
		this.staffName = staffName;
		this.age = age;
		this.gender = gender;
		this.department = department;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(int staffCode) {
		this.staffCode = staffCode;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Timestamp getOnBordingDate() {
		return onBordingDate;
	}

	public void setOnBordingDate(Timestamp onBordingDate) {
		this.onBordingDate = onBordingDate;
	}

	@Override
	public String toString() {
		return "VcicUser [userId=" + userId + ", staffCode=" + staffCode + ", staffName=" + staffName + ", age=" + age
				+ ", gender=" + gender + ", department=" + department + ", onBordingDate=" + onBordingDate + "]";
	}

	
	
	
}
