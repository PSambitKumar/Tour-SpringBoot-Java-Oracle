package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_trip_master")
public class TTripMaster {
	@Id
	@Column(name = "intTripMasterId", nullable = false)
	private Integer id;

	@Column(name = "intStartPointId")
	private Integer intStartPointId;

	@Column(name = "intEndPointId")
	private Integer intEndPointId;

	@Column(name = "vchStartLatitudeLongitude", length = 150)
	private String vchStartLatitudeLongitude;

	@Column(name = "vchEndLatitudeLongitude", length = 150)
	private String vchEndLatitudeLongitude;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "vchCreatedBy", length = 150)
	private String vchCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "intUpdatedBy", columnDefinition = "INT UNSIGNED")
	private Long intUpdatedBy;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	@Column(name = "endPointType")
	private Character endPointType;

	@Column(name = "intTripId")
	private Integer intTripId;

	@Column(name = "startPointType")
	private Character startPointType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntStartPointId() {
		return intStartPointId;
	}

	public void setIntStartPointId(Integer intStartPointId) {
		this.intStartPointId = intStartPointId;
	}

	public Integer getIntEndPointId() {
		return intEndPointId;
	}

	public void setIntEndPointId(Integer intEndPointId) {
		this.intEndPointId = intEndPointId;
	}

	public String getVchStartLatitudeLongitude() {
		return vchStartLatitudeLongitude;
	}

	public void setVchStartLatitudeLongitude(String vchStartLatitudeLongitude) {
		this.vchStartLatitudeLongitude = vchStartLatitudeLongitude;
	}

	public String getVchEndLatitudeLongitude() {
		return vchEndLatitudeLongitude;
	}

	public void setVchEndLatitudeLongitude(String vchEndLatitudeLongitude) {
		this.vchEndLatitudeLongitude = vchEndLatitudeLongitude;
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

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public Long getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Long intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Character getEndPointType() {
		return endPointType;
	}

	public void setEndPointType(Character endPointType) {
		this.endPointType = endPointType;
	}

	public Integer getIntTripId() {
		return intTripId;
	}

	public void setIntTripId(Integer intTripId) {
		this.intTripId = intTripId;
	}

	public Character getStartPointType() {
		return startPointType;
	}

	public void setStartPointType(Character startPointType) {
		this.startPointType = startPointType;
	}

}