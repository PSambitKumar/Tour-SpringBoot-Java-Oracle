package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_bird_festival_application")
public class TBirdFestivalApplication {
	@Id
	@Column(name = "intAppId", nullable = false)
	private Integer id;

	@Column(name = "vchAppNo", length = 125)
	private String vchAppNo;

	@Column(name = "intRegdBy", nullable = false)
	private Integer intRegdBy;

	@Column(name = "intNoOfAdlt")
	private Integer intNoOfAdlt;

	@Column(name = "intNoOfChild")
	private Integer intNoOfChild;

	@Column(name = "vchExpOnBird", length = 1024)
	private String vchExpOnBird;

	@Column(name = "intTypeOfExp")
	private Integer intTypeOfExp;

	@Column(name = "vchNoOfExp", length = 45)
	private String vchNoOfExp;

	@Column(name = "vchSocialMedia", length = 256)
	private String vchSocialMedia;

	@Column(name = "vchSocialLink", length = 1000)
	private String vchSocialLink;

	@Column(name = "vchMemberReleventH", length = 156)
	private String vchMemberReleventH;

	@Column(name = "vchMemberReleventD", length = 256)
	private String vchMemberReleventD;

	@Column(name = "intAppovalSatatus")
	private Integer intAppovalSatatus;

	@Column(name = "intApprovedBy")
	private Integer intApprovedBy;

	@Column(name = "vchRemarks", length = 125)
	private String vchRemarks;

	@Column(name = "intPaymentStatus")
	private Integer intPaymentStatus;

	@Column(name = "intPaymentId")
	private Integer intPaymentId;

	@Column(name = "tinIsMailSent")
	private Byte tinIsMailSent;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "intCreatedBy", columnDefinition = "INT UNSIGNED not null")
	private Long intCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	@Column(name = "intNoOfFeilds")
	private Integer intNoOfFeilds;

	@Column(name = "intPaymentStatusOtherPackage")
	private Integer intPaymentStatusOtherPackage;

	@Column(name = "intPaymentIdOptionalTour")
	private Integer intPaymentIdOptionalTour;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchAppNo() {
		return vchAppNo;
	}

	public void setVchAppNo(String vchAppNo) {
		this.vchAppNo = vchAppNo;
	}

	public Integer getIntRegdBy() {
		return intRegdBy;
	}

	public void setIntRegdBy(Integer intRegdBy) {
		this.intRegdBy = intRegdBy;
	}

	public Integer getIntNoOfAdlt() {
		return intNoOfAdlt;
	}

	public void setIntNoOfAdlt(Integer intNoOfAdlt) {
		this.intNoOfAdlt = intNoOfAdlt;
	}

	public Integer getIntNoOfChild() {
		return intNoOfChild;
	}

	public void setIntNoOfChild(Integer intNoOfChild) {
		this.intNoOfChild = intNoOfChild;
	}

	public String getVchExpOnBird() {
		return vchExpOnBird;
	}

	public void setVchExpOnBird(String vchExpOnBird) {
		this.vchExpOnBird = vchExpOnBird;
	}

	public Integer getIntTypeOfExp() {
		return intTypeOfExp;
	}

	public void setIntTypeOfExp(Integer intTypeOfExp) {
		this.intTypeOfExp = intTypeOfExp;
	}

	public String getVchNoOfExp() {
		return vchNoOfExp;
	}

	public void setVchNoOfExp(String vchNoOfExp) {
		this.vchNoOfExp = vchNoOfExp;
	}

	public String getVchSocialMedia() {
		return vchSocialMedia;
	}

	public void setVchSocialMedia(String vchSocialMedia) {
		this.vchSocialMedia = vchSocialMedia;
	}

	public String getVchSocialLink() {
		return vchSocialLink;
	}

	public void setVchSocialLink(String vchSocialLink) {
		this.vchSocialLink = vchSocialLink;
	}

	public String getVchMemberReleventH() {
		return vchMemberReleventH;
	}

	public void setVchMemberReleventH(String vchMemberReleventH) {
		this.vchMemberReleventH = vchMemberReleventH;
	}

	public String getVchMemberReleventD() {
		return vchMemberReleventD;
	}

	public void setVchMemberReleventD(String vchMemberReleventD) {
		this.vchMemberReleventD = vchMemberReleventD;
	}

	public Integer getIntAppovalSatatus() {
		return intAppovalSatatus;
	}

	public void setIntAppovalSatatus(Integer intAppovalSatatus) {
		this.intAppovalSatatus = intAppovalSatatus;
	}

	public Integer getIntApprovedBy() {
		return intApprovedBy;
	}

	public void setIntApprovedBy(Integer intApprovedBy) {
		this.intApprovedBy = intApprovedBy;
	}

	public String getVchRemarks() {
		return vchRemarks;
	}

	public void setVchRemarks(String vchRemarks) {
		this.vchRemarks = vchRemarks;
	}

	public Integer getIntPaymentStatus() {
		return intPaymentStatus;
	}

	public void setIntPaymentStatus(Integer intPaymentStatus) {
		this.intPaymentStatus = intPaymentStatus;
	}

	public Integer getIntPaymentId() {
		return intPaymentId;
	}

	public void setIntPaymentId(Integer intPaymentId) {
		this.intPaymentId = intPaymentId;
	}

	public Byte getTinIsMailSent() {
		return tinIsMailSent;
	}

	public void setTinIsMailSent(Byte tinIsMailSent) {
		this.tinIsMailSent = tinIsMailSent;
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

	public Integer getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Integer intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Integer getIntNoOfFeilds() {
		return intNoOfFeilds;
	}

	public void setIntNoOfFeilds(Integer intNoOfFeilds) {
		this.intNoOfFeilds = intNoOfFeilds;
	}

	public Integer getIntPaymentStatusOtherPackage() {
		return intPaymentStatusOtherPackage;
	}

	public void setIntPaymentStatusOtherPackage(Integer intPaymentStatusOtherPackage) {
		this.intPaymentStatusOtherPackage = intPaymentStatusOtherPackage;
	}

	public Integer getIntPaymentIdOptionalTour() {
		return intPaymentIdOptionalTour;
	}

	public void setIntPaymentIdOptionalTour(Integer intPaymentIdOptionalTour) {
		this.intPaymentIdOptionalTour = intPaymentIdOptionalTour;
	}

}