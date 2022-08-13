package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "t_user_contribute")
public class TUserContribute {
	@Id
	@Column(name = "intUserContributeId", nullable = false)
	private Integer id;

	@Column(name = "intCategoryId")
	private Integer intCategoryId;

	@Column(name = "intType")
	private Integer intType;

	@Column(name = "vchContributTitle", length = 256)
	private String vchContributTitle;

	@Column(name = "vchStartDate")
	private LocalDate vchStartDate;

	@Column(name = "vchTripDuretion", length = 45)
	private String vchTripDuretion;

	@Column(name = "vchCoverImage", length = 256)
	private String vchCoverImage;

	@Column(name = "vchCoverImgCaption", length = 256)
	private String vchCoverImgCaption;

	@Lob
	@Column(name = "vchContributeData")
	private String vchContributeData;

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

	@Column(name = "intApprovedStatus")
	private Integer intApprovedStatus;

	@Column(name = "intApprovedBy")
	private Integer intApprovedBy;

	@Column(name = "dtmApprovedOn")
	private Instant dtmApprovedOn;

	@Column(name = "vchApprovedRemarks", length = 512)
	private String vchApprovedRemarks;

	@Column(name = "intLikeCount")
	private Integer intLikeCount;

	@Column(name = "intViewCount")
	private Integer intViewCount;

	@Column(name = "dtmPublishDate")
	private LocalDate dtmPublishDate;

	@Column(name = "dtmExpiryDate")
	private LocalDate dtmExpiryDate;

	@Column(name = "intCommentAllow")
	private Integer intCommentAllow;

	@Column(name = "intUserId")
	private Integer intUserId;

	@Column(name = "vchPageAlias", length = 158)
	private String vchPageAlias;

	@Column(name = "vchShortDescription", length = 1024)
	private String vchShortDescription;

	@Column(name = "vchAttractionId", length = 256)
	private String vchAttractionId;

	@Column(name = "vchAttrItemId", length = 512)
	private String vchAttrItemId;

	@Column(name = "intPublishStatus")
	private Integer intPublishStatus;

	@Column(name = "intPublishType")
	private Integer intPublishType;

	@Column(name = "vchCoverType")
	private Integer vchCoverType;

	@Column(name = "vchPostedBy", length = 128)
	private String vchPostedBy;

	@Column(name = "vchPostedByImg", length = 256)
	private String vchPostedByImg;

	@Column(name = "intShowHomePageStatus")
	private Integer intShowHomePageStatus;

	@Column(name = "vchHomePageImg", length = 100)
	private String vchHomePageImg;

	@Column(name = "intUserLoginType")
	private Integer intUserLoginType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntCategoryId() {
		return intCategoryId;
	}

	public void setIntCategoryId(Integer intCategoryId) {
		this.intCategoryId = intCategoryId;
	}

	public Integer getIntType() {
		return intType;
	}

	public void setIntType(Integer intType) {
		this.intType = intType;
	}

	public String getVchContributTitle() {
		return vchContributTitle;
	}

	public void setVchContributTitle(String vchContributTitle) {
		this.vchContributTitle = vchContributTitle;
	}

	public LocalDate getVchStartDate() {
		return vchStartDate;
	}

	public void setVchStartDate(LocalDate vchStartDate) {
		this.vchStartDate = vchStartDate;
	}

	public String getVchTripDuretion() {
		return vchTripDuretion;
	}

	public void setVchTripDuretion(String vchTripDuretion) {
		this.vchTripDuretion = vchTripDuretion;
	}

	public String getVchCoverImage() {
		return vchCoverImage;
	}

	public void setVchCoverImage(String vchCoverImage) {
		this.vchCoverImage = vchCoverImage;
	}

	public String getVchCoverImgCaption() {
		return vchCoverImgCaption;
	}

	public void setVchCoverImgCaption(String vchCoverImgCaption) {
		this.vchCoverImgCaption = vchCoverImgCaption;
	}

	public String getVchContributeData() {
		return vchContributeData;
	}

