package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_approval_authority")
public class TApprovalAuthority {
	@Id
	@Column(name = "intAppAuthId", nullable = false)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "intApprovalId", nullable = false)
	private MServiceApproval intApproval;

	@Column(name = "tinStageNo", nullable = false)
	private Boolean tinStageNo = false;

	@Column(name = "intUserId", nullable = false)
	private Integer intUserId;

	@Column(name = "tinNoOfDay", nullable = false)
	private Boolean tinNoOfDay = false;

	@Column(name = "vchAuthorityType", length = 8)
	private String vchAuthorityType;

	@Column(name = "intCreatedBy", nullable = false)
	private Integer intCreatedBy;

	@Column(name = "stmCreatedOn")
	private Instant stmCreatedOn;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MServiceApproval getIntApproval() {
		return intApproval;
	}

	public void setIntApproval(MServiceApproval intApproval) {
		this.intApproval = intApproval;
	}

	public Boolean getTinStageNo() {
		return tinStageNo;
	}

	public void setTinStageNo(Boolean tinStageNo) {
		this.tinStageNo = tinStageNo;
	}

	public Integer getIntUserId() {
		return intUserId;
	}

	public void setIntUserId(Integer intUserId) {
		this.intUserId = intUserId;
	}

	public Boolean getTinNoOfDay() {
		return tinNoOfDay;
	}

	public void setTinNoOfDay(Boolean tinNoOfDay) {
		this.tinNoOfDay = tinNoOfDay;
	}

	public String getVchAuthorityType() {
		return vchAuthorityType;
	}

	public void setVchAuthorityType(String vchAuthorityType) {
		this.vchAuthorityType = vchAuthorityType;
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