package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "m_user_master")
public class MUserMaster {
	@Id
	@Column(name = "INT_ID", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "INT_LOCATION_ID", columnDefinition = "INT UNSIGNED")
	private Long intLocationId;

	@Column(name = "INT_DEPARTMENT_ID", columnDefinition = "INT UNSIGNED")
	private Long intDepartmentId;

	@Column(name = "INT_DESIGNATION_ID", columnDefinition = "INT UNSIGNED")
	private Long intDesignationId;

	@Column(name = "VCH_FULL_NAME", nullable = false, length = 50)
	private String vchFullName;

	@Column(name = "VCH_GENDER", columnDefinition = "INT UNSIGNED not null")
	private Long vchGender;

	@Column(name = "VCH_DATE_OF_JOIN", nullable = false, length = 15)
	private String vchDateOfJoin;

	@Column(name = "VCH_DATE_OF_BIRTH", length = 15)
	private String vchDateOfBirth;

	@Column(name = "VCH_QUALIFICATION", length = 200)
	private String vchQualification;

	@Column(name = "VCH_SPECIALIZATION", length = 30)
	private String vchSpecialization;

	@Column(name = "VCH_HOBBY", length = 500)
	private String vchHobby;

	@Column(name = "VCH_IMAGE", length = 100)
	private String vchImage;

	@Column(name = "VCH_PH_NO", length = 15)
	private String vchPhNo;

	@Column(name = "VCH_MOBILE_NO", length = 10)
	private String vchMobileNo;

	@Column(name = "VCH_EMAIL", nullable = false, length = 50)
	private String vchEmail;

	@Column(name = "VCH_ADDRESS", length = 500)
	private String vchAddress;

	@Column(name = "VCH_USER_ID", nullable = false, length = 50)
	private String vchUserId;

	@Column(name = "VCH_PASSWORD", nullable = false, length = 50)
	private String vchPassword;

	@Column(name = "DTM_CREATED_ON", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "INT_CREATED_BY", columnDefinition = "INT UNSIGNED")
	private Long intCreatedBy;

	@Column(name = "DTM_UPDATED_ON")
	private Instant dtmUpdatedOn;

	@Column(name = "INT_UPDATED_BY", columnDefinition = "INT UNSIGNED")
	private Long intUpdatedBy;

	@Column(name = "BIT_DELETED_FLAG", nullable = false)
	private Boolean bitDeletedFlag = false;

	@Column(name = "INT_ADMIN_PRIVILEGE", columnDefinition = "INT UNSIGNED")
	private Long intAdminPrivilege;

	@Column(name = "INT_PREVILIGE_STATUS", columnDefinition = "INT UNSIGNED")
	private Long intPreviligeStatus;

	@Column(name = "INT_ARCHIVE_STATUS", columnDefinition = "INT UNSIGNED")
	private Long intArchiveStatus;

	@Column(name = "INT_PUBLISH_STATUS", columnDefinition = "INT UNSIGNED")
	private Long intPublishStatus;

	@Column(name = "INT_PASSWORD_CHECK", columnDefinition = "INT UNSIGNED not null")
	private Long intPasswordCheck;

	@Column(name = "INT_PORTAL_TYPE", columnDefinition = "INT UNSIGNED not null")
	private Long intPortalType;

	@Column(name = "INT_SLNO", columnDefinition = "INT UNSIGNED")
	private Long intSlno;

	@Column(name = "INT_DISTRICT_ID")
	private Integer intDistrictId;

	@Column(name = "INT_AGENT_AUTHORITY")
	private Integer intAgentAuthority;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIntLocationId() {
		return intLocationId;
	}

	public void setIntLocationId(Long intLocationId) {
		this.intLocationId = intLocationId;
	}

	public Long getIntDepartmentId() {
		return intDepartmentId;
	}

	public void setIntDepartmentId(Long intDepartmentId) {
		this.intDepartmentId = intDepartmentId;
	}

	public Long getIntDesignationId() {
		return intDesignationId;
	}

	public void setIntDesignationId(Long intDesignationId) {
		this.intDesignationId = intDesignationId;
	}

