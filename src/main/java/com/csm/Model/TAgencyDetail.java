package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_agency_details")
public class TAgencyDetail {
	@Id
	@Column(name = "intAgencyId", nullable = false)
	private Integer id;

	@Column(name = "intAffiliateTagentId")
	private Integer intAffiliateTagentId;

	@Column(name = "intEnterpriseId")
	private Integer intEnterpriseId;

	@Column(name = "vchEnterpriseName", length = 200)
	private String vchEnterpriseName;

	@Column(name = "vchYearOfRgstrn", length = 20)
	private String vchYearOfRgstrn;

	@Column(name = "vchTypOfCmpnyCertifct", length = 128)
	private String vchTypOfCmpnyCertifct;

	@Column(name = "vchOtherTypOfCertifct", length = 128)
	private String vchOtherTypOfCertifct;

	@Column(name = "vchCmpnyCertifct", length = 256)
	private String vchCmpnyCertifct;

	@Column(name = "intNationalityId")
	private Integer intNationalityId;

	@Column(name = "intStateId")
	private Integer intStateId;

	@Column(name = "vchCorrespndncAddress", length = 256)
	private String vchCorrespndncAddress;

	@Column(name = "vchTagServiceLocation", length = 256)
	private String vchTagServiceLocation;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "intFormProgressStatus")
	private Integer intFormProgressStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntAffiliateTagentId() {
		return intAffiliateTagentId;
	}

	public void setIntAffiliateTagentId(Integer intAffiliateTagentId) {
		this.intAffiliateTagentId = intAffiliateTagentId;
	}

	public Integer getIntEnterpriseId() {
		return intEnterpriseId;
	}

	public void setIntEnterpriseId(Integer intEnterpriseId) {
		this.intEnterpriseId = intEnterpriseId;
	}

	public String getVchEnterpriseName() {
		return vchEnterpriseName;
	}

	public void setVchEnterpriseName(String vchEnterpriseName) {
		this.vchEnterpriseName = vchEnterpriseName;
	}

	public String getVchYearOfRgstrn() {
		return vchYearOfRgstrn;
	}

	public void setVchYearOfRgstrn(String vchYearOfRgstrn) {
		this.vchYearOfRgstrn = vchYearOfRgstrn;
	}

	public String getVchTypOfCmpnyCertifct() {
		return vchTypOfCmpnyCertifct;
	}

	public void setVchTypOfCmpnyCertifct(String vchTypOfCmpnyCertifct) {
		this.vchTypOfCmpnyCertifct = vchTypOfCmpnyCertifct;
	}

	public String getVchOtherTypOfCertifct() {
		return vchOtherTypOfCertifct;
	}

	public void setVchOtherTypOfCertifct(String vchOtherTypOfCertifct) {
		this.vchOtherTypOfCertifct = vchOtherTypOfCertifct;
	}

	public String getVchCmpnyCertifct() {
		return vchCmpnyCertifct;
	}

	public void setVchCmpnyCertifct(String vchCmpnyCertifct) {
		this.vchCmpnyCertifct = vchCmpnyCertifct;
	}

	public Integer getIntNationalityId() {
		return intNationalityId;
	}

	public void setIntNationalityId(Integer intNationalityId) {
		this.intNationalityId = intNationalityId;
	}

	public Integer getIntStateId() {
		return intStateId;
	}

	public void setIntStateId(Integer intStateId) {
		this.intStateId = intStateId;
	}

	public String getVchCorrespndncAddress() {
		return vchCorrespndncAddress;
	}

	public void setVchCorrespndncAddress(String vchCorrespndncAddress) {
		this.vchCorrespndncAddress = vchCorrespndncAddress;
	}

	public String getVchTagServiceLocation() {
		return vchTagServiceLocation;
	}

	public void setVchTagServiceLocation(String vchTagServiceLocation) {
		this.vchTagServiceLocation = vchTagServiceLocation;
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

	public Integer getIntFormProgressStatus() {
		return intFormProgressStatus;
	}

	public void setIntFormProgressStatus(Integer intFormProgressStatus) {
		this.intFormProgressStatus = intFormProgressStatus;
	}

}