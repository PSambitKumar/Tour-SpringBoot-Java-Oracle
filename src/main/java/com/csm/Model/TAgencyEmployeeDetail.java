package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_agency_employee_details")
public class TAgencyEmployeeDetail {
	@Id
	@Column(name = "intEmployeeId", nullable = false)
	private Integer id;

	@Column(name = "intAgencyId")
	private Integer intAgencyId;

	@Column(name = "intNoOfEmployees")
	private Integer intNoOfEmployees;

	@Column(name = "vchEmployeeName", length = 128)
	private String vchEmployeeName;

	@Column(name = "vchEmpQualification", length = 100)
	private String vchEmpQualification;

	@Column(name = "vchEmpDocument", length = 256)
	private String vchEmpDocument;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntAgencyId() {
		return intAgencyId;
	}

	public void setIntAgencyId(Integer intAgencyId) {
		this.intAgencyId = intAgencyId;
	}

	public Integer getIntNoOfEmployees() {
		return intNoOfEmployees;
	}

	public void setIntNoOfEmployees(Integer intNoOfEmployees) {
		this.intNoOfEmployees = intNoOfEmployees;
	}

	public String getVchEmployeeName() {
		return vchEmployeeName;
	}

	public void setVchEmployeeName(String vchEmployeeName) {
		this.vchEmployeeName = vchEmployeeName;
	}

	public String getVchEmpQualification() {
		return vchEmpQualification;
	}

	public void setVchEmpQualification(String vchEmpQualification) {
		this.vchEmpQualification = vchEmpQualification;
	}

	public String getVchEmpDocument() {
		return vchEmpDocument;
	}

	public void setVchEmpDocument(String vchEmpDocument) {
		this.vchEmpDocument = vchEmpDocument;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

}