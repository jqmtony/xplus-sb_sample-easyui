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
 * 部门<br>
 * 
 * @author qiming.kong
 */
@Entity
@Table(name = "T_SYS_DEPT")
public class Dept implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ......
	private String id;
	private String no;
	private String name;
	private String enName;
	private String remark;// 备注
	// ......
	private Dept parent;
	private Set<Dept> childrens = new HashSet<>();

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

	@Column(name = "REMARK", length = 1000)
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "PARENT_ID")
	public Dept getParent() {
		return parent;
	}

	public void setParent(Dept parent) {
		this.parent = parent;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "parent")
	public Set<Dept> getChildrens() {
		return childrens;
	}

	public void setChildrens(Set<Dept> childrens) {
		this.childrens = childrens;
	}

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(String id, String no, String name, String enName, Dept parent, Set<Dept> childrens) {
		super();
		this.id = id;
		this.no = no;
		this.name = name;
		this.enName = enName;
		this.parent = parent;
		this.childrens = childrens;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", no=" + no + ", name=" + name + ", enName=" + enName + ", parent=" + parent
				+ ", childrens=" + childrens + "]";
	}

}
