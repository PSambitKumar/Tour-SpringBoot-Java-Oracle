package com.csm.Model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "t_tender_document_upload")
public class TenderUploadDocument {
	@Id
	@Column(name = "intTenderDocId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int intTenderDocId;
	@ManyToOne
	@JoinColumn(name = "intTenderId", referencedColumnName = "intTenderId")
	private TenderUpload TenderId;
	@Column(name = "vchUploadedDocTitle")
	private String vchUploadedDocTitle;
	@Column(name = "vchUploadedDoc")
	private String vchUploadedDoc;
	@Column(name = "dtmCreatedOn")
	private Date dtmCreatedOn;
	@Column(name = "bitDeletedFlag")
	private  Boolean bitDeletedFlag;
	@Column(name = "dtmUpdatedOn")
	private Date dtmUpdatedOn;
	@Column(name = "vchCreatedBy")
	private String vchCreatedBy;

	public int getIntTenderDocId() {
		return intTenderDocId;
	}

	public void setIntTenderDocId(int intTenderDocId) {
		this.intTenderDocId = intTenderDocId;
	}

	public TenderUpload getTenderId() {
		return TenderId;
	}

	public void setTenderId(TenderUpload tenderId) {
		TenderId = tenderId;
	}

	public String getVchUploadedDocTitle() {
		return vchUploadedDocTitle;
	}

	public void setVchUploadedDocTitle(String vchUploadedDocTitle) {
		this.vchUploadedDocTitle = vchUploadedDocTitle;
	}

	public String getVchUploadedDoc() {
		return vchUploadedDoc;
	}

	public void setVchUploadedDoc(String vchUploadedDoc) {
		this.vchUploadedDoc = vchUploadedDoc;
	}

	public Date getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Date dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Date getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Date dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public String getVchCreatedBy() {
		return vchCreatedBy;
	}

	public void setVchCreatedBy(String vchCreatedBy) {
		this.vchCreatedBy = vchCreatedBy;
	}

	@Override
	public String toString() {
		return "TenderUploadDocument{" +
			   "intTenderDocId=" + intTenderDocId +
			   ", TenderId=" + TenderId +
			   ", vchUploadedDocTitle='" + vchUploadedDocTitle + '\'' +
			   ", vchUploadedDoc='" + vchUploadedDoc + '\'' +
			   ", dtmCreatedOn=" + dtmCreatedOn +
			   ", bitDeletedFlag=" + bitDeletedFlag +
			   ", dtmUpdatedOn=" + dtmUpdatedOn +
			   ", vchCreatedBy='" + vchCreatedBy + '\'' +
			   '}';
	}
}
