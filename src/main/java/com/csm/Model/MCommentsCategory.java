package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_comments_category")
public class MCommentsCategory {
	@Id
	@Column(name = "intCategoryId", nullable = false)
	private Integer id;

	@Column(name = "vchCategoryName", length = 45)
	private String vchCategoryName;

	@Column(name = "vchTableName", length = 45)
	private String vchTableName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchCategoryName() {
		return vchCategoryName;
	}

	public void setVchCategoryName(String vchCategoryName) {
		this.vchCategoryName = vchCategoryName;
	}

	public String getVchTableName() {
		return vchTableName;
	}

	public void setVchTableName(String vchTableName) {
		this.vchTableName = vchTableName;
	}

}