package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_pages")
public class TPage {
	@Id
	@Column(name = "intPageId", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "vchTitle", length = 100)
	private String vchTitle;

	@Column(name = "vchName", length = 80)
	private String vchName;

	@Column(name = "vchFeaturedImage", length = 200)
	private String vchFeaturedImage;

	@Column(name = "intLinkType", columnDefinition = "SMALLINT UNSIGNED not null")
	private Integer intLinkType;

	@Lob
	@Column(name = "vchUrl")
	private String vchUrl;

	@Column(name = "intTemplateType", columnDefinition = "SMALLINT UNSIGNED not null")
	private Integer intTemplateType;

	@Column(name = "vchPluginName", length = 100)
	private String vchPluginName;

	@Column(name = "intWindowStatus", columnDefinition = "SMALLINT UNSIGNED not null")
	private Integer intWindowStatus;

	@Column(name = "intPublishStatus", columnDefinition = "SMALLINT UNSIGNED not null")
	private Integer intPublishStatus;

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

	@Column(name = "vchPageAlias", length = 50)
	private String vchPageAlias;

	@Column(name = "vchMetaTitle", length = 100)
	private String vchMetaTitle;

	@Column(name = "vchMetaKeyword", length = 1024)
	private String vchMetaKeyword;

	@Column(name = "vchMetaDescription", length = 1024)
	private String vchMetaDescription;

	@Column(name = "vchMetaType", length = 50)
	private String vchMetaType;

	@Column(name = "vchMetaImage", length = 100)
	private String vchMetaImage;

	@Column(name = "intArcStatus", columnDefinition = "INT UNSIGNED not null")
	private Long intArcStatus;

	@Column(name = "dtmArchieveOn")
	private Instant dtmArchieveOn;

	@Lob
	@Column(name = "vchSnippet")
	private String vchSnippet;

	@Column(name = "INT_FUNCTION_ID", columnDefinition = "INT UNSIGNED")
	private Long intFunctionId;

	@Lob
	@Column(name = "vchNameO")
	private String vchNameO;

	@Column(name = "vchHomeImage", length = 64)
	private String vchHomeImage;

	@Column(name = "tinFeaturedType")
	private Boolean tinFeaturedType;

	@Column(name = "tinVideoType")
	private Boolean tinVideoType;

	@Column(name = "vchVideoFile", length = 64)
	private String vchVideoFile;

	@Lob
	@Column(name = "vchEmbeddedURL")
	private String vchEmbeddedURL;

	@Column(name = "vchMapAddress", length = 560)
	private String vchMapAddress;

	@Lob
	@Column(name = "vchVisitAddress")
	private String vchVisitAddress;

	@Column(name = "intTemplateId")
	private Integer intTemplateId;

	@Column(name = "vchMenuIconImg", length = 64)
	private String vchMenuIconImg;

	@Lob
	@Column(name = "vchLandlineNo")
	private String vchLandlineNo;

	@Lob
	@Column(name = "vchMobileNo")
	private String vchMobileNo;

	@Column(name = "vchEmailId", length = 64)
	private String vchEmailId;

	@Column(name = "vchCommAddress", length = 560)
	private String vchCommAddress;

	@Column(name = "vchDoubleHomeImage", length = 500)
	private String vchDoubleHomeImage;

	@Column(name = "intHomeImgType")
	private Integer intHomeImgType;

	@Column(name = "vchBrochure", length = 64)
	private String vchBrochure;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVchTitle() {
		return vchTitle;
	}

	public void setVchTitle(String vchTitle) {
		this.vchTitle = vchTitle;
	}

	public String getVchName() {
		return vchName;
	}

	public void setVchName(String vchName) {
		this.vchName = vchName;
	}

	public String getVchFeaturedImage() {
		return vchFeaturedImage;
	}

	public void setVchFeaturedImage(String vchFeaturedImage) {
		this.vchFeaturedImage = vchFeaturedImage;
	}

	public Integer getIntLinkType() {
		return intLinkType;
	}

	public void setIntLinkType(Integer intLinkType) {
		this.intLinkType = intLinkType;
	}

	public String getVchUrl() {
		return vchUrl;
	}

	public void setVchUrl(String vchUrl) {
		this.vchUrl = vchUrl;
	}

	public Integer getIntTemplateType() {
		return intTemplateType;
	}

	public void setIntTemplateType(Integer intTemplateType) {
		this.intTemplateType = intTemplateType;
	}

	public String getVchPluginName() {
		return vchPluginName;
	}

	public void setVchPluginName(String vchPluginName) {
		this.vchPluginName = vchPluginName;
	}

	public Integer getIntWindowStatus() {
		return intWindowStatus;
	}

	public void setIntWindowStatus(Integer intWindowStatus) {
		this.intWindowStatus = intWindowStatus;
	}

	public Integer getIntPublishStatus() {
		return intPublishStatus;
	}