	public void setVchContributeData(String vchContributeData) {
		this.vchContributeData = vchContributeData;
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

	public Integer getIntApprovedStatus() {
		return intApprovedStatus;
	}

	public void setIntApprovedStatus(Integer intApprovedStatus) {
		this.intApprovedStatus = intApprovedStatus;
	}

	public Integer getIntApprovedBy() {
		return intApprovedBy;
	}

	public void setIntApprovedBy(Integer intApprovedBy) {
		this.intApprovedBy = intApprovedBy;
	}

	public Instant getDtmApprovedOn() {
		return dtmApprovedOn;
	}

	public void setDtmApprovedOn(Instant dtmApprovedOn) {
		this.dtmApprovedOn = dtmApprovedOn;
	}

	public String getVchApprovedRemarks() {
		return vchApprovedRemarks;
	}

	public void setVchApprovedRemarks(String vchApprovedRemarks) {
		this.vchApprovedRemarks = vchApprovedRemarks;
	}

	public Integer getIntLikeCount() {
		return intLikeCount;
	}

	public void setIntLikeCount(Integer intLikeCount) {
		this.intLikeCount = intLikeCount;
	}

	public Integer getIntViewCount() {
		return intViewCount;
	}

	public void setIntViewCount(Integer intViewCount) {
		this.intViewCount = intViewCount;
	}

	public LocalDate getDtmPublishDate() {
		return dtmPublishDate;
	}

	public void setDtmPublishDate(LocalDate dtmPublishDate) {
		this.dtmPublishDate = dtmPublishDate;
	}

	public LocalDate getDtmExpiryDate() {
		return dtmExpiryDate;
	}

	public void setDtmExpiryDate(LocalDate dtmExpiryDate) {
		this.dtmExpiryDate = dtmExpiryDate;
	}

	public Integer getIntCommentAllow() {
		return intCommentAllow;
	}

	public void setIntCommentAllow(Integer intCommentAllow) {
		this.intCommentAllow = intCommentAllow;
	}

	public Integer getIntUserId() {
		return intUserId;
	}

	public void setIntUserId(Integer intUserId) {
		this.intUserId = intUserId;
	}

	public String getVchPageAlias() {
		return vchPageAlias;
	}

	public void setVchPageAlias(String vchPageAlias) {
		this.vchPageAlias = vchPageAlias;
	}

	public String getVchShortDescription() {
		return vchShortDescription;
	}

	public void setVchShortDescription(String vchShortDescription) {
		this.vchShortDescription = vchShortDescription;
	}

	public String getVchAttractionId() {
		return vchAttractionId;
	}

	public void setVchAttractionId(String vchAttractionId) {
		this.vchAttractionId = vchAttractionId;
	}

	public String getVchAttrItemId() {
		return vchAttrItemId;
	}

	public void setVchAttrItemId(String vchAttrItemId) {
		this.vchAttrItemId = vchAttrItemId;
	}

	public Integer getIntPublishStatus() {
		return intPublishStatus;
	}

	public void setIntPublishStatus(Integer intPublishStatus) {
		this.intPublishStatus = intPublishStatus;
	}

	public Integer getIntPublishType() {
		return intPublishType;
	}

	public void setIntPublishType(Integer intPublishType) {
		this.intPublishType = intPublishType;
	}

	public Integer getVchCoverType() {
		return vchCoverType;
	}

	public void setVchCoverType(Integer vchCoverType) {
		this.vchCoverType = vchCoverType;
	}

	public String getVchPostedBy() {
		return vchPostedBy;
	}

	public void setVchPostedBy(String vchPostedBy) {
		this.vchPostedBy = vchPostedBy;
	}

	public String getVchPostedByImg() {
		return vchPostedByImg;
	}

	public void setVchPostedByImg(String vchPostedByImg) {
		this.vchPostedByImg = vchPostedByImg;
	}

	public Integer getIntShowHomePageStatus() {
		return intShowHomePageStatus;
	}

	public void setIntShowHomePageStatus(Integer intShowHomePageStatus) {
		this.intShowHomePageStatus = intShowHomePageStatus;
	}

	public String getVchHomePageImg() {
		return vchHomePageImg;
	}

	public void setVchHomePageImg(String vchHomePageImg) {
		this.vchHomePageImg = vchHomePageImg;
	}

	public Integer getIntUserLoginType() {
		return intUserLoginType;
	}

	public void setIntUserLoginType(Integer intUserLoginType) {
		this.intUserLoginType = intUserLoginType;
	}

}