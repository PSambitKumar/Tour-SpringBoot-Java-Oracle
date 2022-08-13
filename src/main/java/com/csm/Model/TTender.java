package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "t_tender")
public class TTender {
	@Id
	@Column(name = "intTenderId", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "vchTenderNo", nullable = false, length = 64)
	private String vchTenderNo;

	@Column(name = "vchHeadlineE", nullable = false, length = 256)
	private String vchHeadlineE;

	@Column(name = "vchHeadlineH", length = 512)
	private String vchHeadlineH;

	@Column(name = "vchHeadlineM", length = 512)
	private String vchHeadlineM;

	@Column(name = "vchOpeningDate")
	private LocalDate vchOpeningDate;

	@Column(name = "vchClosingDate")
	private LocalDate vchClosingDate;

	@Column(name = "vchDoc1E", length = 64)
	private String vchDoc1E;

	@Column(name = "vchDoc2E", length = 64)
	private String vchDoc2E;

	@Column(name = "vchDoc3E", length = 64)
	private String vchDoc3E;

	@Column(name = "vchDoc1H", length = 64)
	private String vchDoc1H;

	@Column(name = "vchDoc2H", length = 64)
	private String vchDoc2H;

	@Column(name = "vchDoc3H", length = 64)
	private String vchDoc3H;

	@Column(name = "vchDoc1M", length = 64)
	private String vchDoc1M;

	@Column(name = "vchDoc2M", length = 64)
	private String vchDoc2M;

	@Column(name = "vchDoc3M", length = 64)
	private String vchDoc3M;

	@Column(name = "vchDescE", length = 512)
	private String vchDescE;

	@Column(name = "vchDescH", length = 1024)
	private String vchDescH;

	@Column(name = "vchDsecM", length = 1024)
	private String vchDsecM;

	@Column(name = "tinPubStatus")
	private Byte tinPubStatus;

	@Column(name = "tinArcStatus")
	private Byte tinArcStatus;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "stmUpdatedOn")
	private Instant stmUpdatedOn;

	@Column(name = "dtmArcOn")
	private Instant dtmArcOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "intInsertId")
	private Integer intInsertId;

	@Column(name = "dtmPublishOn")
	private LocalDate dtmPublishOn;

	@Column(name = "vchAlias", length = 256)
	private String vchAlias;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVchTenderNo() {
		return vchTenderNo;
	}

	public void setVchTenderNo(String vchTenderNo) {
		this.vchTenderNo = vchTenderNo;
	}

	public String getVchHeadlineE() {
		return vchHeadlineE;
	}

	public void setVchHeadlineE(String vchHeadlineE) {
		this.vchHeadlineE = vchHeadlineE;
	}

	public String getVchHeadlineH() {
		return vchHeadlineH;
	}

	public void setVchHeadlineH(String vchHeadlineH) {
		this.vchHeadlineH = vchHeadlineH;
	}

	public String getVchHeadlineM() {
		return vchHeadlineM;
	}

	public void setVchHeadlineM(String vchHeadlineM) {
		this.vchHeadlineM = vchHeadlineM;
	}

	public LocalDate getVchOpeningDate() {
		return vchOpeningDate;
	}

	public void setVchOpeningDate(LocalDate vchOpeningDate) {
		this.vchOpeningDate = vchOpeningDate;
	}

	public LocalDate getVchClosingDate() {
		return vchClosingDate;
	}

	public void setVchClosingDate(LocalDate vchClosingDate) {
		this.vchClosingDate = vchClosingDate;
	}

	public String getVchDoc1E() {
		return vchDoc1E;
	}

	public void setVchDoc1E(String vchDoc1E) {
		this.vchDoc1E = vchDoc1E;
	}

	public String getVchDoc2E() {
		return vchDoc2E;
	}

	public void setVchDoc2E(String vchDoc2E) {
		this.vchDoc2E = vchDoc2E;
	}

	public String getVchDoc3E() {
		return vchDoc3E;
	}

	public void setVchDoc3E(String vchDoc3E) {
		this.vchDoc3E = vchDoc3E;
	}

	public String getVchDoc1H() {
		return vchDoc1H;
	}

	public void setVchDoc1H(String vchDoc1H) {
		this.vchDoc1H = vchDoc1H;
	}

	public String getVchDoc2H() {
		return vchDoc2H;
	}

	public void setVchDoc2H(String vchDoc2H) {
		this.vchDoc2H = vchDoc2H;
	}

	public String getVchDoc3H() {
		return vchDoc3H;
	}

	public void setVchDoc3H(String vchDoc3H) {
		this.vchDoc3H = vchDoc3H;
	}

	public String getVchDoc1M() {
		return vchDoc1M;
	}

	public void setVchDoc1M(String vchDoc1M) {
		this.vchDoc1M = vchDoc1M;
	}

	public String getVchDoc2M() {
		return vchDoc2M;
	}

	public void setVchDoc2M(String vchDoc2M) {
		this.vchDoc2M = vchDoc2M;
	}

	public String getVchDoc3M() {
		return vchDoc3M;
	}

	public void setVchDoc3M(String vchDoc3M) {
		this.vchDoc3M = vchDoc3M;
	}

	public String getVchDescE() {
		return vchDescE;
	}

	public void setVchDescE(String vchDescE) {
		this.vchDescE = vchDescE;
	}

	public String getVchDescH() {
		return vchDescH;
	}

	public void setVchDescH(String vchDescH) {
		this.vchDescH = vchDescH;
	}

	public String getVchDsecM() {
		return vchDsecM;
	}

	public void setVchDsecM(String vchDsecM) {
		this.vchDsecM = vchDsecM;
	}

	public Byte getTinPubStatus() {
		return tinPubStatus;
	}

	public void setTinPubStatus(Byte tinPubStatus) {
		this.tinPubStatus = tinPubStatus;
	}

	public Byte getTinArcStatus() {
		return tinArcStatus;
	}

	public void setTinArcStatus(Byte tinArcStatus) {
		this.tinArcStatus = tinArcStatus;
	}

	public Integer getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Integer intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Integer getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Integer intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public Instant getStmUpdatedOn() {
		return stmUpdatedOn;
	}

	public void setStmUpdatedOn(Instant stmUpdatedOn) {
		this.stmUpdatedOn = stmUpdatedOn;
	}

	public Instant getDtmArcOn() {
		return dtmArcOn;
	}

	public void setDtmArcOn(Instant dtmArcOn) {
		this.dtmArcOn = dtmArcOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Integer getIntInsertId() {
		return intInsertId;
	}

	public void setIntInsertId(Integer intInsertId) {
		this.intInsertId = intInsertId;
	}

	public LocalDate getDtmPublishOn() {
		return dtmPublishOn;
	}

	public void setDtmPublishOn(LocalDate dtmPublishOn) {
		this.dtmPublishOn = dtmPublishOn;
	}

	public String getVchAlias() {
		return vchAlias;
	}

	public void setVchAlias(String vchAlias) {
		this.vchAlias = vchAlias;
	}

}