	public void setIntPublishStatus(Integer intPublishStatus) {
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

	public String getVchPageAlias() {
		return vchPageAlias;
	}

	public void setVchPageAlias(String vchPageAlias) {
		this.vchPageAlias = vchPageAlias;
	}

	public String getVchMetaTitle() {
		return vchMetaTitle;
	}

	public void setVchMetaTitle(String vchMetaTitle) {
		this.vchMetaTitle = vchMetaTitle;
	}

	public String getVchMetaKeyword() {
		return vchMetaKeyword;
	}

	public void setVchMetaKeyword(String vchMetaKeyword) {
		this.vchMetaKeyword = vchMetaKeyword;
	}

	public String getVchMetaDescription() {
		return vchMetaDescription;
	}

	public void setVchMetaDescription(String vchMetaDescription) {
		this.vchMetaDescription = vchMetaDescription;
	}

	public String getVchMetaType() {
		return vchMetaType;
	}

	public void setVchMetaType(String vchMetaType) {
		this.vchMetaType = vchMetaType;
	}

	public String getVchMetaImage() {
		return vchMetaImage;
	}

	public void setVchMetaImage(String vchMetaImage) {
		this.vchMetaImage = vchMetaImage;
	}

	public Long getIntArcStatus() {
		return intArcStatus;
	}

	public void setIntArcStatus(Long intArcStatus) {
		this.intArcStatus = intArcStatus;
	}

	public Instant getDtmArchieveOn() {
		return dtmArchieveOn;
	}

	public void setDtmArchieveOn(Instant dtmArchieveOn) {
		this.dtmArchieveOn = dtmArchieveOn;
	}

	public String getVchSnippet() {
		return vchSnippet;
	}

	public void setVchSnippet(String vchSnippet) {
		this.vchSnippet = vchSnippet;
	}

	public Long getIntFunctionId() {
		return intFunctionId;
	}

	public void setIntFunctionId(Long intFunctionId) {
		this.intFunctionId = intFunctionId;
	}

	public String getVchNameO() {
		return vchNameO;
	}

	public void setVchNameO(String vchNameO) {
		this.vchNameO = vchNameO;
	}

	public String getVchHomeImage() {
		return vchHomeImage;
	}

	public void setVchHomeImage(String vchHomeImage) {
		this.vchHomeImage = vchHomeImage;
	}

	public Boolean getTinFeaturedType() {
		return tinFeaturedType;
	}

	public void setTinFeaturedType(Boolean tinFeaturedType) {
		this.tinFeaturedType = tinFeaturedType;
	}

	public Boolean getTinVideoType() {
		return tinVideoType;
	}

	public void setTinVideoType(Boolean tinVideoType) {
		this.tinVideoType = tinVideoType;
	}

	public String getVchVideoFile() {
		return vchVideoFile;
	}

	public void setVchVideoFile(String vchVideoFile) {
		this.vchVideoFile = vchVideoFile;
	}

	public String getVchEmbeddedURL() {
		return vchEmbeddedURL;
	}

	public void setVchEmbeddedURL(String vchEmbeddedURL) {
		this.vchEmbeddedURL = vchEmbeddedURL;
	}

	public String getVchMapAddress() {
		return vchMapAddress;
	}

	public void setVchMapAddress(String vchMapAddress) {
		this.vchMapAddress = vchMapAddress;
	}

	public String getVchVisitAddress() {
		return vchVisitAddress;
	}

	public void setVchVisitAddress(String vchVisitAddress) {
		this.vchVisitAddress = vchVisitAddress;
	}

	public Integer getIntTemplateId() {
		return intTemplateId;
	}

	public void setIntTemplateId(Integer intTemplateId) {
		this.intTemplateId = intTemplateId;
	}

	public String getVchMenuIconImg() {
		return vchMenuIconImg;
	}

	public void setVchMenuIconImg(String vchMenuIconImg) {
		this.vchMenuIconImg = vchMenuIconImg;
	}

	public String getVchLandlineNo() {
		return vchLandlineNo;
	}

	public void setVchLandlineNo(String vchLandlineNo) {
		this.vchLandlineNo = vchLandlineNo;
	}

	public String getVchMobileNo() {
		return vchMobileNo;
	}

	public void setVchMobileNo(String vchMobileNo) {
		this.vchMobileNo = vchMobileNo;
	}

	public String getVchEmailId() {
		return vchEmailId;
	}

	public void setVchEmailId(String vchEmailId) {
		this.vchEmailId = vchEmailId;
	}

	public String getVchCommAddress() {
		return vchCommAddress;
	}

	public void setVchCommAddress(String vchCommAddress) {
		this.vchCommAddress = vchCommAddress;
	}

	public String getVchDoubleHomeImage() {
		return vchDoubleHomeImage;
	}

	public void setVchDoubleHomeImage(String vchDoubleHomeImage) {
		this.vchDoubleHomeImage = vchDoubleHomeImage;
	}

	public Integer getIntHomeImgType() {
		return intHomeImgType;
	}

	public void setIntHomeImgType(Integer intHomeImgType) {
		this.intHomeImgType = intHomeImgType;
	}

	public String getVchBrochure() {
		return vchBrochure;
	}

	public void setVchBrochure(String vchBrochure) {
		this.vchBrochure = vchBrochure;
	}

}