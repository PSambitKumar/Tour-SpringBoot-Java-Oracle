package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_travel_agent_trail_other_destination")
public class TTravelAgentTrailOtherDestination {
	@Id
	@Column(name = "intOtherDestId", nullable = false)
	private Integer id;

	@Column(name = "vchDestName", length = 128)
	private String vchDestName;

	@Column(name = "vchOTThumbImage", length = 256)
	private String vchOTThumbImage;

	@Column(name = "vchOTShortDescription", length = 256)
	private String vchOTShortDescription;

	@Column(name = "intDestrictId")
	private Integer intDestrictId;

	@Column(name = "intLocationId")
	private Integer intLocationId;

	@Column(name = "vchLatitudeLongatude", length = 256)
	private String vchLatitudeLongatude;

	@Column(name = "vchCoordinates", length = 256)
	private String vchCoordinates;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchDestName() {
		return vchDestName;
	}

	public void setVchDestName(String vchDestName) {
		this.vchDestName = vchDestName;
	}

	public String getVchOTThumbImage() {
		return vchOTThumbImage;
	}

	public void setVchOTThumbImage(String vchOTThumbImage) {
		this.vchOTThumbImage = vchOTThumbImage;
	}

	public String getVchOTShortDescription() {
		return vchOTShortDescription;
	}

	public void setVchOTShortDescription(String vchOTShortDescription) {
		this.vchOTShortDescription = vchOTShortDescription;
	}

	public Integer getIntDestrictId() {
		return intDestrictId;
	}

	public void setIntDestrictId(Integer intDestrictId) {
		this.intDestrictId = intDestrictId;
	}

	public Integer getIntLocationId() {
		return intLocationId;
	}

	public void setIntLocationId(Integer intLocationId) {
		this.intLocationId = intLocationId;
	}

	public String getVchLatitudeLongatude() {
		return vchLatitudeLongatude;
	}

	public void setVchLatitudeLongatude(String vchLatitudeLongatude) {
		this.vchLatitudeLongatude = vchLatitudeLongatude;
	}

	public String getVchCoordinates() {
		return vchCoordinates;
	}

	public void setVchCoordinates(String vchCoordinates) {
		this.vchCoordinates = vchCoordinates;
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