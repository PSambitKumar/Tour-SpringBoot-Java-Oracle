package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_attractions")
public class TAttraction {
	@Id
	@Column(name = "intId", nullable = false)
	private Integer id;

	@Column(name = "intModuleId")
	private Integer intModuleId;

	@Column(name = "intCategory")
	private Integer intCategory;

	@Column(name = "intParentCategory")
	private Integer intParentCategory;

	@Column(name = "intItemId")
	private Integer intItemId;

	@Column(name = "vchHeadline", length = 200)
	private String vchHeadline;

	@Column(name = "intDistrictId")
	private Integer intDistrictId;

	@Column(name = "intLocation")
	private Integer intLocation;

	@Column(name = "vchBannerImage", length = 150)
	private String vchBannerImage;

	@Column(name = "vchThumbnail", length = 150)
	private String vchThumbnail;

	@Column(name = "vchIcon", length = 150)
	private String vchIcon;

	@Column(name = "vchShortDesc", length = 500)
	private String vchShortDesc;

	@Column(name = "intLinkType")
	private Byte intLinkType;

	@Column(name = "vchURL", length = 500)
	private String vchURL;

	@Lob
	@Column(name = "txtHeightlights")
	private String txtHeightlights;

	@Lob
	@Column(name = "txtContent")
	private String txtContent;

	@Column(name = "vchLatitudeLongatude", length = 168)
	private String vchLatitudeLongatude;

	@Column(name = "intCommentAllowed")
	private Byte intCommentAllowed;

	@Column(name = "intLikeCount")
	private Integer intLikeCount;

	@Column(name = "intViewsCount")
	private Integer intViewsCount;

	@Column(name = "intCommentCount")
	private Integer intCommentCount;

	@Column(name = "intShowInHomePage")
	private Integer intShowInHomePage;

	@Column(name = "intArcStatus")
	private Byte intArcStatus;

