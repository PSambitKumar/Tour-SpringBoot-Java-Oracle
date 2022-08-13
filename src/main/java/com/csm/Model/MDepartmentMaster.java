package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "m_department_master")
public class MDepartmentMaster {
	@Id
	@Column(name = "INT_DEPARTMENT_ID", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "INT_LOCATION_ID", columnDefinition = "INT UNSIGNED not null")
	private Long intLocationId;

	@Column(name = "VCH_DEPARTMENT_NAME", nullable = false, length = 45)
	private String vchDepartmentName;

	@Lob
	@Column(name = "TXT_DEPARTMENT_NAME_O")
	private String txtDepartmentNameO;

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

	@Column(name = "INT_PREVILIGE_STATUS", columnDefinition = "INT UNSIGNED")
	private Long intPreviligeStatus;

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

	public String getVchDepartmentName() {
		return vchDepartmentName;
	}

	public void setVchDepartmentName(String vchDepartmentName) {
		this.vchDepartmentName = vchDepartmentName;
	}

	public String getTxtDepartmentNameO() {
		return txtDepartmentNameO;
	}

	public void setTxtDepartmentNameO(String txtDepartmentNameO) {
		this.txtDepartmentNameO = txtDepartmentNameO;
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

	public Long getIntPreviligeStatus() {
		return intPreviligeStatus;
	}

	public void setIntPreviligeStatus(Long intPreviligeStatus) {
		this.intPreviligeStatus = intPreviligeStatus;
	}

}