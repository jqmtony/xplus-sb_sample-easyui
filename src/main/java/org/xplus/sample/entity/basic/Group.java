package org.xplus.sample.entity.basic;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 用户组<br>
 * 
 * @author qiming.kong
 */
@Entity
@Table(name = "T_SYS_GROUP")
public class Group implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ......
	private String id;
	private String no;
	private String name;
	private String enName;
	private String remark;

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

	@Column(name = "REMARK", length = 1000)
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
