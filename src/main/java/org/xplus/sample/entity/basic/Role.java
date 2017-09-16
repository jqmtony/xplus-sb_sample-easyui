package org.xplus.sample.entity.basic;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 角色<br>
 * 
 * @author qiming.kong
 */
@Entity
@Table(name = "T_SYS_ROLE")
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ......
	private String id;
	private String no;
	private String name;
	private String enName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	@Column(name = "NO")
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

}
