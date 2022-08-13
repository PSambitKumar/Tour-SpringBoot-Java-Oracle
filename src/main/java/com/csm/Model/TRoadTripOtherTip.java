package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_road_trip_other_tips")
public class TRoadTripOtherTip {
	@Id
	@Column(name = "intOtherTipsId", nullable = false)
	private Integer id;

	@Column(name = "intTripId")
	private Integer intTripId;

	@Column(name = "vchTitle", length = 200)
	private String vchTitle;

	@Column(name = "vchFileName", length = 256)
	private String vchFileName;

	@Lob
	@Column(name = "vchFilePath")
	private String vchFilePath;

	@Lob
	@Column(name = "vchShortDescription")
	private String vchShortDescription;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "vchCreatedBy", length = 150)
	private String vchCreatedBy;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "vchFileName2", length = 256)
	private String vchFileName2;

	@Lob
	@Column(name = "vchFilePath2")
	private String vchFilePath2;

	@Lob
	@Column(name = "vchShortDescription2")
	private String vchShortDescription2;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntTripId() {
		return intTripId;
	}

	public void setIntTripId(Integer intTripId) {
		this.intTripId = intTripId;
	}

	public String getVchTitle() {
		return vchTitle;
	}

	public void setVchTitle(String vchTitle) {
		this.vchTitle = vchTitle;
	}

	public String getVchFileName() {
		return vchFileName;
	}

	public void setVchFileName(String vchFileName) {
		this.vchFileName = vchFileName;
	}

	public String getVchFilePath() {
		return vchFilePath;
	}

	public void setVchFilePath(String vchFilePath) {
		this.vchFilePath = vchFilePath;
	}

	public String getVchShortDescription() {
		return vchShortDescription;
	}

	public void setVchShortDescription(String vchShortDescription) {
		this.vchShortDescription = vchShortDescription;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public String getVchCreatedBy() {
		return vchCreatedBy;
	}

	public void setVchCreatedBy(String vchCreatedBy) {
		this.vchCreatedBy = vchCreatedBy;
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

	public String getVchFileName2() {
		return vchFileName2;
	}

	public void setVchFileName2(String vchFileName2) {
		this.vchFileName2 = vchFileName2;
	}

	public String getVchFilePath2() {
		return vchFilePath2;
	}

	public void setVchFilePath2(String vchFilePath2) {
		this.vchFilePath2 = vchFilePath2;
	}

	public String getVchShortDescription2() {
		return vchShortDescription2;
	}

	public void setVchShortDescription2(String vchShortDescription2) {
		this.vchShortDescription2 = vchShortDescription2;
	}

}