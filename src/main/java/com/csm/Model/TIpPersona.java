package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_ip_persona")
public class TIpPersona {
	@Id
	@Column(name = "intPersonaId", nullable = false)
	private Integer id;

	@Column(name = "intCatId")
	private Integer intCatId;

	@Column(name = "vchUserIP", length = 16)
	private String vchUserIP;

	@Column(name = "vchPageName", length = 200)
	private String vchPageName;

	@Column(name = "intPilgrimCount")
	private Integer intPilgrimCount;

	@Column(name = "intFamilyCount")
	private Integer intFamilyCount;

	@Column(name = "intNatureCount")
	private Integer intNatureCount;

	@Column(name = "intHistoryCount")
	private Integer intHistoryCount;

	@Column(name = "intBackPackerCount")
	private Integer intBackPackerCount;

	@Column(name = "intHoneymoonCount")
	private Integer intHoneymoonCount;

	@Column(name = "intWeekenderCount")
	private Integer intWeekenderCount;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntCatId() {
		return intCatId;
	}

	public void setIntCatId(Integer intCatId) {
		this.intCatId = intCatId;
	}

	public String getVchUserIP() {
		return vchUserIP;
	}

	public void setVchUserIP(String vchUserIP) {
		this.vchUserIP = vchUserIP;
	}

	public String getVchPageName() {
		return vchPageName;
	}

	public void setVchPageName(String vchPageName) {
		this.vchPageName = vchPageName;
	}

	public Integer getIntPilgrimCount() {
		return intPilgrimCount;
	}

	public void setIntPilgrimCount(Integer intPilgrimCount) {
		this.intPilgrimCount = intPilgrimCount;
	}

	public Integer getIntFamilyCount() {
		return intFamilyCount;
	}

	public void setIntFamilyCount(Integer intFamilyCount) {
		this.intFamilyCount = intFamilyCount;
	}

	public Integer getIntNatureCount() {
		return intNatureCount;
	}

	public void setIntNatureCount(Integer intNatureCount) {
		this.intNatureCount = intNatureCount;
	}

	public Integer getIntHistoryCount() {
		return intHistoryCount;
	}

	public void setIntHistoryCount(Integer intHistoryCount) {
		this.intHistoryCount = intHistoryCount;
	}

	public Integer getIntBackPackerCount() {
		return intBackPackerCount;
	}

	public void setIntBackPackerCount(Integer intBackPackerCount) {
		this.intBackPackerCount = intBackPackerCount;
	}

	public Integer getIntHoneymoonCount() {
		return intHoneymoonCount;
	}

	public void setIntHoneymoonCount(Integer intHoneymoonCount) {
		this.intHoneymoonCount = intHoneymoonCount;
	}

	public Integer getIntWeekenderCount() {
		return intWeekenderCount;
	}

	public void setIntWeekenderCount(Integer intWeekenderCount) {
		this.intWeekenderCount = intWeekenderCount;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
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

	public Integer getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Integer intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

}