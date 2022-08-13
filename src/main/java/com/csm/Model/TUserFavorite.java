package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_user_favorites")
public class TUserFavorite {
	@Id
	@Column(name = "intId", nullable = false)
	private Integer id;

	@Column(name = "intUserId")
	private Integer intUserId;

	@Column(name = "intLikeType")
	private Integer intLikeType;

	@Column(name = "intlikeItemId")
	private Integer intlikeItemId;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "vchUserType")
	private Integer vchUserType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntUserId() {
		return intUserId;
	}

	public void setIntUserId(Integer intUserId) {
		this.intUserId = intUserId;
	}

	public Integer getIntLikeType() {
		return intLikeType;
	}

	public void setIntLikeType(Integer intLikeType) {
		this.intLikeType = intLikeType;
	}

	public Integer getIntlikeItemId() {
		return intlikeItemId;
	}

	public void setIntlikeItemId(Integer intlikeItemId) {
		this.intlikeItemId = intlikeItemId;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Integer getVchUserType() {
		return vchUserType;
	}

	public void setVchUserType(Integer vchUserType) {
		this.vchUserType = vchUserType;
	}

}