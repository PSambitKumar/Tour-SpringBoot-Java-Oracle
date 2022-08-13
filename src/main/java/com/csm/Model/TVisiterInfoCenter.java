package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_visiter_info_center")
public class TVisiterInfoCenter {
	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "vchLocation", length = 120)
	private String vchLocation;

	@Column(name = "vchAddress", length = 500)
	private String vchAddress;

	@Column(name = "vchContact", length = 256)
	private String vchContact;

	@Column(name = "vchOfficeLoc", length = 150)
	private String vchOfficeLoc;

	@Column(name = "vchOfficerName", length = 300)
	private String vchOfficerName;

	@Column(name = "vchOfficerDesignation", length = 250)
	private String vchOfficerDesignation;

	@Column(name = "vchOfficerEmail", length = 125)
	private String vchOfficerEmail;

	@Column(name = "vchOfficerMobileNo", length = 25)
	private String vchOfficerMobileNo;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchLocation() {
		return vchLocation;
	}

	public void setVchLocation(String vchLocation) {
		this.vchLocation = vchLocation;
	}

	public String getVchAddress() {
		return vchAddress;
	}

	public void setVchAddress(String vchAddress) {
		this.vchAddress = vchAddress;
	}

	public String getVchContact() {
		return vchContact;
	}

	public void setVchContact(String vchContact) {
		this.vchContact = vchContact;
	}

	public String getVchOfficeLoc() {
		return vchOfficeLoc;
	}

	public void setVchOfficeLoc(String vchOfficeLoc) {
		this.vchOfficeLoc = vchOfficeLoc;
	}

	public String getVchOfficerName() {
		return vchOfficerName;
	}

	public void setVchOfficerName(String vchOfficerName) {
		this.vchOfficerName = vchOfficerName;
	}

	public String getVchOfficerDesignation() {
		return vchOfficerDesignation;
	}

	public void setVchOfficerDesignation(String vchOfficerDesignation) {
		this.vchOfficerDesignation = vchOfficerDesignation;
	}

	public String getVchOfficerEmail() {
		return vchOfficerEmail;
	}

	public void setVchOfficerEmail(String vchOfficerEmail) {
		this.vchOfficerEmail = vchOfficerEmail;
	}

	public String getVchOfficerMobileNo() {
		return vchOfficerMobileNo;
	}

	public void setVchOfficerMobileNo(String vchOfficerMobileNo) {
		this.vchOfficerMobileNo = vchOfficerMobileNo;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}