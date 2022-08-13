package com.csm.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_tender_upload")
public class TenderUpload {
	@Id
	@Column(name = "intTenderId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int intTenderId;
	@Column(name = "vchStatus")
	private String vchStatus;
	@Column(name = "vchTitle")
	private String vchTitle;
	@Column(name = "vchSubmissionDate")
	private String vchSubmissionDate;
	@Column(name = "vchTime")
	private String vchTime;
	@Column(name = "dtmCreatedOn")
	private Date dtmCreatedOn;
	@Column(name = "bitDeletedFlag")
	private  Boolean bitDeletedFlag;
	@Column(name = "vchCreatedBy")
	private String vchCreatedBy;
	@Column(name = "dtmUpdatedOn")
	private Date dtmUpdatedOn;
	@Column(name = "intArchiveStatus", length = 1)
	private int intArchiveStatus;

	public int getIntTenderId() {
		return intTenderId;
	}

	public void setIntTenderId(int intTenderId) {
		this.intTenderId = intTenderId;
	}

	public String getVchStatus() {
		return vchStatus;
	}

	public void setVchStatus(String vchStatus) {
		this.vchStatus = vchStatus;
	}

	public String getVchTitle() {
		return vchTitle;
	}

	public void setVchTitle(String vchTitle) {
		this.vchTitle = vchTitle;
	}

	public String getVchSubmissionDate() {
		return vchSubmissionDate;
	}

	public void setVchSubmissionDate(String vchSubmissionDate) {
		this.vchSubmissionDate = vchSubmissionDate;
	}

	public String getVchTime() {
		return vchTime;
	}

	public void setVchTime(String vchTime) {
		this.vchTime = vchTime;
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

	public String getVchCreatedBy() {
		return vchCreatedBy;
	}

	public void setVchCreatedBy(String vchCreatedBy) {
		this.vchCreatedBy = vchCreatedBy;
	}

	public Date getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Date dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public int getIntArchiveStatus() {
		return intArchiveStatus;
	}

	public void setIntArchiveStatus(int intArchiveStatus) {
		this.intArchiveStatus = intArchiveStatus;
	}

	@Override
	public String toString() {
		return "TenderUpload{" +
			   "intTenderId=" + intTenderId +
			   ", vchStatus='" + vchStatus + '\'' +
			   ", vchTitle='" + vchTitle + '\'' +
			   ", vchSubmissionDate='" + vchSubmissionDate + '\'' +
			   ", vchTime='" + vchTime + '\'' +
			   ", dtmCreatedOn=" + dtmCreatedOn +
			   ", bitDeletedFlag=" + bitDeletedFlag +
			   ", vchCreatedBy='" + vchCreatedBy + '\'' +
			   ", dtmUpdatedOn=" + dtmUpdatedOn +
			   ", intArchiveStatus=" + intArchiveStatus +
			   '}';
	}
}
