package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_covid_safety_room_service")
public class TCovidSafetyRoomService {
	@Id
	@Column(name = "intRoomServiceId", nullable = false)
	private Integer id;

	@Column(name = "intHotelId")
	private Integer intHotelId;

	@Column(name = "intFacilityId")
	private Integer intFacilityId;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "vchCreatedBy", length = 150)
	private String vchCreatedBy;

	@Lob
	@Column(name = "vchFood")
	private String vchFood;

	@Lob
	@Column(name = "vchRestaurant")
	private String vchRestaurant;

	@Lob
	@Column(name = "vchHousekeeping")
	private String vchHousekeeping;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntHotelId() {
		return intHotelId;
	}

	public void setIntHotelId(Integer intHotelId) {
		this.intHotelId = intHotelId;
	}

	public Integer getIntFacilityId() {
		return intFacilityId;
	}

	public void setIntFacilityId(Integer intFacilityId) {
		this.intFacilityId = intFacilityId;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public String getVchCreatedBy() {
		return vchCreatedBy;
	}

	public void setVchCreatedBy(String vchCreatedBy) {
		this.vchCreatedBy = vchCreatedBy;
	}

	public String getVchFood() {
		return vchFood;
	}

	public void setVchFood(String vchFood) {
		this.vchFood = vchFood;
	}

	public String getVchRestaurant() {
		return vchRestaurant;
	}

	public void setVchRestaurant(String vchRestaurant) {
		this.vchRestaurant = vchRestaurant;
	}

	public String getVchHousekeeping() {
		return vchHousekeeping;
	}

	public void setVchHousekeeping(String vchHousekeeping) {
		this.vchHousekeeping = vchHousekeeping;
	}

}