package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_covid_safety_instructions")
public class TCovidSafetyInstruction {
	@Id
	@Column(name = "instructionId", nullable = false)
	private Integer id;

	@Column(name = "intHotelId")
	private Integer intHotelId;

	@Lob
	@Column(name = "vchInstructions")
	private String vchInstructions;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "vchCreatedBy", length = 150)
	private String vchCreatedBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntHotelId() {
		return intHotelId;
	}

	public void setIntHotelId(Integer intHotelId) {
		this.intHotelId = intHotelId;
	}

	public String getVchInstructions() {
		return vchInstructions;
	}

	public void setVchInstructions(String vchInstructions) {
		this.vchInstructions = vchInstructions;
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

	public String getVchCreatedBy() {
		return vchCreatedBy;
	}

	public void setVchCreatedBy(String vchCreatedBy) {
		this.vchCreatedBy = vchCreatedBy;
	}

}