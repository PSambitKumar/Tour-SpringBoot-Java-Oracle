package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_hospital")
public class THospital {
	@Id
	@Column(name = "intHospitalId", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "intCatId")
	private Integer intCatId;

	@Column(name = "vchTitle", length = 512)
	private String vchTitle;

	@Column(name = "vchSnippet", length = 1024)
	private String vchSnippet;

	@Column(name = "vchIcon", length = 112)
	private String vchIcon;

	@Column(name = "vchAddress", length = 512)
	private String vchAddress;

	@Column(name = "vchEmail", length = 512)
	private String vchEmail;

	@Column(name = "vchPhone", length = 512)
	private String vchPhone;

	@Column(name = "vchFax", length = 512)
	private String vchFax;

	@Lob
	@Column(name = "vchMapAddress")
	private String vchMapAddress;

	@Column(name = "vchWeAreOpen", length = 200)
	private String vchWeAreOpen;

	@Column(name = "vchUrl", length = 512)
	private String vchUrl;

	@Lob
	@Column(name = "vchSpecialisation")
	private String vchSpecialisation;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "stmCreatedOn", nullable = false)
	private Instant stmCreatedOn;

	@Column(name = "intUpdatedBy", columnDefinition = "INT UNSIGNED")
	private Long intUpdatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "tinArcStatus", columnDefinition = "TINYINT UNSIGNED")
	private Short tinArcStatus;

	@Column(name = "tinPublishStatus", columnDefinition = "TINYINT UNSIGNED")
	private Short tinPublishStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIntCatId() {
		return intCatId;
	}

	public void setIntCatId(Integer intCatId) {
		this.intCatId = intCatId;
	}

	public String getVchTitle() {
		return vchTitle;
	}

	public void setVchTitle(String vchTitle) {
		this.vchTitle = vchTitle;
	}

	public String getVchSnippet() {
		return vchSnippet;
	}

	public void setVchSnippet(String vchSnippet) {
		this.vchSnippet = vchSnippet;
	}

	public String getVchIcon() {
		return vchIcon;
	}

	public void setVchIcon(String vchIcon) {
		this.vchIcon = vchIcon;
	}

	public String getVchAddress() {
		return vchAddress;
	}

	public void setVchAddress(String vchAddress) {
		this.vchAddress = vchAddress;
	}

	public String getVchEmail() {
		return vchEmail;
	}

	public void setVchEmail(String vchEmail) {
		this.vchEmail = vchEmail;
	}

	public String getVchPhone() {
		return vchPhone;
	}

	public void setVchPhone(String vchPhone) {
		this.vchPhone = vchPhone;
	}

	public String getVchFax() {
		return vchFax;
	}

	public void setVchFax(String vchFax) {
		this.vchFax = vchFax;
	}

	public String getVchMapAddress() {
		return vchMapAddress;
	}

	public void setVchMapAddress(String vchMapAddress) {
		this.vchMapAddress = vchMapAddress;
	}

	public String getVchWeAreOpen() {
		return vchWeAreOpen;
	}

	public void setVchWeAreOpen(String vchWeAreOpen) {
		this.vchWeAreOpen = vchWeAreOpen;
	}

	public String getVchUrl() {
		return vchUrl;
	}

	public void setVchUrl(String vchUrl) {
		this.vchUrl = vchUrl;
	}

	public String getVchSpecialisation() {
		return vchSpecialisation;
	}

	public void setVchSpecialisation(String vchSpecialisation) {
		this.vchSpecialisation = vchSpecialisation;
	}

	public Integer getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Integer intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Instant getStmCreatedOn() {
		return stmCreatedOn;
	}

	public void setStmCreatedOn(Instant stmCreatedOn) {
		this.stmCreatedOn = stmCreatedOn;
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

	public Short getTinArcStatus() {
		return tinArcStatus;
	}

	public void setTinArcStatus(Short tinArcStatus) {
		this.tinArcStatus = tinArcStatus;
	}

	public Short getTinPublishStatus() {
		return tinPublishStatus;
	}

	public void setTinPublishStatus(Short tinPublishStatus) {
		this.tinPublishStatus = tinPublishStatus;
	}

}