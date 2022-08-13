package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_events_category")
public class TEventsCategory {
	@Id
	@Column(name = "intCatId", nullable = false)
	private Integer id;

	@Column(name = "vchCategoryName", length = 45)
	private String vchCategoryName;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

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

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}