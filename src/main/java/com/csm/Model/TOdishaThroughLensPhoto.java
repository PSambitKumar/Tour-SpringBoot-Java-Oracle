package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_odisha_through_lens_photo")
public class TOdishaThroughLensPhoto {
	@Id
	@Column(name = "contestImageId", nullable = false)
	private Integer id;

	@Column(name = "contestUserId", nullable = false)
	private Integer contestUserId;

	@Column(name = "contestImageName", length = 150)
	private String contestImageName;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getContestUserId() {
		return contestUserId;
	}

	public void setContestUserId(Integer contestUserId) {
		this.contestUserId = contestUserId;
	}

	public String getContestImageName() {
		return contestImageName;
	}

	public void setContestImageName(String contestImageName) {
		this.contestImageName = contestImageName;
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