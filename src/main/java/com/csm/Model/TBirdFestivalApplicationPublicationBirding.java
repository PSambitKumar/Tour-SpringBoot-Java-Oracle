package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_bird_festival_application_publication_birding")
public class TBirdFestivalApplicationPublicationBirding {
	@Id
	@Column(name = "intPublicationId", nullable = false)
	private Integer id;

	@Column(name = "intAppId")
	private Integer intAppId;

	@Column(name = "vchPublicationHeading", length = 128)
	private String vchPublicationHeading;

	@Column(name = "vchPublicationLink", length = 128)
	private String vchPublicationLink;

	@Column(name = "vchPublicationDocument")
	private String vchPublicationDocument;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy", columnDefinition = "INT UNSIGNED not null")
	private Long intCreatedBy;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntAppId() {
		return intAppId;
	}

	public void setIntAppId(Integer intAppId) {
		this.intAppId = intAppId;
	}

	public String getVchPublicationHeading() {
		return vchPublicationHeading;
	}

	public void setVchPublicationHeading(String vchPublicationHeading) {
		this.vchPublicationHeading = vchPublicationHeading;
	}

	public String getVchPublicationLink() {
		return vchPublicationLink;
	}

	public void setVchPublicationLink(String vchPublicationLink) {
		this.vchPublicationLink = vchPublicationLink;
	}

	public String getVchPublicationDocument() {
		return vchPublicationDocument;
	}

	public void setVchPublicationDocument(String vchPublicationDocument) {
		this.vchPublicationDocument = vchPublicationDocument;
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

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}