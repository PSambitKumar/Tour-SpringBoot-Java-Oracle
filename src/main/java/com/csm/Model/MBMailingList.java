package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class MBMailingList {
	@Id
	@Column(name = "mailingListId", nullable = false)
	private Long id;

	@Column(name = "uuid_", length = 75)
	private String uuid;

	@Column(name = "groupId")
	private Long groupId;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "userId")
	private Long userId;

	@Column(name = "userName", length = 75)
	private String userName;

	@Column(name = "createDate")
	private Instant createDate;

	@Column(name = "modifiedDate")
	private Instant modifiedDate;

	@Column(name = "categoryId")
	private Long categoryId;

	@Column(name = "emailAddress", length = 254)
	private String emailAddress;

	@Column(name = "inProtocol", length = 75)
	private String inProtocol;

	@Column(name = "inServerName", length = 75)
	private String inServerName;

	@Column(name = "inServerPort")
	private Integer inServerPort;

	@Column(name = "inUseSSL")
	private Byte inUseSSL;

	@Column(name = "inUserName", length = 75)
	private String inUserName;

	@Column(name = "inPassword", length = 75)
	private String inPassword;

	@Column(name = "inReadInterval")
	private Integer inReadInterval;

	@Column(name = "outEmailAddress", length = 254)
	private String outEmailAddress;

	@Column(name = "outCustom")
	private Byte outCustom;

	@Column(name = "outServerName", length = 75)
	private String outServerName;

	@Column(name = "outServerPort")
	private Integer outServerPort;

	@Column(name = "outUseSSL")
	private Byte outUseSSL;

	@Column(name = "outUserName", length = 75)
	private String outUserName;

	@Column(name = "outPassword", length = 75)
	private String outPassword;

	@Column(name = "allowAnonymous")
	private Byte allowAnonymous;

	@Column(name = "active_")
	private Byte active;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Instant getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Instant createDate) {
		this.createDate = createDate;
	}

	public Instant getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Instant modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getInProtocol() {
		return inProtocol;
	}

	public void setInProtocol(String inProtocol) {
		this.inProtocol = inProtocol;
	}

	public String getInServerName() {
		return inServerName;
	}

	public void setInServerName(String inServerName) {
		this.inServerName = inServerName;
	}

	public Integer getInServerPort() {
		return inServerPort;
	}

	public void setInServerPort(Integer inServerPort) {
		this.inServerPort = inServerPort;
	}

	public Byte getInUseSSL() {
		return inUseSSL;
	}

	public void setInUseSSL(Byte inUseSSL) {
		this.inUseSSL = inUseSSL;
	}

	public String getInUserName() {
		return inUserName;
	}

	public void setInUserName(String inUserName) {
		this.inUserName = inUserName;
	}

	public String getInPassword() {
		return inPassword;
	}

	public void setInPassword(String inPassword) {
		this.inPassword = inPassword;
	}

	public Integer getInReadInterval() {
		return inReadInterval;
	}

	public void setInReadInterval(Integer inReadInterval) {
		this.inReadInterval = inReadInterval;
	}

	public String getOutEmailAddress() {
		return outEmailAddress;
	}

	public void setOutEmailAddress(String outEmailAddress) {
		this.outEmailAddress = outEmailAddress;
	}

	public Byte getOutCustom() {
		return outCustom;
	}

	public void setOutCustom(Byte outCustom) {
		this.outCustom = outCustom;
	}

	public String getOutServerName() {
		return outServerName;
	}

	public void setOutServerName(String outServerName) {
		this.outServerName = outServerName;
	}

	public Integer getOutServerPort() {
		return outServerPort;
	}

	public void setOutServerPort(Integer outServerPort) {
		this.outServerPort = outServerPort;
	}

	public Byte getOutUseSSL() {
		return outUseSSL;
	}

	public void setOutUseSSL(Byte outUseSSL) {
		this.outUseSSL = outUseSSL;
	}

	public String getOutUserName() {
		return outUserName;
	}

	public void setOutUserName(String outUserName) {
		this.outUserName = outUserName;
	}

	public String getOutPassword() {
		return outPassword;
	}

	public void setOutPassword(String outPassword) {
		this.outPassword = outPassword;
	}

	public Byte getAllowAnonymous() {
		return allowAnonymous;
	}

	public void setAllowAnonymous(Byte allowAnonymous) {
		this.allowAnonymous = allowAnonymous;
	}

	public Byte getActive() {
		return active;
	}

	public void setActive(Byte active) {
		this.active = active;
	}

}