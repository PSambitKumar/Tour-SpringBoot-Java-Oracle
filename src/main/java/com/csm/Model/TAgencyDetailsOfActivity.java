package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_agency_details_of_activity")
public class TAgencyDetailsOfActivity {
	@Id
	@Column(name = "intactivityDetailId", nullable = false)
	private Integer id;

	@Column(name = "intAgencyId")
	private Integer intAgencyId;

	@Column(name = "vchChartredAcntCertificate", length = 256)
	private String vchChartredAcntCertificate;

	@Column(name = "vchSpclTouristGroupsHandled", length = 5)
	private String vchSpclTouristGroupsHandled;

	@Column(name = "vchSize", length = 10)
	private String vchSize;

	@Column(name = "vchFrequencyInMnth", length = 10)
	private String vchFrequencyInMnth;

	@Column(name = "vchActivityDesc1", length = 500)
	private String vchActivityDesc1;

	@Column(name = "vchActivityDesc2", length = 500)
	private String vchActivityDesc2;

	@Column(name = "intUndertakingStatus")
	private Integer intUndertakingStatus;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	@Column(name = "dtmCreatedOn", nullable = false)
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

	public String getVchChartredAcntCertificate() {
		return vchChartredAcntCertificate;
	}

	public void setVchChartredAcntCertificate(String vchChartredAcntCertificate) {
		this.vchChartredAcntCertificate = vchChartredAcntCertificate;
	}

	public String getVchSpclTouristGroupsHandled() {
		return vchSpclTouristGroupsHandled;
	}

	public void setVchSpclTouristGroupsHandled(String vchSpclTouristGroupsHandled) {
		this.vchSpclTouristGroupsHandled = vchSpclTouristGroupsHandled;
	}

	public String getVchSize() {
		return vchSize;
	}

	public void setVchSize(String vchSize) {
		this.vchSize = vchSize;
	}

	public String getVchFrequencyInMnth() {
		return vchFrequencyInMnth;
	}

	public void setVchFrequencyInMnth(String vchFrequencyInMnth) {
		this.vchFrequencyInMnth = vchFrequencyInMnth;
	}

	public String getVchActivityDesc1() {
		return vchActivityDesc1;
	}

	public void setVchActivityDesc1(String vchActivityDesc1) {
		this.vchActivityDesc1 = vchActivityDesc1;
	}

	public String getVchActivityDesc2() {
		return vchActivityDesc2;
	}

	public void setVchActivityDesc2(String vchActivityDesc2) {
		this.vchActivityDesc2 = vchActivityDesc2;
	}

	public Integer getIntUndertakingStatus() {
		return intUndertakingStatus;
	}

	public void setIntUndertakingStatus(Integer intUndertakingStatus) {
		this.intUndertakingStatus = intUndertakingStatus;
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