package org.xplus.sample.entity.basic;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 功能菜单类型<br>
 * 
 * @author qiming.kong
 */
@Entity
@Table(name = "T_SYS_MENU_TYPE")
public class MenuType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ......
	private int id;
	private String no;
	private String name;
	private String enName;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public MenuType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MenuType(int id, String no, String name, String enName) {
		super();
		this.id = id;
		this.no = no;
		this.name = name;
		this.enName = enName;
	}

	@Override
	public String toString() {
		return "MenuType [id=" + id + ", no=" + no + ", name=" + name + ", enName=" + enName + "]";
	}

}
