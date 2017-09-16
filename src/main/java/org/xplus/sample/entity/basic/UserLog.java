package org.xplus.sample.entity.basic;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 用户操作记录表<br>
 * 
 * @author qiming.kong [C]
 *
 */
@Entity
@Table(name = "T_SYS_USER_LOG")
public class UserLog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ......
	private String id;//
	private String eventUserId;//
	private String eventType;//
	private String eventContent;//
	private String eventIP;//
	private Date eventDateTime;//

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

	@Column(name = "EVENT_USER_ID", length = 200)
	public String getEventUserId() {
		return eventUserId;
	}

	public void setEventUserId(String eventUserId) {
		this.eventUserId = eventUserId;
	}

	@Column(name = "EVENT_TYPE", length = 200)
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	@Column(name = "EVENT_CONTENT", length = 200)
	public String getEventContent() {
		return eventContent;
	}

	public void setEventContent(String eventContent) {
		this.eventContent = eventContent;
	}

	@Column(name = "EVENT_IP", length = 200)
	public String getEventIP() {
		return eventIP;
	}

	public void setEventIP(String eventIP) {
		this.eventIP = eventIP;
	}

	@Column(name = "EVENT_DATETIME", updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@CreatedDate
	public Date getEventDateTime() {
		return eventDateTime;
	}

	public void setEventDateTime(Date eventDateTime) {
		this.eventDateTime = eventDateTime;
	}

	public UserLog() {
		super();

	}

	public UserLog(String id) {
		super();
		this.id = id;
	}

}
