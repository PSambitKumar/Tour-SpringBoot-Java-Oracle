package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_covid_safety_amenities")
public class TCovidSafetyAmenity {
	@Id
	@Column(name = "intAmenityId", nullable = false)
	private Integer id;

	@Column(name = "intHotelId")
	private Integer intHotelId;

	@Lob
	@Column(name = "vchAmenitiesCategory")
	private String vchAmenitiesCategory;

	@Lob
	@Column(name = "vchAmenities")
	private String vchAmenities;

	@Lob
	@Column(name = "vchAmenitiesIcon")
	private String vchAmenitiesIcon;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "vchCreatedBy", length = 150)
	private String vchCreatedBy;

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

	public String getVchAmenitiesCategory() {
		return vchAmenitiesCategory;
	}

	public void setVchAmenitiesCategory(String vchAmenitiesCategory) {
		this.vchAmenitiesCategory = vchAmenitiesCategory;
	}

	public String getVchAmenities() {
		return vchAmenities;
	}

	public void setVchAmenities(String vchAmenities) {
		this.vchAmenities = vchAmenities;
	}

	public String getVchAmenitiesIcon() {
		return vchAmenitiesIcon;
	}

	public void setVchAmenitiesIcon(String vchAmenitiesIcon) {
		this.vchAmenitiesIcon = vchAmenitiesIcon;
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

}