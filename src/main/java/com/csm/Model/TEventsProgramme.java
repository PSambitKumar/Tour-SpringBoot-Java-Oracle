package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "t_events_programme")
public class TEventsProgramme {
	@Id
	@Column(name = "intEventsProgrammeId", nullable = false)
	private Integer id;

	@Column(name = "intEventId")
	private Integer intEventId;

	@Column(name = "vchProgrammeHeading")
	private LocalDate vchProgrammeHeading;

	@Column(name = "vchProgrammeImage", length = 200)
	private String vchProgrammeImage;

	@Lob
	@Column(name = "vchProgrammeDetails")
	private String vchProgrammeDetails;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy", columnDefinition = "INT UNSIGNED")
	private Long intCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intUpdatedBy", columnDefinition = "INT UNSIGNED")
	private Long intUpdatedBy;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntEventId() {
		return intEventId;
	}

	public void setIntEventId(Integer intEventId) {
		this.intEventId = intEventId;
	}

	public LocalDate getVchProgrammeHeading() {
		return vchProgrammeHeading;
	}

	public void setVchProgrammeHeading(LocalDate vchProgrammeHeading) {
		this.vchProgrammeHeading = vchProgrammeHeading;
	}

	public String getVchProgrammeImage() {
		return vchProgrammeImage;
	}

	public void setVchProgrammeImage(String vchProgrammeImage) {
		this.vchProgrammeImage = vchProgrammeImage;
	}

	public String getVchProgrammeDetails() {
		return vchProgrammeDetails;
	}

	public void setVchProgrammeDetails(String vchProgrammeDetails) {
		this.vchProgrammeDetails = vchProgrammeDetails;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Long getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Long intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public Long getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Long intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}