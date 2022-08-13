package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_banner")
public class TBanner {
	@Id
	@Column(name = "intBannerId", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "vchBannerTitle")
	private String vchBannerTitle;

	@Column(name = "tinBannerLocation")
	private Byte tinBannerLocation;

	@Lob
	@Column(name = "vchCaptionE")
	private String vchCaptionE;

	@Column(name = "vchCaptionA", nullable = false, length = 256)
	private String vchCaptionA;

	@Column(name = "vchCaptionF", length = 128)
	private String vchCaptionF;

	@Column(name = "vchFileName", nullable = false, length = 64)
	private String vchFileName;

	@Column(name = "tinPublishStatus", columnDefinition = "TINYINT UNSIGNED")
	private Short tinPublishStatus;

	@Column(name = "tinArcStatus", columnDefinition = "TINYINT UNSIGNED")
	private Short tinArcStatus;

	@Column(name = "tinShowOn", columnDefinition = "TINYINT UNSIGNED not null")
	private Short tinShowOn;

	@Column(name = "intDeptId", columnDefinition = "INT UNSIGNED not null")
	private Long intDeptId;

	@Column(name = "stmCreatedOn", nullable = false)
	private Instant stmCreatedOn;

	@Column(name = "intCreatedBy", columnDefinition = "INT UNSIGNED not null")
	private Long intCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intUpdatedBy", columnDefinition = "INT UNSIGNED")
	private Long intUpdatedBy;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	@Column(name = "vchlink", length = 256)
	private String vchlink;

	@Column(name = "vchFileNameH", length = 64)
	private String vchFileNameH;

	@Column(name = "tinBanType", columnDefinition = "TINYINT UNSIGNED")
	private Short tinBanType;

	@Column(name = "vchVideo", length = 500)
	private String vchVideo;

	@Lob
	@Column(name = "vchEmdvideo")
	private String vchEmdvideo;

	@Column(name = "tinLinkType")
	private Byte tinLinkType;

	@Column(name = "vchThumbFileName", length = 64)
	private String vchThumbFileName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVchBannerTitle() {
		return vchBannerTitle;
	}

	public void setVchBannerTitle(String vchBannerTitle) {
		this.vchBannerTitle = vchBannerTitle;
	}

	public Byte getTinBannerLocation() {
		return tinBannerLocation;
	}

	public void setTinBannerLocation(Byte tinBannerLocation) {
		this.tinBannerLocation = tinBannerLocation;
	}

	public String getVchCaptionE() {
		return vchCaptionE;
	}

	public void setVchCaptionE(String vchCaptionE) {
		this.vchCaptionE = vchCaptionE;
	}

	public String getVchCaptionA() {
		return vchCaptionA;
	}

	public void setVchCaptionA(String vchCaptionA) {
		this.vchCaptionA = vchCaptionA;
	}

	public String getVchCaptionF() {
		return vchCaptionF;
	}

	public void setVchCaptionF(String vchCaptionF) {
		this.vchCaptionF = vchCaptionF;
	}

	public String getVchFileName() {
		return vchFileName;
	}

	public void setVchFileName(String vchFileName) {
		this.vchFileName = vchFileName;
	}

	public Short getTinPublishStatus() {
		return tinPublishStatus;
	}

	public void setTinPublishStatus(Short tinPublishStatus) {
		this.tinPublishStatus = tinPublishStatus;
	}

	public Short getTinArcStatus() {
		return tinArcStatus;
	}

	public void setTinArcStatus(Short tinArcStatus) {
		this.tinArcStatus = tinArcStatus;
	}

	public Short getTinShowOn() {
		return tinShowOn;
	}

	public void setTinShowOn(Short tinShowOn) {
		this.tinShowOn = tinShowOn;
	}

	public Long getIntDeptId() {
		return intDeptId;
	}

	public void setIntDeptId(Long intDeptId) {
		this.intDeptId = intDeptId;
	}

	public Instant getStmCreatedOn() {
		return stmCreatedOn;
	}

	public void setStmCreatedOn(Instant stmCreatedOn) {
		this.stmCreatedOn = stmCreatedOn;
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

	public String getVchlink() {
		return vchlink;
	}

	public void setVchlink(String vchlink) {
		this.vchlink = vchlink;
	}

	public String getVchFileNameH() {
		return vchFileNameH;
	}

	public void setVchFileNameH(String vchFileNameH) {
		this.vchFileNameH = vchFileNameH;
	}

	public Short getTinBanType() {
		return tinBanType;
	}

	public void setTinBanType(Short tinBanType) {
		this.tinBanType = tinBanType;
	}

	public String getVchVideo() {
		return vchVideo;
	}

	public void setVchVideo(String vchVideo) {
		this.vchVideo = vchVideo;
	}

	public String getVchEmdvideo() {
		return vchEmdvideo;
	}

	public void setVchEmdvideo(String vchEmdvideo) {
		this.vchEmdvideo = vchEmdvideo;
	}

	public Byte getTinLinkType() {
		return tinLinkType;
	}

	public void setTinLinkType(Byte tinLinkType) {
		this.tinLinkType = tinLinkType;
	}

	public String getVchThumbFileName() {
		return vchThumbFileName;
	}

	public void setVchThumbFileName(String vchThumbFileName) {
		this.vchThumbFileName = vchThumbFileName;
	}

}