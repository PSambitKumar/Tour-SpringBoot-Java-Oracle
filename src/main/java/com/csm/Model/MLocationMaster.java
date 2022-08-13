package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "m_location_master")
public class MLocationMaster {
	@Id
	@Column(name = "INT_LOCATION_ID", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "VCH_LOCATION", nullable = false, length = 50)
	private String vchLocation;

	@Lob
	@Column(name = "TXT_LOCATION_O")
	private String txtLocationO;

	@Column(name = "VCH_DESCRIPTION", length = 500)
	private String vchDescription;

	@Column(name = "INT_CREATED_BY", columnDefinition = "INT UNSIGNED")
	private Long intCreatedBy;

	@Column(name = "DTM_CREATED_ON", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "INT_UPDATED_BY", columnDefinition = "INT UNSIGNED")
	private Long intUpdatedBy;

	@Column(name = "DTM_UPDATED_ON")
	private Instant dtmUpdatedOn;

	@Column(name = "BIT_DELETED_FLAG", nullable = false)
	private Boolean bitDeletedFlag = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVchLocation() {
		return vchLocation;
	}

	public void setVchLocation(String vchLocation) {
		this.vchLocation = vchLocation;
	}

	public String getTxtLocationO() {
		return txtLocationO;
	}

	public void setTxtLocationO(String txtLocationO) {
		this.txtLocationO = txtLocationO;
	}

	public String getVchDescription() {
		return vchDescription;
	}

	public void setVchDescription(String vchDescription) {
		this.vchDescription = vchDescription;
	}

	public Long getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Long intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Long getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Long intUpdatedBy) {
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