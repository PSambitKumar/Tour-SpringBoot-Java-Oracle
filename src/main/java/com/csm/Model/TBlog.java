package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "t_blog")
public class TBlog {
	@Id
	@Column(name = "INT_BLOG_ID", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "VCH_HEADLINE", length = 256)
	private String vchHeadline;

	@Column(name = "VCH_SLUG", length = 256)
	private String vchSlug;

	@Column(name = "VCH_IMAGE", length = 200)
	private String vchImage;

	@Lob
	@Column(name = "VCH_DESCRIPTION")
	private String vchDescription;

	@Column(name = "INT_CATEGORY")
	private Integer intCategory;

	@Column(name = "VCH_POSTED_BY", length = 200)
	private String vchPostedBy;

	@Column(name = "INT_CREATED_BY")
	private Integer intCreatedBy;

	@Column(name = "VCH_SNIPPET", length = 1000)
	private String vchSnippet;

	@Column(name = "DTM_CREATED_ON", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "INT_UPDATED_BY", columnDefinition = "INT UNSIGNED")
	private Long intUpdatedBy;

	@Column(name = "DTM_UPDATED_ON")
	private Instant dtmUpdatedOn;

	@Column(name = "BIT_DELETED_FLAG")
	private Boolean bitDeletedFlag;

	@Column(name = "INT_PUBLISH_STATUS", columnDefinition = "INT UNSIGNED")
	private Long intPublishStatus;

	@Column(name = "INT_HOME_STATUS")
	private Integer intHomeStatus;

	@Column(name = "INT_VIEW_COUNT")
	private Integer intViewCount;

	@Column(name = "INT_LIKES")
	private Integer intLikes;

	@Column(name = "VCH_THUMBNAIL", length = 140)
	private String vchThumbnail;

	@Column(name = "INT_IS_COMMENT_ALLOWED")
	private Integer intIsCommentAllowed;

	@Column(name = "INT_COMMENT_COUNT")
	private Integer intCommentCount;

	@Column(name = "TIN_TYPE")
	private Byte tinType;

	@Column(name = "DT_PUBLISH_DATE")
	private LocalDate dtPublishDate;

	@Lob
	@Column(name = "INT_ATTR_CAT_ID")
	private String intAttrCatId;

	@Lob
	@Column(name = "INT_ATTR_ITEM_ID")
	private String intAttrItemId;

	@Column(name = "vchPhoto", length = 100)
	private String vchPhoto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVchHeadline() {
		return vchHeadline;
	}

	public void setVchHeadline(String vchHeadline) {
		this.vchHeadline = vchHeadline;
	}

	public String getVchSlug() {
		return vchSlug;
	}

	public void setVchSlug(String vchSlug) {
		this.vchSlug = vchSlug;
	}

	public String getVchImage() {
		return vchImage;
	}

	public void setVchImage(String vchImage) {
		this.vchImage = vchImage;
	}

	public String getVchDescription() {
		return vchDescription;
	}

	public void setVchDescription(String vchDescription) {
		this.vchDescription = vchDescription;
	}

	public Integer getIntCategory() {
		return intCategory;
	}

	public void setIntCategory(Integer intCategory) {
		this.intCategory = intCategory;
	}

	public String getVchPostedBy() {
		return vchPostedBy;
	}

	public void setVchPostedBy(String vchPostedBy) {
		this.vchPostedBy = vchPostedBy;
	}

	public Integer getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Integer intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public String getVchSnippet() {
		return vchSnippet;
	}

	public void setVchSnippet(String vchSnippet) {
		this.vchSnippet = vchSnippet;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Long getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Long intUpdatedBy) {
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

	public Long getIntPublishStatus() {
		return intPublishStatus;
	}

	public void setIntPublishStatus(Long intPublishStatus) {
		this.intPublishStatus = intPublishStatus;
	}

	public Integer getIntHomeStatus() {
		return intHomeStatus;
	}

	public void setIntHomeStatus(Integer intHomeStatus) {
		this.intHomeStatus = intHomeStatus;
	}

	public Integer getIntViewCount() {
		return intViewCount;
	}

	public void setIntViewCount(Integer intViewCount) {
		this.intViewCount = intViewCount;
	}

	public Integer getIntLikes() {
		return intLikes;
	}

	public void setIntLikes(Integer intLikes) {
		this.intLikes = intLikes;
	}

	public String getVchThumbnail() {
		return vchThumbnail;
	}

	public void setVchThumbnail(String vchThumbnail) {
		this.vchThumbnail = vchThumbnail;
	}

	public Integer getIntIsCommentAllowed() {
		return intIsCommentAllowed;
	}

	public void setIntIsCommentAllowed(Integer intIsCommentAllowed) {
		this.intIsCommentAllowed = intIsCommentAllowed;
	}

	public Integer getIntCommentCount() {
		return intCommentCount;
	}

	public void setIntCommentCount(Integer intCommentCount) {
		this.intCommentCount = intCommentCount;
	}

	public Byte getTinType() {
		return tinType;
	}

	public void setTinType(Byte tinType) {
		this.tinType = tinType;
	}

	public LocalDate getDtPublishDate() {
		return dtPublishDate;
	}

	public void setDtPublishDate(LocalDate dtPublishDate) {
		this.dtPublishDate = dtPublishDate;
	}

	public String getIntAttrCatId() {
		return intAttrCatId;
	}

	public void setIntAttrCatId(String intAttrCatId) {
		this.intAttrCatId = intAttrCatId;
	}

	public String getIntAttrItemId() {
		return intAttrItemId;
	}

	public void setIntAttrItemId(String intAttrItemId) {
		this.intAttrItemId = intAttrItemId;
	}

	public String getVchPhoto() {
		return vchPhoto;
	}

	public void setVchPhoto(String vchPhoto) {
		this.vchPhoto = vchPhoto;
	}

}