package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_way_side_amenities")
public class TWaySideAmenity {
	@Id
	@Column(name = "WacId", nullable = false)
	private Integer id;

	@Column(name = "District", length = 25)
	private String district;

	@Column(name = "Division", length = 25)
	private String division;

	@Column(name = "Location_name", length = 25)
	private String locationName;

	@Column(name = "Name_of_the_road", length = 250)
	private String nameOfTheRoad;

	@Column(name = "Lat", length = 50)
	private String lat;

	@Column(name = "Longitude", length = 50)
	private String longitude;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getNameOfTheRoad() {
		return nameOfTheRoad;
	}

	public void setNameOfTheRoad(String nameOfTheRoad) {
		this.nameOfTheRoad = nameOfTheRoad;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}