package com.it.entities;

import java.util.Date;

public class User {
	private Integer id;
	private String userName;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private Integer age;
	private Date birthday;
	private String sex;
	private String mobile;
	private String email;
	private String note;
	private Address address;
	public Address getAddress() {
		return address;
	}
	public User(String userName, Integer age) {
		super();
		this.userName = userName;
		this.age = age;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", age=" + age
				+ ", birthday=" + birthday + ", sex=" + sex + ", mobile="
				+ mobile + ", email=" + email + ", note=" + note + ", address="
				+ address + "]";
	}
	
}
