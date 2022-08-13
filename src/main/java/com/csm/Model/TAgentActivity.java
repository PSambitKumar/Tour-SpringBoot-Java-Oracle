package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_agent_activities")
public class TAgentActivity {
	@Id
	@Column(name = "intActivityId", nullable = false)
	private Integer id;

	@Column(name = "intAgentAppId")
	private Integer intAgentAppId;

	@Column(name = "vchCharteredAccountantCerti", length = 100)
	private String vchCharteredAccountantCerti;

	@Column(name = "intSpecialTouristGroup")
	private Integer intSpecialTouristGroup;

	@Column(name = "intSize", length = 20)
	private String intSize;

	@Column(name = "intFrequency", length = 20)
	private String intFrequency;

	@Column(name = "vchStepsTaken", length = 500)
	private String vchStepsTaken;

	@Column(name = "vchspecialPragramme", length = 500)
	private String vchspecialPragramme;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

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

	public Integer getIntAgentAppId() {
		return intAgentAppId;
	}

	public void setIntAgentAppId(Integer intAgentAppId) {
		this.intAgentAppId = intAgentAppId;
	}

	public String getVchCharteredAccountantCerti() {
		return vchCharteredAccountantCerti;
	}

	public void setVchCharteredAccountantCerti(String vchCharteredAccountantCerti) {
		this.vchCharteredAccountantCerti = vchCharteredAccountantCerti;
	}

	public Integer getIntSpecialTouristGroup() {
		return intSpecialTouristGroup;
	}

	public void setIntSpecialTouristGroup(Integer intSpecialTouristGroup) {
		this.intSpecialTouristGroup = intSpecialTouristGroup;
	}

	public String getIntSize() {
		return intSize;
	}

	public void setIntSize(String intSize) {
		this.intSize = intSize;
	}

	public String getIntFrequency() {
		return intFrequency;
	}

	public void setIntFrequency(String intFrequency) {
		this.intFrequency = intFrequency;
	}

	public String getVchStepsTaken() {
		return vchStepsTaken;
	}

	public void setVchStepsTaken(String vchStepsTaken) {
		this.vchStepsTaken = vchStepsTaken;
	}

	public String getVchspecialPragramme() {
		return vchspecialPragramme;
	}

	public void setVchspecialPragramme(String vchspecialPragramme) {
		this.vchspecialPragramme = vchspecialPragramme;
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

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}