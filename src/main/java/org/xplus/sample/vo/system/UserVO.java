package org.xplus.sample.vo.system;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.xplus.sample.entity.system.User;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String no;
	private String username;
	private String password;
	// ......
	private String name;
	private String enName;
	private Date birthday;
	private String email;
	private String telephone;
	private String mobile;
	// ......
	private String sex;
	private String sexNo;
	private String sexName;
	// ......
	private String userType;
	private String userTypeNo;
	private String userTypeName;
	// ......
	private String userStatus;
	private String userStatusNo;
	private String userStatusName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSexNo() {
		return sexNo;
	}

	public void setSexNo(String sexNo) {
		this.sexNo = sexNo;
	}

	public String getSexName() {
		return sexName;
	}

	public void setSexName(String sexName) {
		this.sexName = sexName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserTypeNo() {
		return userTypeNo;
	}

	public void setUserTypeNo(String userTypeNo) {
		this.userTypeNo = userTypeNo;
	}

	public String getUserTypeName() {
		return userTypeName;
	}

	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserStatusNo() {
		return userStatusNo;
	}

	public void setUserStatusNo(String userStatusNo) {
		this.userStatusNo = userStatusNo;
	}

	public String getUserStatusName() {
		return userStatusName;
	}

	public void setUserStatusName(String userStatusName) {
		this.userStatusName = userStatusName;
	}

	public UserVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserVO(User user) {
		super();
		this.id = user.getId();
		this.no = user.getNo();
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.name = user.getName();
		this.enName = user.getEnName();
		this.birthday = user.getBirthday();
		this.email = user.getEmail();
		this.telephone = user.getTelephone();
		this.mobile = user.getMobile();
		this.sex = String.valueOf(user.getSex().getId());
		this.sexNo = user.getSex().getNo();
		this.sexName = user.getSex().getName();
		this.userType = String.valueOf(user.getUserType().getId());
		this.userTypeNo = user.getUserType().getNo();
		this.userTypeName = user.getUserType().getName();
		this.userStatus = String.valueOf(user.getUserStatus().getId());
		this.userStatusNo = user.getUserStatus().getNo();
		this.userStatusName = user.getUserStatus().getName();
	}

	public UserVO(String id, String no, String username, String password, String name, String enName, Date birthday,
			String email, String telephone, String mobile, String sex, String sexNo, String sexName, String userType,
			String userTypeNo, String userTypeName, String userStatus, String userStatusNo, String userStatusName) {
		super();
		this.id = id;
		this.no = no;
		this.username = username;
		this.password = password;
		this.name = name;
		this.enName = enName;
		this.birthday = birthday;
		this.email = email;
		this.telephone = telephone;
		this.mobile = mobile;
		this.sex = sex;
		this.sexNo = sexNo;
		this.sexName = sexName;
		this.userType = userType;
		this.userTypeNo = userTypeNo;
		this.userTypeName = userTypeName;
		this.userStatus = userStatus;
		this.userStatusNo = userStatusNo;
		this.userStatusName = userStatusName;
	}

}
