package org.xplus.sample.entity.basic;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户状态<br>
 * 
 * @author qiming.kong
 *
 */
@Entity
@Table(name = "T_SYS_USER_STATUS")
public class UserStatus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ......
	private Integer id;
	private String no;
	private String name;
	private String enName;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "NO", length = 32)
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "EN_NAME")
	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public UserStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserStatus(Integer id, String no, String name, String enName) {
		super();
		this.id = id;
		this.no = no;
		this.name = name;
		this.enName = enName;
	}

	@Override
	public String toString() {
		return "UserStatus [id=" + id + ", no=" + no + ", name=" + name + ", enName=" + enName + "]";
	}

}
