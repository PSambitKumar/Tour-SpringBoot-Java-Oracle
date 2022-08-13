package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_agency_director_details")
public class TAgencyDirectorDetail {
	@Id
	@Column(name = "intDirectorId", nullable = false)
	private Integer id;

	@Column(name = "intAgencyId")
	private Integer intAgencyId;

	@Column(name = "vchDirectorName", length = 128)
	private String vchDirectorName;

	@Column(name = "vchDirectorDesignation", length = 128)
	private String vchDirectorDesignation;

	@Column(name = "vchTypOfDocmnt", length = 128)
	private String vchTypOfDocmnt;

	@Column(name = "vchOthrTypOfDcmnt", length = 128)
	private String vchOthrTypOfDcmnt;

	@Column(name = "vchDocument", length = 256)
	private String vchDocument;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntAgencyId() {
		return intAgencyId;
	}

	public void setIntAgencyId(Integer intAgencyId) {
		this.intAgencyId = intAgencyId;
	}

	public String getVchDirectorName() {
		return vchDirectorName;
	}

	public void setVchDirectorName(String vchDirectorName) {
		this.vchDirectorName = vchDirectorName;
	}

	public String getVchDirectorDesignation() {
		return vchDirectorDesignation;
	}

	public void setVchDirectorDesignation(String vchDirectorDesignation) {
		this.vchDirectorDesignation = vchDirectorDesignation;
	}

	public String getVchTypOfDocmnt() {
		return vchTypOfDocmnt;
	}

	public void setVchTypOfDocmnt(String vchTypOfDocmnt) {
		this.vchTypOfDocmnt = vchTypOfDocmnt;
	}

	public String getVchOthrTypOfDcmnt() {
		return vchOthrTypOfDcmnt;
	}

	public void setVchOthrTypOfDcmnt(String vchOthrTypOfDcmnt) {
		this.vchOthrTypOfDcmnt = vchOthrTypOfDcmnt;
	}

	public String getVchDocument() {
		return vchDocument;
	}

	public void setVchDocument(String vchDocument) {
		this.vchDocument = vchDocument;
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

}