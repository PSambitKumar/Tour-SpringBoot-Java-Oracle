package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_affiliate_training_subCategory")
public class TAffiliateTrainingSubcategory {
	@Id
	@Column(name = "intSubCategoryId", nullable = false)
	private Integer id;

	@Column(name = "vchSubCategoryName", length = 80)
	private String vchSubCategoryName;

	@Column(name = "intCategoryId", nullable = false)
	private Integer intCategoryId;

	@Column(name = "vchVideo", length = 50)
	private String vchVideo;

	@Column(name = "vchPdf", length = 50)
	private String vchPdf;

	@Column(name = "vchAverageTime", length = 20)
	private String vchAverageTime;

	@Column(name = "dtmSubCatCreatedOn")
	private Instant dtmSubCatCreatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "intVideoId")
	private Integer intVideoId;

	@Column(name = "intPdfId")
	private Integer intPdfId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchSubCategoryName() {
		return vchSubCategoryName;
	}

	public void setVchSubCategoryName(String vchSubCategoryName) {
		this.vchSubCategoryName = vchSubCategoryName;
	}

	public Integer getIntCategoryId() {
		return intCategoryId;
	}

	public void setIntCategoryId(Integer intCategoryId) {
		this.intCategoryId = intCategoryId;
	}

	public String getVchVideo() {
		return vchVideo;
	}

	public void setVchVideo(String vchVideo) {
		this.vchVideo = vchVideo;
	}

	public String getVchPdf() {
		return vchPdf;
	}

	public void setVchPdf(String vchPdf) {
		this.vchPdf = vchPdf;
	}

	public String getVchAverageTime() {
		return vchAverageTime;
	}

	public void setVchAverageTime(String vchAverageTime) {
		this.vchAverageTime = vchAverageTime;
	}

	public Instant getDtmSubCatCreatedOn() {
		return dtmSubCatCreatedOn;
	}

	public void setDtmSubCatCreatedOn(Instant dtmSubCatCreatedOn) {
		this.dtmSubCatCreatedOn = dtmSubCatCreatedOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Integer getIntVideoId() {
		return intVideoId;
	}

	public void setIntVideoId(Integer intVideoId) {
		this.intVideoId = intVideoId;
	}

	public Integer getIntPdfId() {
		return intPdfId;
	}

	public void setIntPdfId(Integer intPdfId) {
		this.intPdfId = intPdfId;
	}

}