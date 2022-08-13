package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "m_service_approval")
public class MServiceApproval {
	@Id
	@Column(name = "INT_APPROVAL_ID", nullable = false)
	private Integer id;

	@Column(name = "TIN_TYPE_ID", columnDefinition = "TINYINT UNSIGNED not null")
	private Short tinTypeId;

	@Column(name = "INT_CAT_ID", columnDefinition = "INT UNSIGNED not null")
	private Long intCatId;

	@Column(name = "INT_SUB_CAT")
	private Integer intSubCat;

	@Column(name = "INT_SERVICES_ID")
	private Integer intServicesId;

	@Column(name = "TIN_NOOFSTAGE", columnDefinition = "TINYINT UNSIGNED not null")
	private Short tinNoofstage;

	@Column(name = "INT_CREATED_BY")
	private Integer intCreatedBy;

	@Column(name = "STM_CREATED_ON")
	private Instant stmCreatedOn;

	@Column(name = "INT_UPDATED_BY")
	private Integer intUpdatedBy;

	@Column(name = "DTM_UPDATED_ON")
	private Instant dtmUpdatedOn;

	@Column(name = "BIT_DELETED_FLAG")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Short getTinTypeId() {
		return tinTypeId;
	}

	public void setTinTypeId(Short tinTypeId) {
		this.tinTypeId = tinTypeId;
	}

	public Long getIntCatId() {
		return intCatId;
	}

	public void setIntCatId(Long intCatId) {
		this.intCatId = intCatId;
	}

	public Integer getIntSubCat() {
		return intSubCat;
	}

	public void setIntSubCat(Integer intSubCat) {
		this.intSubCat = intSubCat;
	}

	public Integer getIntServicesId() {
		return intServicesId;
	}

	public void setIntServicesId(Integer intServicesId) {
		this.intServicesId = intServicesId;
	}

	public Short getTinNoofstage() {
		return tinNoofstage;
	}

	public void setTinNoofstage(Short tinNoofstage) {
		this.tinNoofstage = tinNoofstage;
	}

	public Integer getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Integer intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Instant getStmCreatedOn() {
		return stmCreatedOn;
	}

	public void setStmCreatedOn(Instant stmCreatedOn) {
		this.stmCreatedOn = stmCreatedOn;
	}

	public Integer getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Integer intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}