package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_covid_safety_amenities_master")
public class TCovidSafetyAmenitiesMaster {
	@Id
	@Column(name = "intId", nullable = false)
	private Integer id;

	@Lob
	@Column(name = "vchAmenities")
	private String vchAmenities;

	@Column(name = "vchIcon", length = 200)
	private String vchIcon;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchAmenities() {
		return vchAmenities;
	}

	public void setVchAmenities(String vchAmenities) {
		this.vchAmenities = vchAmenities;
	}

	public String getVchIcon() {
		return vchIcon;
	}

	public void setVchIcon(String vchIcon) {
		this.vchIcon = vchIcon;
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

}