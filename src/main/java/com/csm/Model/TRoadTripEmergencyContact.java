package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_road_trip_emergency_contact")
public class TRoadTripEmergencyContact {
	@Id
	@Column(name = "intEmergencyId", nullable = false)
	private Integer id;

	@Column(name = "intTripId")
	private Integer intTripId;

	@Column(name = "vchContactNumber", length = 30)
	private String vchContactNumber;

	@Column(name = "vchContactPerson", length = 150)
	private String vchContactPerson;

	@Column(name = "vchOrganization", length = 200)
	private String vchOrganization;

	@Column(name = "vchdesignation", length = 200)
	private String vchdesignation;

	@Column(name = "intDestinationId")
	private Integer intDestinationId;

	@Column(name = "vchLatitude", length = 150)
	private String vchLatitude;

	@Column(name = "vchLongitude", length = 150)
	private String vchLongitude;

	@Column(name = "intSos")
	private Integer intSos;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "vchCreatedBy", length = 150)
	private String vchCreatedBy;

	@Column(name = "intUpdatedBy")
	private Integer intUpdatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntTripId() {
		return intTripId;
	}

	public void setIntTripId(Integer intTripId) {
		this.intTripId = intTripId;
	}

	public String getVchContactNumber() {
		return vchContactNumber;
	}

	public void setVchContactNumber(String vchContactNumber) {
		this.vchContactNumber = vchContactNumber;
	}

	public String getVchContactPerson() {
		return vchContactPerson;
	}

	public void setVchContactPerson(String vchContactPerson) {
		this.vchContactPerson = vchContactPerson;
	}

	public String getVchOrganization() {
		return vchOrganization;
	}

	public void setVchOrganization(String vchOrganization) {
		this.vchOrganization = vchOrganization;
	}

	public String getVchdesignation() {
		return vchdesignation;
	}

	public void setVchdesignation(String vchdesignation) {
		this.vchdesignation = vchdesignation;
	}

	public Integer getIntDestinationId() {
		return intDestinationId;
	}

	public void setIntDestinationId(Integer intDestinationId) {
		this.intDestinationId = intDestinationId;
	}

	public String getVchLatitude() {
		return vchLatitude;
	}

	public void setVchLatitude(String vchLatitude) {
		this.vchLatitude = vchLatitude;
	}

	public String getVchLongitude() {
		return vchLongitude;
	}

	public void setVchLongitude(String vchLongitude) {
		this.vchLongitude = vchLongitude;
	}

	public Integer getIntSos() {
		return intSos;
	}

	public void setIntSos(Integer intSos) {
		this.intSos = intSos;
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

	public Integer getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Integer intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}