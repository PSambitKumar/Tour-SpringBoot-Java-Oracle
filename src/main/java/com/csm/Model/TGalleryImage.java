package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_gallery_image")
public class TGalleryImage {
	@Id
	@Column(name = "intImageId", nullable = false)
	private Integer id;

	@Column(name = "intGalleryId")
	private Integer intGalleryId;

	@Column(name = "intGalleryCategory")
	private Integer intGalleryCategory;

	@Column(name = "vchFileName", length = 150)
	private String vchFileName;

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

	public Integer getIntGalleryId() {
		return intGalleryId;
	}

	public void setIntGalleryId(Integer intGalleryId) {
		this.intGalleryId = intGalleryId;
	}

	public Integer getIntGalleryCategory() {
		return intGalleryCategory;
	}

	public void setIntGalleryCategory(Integer intGalleryCategory) {
		this.intGalleryCategory = intGalleryCategory;
	}

	public String getVchFileName() {
		return vchFileName;
	}

	public void setVchFileName(String vchFileName) {
		this.vchFileName = vchFileName;
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