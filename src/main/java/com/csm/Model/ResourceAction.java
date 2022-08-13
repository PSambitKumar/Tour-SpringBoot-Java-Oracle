package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ResourceAction {
	@Id
	@Column(name = "resourceActionId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "name")
	private String name;

	@Column(name = "actionId", length = 75)
	private String actionId;

	@Column(name = "bitwiseValue")
	private Long bitwiseValue;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActionId() {
		return actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public Long getBitwiseValue() {
		return bitwiseValue;
	}

	public void setBitwiseValue(Long bitwiseValue) {
		this.bitwiseValue = bitwiseValue;
	}

}