package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "m_ecotour_location")
public class MEcotourLocation {
	@Id
	@Column(name = "intLocationId", nullable = false)
	private Integer id;

	@Column(name = "intDestinationId", nullable = false)
	private Integer intDestinationId;

	@Column(name = "vchlocationName", length = 100)
	private String vchlocationName;

	@Column(name = "vchImage")
	private String vchImage;

	@Column(name = "vchCoordinates", length = 80)
	private String vchCoordinates;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntDestinationId() {
		return intDestinationId;
	}

	public void setIntDestinationId(Integer intDestinationId) {
		this.intDestinationId = intDestinationId;
	}

	public String getVchlocationName() {
		return vchlocationName;
	}

	public void setVchlocationName(String vchlocationName) {
		this.vchlocationName = vchlocationName;
	}

	public String getVchImage() {
		return vchImage;
	}

	public void setVchImage(String vchImage) {
		this.vchImage = vchImage;
	}

	public String getVchCoordinates() {
		return vchCoordinates;
	}

	public void setVchCoordinates(String vchCoordinates) {
		this.vchCoordinates = vchCoordinates;
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

}