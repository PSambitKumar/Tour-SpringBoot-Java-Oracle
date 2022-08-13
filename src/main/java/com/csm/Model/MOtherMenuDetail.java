package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "m_other_menu_details")
public class MOtherMenuDetail {
	@Id
	@Column(name = "intId", nullable = false)
	private Integer id;

	@Column(name = "vchMenuIcon", length = 112)
	private String vchMenuIcon;

	@Column(name = "vchSnippet", length = 1024)
	private String vchSnippet;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "intMenuType")
	private Integer intMenuType;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchMenuIcon() {
		return vchMenuIcon;
	}

	public void setVchMenuIcon(String vchMenuIcon) {
		this.vchMenuIcon = vchMenuIcon;
	}

	public String getVchSnippet() {
		return vchSnippet;
	}

	public void setVchSnippet(String vchSnippet) {
		this.vchSnippet = vchSnippet;
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

	public Integer getIntMenuType() {
		return intMenuType;
	}

	public void setIntMenuType(Integer intMenuType) {
		this.intMenuType = intMenuType;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}