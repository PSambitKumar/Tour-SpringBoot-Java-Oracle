package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_otdc_gallery")
public class TOtdcGallery {
	@Id
	@Column(name = "intOtdcGalleryId", nullable = false)
	private Integer id;

	@Column(name = "intOtdcRefId")
	private Integer intOtdcRefId;

	@Column(name = "intRoomTypeId")
	private Integer intRoomTypeId;

	@Column(name = "vchImageName", length = 128)
	private String vchImageName;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntOtdcRefId() {
		return intOtdcRefId;
	}

	public void setIntOtdcRefId(Integer intOtdcRefId) {
		this.intOtdcRefId = intOtdcRefId;
	}

	public Integer getIntRoomTypeId() {
		return intRoomTypeId;
	}

	public void setIntRoomTypeId(Integer intRoomTypeId) {
		this.intRoomTypeId = intRoomTypeId;
	}

	public String getVchImageName() {
		return vchImageName;
	}

	public void setVchImageName(String vchImageName) {
		this.vchImageName = vchImageName;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}