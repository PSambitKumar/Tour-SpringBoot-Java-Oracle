package com.csm.Model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "t_affiliate_local_partner")
public class TAffiliateLocalPartner {
	@Id
	@Column(name = "intAffLocalPartnerId", nullable = false)
	private Integer id;

	@Column(name = "intAffiliateTagentId")
	private Integer intAffiliateTagentId;

	@Column(name = "intTravelAgentId")
	private Integer intTravelAgentId;

	@Column(name = "intCatId")
	private Integer intCatId;

	@Column(name = "vchTime", length = 64)
	private String vchTime;

	@Lob
	@Column(name = "vchMessage")
	private String vchMessage;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "commission", precision = 5, scale = 2)
	private BigDecimal commission;

	@Column(name = "vchMOU", length = 80)
	private String vchMOU;

	@Column(name = "intFinalizeStatus")
	private Integer intFinalizeStatus;

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

	public Integer getIntTravelAgentId() {
		return intTravelAgentId;
	}

	public void setIntTravelAgentId(Integer intTravelAgentId) {
		this.intTravelAgentId = intTravelAgentId;
	}

	public Integer getIntCatId() {
		return intCatId;
	}

	public void setIntCatId(Integer intCatId) {
		this.intCatId = intCatId;
	}

	public String getVchTime() {
		return vchTime;
	}

	public void setVchTime(String vchTime) {
		this.vchTime = vchTime;
	}

	public String getVchMessage() {
		return vchMessage;
	}

	public void setVchMessage(String vchMessage) {
		this.vchMessage = vchMessage;
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

	public BigDecimal getCommission() {
		return commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public String getVchMOU() {
		return vchMOU;
	}

	public void setVchMOU(String vchMOU) {
		this.vchMOU = vchMOU;
	}

	public Integer getIntFinalizeStatus() {
		return intFinalizeStatus;
	}

	public void setIntFinalizeStatus(Integer intFinalizeStatus) {
		this.intFinalizeStatus = intFinalizeStatus;
	}

}