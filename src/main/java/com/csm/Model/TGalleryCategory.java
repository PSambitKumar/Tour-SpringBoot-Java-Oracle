package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_gallery_category")
public class TGalleryCategory {
	@Id
	@Column(name = "INT_CATEGORY_ID", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "VCH_CATEGORY_NAME", nullable = false, length = 100)
	private String vchCategoryName;

	@Column(name = "VCH_DESCRIPTION", length = 500)
	private String vchDescription;

	@Column(name = "INT_PUBLISH_STATUS", columnDefinition = "INT UNSIGNED not null")
	private Long intPublishStatus;

	@Column(name = "DTM_CREATED_ON", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "INT_CREATED_BY", columnDefinition = "INT UNSIGNED not null")
	private Long intCreatedBy;

	@Column(name = "DTM_UPDATED_ON")
	private Instant dtmUpdatedOn;

	@Column(name = "INT_UPDATED_BY", columnDefinition = "INT UNSIGNED")
	private Long intUpdatedBy;

	@Column(name = "BIT_DELETED_FLAG", nullable = false)
	private Boolean bitDeletedFlag = false;

	@Column(name = "INT_SHOW_HOME", columnDefinition = "SMALLINT UNSIGNED not null")
	private Integer intShowHome;

	@Column(name = "VCH_CATEGORY_NAME_O", length = 150)
	private String vchCategoryNameO;

	@Lob
	@Column(name = "VCH_DESCRIPTION_O")
	private String vchDescriptionO;

	@Column(name = "INT_TYPE", columnDefinition = "INT UNSIGNED not null")
	private Long intType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVchCategoryName() {
		return vchCategoryName;
	}

	public void setVchCategoryName(String vchCategoryName) {
		this.vchCategoryName = vchCategoryName;
	}

	public String getVchDescription() {
		return vchDescription;
	}

	public void setVchDescription(String vchDescription) {
		this.vchDescription = vchDescription;
	}

	public Long getIntPublishStatus() {
		return intPublishStatus;
	}

	public void setIntPublishStatus(Long intPublishStatus) {
		this.intPublishStatus = intPublishStatus;
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

	public Integer getIntShowHome() {
		return intShowHome;
	}

	public void setIntShowHome(Integer intShowHome) {
		this.intShowHome = intShowHome;
	}

	public String getVchCategoryNameO() {
		return vchCategoryNameO;
	}

	public void setVchCategoryNameO(String vchCategoryNameO) {
		this.vchCategoryNameO = vchCategoryNameO;
	}

	public String getVchDescriptionO() {
		return vchDescriptionO;
	}

	public void setVchDescriptionO(String vchDescriptionO) {
		this.vchDescriptionO = vchDescriptionO;
	}

	public Long getIntType() {
		return intType;
	}

	public void setIntType(Long intType) {
		this.intType = intType;
	}

}