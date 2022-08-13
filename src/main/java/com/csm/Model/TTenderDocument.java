package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_tender_document")
public class TTenderDocument {
	@Id
	@Column(name = "intDoctId", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "intTenderId", nullable = false)
	private Integer intTenderId;

	@Column(name = "intDocType", nullable = false)
	private Integer intDocType;

	@Lob
	@Column(name = "vchDocumentE")
	private String vchDocumentE;

	@Column(name = "tinPubStatus")
	private Byte tinPubStatus;

	@Column(name = "stmCreatedOn")
	private Instant stmCreatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "intTypeId")
	private Integer intTypeId;

	@Column(name = "dtmCorrigendumPubDtFrom")
	private Instant dtmCorrigendumPubDtFrom;

	@Column(name = "dtmCorrigendumPubDtTo")
	private Instant dtmCorrigendumPubDtTo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIntTenderId() {
		return intTenderId;
	}

	public void setIntTenderId(Integer intTenderId) {
		this.intTenderId = intTenderId;
	}

	public Integer getIntDocType() {
		return intDocType;
	}

	public void setIntDocType(Integer intDocType) {
		this.intDocType = intDocType;
	}

	public String getVchDocumentE() {
		return vchDocumentE;
	}

	public void setVchDocumentE(String vchDocumentE) {
		this.vchDocumentE = vchDocumentE;
	}

	public Byte getTinPubStatus() {
		return tinPubStatus;
	}

	public void setTinPubStatus(Byte tinPubStatus) {
		this.tinPubStatus = tinPubStatus;
	}

	public Instant getStmCreatedOn() {
		return stmCreatedOn;
	}

	public void setStmCreatedOn(Instant stmCreatedOn) {
		this.stmCreatedOn = stmCreatedOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Integer getIntTypeId() {
		return intTypeId;
	}

	public void setIntTypeId(Integer intTypeId) {
		this.intTypeId = intTypeId;
	}

	public Instant getDtmCorrigendumPubDtFrom() {
		return dtmCorrigendumPubDtFrom;
	}

	public void setDtmCorrigendumPubDtFrom(Instant dtmCorrigendumPubDtFrom) {
		this.dtmCorrigendumPubDtFrom = dtmCorrigendumPubDtFrom;
	}

	public Instant getDtmCorrigendumPubDtTo() {
		return dtmCorrigendumPubDtTo;
	}

	public void setDtmCorrigendumPubDtTo(Instant dtmCorrigendumPubDtTo) {
		this.dtmCorrigendumPubDtTo = dtmCorrigendumPubDtTo;
	}

}