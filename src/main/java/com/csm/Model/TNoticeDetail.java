package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_notice_details")
public class TNoticeDetail {
	@Id
	@Column(name = "intNoticeId", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "intProjectId")
	private Integer intProjectId;

	@Column(name = "vchLetterno", nullable = false, length = 128)
	private String vchLetterno;

	@Column(name = "vchHeadLineE", nullable = false, length = 256)
	private String vchHeadLineE;

	@Column(name = "vchHeadLineH", length = 320)
	private String vchHeadLineH;

	@Column(name = "vchHeadLineO", length = 320)
	private String vchHeadLineO;

	@Column(name = "vchDocument", length = 128)
	private String vchDocument;

	@Lob
	@Column(name = "vchDescriptionE")
	private String vchDescriptionE;

	@Lob
	@Column(name = "vchDescriptionH")
	private String vchDescriptionH;

	@Lob
	@Column(name = "vchDescriptionO")
	private String vchDescriptionO;

	@Column(name = "dtmExparyDate")
	private Instant dtmExparyDate;

	@Column(name = "dtmNoticeDate")
	private Instant dtmNoticeDate;

	@Column(name = "tinPublishStatus", columnDefinition = "TINYINT UNSIGNED not null")
	private Short tinPublishStatus;

	@Column(name = "tinArcStatus", columnDefinition = "TINYINT UNSIGNED not null")
	private Short tinArcStatus;

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

	@Column(name = "intShowHome", columnDefinition = "SMALLINT UNSIGNED not null")
	private Integer intShowHome;

	@Column(name = "dtmArchieveOn")
	private Instant dtmArchieveOn;

	@Column(name = "intCommonCategoryId")
	private Integer intCommonCategoryId;

	@Column(name = "vchURL", length = 100)
	private String vchURL;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIntProjectId() {
		return intProjectId;
	}

	public void setIntProjectId(Integer intProjectId) {
		this.intProjectId = intProjectId;
	}

	public String getVchLetterno() {
		return vchLetterno;
	}

	public void setVchLetterno(String vchLetterno) {
		this.vchLetterno = vchLetterno;
	}

	public String getVchHeadLineE() {
		return vchHeadLineE;
	}

	public void setVchHeadLineE(String vchHeadLineE) {
		this.vchHeadLineE = vchHeadLineE;
	}

	public String getVchHeadLineH() {
		return vchHeadLineH;
	}

	public void setVchHeadLineH(String vchHeadLineH) {
		this.vchHeadLineH = vchHeadLineH;
	}

	public String getVchHeadLineO() {
		return vchHeadLineO;
	}

	public void setVchHeadLineO(String vchHeadLineO) {
		this.vchHeadLineO = vchHeadLineO;
	}

	public String getVchDocument() {
		return vchDocument;
	}

	public void setVchDocument(String vchDocument) {
		this.vchDocument = vchDocument;
	}

	public String getVchDescriptionE() {
		return vchDescriptionE;
	}

	public void setVchDescriptionE(String vchDescriptionE) {
		this.vchDescriptionE = vchDescriptionE;
	}

	public String getVchDescriptionH() {
		return vchDescriptionH;
	}

	public void setVchDescriptionH(String vchDescriptionH) {
		this.vchDescriptionH = vchDescriptionH;
	}

	public String getVchDescriptionO() {
		return vchDescriptionO;
	}

	public void setVchDescriptionO(String vchDescriptionO) {
		this.vchDescriptionO = vchDescriptionO;
	}

	public Instant getDtmExparyDate() {
		return dtmExparyDate;
	}

	public void setDtmExparyDate(Instant dtmExparyDate) {
		this.dtmExparyDate = dtmExparyDate;
	}

	public Instant getDtmNoticeDate() {
		return dtmNoticeDate;
	}

	public void setDtmNoticeDate(Instant dtmNoticeDate) {
		this.dtmNoticeDate = dtmNoticeDate;
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

	public Integer getIntShowHome() {
		return intShowHome;
	}

	public void setIntShowHome(Integer intShowHome) {
		this.intShowHome = intShowHome;
	}

	public Instant getDtmArchieveOn() {
		return dtmArchieveOn;
	}

	public void setDtmArchieveOn(Instant dtmArchieveOn) {
		this.dtmArchieveOn = dtmArchieveOn;
	}

	public Integer getIntCommonCategoryId() {
		return intCommonCategoryId;
	}

	public void setIntCommonCategoryId(Integer intCommonCategoryId) {
		this.intCommonCategoryId = intCommonCategoryId;
	}

	public String getVchURL() {
		return vchURL;
	}

	public void setVchURL(String vchURL) {
		this.vchURL = vchURL;
	}

}