package com.csm.Model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "t_package_tour")
public class TPackageTour {
	@Id
	@Column(name = "intPackageId", nullable = false)
	private Integer id;

	@Column(name = "intCategoryId", nullable = false)
	private Integer intCategoryId;

	@Column(name = "vchHeadline", length = 160)
	private String vchHeadline;

	@Column(name = "vchBannerImage", length = 150)
	private String vchBannerImage;

	@Column(name = "vchThumbImage", length = 150)
	private String vchThumbImage;

	@Column(name = "vchShortDesc", length = 500)
	private String vchShortDesc;

	@Lob
	@Column(name = "vchLongDesc")
	private String vchLongDesc;

	@Column(name = "intCommentAllowed", nullable = false)
	private Integer intCommentAllowed;

	@Lob
	@Column(name = "vchInclusion")
	private String vchInclusion;

	@Lob
	@Column(name = "vchExclusion")
	private String vchExclusion;

	@Lob
	@Column(name = "vchOthers")
	private String vchOthers;

	@Column(name = "vchPrice", precision = 10, scale = 2)
	private BigDecimal vchPrice;

	@Column(name = "vchDurDay", length = 168)
	private String vchDurDay;

	@Column(name = "vchDurNite", length = 168)
	private String vchDurNite;

	@Column(name = "dtmStartDate")
	private LocalDate dtmStartDate;

	@Column(name = "dtmEndDate")
	private LocalDate dtmEndDate;

	@Column(name = "intLikeCount")
	private Integer intLikeCount;

	@Column(name = "intCommentCount")
	private Integer intCommentCount;

	@Column(name = "intViewsCount")
	private Integer intViewsCount;

	@Column(name = "tinPublishStatus")
	private Byte tinPublishStatus;

	@Column(name = "dtmPublishOn")
	private Instant dtmPublishOn;

	@Column(name = "intArcStatus")
	private Integer intArcStatus;

	@Column(name = "dtmArchieveOn")
	private Instant dtmArchieveOn;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy", columnDefinition = "INT UNSIGNED not null")
	private Long intCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intUpdatedBy", columnDefinition = "INT UNSIGNED")
	private Long intUpdatedBy;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	@Column(name = "vchAlias", length = 170)
	private String vchAlias;

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

	public String getVchHeadline() {
		return vchHeadline;
	}

	public void setVchHeadline(String vchHeadline) {
		this.vchHeadline = vchHeadline;
	}

	public String getVchBannerImage() {
		return vchBannerImage;
	}

	public void setVchBannerImage(String vchBannerImage) {
		this.vchBannerImage = vchBannerImage;
	}

	public String getVchThumbImage() {
		return vchThumbImage;
	}

	public void setVchThumbImage(String vchThumbImage) {
		this.vchThumbImage = vchThumbImage;
	}

	public String getVchShortDesc() {
		return vchShortDesc;
	}

	public void setVchShortDesc(String vchShortDesc) {
		this.vchShortDesc = vchShortDesc;
	}

	public String getVchLongDesc() {
		return vchLongDesc;
	}

	public void setVchLongDesc(String vchLongDesc) {
		this.vchLongDesc = vchLongDesc;
	}

	public Integer getIntCommentAllowed() {
		return intCommentAllowed;
	}

	public void setIntCommentAllowed(Integer intCommentAllowed) {
		this.intCommentAllowed = intCommentAllowed;
	}

	public String getVchInclusion() {
		return vchInclusion;
	}

	public void setVchInclusion(String vchInclusion) {
		this.vchInclusion = vchInclusion;
	}

	public String getVchExclusion() {
		return vchExclusion;
	}

	public void setVchExclusion(String vchExclusion) {
		this.vchExclusion = vchExclusion;
	}

	public String getVchOthers() {
		return vchOthers;
	}

	public void setVchOthers(String vchOthers) {
		this.vchOthers = vchOthers;
	}

	public BigDecimal getVchPrice() {
		return vchPrice;
	}

	public void setVchPrice(BigDecimal vchPrice) {
		this.vchPrice = vchPrice;
	}

	public String getVchDurDay() {
		return vchDurDay;
	}

	public void setVchDurDay(String vchDurDay) {
		this.vchDurDay = vchDurDay;
	}

	public String getVchDurNite() {
		return vchDurNite;
	}

	public void setVchDurNite(String vchDurNite) {
		this.vchDurNite = vchDurNite;
	}

	public LocalDate getDtmStartDate() {
		return dtmStartDate;
	}

	public void setDtmStartDate(LocalDate dtmStartDate) {
		this.dtmStartDate = dtmStartDate;
	}

	public LocalDate getDtmEndDate() {
		return dtmEndDate;
	}

	public void setDtmEndDate(LocalDate dtmEndDate) {
		this.dtmEndDate = dtmEndDate;
	}

	public Integer getIntLikeCount() {
		return intLikeCount;
	}

	public void setIntLikeCount(Integer intLikeCount) {
		this.intLikeCount = intLikeCount;
	}

	public Integer getIntCommentCount() {
		return intCommentCount;
	}

	public void setIntCommentCount(Integer intCommentCount) {
		this.intCommentCount = intCommentCount;
	}

	public Integer getIntViewsCount() {
		return intViewsCount;
	}

	public void setIntViewsCount(Integer intViewsCount) {
		this.intViewsCount = intViewsCount;
	}

	public Byte getTinPublishStatus() {
		return tinPublishStatus;
	}

	public void setTinPublishStatus(Byte tinPublishStatus) {
		this.tinPublishStatus = tinPublishStatus;
	}

	public Instant getDtmPublishOn() {
		return dtmPublishOn;
	}

	public void setDtmPublishOn(Instant dtmPublishOn) {
		this.dtmPublishOn = dtmPublishOn;
	}

	public Integer getIntArcStatus() {
		return intArcStatus;
	}

	public void setIntArcStatus(Integer intArcStatus) {
		this.intArcStatus = intArcStatus;
	}

	public Instant getDtmArchieveOn() {
		return dtmArchieveOn;
	}

	public void setDtmArchieveOn(Instant dtmArchieveOn) {
		this.dtmArchieveOn = dtmArchieveOn;
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

	public String getVchAlias() {
		return vchAlias;
	}

	public void setVchAlias(String vchAlias) {
		this.vchAlias = vchAlias;
	}

}