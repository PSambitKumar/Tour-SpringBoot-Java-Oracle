package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_admin_console")
public class TAdminConsole {
	@Id
	@Column(name = "intId", nullable = false)
	private Integer id;

	@Column(name = "vchUserName", length = 125)
	private String vchUserName;

	@Column(name = "vchPassword", length = 256)
	private String vchPassword;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	@Column(name = "intRole", nullable = false)
	private Integer intRole;

	@Column(name = "vchRoleName", length = 15)
	private String vchRoleName;

	@Column(name = "vchEmail", length = 60)
	private String vchEmail;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchUserName() {
		return vchUserName;
	}

	public void setVchUserName(String vchUserName) {
		this.vchUserName = vchUserName;
	}

	public String getVchPassword() {
		return vchPassword;
	}

	public void setVchPassword(String vchPassword) {
		this.vchPassword = vchPassword;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Integer getIntRole() {
		return intRole;
	}

	public void setIntRole(Integer intRole) {
		this.intRole = intRole;
	}

	public String getVchRoleName() {
		return vchRoleName;
	}

	public void setVchRoleName(String vchRoleName) {
		this.vchRoleName = vchRoleName;
	}

	public String getVchEmail() {
		return vchEmail;
	}

	public void setVchEmail(String vchEmail) {
		this.vchEmail = vchEmail;
	}

}