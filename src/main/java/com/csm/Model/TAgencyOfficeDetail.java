package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "t_agency_office_details")
public class TAgencyOfficeDetail {
	@Id
	@Column(name = "intOffcDetailsId", nullable = false)
	private Integer id;

	@Column(name = "intAgencyId")
	private Integer intAgencyId;

	@Column(name = "vchContctPersn", length = 128)
	private String vchContctPersn;

	@Column(name = "vchEmailId", length = 128)
	private String vchEmailId;

	@Column(name = "vchOfcFaxNo", length = 28)
	private String vchOfcFaxNo;

	@Column(name = "intOfcPhnNoTyp")
	private Integer intOfcPhnNoTyp;

	@Column(name = "vchLandlineNo", length = 28)
	private String vchLandlineNo;

	@Column(name = "vchMobileNo", length = 16)
	private String vchMobileNo;

	@Column(name = "vchWebsite", length = 128)
	private String vchWebsite;

	@Column(name = "vchOffcAreaInSqFt", precision = 10, scale = 2)
	private BigDecimal vchOffcAreaInSqFt;

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

	public String getVchContctPersn() {
		return vchContctPersn;
	}

	public void setVchContctPersn(String vchContctPersn) {
		this.vchContctPersn = vchContctPersn;
	}

	public String getVchEmailId() {
		return vchEmailId;
	}

	public void setVchEmailId(String vchEmailId) {
		this.vchEmailId = vchEmailId;
	}

	public String getVchOfcFaxNo() {
		return vchOfcFaxNo;
	}

	public void setVchOfcFaxNo(String vchOfcFaxNo) {
		this.vchOfcFaxNo = vchOfcFaxNo;
	}

	public Integer getIntOfcPhnNoTyp() {
		return intOfcPhnNoTyp;
	}

	public void setIntOfcPhnNoTyp(Integer intOfcPhnNoTyp) {
		this.intOfcPhnNoTyp = intOfcPhnNoTyp;
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

	public String getVchWebsite() {
		return vchWebsite;
	}

	public void setVchWebsite(String vchWebsite) {
		this.vchWebsite = vchWebsite;
	}

	public BigDecimal getVchOffcAreaInSqFt() {
		return vchOffcAreaInSqFt;
	}

	public void setVchOffcAreaInSqFt(BigDecimal vchOffcAreaInSqFt) {
		this.vchOffcAreaInSqFt = vchOffcAreaInSqFt;
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