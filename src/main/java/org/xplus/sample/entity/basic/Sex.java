package org.xplus.sample.entity.basic;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 性别<br>
 * 
 * @author qiming.kong
 */
@Entity
@Table(name = "T_SYS_SEX")
public class Sex implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// .....
	private long id;
	private String no;
	private String name;
	private String enName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public Sex() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sex(long id, String no, String name, String enName) {
		super();
		this.id = id;
		this.no = no;
		this.name = name;
		this.enName = enName;
	}

	@Override
	public String toString() {
		return "Sex [id=" + id + ", no=" + no + ", name=" + name + ", enName=" + enName + "]";
	}

}
