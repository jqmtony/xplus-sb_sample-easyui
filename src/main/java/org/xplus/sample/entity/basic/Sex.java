package org.xplus.sample.entity.basic;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Integer id;
	private String no;
	private String name;
	private String enName;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
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

	@Column(name = "NAME", length = 32)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "EN_NAME", length = 32)
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

	public Sex(Integer id, String no, String name, String enName) {
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
