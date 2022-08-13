package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "Ecoretreat_survey")
public class EcoretreatSurvey {
	@Column(name = "intEcoretreatSurveyId")
	private Integer intEcoretreatSurveyId;

	@Lob
	@Column(name = "vchName")
	private String vchName;

	@Lob
	@Column(name = "vchPhoneNo")
	private String vchPhoneNo;

	@Lob
	@Column(name = "vchEmailId")
	private String vchEmailId;

	@Lob
	@Column(name = "vchDestinationName")
	private String vchDestinationName;

	@Lob
	@Column(name = "dtDateOfBooking")
	private String dtDateOfBooking;

	public Integer getIntEcoretreatSurveyId() {
		return intEcoretreatSurveyId;
	}

	public void setIntEcoretreatSurveyId(Integer intEcoretreatSurveyId) {
		this.intEcoretreatSurveyId = intEcoretreatSurveyId;
	}

	public String getVchName() {
		return vchName;
	}

	public void setVchName(String vchName) {
		this.vchName = vchName;
	}

	public String getVchPhoneNo() {
		return vchPhoneNo;
	}

	public void setVchPhoneNo(String vchPhoneNo) {
		this.vchPhoneNo = vchPhoneNo;
	}

	public String getVchEmailId() {
		return vchEmailId;
	}

	public void setVchEmailId(String vchEmailId) {
		this.vchEmailId = vchEmailId;
	}

	public String getVchDestinationName() {
		return vchDestinationName;
	}

	public void setVchDestinationName(String vchDestinationName) {
		this.vchDestinationName = vchDestinationName;
	}

	public String getDtDateOfBooking() {
		return dtDateOfBooking;
	}

	public void setDtDateOfBooking(String dtDateOfBooking) {
		this.dtDateOfBooking = dtDateOfBooking;
	}

/*
    TODO [JPA Buddy] create field to map the 'vchPnrNo' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "vchPnrNo", columnDefinition = "JSON(1073741824)")
    private Object vchPnrNo;
*/
}