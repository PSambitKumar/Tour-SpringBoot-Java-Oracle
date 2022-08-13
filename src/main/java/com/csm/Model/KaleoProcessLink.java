package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KaleoProcessLink {
	@Id
	@Column(name = "kaleoProcessLinkId", nullable = false)
	private Long id;

	@Column(name = "kaleoProcessId")
	private Long kaleoProcessId;

	@Column(name = "workflowTaskName", length = 75)
	private String workflowTaskName;

	@Column(name = "DDMTemplateId")
	private Long dDMTemplateId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getKaleoProcessId() {
		return kaleoProcessId;
	}

	public void setKaleoProcessId(Long kaleoProcessId) {
		this.kaleoProcessId = kaleoProcessId;
	}

	public String getWorkflowTaskName() {
		return workflowTaskName;
	}

	public void setWorkflowTaskName(String workflowTaskName) {
		this.workflowTaskName = workflowTaskName;
	}

	public Long getDDMTemplateId() {
		return dDMTemplateId;
	}

	public void setDDMTemplateId(Long dDMTemplateId) {
		this.dDMTemplateId = dDMTemplateId;
	}

}