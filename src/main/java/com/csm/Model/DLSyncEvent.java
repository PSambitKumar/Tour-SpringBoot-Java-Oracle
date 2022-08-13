package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DLSyncEvent {
	@Id
	@Column(name = "syncEventId", nullable = false)
	private Long id;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "modifiedTime")
	private Long modifiedTime;

	@Column(name = "event", length = 75)
	private String event;

	@Column(name = "type_", length = 75)
	private String type;

	@Column(name = "typePK")
	private Long typePK;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Long modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getTypePK() {
		return typePK;
	}

	public void setTypePK(Long typePK) {
		this.typePK = typePK;
	}

}