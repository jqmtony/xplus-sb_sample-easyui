package org.xplus.sample.entity.basic;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @author qiming.kong
 */
@Entity
@Table(name = "T_SYS_USER")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ......
	private String id;//
	private String no;//
	private String name;//
	private String enName;//
	private String username;//
	private String password;//
	// ......

	private Sex sex;//
	private Date birthday;//
	private String email;//
	private String telephone;//
	private String mobile;//
	// ......
	private UserType userType;//
	private UserStatus userStatus;//
	private boolean actived = true;//
	// ......
	private Set<Role> roles = new HashSet<Role>();
	private Set<Dept> depts = new HashSet<Dept>();
	private Set<Group> groups = new HashSet<Group>();

	@Id
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@GeneratedValue(generator = "system-uuid")
	@Column(name = "ID", unique = true, nullable = false, length = 32)
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "USERNAME", length = 128)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "PASSWORD", length = 128)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "USER_TYPE_ID", nullable = true)
	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	@Column(name = "EN_NAME")
	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "SEX_ID", nullable = true)
	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "BIRTHDAY")
	// @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "TELEPHONE")
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "MOBILE")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "USER_STATUS_ID", nullable = true)
	public UserStatus getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}

	@Column(name = "ACTIVED")
	public boolean isActived() {
		return actived;
	}

	public void setActived(boolean actived) {
		this.actived = actived;
	}

	@ManyToMany(cascade = { CascadeType.REFRESH, CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.LAZY)
	@JoinTable(name = "T_SYS_USER_ROLE_LIST", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "ROLE_ID") })
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@ManyToMany(cascade = { CascadeType.REFRESH, CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.LAZY)
	@JoinTable(name = "T_SYS_USER_DEPT_LIST", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "DEPT_ID") })
	public Set<Dept> getDepts() {
		return depts;
	}

	public void setDepts(Set<Dept> depts) {
		this.depts = depts;
	}

	@ManyToMany(cascade = { CascadeType.REFRESH, CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.LAZY)
	@JoinTable(name = "T_SYS_USER_GROUP_LIST", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "GROUP_ID") })
	public Set<Group> getGroups() {
		return groups;
	}

	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String id) {
		super();
		this.id = id;
		// TODO Auto-generated constructor stub
	}
	
	

}
