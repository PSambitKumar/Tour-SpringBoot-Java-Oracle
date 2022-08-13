package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_admin_task_assignment")
public class TAdminTaskAssignment {
	@Id
	@Column(name = "intTaskId", nullable = false)
	private Integer id;

	@Column(name = "intSubActivityId", nullable = false)
	private Integer intSubActivityId;

	@Column(name = "intActivityId", nullable = false)
	private Integer intActivityId;

	@Column(name = "intUserId", length = 50)
	private String intUserId;

	@Lob
	@Column(name = "task_name")
	private String taskName;

	@Column(name = "assigned_by", length = 50)
	private String assignedBy;

	@Column(name = "assigned_to", length = 50)
	private String assignedTo;

	@Column(name = "totalEffort")
	private Integer totalEffort;

	@Column(name = "activitystartDate")
	private Instant activitystartDate;

	@Column(name = "activityendDate")
	private Instant activityendDate;

	@Column(name = "priority")
	private Integer priority;

	@Lob
	@Column(name = "description")
	private String description;

	@Column(name = "vchClientName", length = 50)
	private String vchClientName;

	@Column(name = "vchDesignation", length = 150)
	private String vchDesignation;

	@Column(name = "date_of_assign", length = 24)
	private String dateOfAssign;

	@Column(name = "vchstatus")
	private Boolean vchstatus;

	@Column(name = "actualEffort")
	private Integer actualEffort;

	@Column(name = "r_date", length = 24)
	private String rDate;

	@Column(name = "r_startTime", length = 45)
	private String rStarttime;

	@Column(name = "r_endTime", length = 45)
	private String rEndtime;

	@Lob
	@Column(name = "r_description")
	private String rDescription;

	@Column(name = "r_hours")
	private Integer rHours;

	@Column(name = "r_status")
	private Integer rStatus;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "vchUpdatedBy", length = 50)
	private String vchUpdatedBy;

	@Column(name = "vchUpdatedOn")
	private Instant vchUpdatedOn;

	@Column(name = "vchCreatedBy", length = 50)
	private String vchCreatedBy;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntSubActivityId() {
		return intSubActivityId;
	}

	public void setIntSubActivityId(Integer intSubActivityId) {
		this.intSubActivityId = intSubActivityId;
	}

	public Integer getIntActivityId() {
		return intActivityId;
	}

	public void setIntActivityId(Integer intActivityId) {
		this.intActivityId = intActivityId;
	}

	public String getIntUserId() {
		return intUserId;
	}

	public void setIntUserId(String intUserId) {
		this.intUserId = intUserId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getAssignedBy() {
		return assignedBy;
	}

	public void setAssignedBy(String assignedBy) {
		this.assignedBy = assignedBy;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public Integer getTotalEffort() {
		return totalEffort;
	}

	public void setTotalEffort(Integer totalEffort) {
		this.totalEffort = totalEffort;
	}

	public Instant getActivitystartDate() {
		return activitystartDate;
	}

	public void setActivitystartDate(Instant activitystartDate) {
		this.activitystartDate = activitystartDate;
	}

	public Instant getActivityendDate() {
		return activityendDate;
	}

	public void setActivityendDate(Instant activityendDate) {
		this.activityendDate = activityendDate;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVchClientName() {
		return vchClientName;
	}

	public void setVchClientName(String vchClientName) {
		this.vchClientName = vchClientName;
	}

	public String getVchDesignation() {
		return vchDesignation;
	}

	public void setVchDesignation(String vchDesignation) {
		this.vchDesignation = vchDesignation;
	}

	public String getDateOfAssign() {
		return dateOfAssign;
	}

	public void setDateOfAssign(String dateOfAssign) {
		this.dateOfAssign = dateOfAssign;
	}

	public Boolean getVchstatus() {
		return vchstatus;
	}

	public void setVchstatus(Boolean vchstatus) {
		this.vchstatus = vchstatus;
	}

	public Integer getActualEffort() {
		return actualEffort;
	}

	public void setActualEffort(Integer actualEffort) {
		this.actualEffort = actualEffort;
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

	public Integer getRHours() {
		return rHours;
	}

	public void setRHours(Integer rHours) {
		this.rHours = rHours;
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

	public String getVchUpdatedBy() {
		return vchUpdatedBy;
	}

	public void setVchUpdatedBy(String vchUpdatedBy) {
		this.vchUpdatedBy = vchUpdatedBy;
	}

	public Instant getVchUpdatedOn() {
		return vchUpdatedOn;
	}

	public void setVchUpdatedOn(Instant vchUpdatedOn) {
		this.vchUpdatedOn = vchUpdatedOn;
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