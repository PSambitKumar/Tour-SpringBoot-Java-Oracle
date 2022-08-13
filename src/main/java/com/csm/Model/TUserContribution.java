package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_user_contribution")
public class TUserContribution {
	@Id
	@Column(name = "intContributionId", nullable = false)
	private Integer id;

	@Column(name = "intUserId")
	private Integer intUserId;

	@Lob
	@Column(name = "vchContributionText")
	private String vchContributionText;

	@Column(name = "vchDocument", length = 45)
	private String vchDocument;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntUserId() {
		return intUserId;
	}

	public void setIntUserId(Integer intUserId) {
		this.intUserId = intUserId;
	}

	public String getVchContributionText() {
		return vchContributionText;
	}

	public void setVchContributionText(String vchContributionText) {
		this.vchContributionText = vchContributionText;
	}

	public String getVchDocument() {
		return vchDocument;
	}

	public void setVchDocument(String vchDocument) {
		this.vchDocument = vchDocument;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}