package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class OAuth2Application {
	@Id
	@Column(name = "oAuth2ApplicationId", nullable = false)
	private Long id;

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

	@Column(name = "oA2AScopeAliasesId")
	private Long oA2AScopeAliasesId;

	@Column(name = "allowedGrantTypes", length = 75)
	private String allowedGrantTypes;

	@Column(name = "clientCredentialUserId")
	private Long clientCredentialUserId;

	@Column(name = "clientCredentialUserName", length = 75)
	private String clientCredentialUserName;

	@Column(name = "clientId", length = 75)
	private String clientId;

	@Column(name = "clientProfile")
	private Integer clientProfile;

	@Column(name = "clientSecret", length = 75)
	private String clientSecret;

	@Lob
	@Column(name = "description")
	private String description;

	@Lob
	@Column(name = "features")
	private String features;

	@Lob
	@Column(name = "homePageURL")
	private String homePageURL;

	@Column(name = "iconFileEntryId")
	private Long iconFileEntryId;

	@Column(name = "name", length = 75)
	private String name;

	@Lob
	@Column(name = "privacyPolicyURL")
	private String privacyPolicyURL;

	@Lob
	@Column(name = "redirectURIs")
	private String redirectURIs;

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

	public Long getOA2AScopeAliasesId() {
		return oA2AScopeAliasesId;
	}

	public void setOA2AScopeAliasesId(Long oA2AScopeAliasesId) {
		this.oA2AScopeAliasesId = oA2AScopeAliasesId;
	}

	public String getAllowedGrantTypes() {
		return allowedGrantTypes;
	}

	public void setAllowedGrantTypes(String allowedGrantTypes) {
		this.allowedGrantTypes = allowedGrantTypes;
	}

	public Long getClientCredentialUserId() {
		return clientCredentialUserId;
	}

	public void setClientCredentialUserId(Long clientCredentialUserId) {
		this.clientCredentialUserId = clientCredentialUserId;
	}

	public String getClientCredentialUserName() {
		return clientCredentialUserName;
	}

	public void setClientCredentialUserName(String clientCredentialUserName) {
		this.clientCredentialUserName = clientCredentialUserName;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public Integer getClientProfile() {
		return clientProfile;
	}

	public void setClientProfile(Integer clientProfile) {
		this.clientProfile = clientProfile;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public String getHomePageURL() {
		return homePageURL;
	}

	public void setHomePageURL(String homePageURL) {
		this.homePageURL = homePageURL;
	}

	public Long getIconFileEntryId() {
		return iconFileEntryId;
	}

	public void setIconFileEntryId(Long iconFileEntryId) {
		this.iconFileEntryId = iconFileEntryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrivacyPolicyURL() {
		return privacyPolicyURL;
	}

	public void setPrivacyPolicyURL(String privacyPolicyURL) {
		this.privacyPolicyURL = privacyPolicyURL;
	}

	public String getRedirectURIs() {
		return redirectURIs;
	}

	public void setRedirectURIs(String redirectURIs) {
		this.redirectURIs = redirectURIs;
	}

}