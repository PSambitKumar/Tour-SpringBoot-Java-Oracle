package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_category_persona_master")
public class MCategoryPersonaMaster {
	@Id
	@Column(name = "intCatId", nullable = false)
	private Integer id;

	@Column(name = "intSubCatId")
	private Integer intSubCatId;

	@Column(name = "vchCatName", length = 20)
	private String vchCatName;

	@Column(name = "vchPageName", length = 100)
	private String vchPageName;

	@Column(name = "vchPageValue")
	private Float vchPageValue;

	@Column(name = "bitDeletedFlag")
	private Integer bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntSubCatId() {
		return intSubCatId;
	}

	public void setIntSubCatId(Integer intSubCatId) {
		this.intSubCatId = intSubCatId;
	}

	public String getVchCatName() {
		return vchCatName;
	}

	public void setVchCatName(String vchCatName) {
		this.vchCatName = vchCatName;
	}

	public String getVchPageName() {
		return vchPageName;
	}

	public void setVchPageName(String vchPageName) {
		this.vchPageName = vchPageName;
	}

	public Float getVchPageValue() {
		return vchPageValue;
	}

	public void setVchPageValue(Float vchPageValue) {
		this.vchPageValue = vchPageValue;
	}

	public Integer getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Integer bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}