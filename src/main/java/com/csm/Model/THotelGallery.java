package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_hotel_gallery")
public class THotelGallery {
	@Id
	@Column(name = "intHotelGalleryId", nullable = false)
	private Integer id;

	@Column(name = "intAgentHotelId")
	private Integer intAgentHotelId;

	@Column(name = "intType")
	private Integer intType;

	@Column(name = "vchImageName", length = 1028)
	private String vchImageName;

	@Column(name = "bitDeletedFlag")
	private Integer bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntAgentHotelId() {
		return intAgentHotelId;
	}

	public void setIntAgentHotelId(Integer intAgentHotelId) {
		this.intAgentHotelId = intAgentHotelId;
	}

	public Integer getIntType() {
		return intType;
	}

	public void setIntType(Integer intType) {
		this.intType = intType;
	}

	public String getVchImageName() {
		return vchImageName;
	}

	public void setVchImageName(String vchImageName) {
		this.vchImageName = vchImageName;
	}

	public Integer getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Integer bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}