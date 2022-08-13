package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "t_affiliate_training_details")
public class TAffiliateTrainingDetail {
	@Id
	@Column(name = "intTrainingDetId", nullable = false)
	private Integer id;

	@Column(name = "intAffiliateTagentId", nullable = false)
	private Integer intAffiliateTagentId;

	@Column(name = "intCategoryId", nullable = false)
	private Integer intCategoryId;

	@Column(name = "intSubCategoryId", nullable = false)
	private Integer intSubCategoryId;

	@Column(name = "videoDuration", precision = 5, scale = 2)
	private BigDecimal videoDuration;

	@Column(name = "pdfDuration", precision = 5, scale = 2)
	private BigDecimal pdfDuration;

	@Column(name = "readPdf", precision = 5, scale = 2)
	private BigDecimal readPdf;

	@Column(name = "totalVideoDuration", length = 15)
	private String totalVideoDuration;

	@Column(name = "averageDetailsTime", precision = 5, scale = 2)
	private BigDecimal averageDetailsTime;

	@Column(name = "dtmStartTime")
	private Instant dtmStartTime;

	@Column(name = "dtmEndTime")
	private Instant dtmEndTime;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntAffiliateTagentId() {
		return intAffiliateTagentId;
	}

	public void setIntAffiliateTagentId(Integer intAffiliateTagentId) {
		this.intAffiliateTagentId = intAffiliateTagentId;
	}

	public Integer getIntCategoryId() {
		return intCategoryId;
	}

	public void setIntCategoryId(Integer intCategoryId) {
		this.intCategoryId = intCategoryId;
	}

	public Integer getIntSubCategoryId() {
		return intSubCategoryId;
	}

	public void setIntSubCategoryId(Integer intSubCategoryId) {
		this.intSubCategoryId = intSubCategoryId;
	}

	public BigDecimal getVideoDuration() {
		return videoDuration;
	}

	public void setVideoDuration(BigDecimal videoDuration) {
		this.videoDuration = videoDuration;
	}

	public BigDecimal getPdfDuration() {
		return pdfDuration;
	}

	public void setPdfDuration(BigDecimal pdfDuration) {
		this.pdfDuration = pdfDuration;
	}

	public BigDecimal getReadPdf() {
		return readPdf;
	}

	public void setReadPdf(BigDecimal readPdf) {
		this.readPdf = readPdf;
	}

	public String getTotalVideoDuration() {
		return totalVideoDuration;
	}

	public void setTotalVideoDuration(String totalVideoDuration) {
		this.totalVideoDuration = totalVideoDuration;
	}

	public BigDecimal getAverageDetailsTime() {
		return averageDetailsTime;
	}

	public void setAverageDetailsTime(BigDecimal averageDetailsTime) {
		this.averageDetailsTime = averageDetailsTime;
	}

	public Instant getDtmStartTime() {
		return dtmStartTime;
	}

	public void setDtmStartTime(Instant dtmStartTime) {
		this.dtmStartTime = dtmStartTime;
	}

	public Instant getDtmEndTime() {
		return dtmEndTime;
	}

	public void setDtmEndTime(Instant dtmEndTime) {
		this.dtmEndTime = dtmEndTime;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}