package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_contact_us")
public class TContactUs {
	@Id
	@Column(name = "intContactId", nullable = false)
	private Integer id;

	@Column(name = "vchAddress", length = 512)
	private String vchAddress;

	@Column(name = "vchEmail", length = 50)
	private String vchEmail;

	@Column(name = "vchPhone", length = 50)
	private String vchPhone;

	@Column(name = "vchFax", length = 50)
	private String vchFax;

	@Lob
	@Column(name = "vchMapAddress")
	private String vchMapAddress;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy", columnDefinition = "INT UNSIGNED")
	private Long intCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intUpdatedBy", columnDefinition = "INT UNSIGNED")
	private Long intUpdatedBy;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "tinPublishStatus")
	private Byte tinPublishStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchAddress() {
		return vchAddress;
	}

	public void setVchAddress(String vchAddress) {
		this.vchAddress = vchAddress;
	}

	public String getVchEmail() {
		return vchEmail;
	}

	public void setVchEmail(String vchEmail) {
		this.vchEmail = vchEmail;
	}

	public String getVchPhone() {
		return vchPhone;
	}

	public void setVchPhone(String vchPhone) {
		this.vchPhone = vchPhone;
	}

	public String getVchFax() {
		return vchFax;
	}

	public void setVchFax(String vchFax) {
		this.vchFax = vchFax;
	}

	public String getVchMapAddress() {
		return vchMapAddress;
	}

	public void setVchMapAddress(String vchMapAddress) {
		this.vchMapAddress = vchMapAddress;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Long getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Long intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public Long getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Long intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Byte getTinPublishStatus() {
		return tinPublishStatus;
	}

	public void setTinPublishStatus(Byte tinPublishStatus) {
		this.tinPublishStatus = tinPublishStatus;
	}

}