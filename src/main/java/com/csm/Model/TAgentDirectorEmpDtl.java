package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_agent_director_emp_dtls")
public class TAgentDirectorEmpDtl {
	@Id
	@Column(name = "intId", nullable = false)
	private Integer id;

	@Column(name = "intType")
	private Integer intType;

	@Column(name = "intAgentAppId")
	private Integer intAgentAppId;

	@Column(name = "vchName")
	private String vchName;

	@Column(name = "intDesignation")
	private Integer intDesignation;

	@Column(name = "intQualification")
	private Integer intQualification;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "vchEmpDocuments", length = 256)
	private String vchEmpDocuments;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntType() {
		return intType;
	}

	public void setIntType(Integer intType) {
		this.intType = intType;
	}

	public Integer getIntAgentAppId() {
		return intAgentAppId;
	}

	public void setIntAgentAppId(Integer intAgentAppId) {
		this.intAgentAppId = intAgentAppId;
	}

	public String getVchName() {
		return vchName;
	}

	public void setVchName(String vchName) {
		this.vchName = vchName;
	}

	public Integer getIntDesignation() {
		return intDesignation;
	}

	public void setIntDesignation(Integer intDesignation) {
		this.intDesignation = intDesignation;
	}

	public Integer getIntQualification() {
		return intQualification;
	}

	public void setIntQualification(Integer intQualification) {
		this.intQualification = intQualification;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public String getVchEmpDocuments() {
		return vchEmpDocuments;
	}

	public void setVchEmpDocuments(String vchEmpDocuments) {
		this.vchEmpDocuments = vchEmpDocuments;
	}

}