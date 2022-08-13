package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "QUARTZ_JOB_DETAILS")
public class QuartzJobDetail {
	@EmbeddedId
	private QuartzJobDetailId id;

	@Column(name = "DESCRIPTION", length = 250)
	private String description;

	@Column(name = "JOB_CLASS_NAME", nullable = false, length = 250)
	private String jobClassName;

	@Column(name = "IS_DURABLE", nullable = false)
	private Byte isDurable;

	@Column(name = "IS_NONCONCURRENT", nullable = false)
	private Byte isNonconcurrent;

	@Column(name = "IS_UPDATE_DATA", nullable = false)
	private Byte isUpdateData;

	@Column(name = "REQUESTS_RECOVERY", nullable = false)
	private Byte requestsRecovery;

	@Column(name = "JOB_DATA")
	private byte[] jobData;

	public QuartzJobDetailId getId() {
		return id;
	}

	public void setId(QuartzJobDetailId id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJobClassName() {
		return jobClassName;
	}

	public void setJobClassName(String jobClassName) {
		this.jobClassName = jobClassName;
	}

	public Byte getIsDurable() {
		return isDurable;
	}

	public void setIsDurable(Byte isDurable) {
		this.isDurable = isDurable;
	}

	public Byte getIsNonconcurrent() {
		return isNonconcurrent;
	}

	public void setIsNonconcurrent(Byte isNonconcurrent) {
		this.isNonconcurrent = isNonconcurrent;
	}

	public Byte getIsUpdateData() {
		return isUpdateData;
	}

	public void setIsUpdateData(Byte isUpdateData) {
		this.isUpdateData = isUpdateData;
	}

	public Byte getRequestsRecovery() {
		return requestsRecovery;
	}

	public void setRequestsRecovery(Byte requestsRecovery) {
		this.requestsRecovery = requestsRecovery;
	}

	public byte[] getJobData() {
		return jobData;
	}

	public void setJobData(byte[] jobData) {
		this.jobData = jobData;
	}

}