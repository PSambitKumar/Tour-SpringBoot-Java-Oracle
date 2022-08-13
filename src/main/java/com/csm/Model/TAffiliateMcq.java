package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_affiliate_mcq")
public class TAffiliateMcq {
	@Id
	@Column(name = "intMcqId", nullable = false)
	private Integer id;

	@Column(name = "intAffiliateTagentId", nullable = false)
	private Integer intAffiliateTagentId;

	@Column(name = "intQuestionId", nullable = false)
	private Integer intQuestionId;

	@Column(name = "intCategoryId", nullable = false)
	private Integer intCategoryId;

	@Column(name = "vchQusImage", length = 25)
	private String vchQusImage;

	@Column(name = "intResultStatus")
	private Integer intResultStatus;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntAffiliateTagentId() {
		return intAffiliateTagentId;
	}

	public void setIntAffiliateTagentId(Integer intAffiliateTagentId) {
		this.intAffiliateTagentId = intAffiliateTagentId;
	}

	public Integer getIntQuestionId() {
		return intQuestionId;
	}

	public void setIntQuestionId(Integer intQuestionId) {
		this.intQuestionId = intQuestionId;
	}

	public Integer getIntCategoryId() {
		return intCategoryId;
	}

	public void setIntCategoryId(Integer intCategoryId) {
		this.intCategoryId = intCategoryId;
	}

	public String getVchQusImage() {
		return vchQusImage;
	}

	public void setVchQusImage(String vchQusImage) {
		this.vchQusImage = vchQusImage;
	}

	public Integer getIntResultStatus() {
		return intResultStatus;
	}

	public void setIntResultStatus(Integer intResultStatus) {
		this.intResultStatus = intResultStatus;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}