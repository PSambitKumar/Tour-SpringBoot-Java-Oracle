package com.csm.Model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "t_ecoretreat_survey_two")
public class TEcoretreatSurveyTwo {
	@Id
	@Column(name = "intEcoretreatSurveyId", nullable = false)
	private Integer id;

	@Column(name = "vchName", length = 256)
	private String vchName;

	@Column(name = "vchPhoneNo", length = 15)
	private String vchPhoneNo;

	@Column(name = "vchEmailId", length = 150)
	private String vchEmailId;

	@Lob
	@Column(name = "vchDestinationName")
	private String vchDestinationName;

	@Column(name = "dtDateOfBooking")
	private LocalDate dtDateOfBooking;

	@Column(name = "vchPnrNo", length = 45)
	private String vchPnrNo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public LocalDate getDtDateOfBooking() {
		return dtDateOfBooking;
	}

	public void setDtDateOfBooking(LocalDate dtDateOfBooking) {
		this.dtDateOfBooking = dtDateOfBooking;
	}

	public String getVchPnrNo() {
		return vchPnrNo;
	}

	public void setVchPnrNo(String vchPnrNo) {
		this.vchPnrNo = vchPnrNo;
	}

}