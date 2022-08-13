package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "t_testAuthoring")
public class TTestauthoring {
	@Id
	@Column(name = "intId", nullable = false)
	private Integer id;

	@Column(name = "intAadharNo")
	private Integer intAadharNo;

	@Column(name = "dtmDOB")
	private LocalDate dtmDOB;

	@Column(name = "mobileNo")
	private Integer mobileNo;

	@Column(name = "vchPhoto", length = 50)
	private String vchPhoto;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntAadharNo() {
		return intAadharNo;
	}

	public void setIntAadharNo(Integer intAadharNo) {
		this.intAadharNo = intAadharNo;
	}

	public LocalDate getDtmDOB() {
		return dtmDOB;
	}

	public void setDtmDOB(LocalDate dtmDOB) {
		this.dtmDOB = dtmDOB;
	}

	public Integer getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getVchPhoto() {
		return vchPhoto;
	}

	public void setVchPhoto(String vchPhoto) {
		this.vchPhoto = vchPhoto;
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