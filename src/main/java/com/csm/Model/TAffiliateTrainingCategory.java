package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_affiliate_training_category")
public class TAffiliateTrainingCategory {
	@Id
	@Column(name = "intCategoryId", nullable = false)
	private Integer id;

	@Column(name = "vchCategoryName", length = 80)
	private String vchCategoryName;

	@Column(name = "vchShortDescription", length = 250)
	private String vchShortDescription;

	@Column(name = "vchCategoryImage", length = 30)
	private String vchCategoryImage;

	@Column(name = "vchAverageTime", length = 20)
	private String vchAverageTime;

	@Column(name = "dtmCatCreatedOn")
	private Instant dtmCatCreatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchCategoryName() {
		return vchCategoryName;
	}

	public void setVchCategoryName(String vchCategoryName) {
		this.vchCategoryName = vchCategoryName;
	}

	public String getVchShortDescription() {
		return vchShortDescription;
	}

	public void setVchShortDescription(String vchShortDescription) {
		this.vchShortDescription = vchShortDescription;
	}

	public String getVchCategoryImage() {
		return vchCategoryImage;
	}

	public void setVchCategoryImage(String vchCategoryImage) {
		this.vchCategoryImage = vchCategoryImage;
	}

	public String getVchAverageTime() {
		return vchAverageTime;
	}

	public void setVchAverageTime(String vchAverageTime) {
		this.vchAverageTime = vchAverageTime;
	}

	public Instant getDtmCatCreatedOn() {
		return dtmCatCreatedOn;
	}

	public void setDtmCatCreatedOn(Instant dtmCatCreatedOn) {
		this.dtmCatCreatedOn = dtmCatCreatedOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}