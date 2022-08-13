package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Company {
	@Id
	@Column(name = "companyId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "accountId")
	private Long accountId;

	@Column(name = "webId", length = 75)
	private String webId;

	@Lob
	@Column(name = "key_")
	private String key;

	@Column(name = "mx", length = 200)
	private String mx;

	@Lob
	@Column(name = "homeURL")
	private String homeURL;

	@Column(name = "logoId")
	private Long logoId;

	@Column(name = "system_")
	private Byte system;

	@Column(name = "maxUsers")
	private Integer maxUsers;

	@Column(name = "active_")
	private Byte active;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMvccVersion() {
		return mvccVersion;
	}

	public void setMvccVersion(Long mvccVersion) {
		this.mvccVersion = mvccVersion;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getWebId() {
		return webId;
	}

	public void setWebId(String webId) {
		this.webId = webId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getMx() {
		return mx;
	}

	public void setMx(String mx) {
		this.mx = mx;
	}

	public String getHomeURL() {
		return homeURL;
	}

	public void setHomeURL(String homeURL) {
		this.homeURL = homeURL;
	}

	public Long getLogoId() {
		return logoId;
	}

	public void setLogoId(Long logoId) {
		this.logoId = logoId;
	}

	public Byte getSystem() {
		return system;
	}

	public void setSystem(Byte system) {
		this.system = system;
	}

	public Integer getMaxUsers() {
		return maxUsers;
	}

	public void setMaxUsers(Integer maxUsers) {
		this.maxUsers = maxUsers;
	}

	public Byte getActive() {
		return active;
	}

	public void setActive(Byte active) {
		this.active = active;
	}

}