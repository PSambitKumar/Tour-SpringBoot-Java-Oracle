package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VirtualHost {
	@Id
	@Column(name = "virtualHostId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "layoutSetId")
	private Long layoutSetId;

	@Column(name = "hostname", length = 200)
	private String hostname;

	@Column(name = "defaultVirtualHost")
	private Byte defaultVirtualHost;

	@Column(name = "languageId", length = 75)
	private String languageId;

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

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getLayoutSetId() {
		return layoutSetId;
	}

	public void setLayoutSetId(Long layoutSetId) {
		this.layoutSetId = layoutSetId;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public Byte getDefaultVirtualHost() {
		return defaultVirtualHost;
	}

	public void setDefaultVirtualHost(Byte defaultVirtualHost) {
		this.defaultVirtualHost = defaultVirtualHost;
	}

	public String getLanguageId() {
		return languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

}