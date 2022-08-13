package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnnouncementsDelivery {
	@Id
	@Column(name = "deliveryId", nullable = false)
	private Long id;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "userId")
	private Long userId;

	@Column(name = "type_", length = 75)
	private String type;

	@Column(name = "email")
	private Byte email;

	@Column(name = "sms")
	private Byte sms;

	@Column(name = "website")
	private Byte website;

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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Byte getEmail() {
		return email;
	}

	public void setEmail(Byte email) {
		this.email = email;
	}

	public Byte getSms() {
		return sms;
	}

	public void setSms(Byte sms) {
		this.sms = sms;
	}

	public Byte getWebsite() {
		return website;
	}

	public void setWebsite(Byte website) {
		this.website = website;
	}

}