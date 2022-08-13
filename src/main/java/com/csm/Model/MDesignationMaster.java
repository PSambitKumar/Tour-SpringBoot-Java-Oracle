package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "m_designation_master")
public class MDesignationMaster {
	@Id
	@Column(name = "INT_DESIGNATION_ID", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "INT_LOCATION", columnDefinition = "INT UNSIGNED not null")
	private Long intLocation;

	@Column(name = "INT_DEPARTMENT_ID", columnDefinition = "INT UNSIGNED not null")
	private Long intDepartmentId;

	@Column(name = "VCH_DESIGNATION_NAME", nullable = false, length = 50)
	private String vchDesignationName;

	@Lob
	@Column(name = "TXT_DESIGNATION_NAME_O")
	private String txtDesignationNameO;

	@Column(name = "VCH_DESCRIPTION", length = 500)
	private String vchDescription;

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

	@Column(name = "INT_PRIVILEGE_STATUS", columnDefinition = "INT UNSIGNED")
	private Long intPrivilegeStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIntLocation() {
		return intLocation;
	}

	public void setIntLocation(Long intLocation) {
		this.intLocation = intLocation;
	}

	public Long getIntDepartmentId() {
		return intDepartmentId;
	}

	public void setIntDepartmentId(Long intDepartmentId) {
		this.intDepartmentId = intDepartmentId;
	}

	public String getVchDesignationName() {
		return vchDesignationName;
	}

	public void setVchDesignationName(String vchDesignationName) {
		this.vchDesignationName = vchDesignationName;
	}

	public String getTxtDesignationNameO() {
		return txtDesignationNameO;
	}

	public void setTxtDesignationNameO(String txtDesignationNameO) {
		this.txtDesignationNameO = txtDesignationNameO;
	}

	public String getVchDescription() {
		return vchDescription;
	}

	public void setVchDescription(String vchDescription) {
		this.vchDescription = vchDescription;
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

	public Long getIntPrivilegeStatus() {
		return intPrivilegeStatus;
	}

	public void setIntPrivilegeStatus(Long intPrivilegeStatus) {
		this.intPrivilegeStatus = intPrivilegeStatus;
	}

}