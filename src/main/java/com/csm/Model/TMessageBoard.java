package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_message_board")
public class TMessageBoard {
	@Id
	@Column(name = "intId", nullable = false)
	private Integer id;

	@Column(name = "vchName", length = 128)
	private String vchName;

	@Column(name = "vchEmail", length = 128)
	private String vchEmail;

	@Column(name = "vchPhone", length = 28)
	private String vchPhone;

	@Column(name = "intCatId")
	private Integer intCatId;

	@Column(name = "vchMessage", length = 256)
	private String vchMessage;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "vchUpdatedBy")
	private Integer vchUpdatedBy;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "bitReadStatus")
	private Integer bitReadStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchName() {
		return vchName;
	}

	public void setVchName(String vchName) {
		this.vchName = vchName;
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

	public Integer getIntCatId() {
		return intCatId;
	}

	public void setIntCatId(Integer intCatId) {
		this.intCatId = intCatId;
	}

	public String getVchMessage() {
		return vchMessage;
	}

	public void setVchMessage(String vchMessage) {
		this.vchMessage = vchMessage;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
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

	public Integer getVchUpdatedBy() {
		return vchUpdatedBy;
	}

	public void setVchUpdatedBy(Integer vchUpdatedBy) {
		this.vchUpdatedBy = vchUpdatedBy;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Integer getBitReadStatus() {
		return bitReadStatus;
	}

	public void setBitReadStatus(Integer bitReadStatus) {
		this.bitReadStatus = bitReadStatus;
	}

}