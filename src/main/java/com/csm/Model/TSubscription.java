package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_subscription")
public class TSubscription {
	@Id
	@Column(name = "intId", nullable = false)
	private Integer id;

	@Column(name = "vchEmail", length = 128)
	private String vchEmail;

	@Column(name = "dtmDateOfSub")
	private Instant dtmDateOfSub;

	@Column(name = "dtmDateOfUnsub")
	private Instant dtmDateOfUnsub;

	@Column(name = "intStatus")
	private Integer intStatus;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmLastSentOn")
	private Instant dtmLastSentOn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchEmail() {
		return vchEmail;
	}

	public void setVchEmail(String vchEmail) {
		this.vchEmail = vchEmail;
	}

	public Instant getDtmDateOfSub() {
		return dtmDateOfSub;
	}

	public void setDtmDateOfSub(Instant dtmDateOfSub) {
		this.dtmDateOfSub = dtmDateOfSub;
	}

	public Instant getDtmDateOfUnsub() {
		return dtmDateOfUnsub;
	}

	public void setDtmDateOfUnsub(Instant dtmDateOfUnsub) {
		this.dtmDateOfUnsub = dtmDateOfUnsub;
	}

	public Integer getIntStatus() {
		return intStatus;
	}

	public void setIntStatus(Integer intStatus) {
		this.intStatus = intStatus;
	}

	public Integer getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Integer intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public Integer getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Integer intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Instant getDtmLastSentOn() {
		return dtmLastSentOn;
	}

	public void setDtmLastSentOn(Instant dtmLastSentOn) {
		this.dtmLastSentOn = dtmLastSentOn;
	}

}