package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "QUARTZ_FIRED_TRIGGERS")
public class QuartzFiredTrigger {
	@EmbeddedId
	private QuartzFiredTriggerId id;

	@Column(name = "TRIGGER_NAME", nullable = false, length = 200)
	private String triggerName;

	@Column(name = "TRIGGER_GROUP", nullable = false, length = 200)
	private String triggerGroup;

	@Column(name = "INSTANCE_NAME", nullable = false, length = 200)
	private String instanceName;

	@Column(name = "FIRED_TIME", nullable = false)
	private Long firedTime;

	@Column(name = "PRIORITY", nullable = false)
	private Integer priority;

	@Column(name = "STATE", nullable = false, length = 16)
	private String state;

	@Column(name = "JOB_NAME", length = 200)
	private String jobName;

	@Column(name = "JOB_GROUP", length = 200)
	private String jobGroup;

	@Column(name = "IS_NONCONCURRENT")
	private Byte isNonconcurrent;

	@Column(name = "REQUESTS_RECOVERY")
	private Byte requestsRecovery;

	public QuartzFiredTriggerId getId() {
		return id;
	}

	public void setId(QuartzFiredTriggerId id) {
		this.id = id;
	}

	public String getTriggerName() {
		return triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

	public String getTriggerGroup() {
		return triggerGroup;
	}

	public void setTriggerGroup(String triggerGroup) {
		this.triggerGroup = triggerGroup;
	}

	public String getInstanceName() {
		return instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public Long getFiredTime() {
		return firedTime;
	}

	public void setFiredTime(Long firedTime) {
		this.firedTime = firedTime;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobGroup() {
		return jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}

	public Byte getIsNonconcurrent() {
		return isNonconcurrent;
	}

	public void setIsNonconcurrent(Byte isNonconcurrent) {
		this.isNonconcurrent = isNonconcurrent;
	}

	public Byte getRequestsRecovery() {
		return requestsRecovery;
	}

	public void setRequestsRecovery(Byte requestsRecovery) {
		this.requestsRecovery = requestsRecovery;
	}

}