	@Column(name = "intPublishStatus")
	private Byte intPublishStatus;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "dtmArchieveOn")
	private Instant dtmArchieveOn;

	@Column(name = "dtmPublishOn")
	private Instant dtmPublishOn;

	@Column(name = "vchAlias", length = 300)
	private String vchAlias;

	@Lob
	@Column(name = "vchDestinationData")
	private String vchDestinationData;

	@Column(name = "vchPageImage", length = 200)
	private String vchPageImage;

	@Column(name = "vchHomeImage", length = 45)
	private String vchHomeImage;

	@Column(name = "intSerialNo")
	private Integer intSerialNo;

	@Column(name = "vchMetaTitle", length = 210)
	private String vchMetaTitle;

	@Column(name = "vchMetaKeyWord", length = 1024)
	private String vchMetaKeyWord;

	@Column(name = "txtMetaDescription", length = 1024)
	private String txtMetaDescription;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntModuleId() {
		return intModuleId;
	}

	public void setIntModuleId(Integer intModuleId) {
		this.intModuleId = intModuleId;
	}

	public Integer getIntCategory() {
		return intCategory;
	}

	public void setIntCategory(Integer intCategory) {
		this.intCategory = intCategory;
	}

	public Integer getIntParentCategory() {
		return intParentCategory;
	}

	public void setIntParentCategory(Integer intParentCategory) {
		this.intParentCategory = intParentCategory;
	}

	public Integer getIntItemId() {
		return intItemId;
	}

	public void setIntItemId(Integer intItemId) {
		this.intItemId = intItemId;
	}

	public String getVchHeadline() {
		return vchHeadline;
	}

	public void setVchHeadline(String vchHeadline) {
		this.vchHeadline = vchHeadline;
	}

	public Integer getIntDistrictId() {
		return intDistrictId;
	}

	public void setIntDistrictId(Integer intDistrictId) {
		this.intDistrictId = intDistrictId;
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

	public String getVchThumbnail() {
		return vchThumbnail;
	}

	public void setVchThumbnail(String vchThumbnail) {
		this.vchThumbnail = vchThumbnail;
	}

	public String getVchIcon() {
		return vchIcon;
	}

	public void setVchIcon(String vchIcon) {
		this.vchIcon = vchIcon;
	}

	public String getVchShortDesc() {
		return vchShortDesc;
	}

	public void setVchShortDesc(String vchShortDesc) {
		this.vchShortDesc = vchShortDesc;
	}

	public Byte getIntLinkType() {
		return intLinkType;
	}

	public void setIntLinkType(Byte intLinkType) {
		this.intLinkType = intLinkType;
	}

	public String getVchURL() {
		return vchURL;
	}

	public void setVchURL(String vchURL) {
		this.vchURL = vchURL;
	}

	public String getTxtHeightlights() {
		return txtHeightlights;
	}

	public void setTxtHeightlights(String txtHeightlights) {
		this.txtHeightlights = txtHeightlights;
	}

	public String getTxtContent() {
		return txtContent;
	}

	public void setTxtContent(String txtContent) {
		this.txtContent = txtContent;
	}

	public String getVchLatitudeLongatude() {
		return vchLatitudeLongatude;
	}

	public void setVchLatitudeLongatude(String vchLatitudeLongatude) {
		this.vchLatitudeLongatude = vchLatitudeLongatude;
	}

	public Byte getIntCommentAllowed() {
		return intCommentAllowed;
	}

	public void setIntCommentAllowed(Byte intCommentAllowed) {
		this.intCommentAllowed = intCommentAllowed;
	}

	public Integer getIntLikeCount() {
		return intLikeCount;
	}

	public void setIntLikeCount(Integer intLikeCount) {
		this.intLikeCount = intLikeCount;
	}

	public Integer getIntViewsCount() {
		return intViewsCount;
	}

	public void setIntViewsCount(Integer intViewsCount) {
		this.intViewsCount = intViewsCount;
	}

	public Integer getIntCommentCount() {
		return intCommentCount;
	}

	public void setIntCommentCount(Integer intCommentCount) {
		this.intCommentCount = intCommentCount;
	}

	public Integer getIntShowInHomePage() {
		return intShowInHomePage;
	}

	public void setIntShowInHomePage(Integer intShowInHomePage) {
		this.intShowInHomePage = intShowInHomePage;
	}

	public Byte getIntArcStatus() {
		return intArcStatus;
	}

	public void setIntArcStatus(Byte intArcStatus) {
		this.intArcStatus = intArcStatus;
	}

	public Byte getIntPublishStatus() {
		return intPublishStatus;
	}

	public void setIntPublishStatus(Byte intPublishStatus) {
		this.intPublishStatus = intPublishStatus;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
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

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public Instant getDtmArchieveOn() {
		return dtmArchieveOn;
	}

	public void setDtmArchieveOn(Instant dtmArchieveOn) {
		this.dtmArchieveOn = dtmArchieveOn;
	}

	public Instant getDtmPublishOn() {
		return dtmPublishOn;
	}

	public void setDtmPublishOn(Instant dtmPublishOn) {
		this.dtmPublishOn = dtmPublishOn;
	}

	public String getVchAlias() {
		return vchAlias;
	}

	public void setVchAlias(String vchAlias) {
		this.vchAlias = vchAlias;
	}

	public String getVchDestinationData() {
		return vchDestinationData;
	}

	public void setVchDestinationData(String vchDestinationData) {
		this.vchDestinationData = vchDestinationData;
	}

	public String getVchPageImage() {
		return vchPageImage;
	}

	public void setVchPageImage(String vchPageImage) {
		this.vchPageImage = vchPageImage;
	}

	public String getVchHomeImage() {
		return vchHomeImage;
	}

	public void setVchHomeImage(String vchHomeImage) {
		this.vchHomeImage = vchHomeImage;
	}

	public Integer getIntSerialNo() {
		return intSerialNo;
	}

	public void setIntSerialNo(Integer intSerialNo) {
		this.intSerialNo = intSerialNo;
	}

	public String getVchMetaTitle() {
		return vchMetaTitle;
	}

	public void setVchMetaTitle(String vchMetaTitle) {
		this.vchMetaTitle = vchMetaTitle;
	}

	public String getVchMetaKeyWord() {
		return vchMetaKeyWord;
	}

	public void setVchMetaKeyWord(String vchMetaKeyWord) {
		this.vchMetaKeyWord = vchMetaKeyWord;
	}

	public String getTxtMetaDescription() {
		return txtMetaDescription;
	}

	public void setTxtMetaDescription(String txtMetaDescription) {
		this.txtMetaDescription = txtMetaDescription;
	}

}