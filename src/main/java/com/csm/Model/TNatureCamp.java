package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalTime;

@Entity
@Table(name = "t_nature_camp")
public class TNatureCamp {
	@Id
	@Column(name = "intAccommodationId", nullable = false)
	private Integer id;

	@Column(name = "intCategoryId", nullable = false)
	private Integer intCategoryId;

	@Column(name = "vchHeadline", length = 160)
	private String vchHeadline;

	@Column(name = "intDistrict")
	private Integer intDistrict;

	@Column(name = "intLocation")
	private Integer intLocation;

	@Column(name = "vchBannerImage", length = 150)
	private String vchBannerImage;

	@Column(name = "vchThumbImage", length = 150)
	private String vchThumbImage;

	@Column(name = "vchShortDesc", length = 500)
	private String vchShortDesc;

	@Lob
	@Column(name = "vchLongDesc")
	private String vchLongDesc;

	@Column(name = "vchLatitudeLongatude", length = 168)
	private String vchLatitudeLongatude;

	@Column(name = "intCommentAllowed", nullable = false)
	private Integer intCommentAllowed;

	@Lob
	@Column(name = "vchFacelities")
	private String vchFacelities;

	@Lob
	@Column(name = "vchFoodChart")
	private String vchFoodChart;

	@Column(name = "vchCheckIn")
	private LocalTime vchCheckIn;

	@Column(name = "vchCheckOut")
	private LocalTime vchCheckOut;

	@Lob
	@Column(name = "vchNote")
	private String vchNote;

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

	@Column(name = "intSerialNo")
	private Integer intSerialNo;

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

	public Integer getIntDistrict() {
		return intDistrict;
	}

	public void setIntDistrict(Integer intDistrict) {
		this.intDistrict = intDistrict;
	}

	public Integer getIntLocation() {
		return intLocation;
	}

	public void setIntLocation(Integer intLocation) {
		this.intLocation = intLocation;
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

	public String getVchLatitudeLongatude() {
		return vchLatitudeLongatude;
	}

	public void setVchLatitudeLongatude(String vchLatitudeLongatude) {
		this.vchLatitudeLongatude = vchLatitudeLongatude;
	}

	public Integer getIntCommentAllowed() {
		return intCommentAllowed;
	}

	public void setIntCommentAllowed(Integer intCommentAllowed) {
		this.intCommentAllowed = intCommentAllowed;
	}

	public String getVchFacelities() {
		return vchFacelities;
	}

	public void setVchFacelities(String vchFacelities) {
		this.vchFacelities = vchFacelities;
	}

	public String getVchFoodChart() {
		return vchFoodChart;
	}

	public void setVchFoodChart(String vchFoodChart) {
		this.vchFoodChart = vchFoodChart;
	}

	public LocalTime getVchCheckIn() {
		return vchCheckIn;
	}

	public void setVchCheckIn(LocalTime vchCheckIn) {
		this.vchCheckIn = vchCheckIn;
	}

	public LocalTime getVchCheckOut() {
		return vchCheckOut;
	}

	public void setVchCheckOut(LocalTime vchCheckOut) {
		this.vchCheckOut = vchCheckOut;
	}

	public String getVchNote() {
		return vchNote;
	}

	public void setVchNote(String vchNote) {
		this.vchNote = vchNote;
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

	public Integer getIntSerialNo() {
		return intSerialNo;
	}

	public void setIntSerialNo(Integer intSerialNo) {
		this.intSerialNo = intSerialNo;
	}

}