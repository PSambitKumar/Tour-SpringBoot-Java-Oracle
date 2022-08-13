package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class OAuth2ScopeGrant {
	@Id
	@Column(name = "oAuth2ScopeGrantId", nullable = false)
	private Long id;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "oA2AScopeAliasesId")
	private Long oA2AScopeAliasesId;

	@Column(name = "applicationName")
	private String applicationName;

	@Column(name = "bundleSymbolicName")
	private String bundleSymbolicName;

	@Column(name = "scope", length = 240)
	private String scope;

	@Lob
	@Column(name = "scopeAliases")
	private String scopeAliases;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getOA2AScopeAliasesId() {
		return oA2AScopeAliasesId;
	}

	public void setOA2AScopeAliasesId(Long oA2AScopeAliasesId) {
		this.oA2AScopeAliasesId = oA2AScopeAliasesId;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getBundleSymbolicName() {
		return bundleSymbolicName;
	}

	public void setBundleSymbolicName(String bundleSymbolicName) {
		this.bundleSymbolicName = bundleSymbolicName;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getScopeAliases() {
		return scopeAliases;
	}

	public void setScopeAliases(String scopeAliases) {
		this.scopeAliases = scopeAliases;
	}

}