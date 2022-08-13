package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class ExpandoValue {
	@Id
	@Column(name = "valueId", nullable = false)
	private Long id;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "tableId")
	private Long tableId;

	@Column(name = "columnId")
	private Long columnId;

	@Column(name = "rowId_")
	private Long rowid;

	@Column(name = "classNameId")
	private Long classNameId;

	@Column(name = "classPK")
	private Long classPK;

	@Lob
	@Column(name = "data_")
	private String data;

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

	public Long getColumnId() {
		return columnId;
	}

	public void setColumnId(Long columnId) {
		this.columnId = columnId;
	}

	public Long getRowid() {
		return rowid;
	}

	public void setRowid(Long rowid) {
		this.rowid = rowid;
	}

	public Long getClassNameId() {
		return classNameId;
	}

	public void setClassNameId(Long classNameId) {
		this.classNameId = classNameId;
	}

	public Long getClassPK() {
		return classPK;
	}

	public void setClassPK(Long classPK) {
		this.classPK = classPK;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}