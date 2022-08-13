package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class ExpandoColumn {
	@Id
	@Column(name = "columnId", nullable = false)
	private Long id;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "tableId")
	private Long tableId;

	@Column(name = "name", length = 75)
	private String name;

	@Column(name = "type_")
	private Integer type;

	@Lob
	@Column(name = "defaultData")
	private String defaultData;

	@Lob
	@Column(name = "typeSettings")
	private String typeSettings;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getTableId() {
		return tableId;
	}

	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getDefaultData() {
		return defaultData;
	}

	public void setDefaultData(String defaultData) {
		this.defaultData = defaultData;
	}

	public String getTypeSettings() {
		return typeSettings;
	}

	public void setTypeSettings(String typeSettings) {
		this.typeSettings = typeSettings;
	}

}