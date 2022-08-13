package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_users_other")
public class TUsersOther {
	@Id
	@Column(name = "intUserId", nullable = false)
	private Integer id;

	@Column(name = "vchOauth_provider", length = 10)
	private String vchoauthProvider;

	@Column(name = "vchOauth_uid", length = 50)
	private String vchoauthUid;

	@Column(name = "vchFirst_name", length = 45)
	private String vchfirstName;

	@Column(name = "vchLast_name", length = 45)
	private String vchlastName;

	@Column(name = "vchEmail", length = 125)
	private String vchEmail;

	@Column(name = "vchGender", length = 10)
	private String vchGender;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "dtmLastLogin")
	private Instant dtmLastLogin;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	@Column(name = "intCount")
	private Integer intCount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchoauthProvider() {
		return vchoauthProvider;
	}

	public void setVchoauthProvider(String vchoauthProvider) {
		this.vchoauthProvider = vchoauthProvider;
	}

	public String getVchoauthUid() {
		return vchoauthUid;
	}

	public void setVchoauthUid(String vchoauthUid) {
		this.vchoauthUid = vchoauthUid;
	}

	public String getVchfirstName() {
		return vchfirstName;
	}

	public void setVchfirstName(String vchfirstName) {
		this.vchfirstName = vchfirstName;
	}

	public String getVchlastName() {
		return vchlastName;
	}

	public void setVchlastName(String vchlastName) {
		this.vchlastName = vchlastName;
	}

	public String getVchEmail() {
		return vchEmail;
	}

	public void setVchEmail(String vchEmail) {
		this.vchEmail = vchEmail;
	}

	public String getVchGender() {
		return vchGender;
	}

	public void setVchGender(String vchGender) {
		this.vchGender = vchGender;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Instant getDtmLastLogin() {
		return dtmLastLogin;
	}

	public void setDtmLastLogin(Instant dtmLastLogin) {
		this.dtmLastLogin = dtmLastLogin;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Integer getIntCount() {
		return intCount;
	}

	public void setIntCount(Integer intCount) {
		this.intCount = intCount;
	}

}