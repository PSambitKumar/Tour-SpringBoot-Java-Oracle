package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_student_info")
public class TStudentInfo {
	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "vchName", length = 100)
	private String vchName;

	@Column(name = "vchFathername", length = 100)
	private String vchFathername;

	@Column(name = "vchMothername", length = 100)
	private String vchMothername;

	@Column(name = "vchAddress", length = 200)
	private String vchAddress;

	@Column(name = "vchGender", length = 10)
	private String vchGender;

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

	public String getVchName() {
		return vchName;
	}

	public void setVchName(String vchName) {
		this.vchName = vchName;
	}

	public String getVchFathername() {
		return vchFathername;
	}

	public void setVchFathername(String vchFathername) {
		this.vchFathername = vchFathername;
	}

	public String getVchMothername() {
		return vchMothername;
	}

	public void setVchMothername(String vchMothername) {
		this.vchMothername = vchMothername;
	}

	public String getVchAddress() {
		return vchAddress;
	}

	public void setVchAddress(String vchAddress) {
		this.vchAddress = vchAddress;
	}

	public String getVchGender() {
		return vchGender;
	}

	public void setVchGender(String vchGender) {
		this.vchGender = vchGender;
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