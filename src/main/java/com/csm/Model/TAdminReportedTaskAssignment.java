package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_admin_reported_task_assignment")
public class TAdminReportedTaskAssignment {
	@Id
	@Column(name = "intReportId", nullable = false)
	private Integer id;

	@Column(name = "intTaskId", nullable = false)
	private Integer intTaskId;

	@Column(name = "intUserId", length = 50)
	private String intUserId;

	@Column(name = "r_date", length = 45)
	private String rDate;

	@Column(name = "r_startTime", length = 45)
	private String rStarttime;

	@Column(name = "r_endTime", length = 45)
	private String rEndtime;

	@Lob
	@Column(name = "r_description")
	private String rDescription;

	@Column(name = "actualEffort")
	private Integer actualEffort;

	@Column(name = "r_status")
	private Integer rStatus;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "vchCreatedBy", length = 45)
	private String vchCreatedBy;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntTaskId() {
		return intTaskId;
	}

	public void setIntTaskId(Integer intTaskId) {
		this.intTaskId = intTaskId;
	}

	public String getIntUserId() {
		return intUserId;
	}

	public void setIntUserId(String intUserId) {
		this.intUserId = intUserId;
	}

	public String getRDate() {
		return rDate;
	}

	public void setRDate(String rDate) {
		this.rDate = rDate;
	}

	public String getRStarttime() {
		return rStarttime;
	}

	public void setRStarttime(String rStarttime) {
		this.rStarttime = rStarttime;
	}

	public String getREndtime() {
		return rEndtime;
	}

	public void setREndtime(String rEndtime) {
		this.rEndtime = rEndtime;
	}

	public String getRDescription() {
		return rDescription;
	}

	public void setRDescription(String rDescription) {
		this.rDescription = rDescription;
	}

	public Integer getActualEffort() {
		return actualEffort;
	}

	public void setActualEffort(Integer actualEffort) {
		this.actualEffort = actualEffort;
	}

	public Integer getRStatus() {
		return rStatus;
	}

	public void setRStatus(Integer rStatus) {
		this.rStatus = rStatus;
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

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}