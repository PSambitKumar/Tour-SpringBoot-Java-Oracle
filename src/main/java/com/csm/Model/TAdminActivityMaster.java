package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_admin_activity_master")
public class TAdminActivityMaster {
	@Id
	@Column(name = "intActivityId", nullable = false)
	private Integer id;

	@Lob
	@Column(name = "vchActivityName")
	private String vchActivityName;

	@Column(name = "vchPlanStartDate", length = 24)
	private String vchPlanStartDate;

	@Column(name = "vchPlanEndDate", length = 24)
	private String vchPlanEndDate;

	@Column(name = "vchActivityEffort", length = 24)
	private String vchActivityEffort;

	@Lob
	@Column(name = "vchDescription")
	private String vchDescription;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "vchCreatedBy", length = 150)
	private String vchCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "vchUpdatedBy", length = 150)
	private String vchUpdatedBy;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchActivityName() {
		return vchActivityName;
	}

	public void setVchActivityName(String vchActivityName) {
		this.vchActivityName = vchActivityName;
	}

	public String getVchPlanStartDate() {
		return vchPlanStartDate;
	}

	public void setVchPlanStartDate(String vchPlanStartDate) {
		this.vchPlanStartDate = vchPlanStartDate;
	}

	public String getVchPlanEndDate() {
		return vchPlanEndDate;
	}

	public void setVchPlanEndDate(String vchPlanEndDate) {
		this.vchPlanEndDate = vchPlanEndDate;
	}

	public String getVchActivityEffort() {
		return vchActivityEffort;
	}

	public void setVchActivityEffort(String vchActivityEffort) {
		this.vchActivityEffort = vchActivityEffort;
	}

	public String getVchDescription() {
		return vchDescription;
	}

	public void setVchDescription(String vchDescription) {
		this.vchDescription = vchDescription;
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

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public String getVchUpdatedBy() {
		return vchUpdatedBy;
	}

	public void setVchUpdatedBy(String vchUpdatedBy) {
		this.vchUpdatedBy = vchUpdatedBy;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}