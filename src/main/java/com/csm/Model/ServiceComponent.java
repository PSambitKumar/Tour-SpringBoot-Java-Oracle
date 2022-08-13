package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class ServiceComponent {
	@Id
	@Column(name = "serviceComponentId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "buildNamespace", length = 75)
	private String buildNamespace;

	@Column(name = "buildNumber")
	private Long buildNumber;

	@Column(name = "buildDate")
	private Long buildDate;

	@Lob
	@Column(name = "data_")
	private String data;

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

	public String getBuildNamespace() {
		return buildNamespace;
	}

	public void setBuildNamespace(String buildNamespace) {
		this.buildNamespace = buildNamespace;
	}

	public Long getBuildNumber() {
		return buildNumber;
	}

	public void setBuildNumber(Long buildNumber) {
		this.buildNumber = buildNumber;
	}

	public Long getBuildDate() {
		return buildDate;
	}

	public void setBuildDate(Long buildDate) {
		this.buildDate = buildDate;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}