	public String getVchFullName() {
		return vchFullName;
	}

	public void setVchFullName(String vchFullName) {
		this.vchFullName = vchFullName;
	}

	public Long getVchGender() {
		return vchGender;
	}

	public void setVchGender(Long vchGender) {
		this.vchGender = vchGender;
	}

	public String getVchDateOfJoin() {
		return vchDateOfJoin;
	}

	public void setVchDateOfJoin(String vchDateOfJoin) {
		this.vchDateOfJoin = vchDateOfJoin;
	}

	public String getVchDateOfBirth() {
		return vchDateOfBirth;
	}

	public void setVchDateOfBirth(String vchDateOfBirth) {
		this.vchDateOfBirth = vchDateOfBirth;
	}

	public String getVchQualification() {
		return vchQualification;
	}

	public void setVchQualification(String vchQualification) {
		this.vchQualification = vchQualification;
	}

	public String getVchSpecialization() {
		return vchSpecialization;
	}

	public void setVchSpecialization(String vchSpecialization) {
		this.vchSpecialization = vchSpecialization;
	}

	public String getVchHobby() {
		return vchHobby;
	}

	public void setVchHobby(String vchHobby) {
		this.vchHobby = vchHobby;
	}

	public String getVchImage() {
		return vchImage;
	}

	public void setVchImage(String vchImage) {
		this.vchImage = vchImage;
	}

	public String getVchPhNo() {
		return vchPhNo;
	}

	public void setVchPhNo(String vchPhNo) {
		this.vchPhNo = vchPhNo;
	}

	public String getVchMobileNo() {
		return vchMobileNo;
	}

	public void setVchMobileNo(String vchMobileNo) {
		this.vchMobileNo = vchMobileNo;
	}

	public String getVchEmail() {
		return vchEmail;
	}

	public void setVchEmail(String vchEmail) {
		this.vchEmail = vchEmail;
	}

	public String getVchAddress() {
		return vchAddress;
	}

	public void setVchAddress(String vchAddress) {
		this.vchAddress = vchAddress;
	}

	public String getVchUserId() {
		return vchUserId;
	}

	public void setVchUserId(String vchUserId) {
		this.vchUserId = vchUserId;
	}

	public String getVchPassword() {
		return vchPassword;
	}

	public void setVchPassword(String vchPassword) {
		this.vchPassword = vchPassword;
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

	public Long getIntAdminPrivilege() {
		return intAdminPrivilege;
	}

	public void setIntAdminPrivilege(Long intAdminPrivilege) {
		this.intAdminPrivilege = intAdminPrivilege;
	}

	public Long getIntPreviligeStatus() {
		return intPreviligeStatus;
	}

	public void setIntPreviligeStatus(Long intPreviligeStatus) {
		this.intPreviligeStatus = intPreviligeStatus;
	}

	public Long getIntArchiveStatus() {
		return intArchiveStatus;
	}

	public void setIntArchiveStatus(Long intArchiveStatus) {
		this.intArchiveStatus = intArchiveStatus;
	}

	public Long getIntPublishStatus() {
		return intPublishStatus;
	}

	public void setIntPublishStatus(Long intPublishStatus) {
		this.intPublishStatus = intPublishStatus;
	}

	public Long getIntPasswordCheck() {
		return intPasswordCheck;
	}

	public void setIntPasswordCheck(Long intPasswordCheck) {
		this.intPasswordCheck = intPasswordCheck;
	}

	public Long getIntPortalType() {
		return intPortalType;
	}

	public void setIntPortalType(Long intPortalType) {
		this.intPortalType = intPortalType;
	}

	public Long getIntSlno() {
		return intSlno;
	}

	public void setIntSlno(Long intSlno) {
		this.intSlno = intSlno;
	}

	public Integer getIntDistrictId() {
		return intDistrictId;
	}

	public void setIntDistrictId(Integer intDistrictId) {
		this.intDistrictId = intDistrictId;
	}

	public Integer getIntAgentAuthority() {
		return intAgentAuthority;
	}

	public void setIntAgentAuthority(Integer intAgentAuthority) {
		this.intAgentAuthority = intAgentAuthority;
	}

}