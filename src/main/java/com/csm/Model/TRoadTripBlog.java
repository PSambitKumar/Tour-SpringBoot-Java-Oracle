package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_road_trip_blog")
public class TRoadTripBlog {
	@Id
	@Column(name = "intBlogTagId", nullable = false)
	private Integer id;

	@Column(name = "intTripId")
	private Integer intTripId;

	@Column(name = "intBlogId")
	private Integer intBlogId;

	@Column(name = "vchBlogerName", length = 250)
	private String vchBlogerName;

	@Lob
	@Column(name = "vchFilePath")
	private String vchFilePath;

	@Column(name = "intFileTypeFor")
	private Integer intFileTypeFor;

	@Lob
	@Column(name = "vchShortDesc")
	private String vchShortDesc;

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

	public Integer getIntBlogId() {
		return intBlogId;
	}

	public void setIntBlogId(Integer intBlogId) {
		this.intBlogId = intBlogId;
	}

	public String getVchBlogerName() {
		return vchBlogerName;
	}

	public void setVchBlogerName(String vchBlogerName) {
		this.vchBlogerName = vchBlogerName;
	}

	public String getVchFilePath() {
		return vchFilePath;
	}

	public void setVchFilePath(String vchFilePath) {
		this.vchFilePath = vchFilePath;
	}

	public Integer getIntFileTypeFor() {
		return intFileTypeFor;
	}

	public void setIntFileTypeFor(Integer intFileTypeFor) {
		this.intFileTypeFor = intFileTypeFor;
	}

	public String getVchShortDesc() {
		return vchShortDesc;
	}

	public void setVchShortDesc(String vchShortDesc) {
		this.vchShortDesc = vchShortDesc;
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

}