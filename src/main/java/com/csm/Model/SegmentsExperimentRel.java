package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class SegmentsExperimentRel {
	@Id
	@Column(name = "segmentsExperimentRelId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "groupId")
	private Long groupId;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "userId")
	private Long userId;

	@Column(name = "userName", length = 75)
	private String userName;

	@Column(name = "createDate")
	private Instant createDate;

	@Column(name = "modifiedDate")
	private Instant modifiedDate;

	@Column(name = "segmentsExperimentId")
	private Long segmentsExperimentId;

	@Column(name = "segmentsExperienceId")
	private Long segmentsExperienceId;

	@Column(name = "split")
	private Double split;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMvccVersion() {
		return mvccVersion;
	}

	public void setMvccVersion(Long mvccVersion) {
		this.mvccVersion = mvccVersion;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Instant getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Instant createDate) {
		this.createDate = createDate;
	}

	public Instant getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Instant modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Long getSegmentsExperimentId() {
		return segmentsExperimentId;
	}

	public void setSegmentsExperimentId(Long segmentsExperimentId) {
		this.segmentsExperimentId = segmentsExperimentId;
	}

	public Long getSegmentsExperienceId() {
		return segmentsExperienceId;
	}

	public void setSegmentsExperienceId(Long segmentsExperienceId) {
		this.segmentsExperienceId = segmentsExperienceId;
	}

	public Double getSplit() {
		return split;
	}

	public void setSplit(Double split) {
		this.split = split;
	}

}