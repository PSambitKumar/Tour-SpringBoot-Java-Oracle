package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_hotel_facility")
public class THotelFacility {
	@Id
	@Column(name = "intHotelFacilityId", nullable = false)
	private Integer id;

	@Column(name = "intAgentHotelId")
	private Integer intAgentHotelId;

	@Column(name = "intFacilityId")
	private Integer intFacilityId;

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

	public Integer getIntFacilityId() {
		return intFacilityId;
	}

	public void setIntFacilityId(Integer intFacilityId) {
		this.intFacilityId = intFacilityId;
	}

	public Integer getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Integer bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}