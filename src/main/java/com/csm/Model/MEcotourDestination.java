package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "m_ecoTour_Destination")
public class MEcotourDestination {
	@Id
	@Column(name = "intDestinationId", nullable = false)
	private Integer id;

	@Column(name = "vchDestinationName", length = 100)
	private String vchDestinationName;

	@Column(name = "intNoOfAdult")
	private Integer intNoOfAdult;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "intUpdatedOn")
	private Instant intUpdatedOn;

	@Column(name = "IntUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "sequenceNo")
	private Integer sequenceNo;

	@Column(name = "vchRedirectRUL", length = 256)
	private String vchRedirectRUL;

	@Column(name = "vchHomePageImage", length = 256)
	private String vchHomePageImage;

	@Column(name = "vchRedirectCation", length = 256)
	private String vchRedirectCation;

	@Column(name = "vchTariffLink", length = 256)
	private String vchTariffLink;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchDestinationName() {
		return vchDestinationName;
	}

	public void setVchDestinationName(String vchDestinationName) {
		this.vchDestinationName = vchDestinationName;
	}

	public Integer getIntNoOfAdult() {
		return intNoOfAdult;
	}

	public void setIntNoOfAdult(Integer intNoOfAdult) {
		this.intNoOfAdult = intNoOfAdult;
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

	public Instant getIntUpdatedOn() {
		return intUpdatedOn;
	}

	public void setIntUpdatedOn(Instant intUpdatedOn) {
		this.intUpdatedOn = intUpdatedOn;
	}

	public Integer getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Integer intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public Integer getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public String getVchRedirectRUL() {
		return vchRedirectRUL;
	}

	public void setVchRedirectRUL(String vchRedirectRUL) {
		this.vchRedirectRUL = vchRedirectRUL;
	}

	public String getVchHomePageImage() {
		return vchHomePageImage;
	}

	public void setVchHomePageImage(String vchHomePageImage) {
		this.vchHomePageImage = vchHomePageImage;
	}

	public String getVchRedirectCation() {
		return vchRedirectCation;
	}

	public void setVchRedirectCation(String vchRedirectCation) {
		this.vchRedirectCation = vchRedirectCation;
	}

	public String getVchTariffLink() {
		return vchTariffLink;
	}

	public void setVchTariffLink(String vchTariffLink) {
		this.vchTariffLink = vchTariffLink;
	}

}