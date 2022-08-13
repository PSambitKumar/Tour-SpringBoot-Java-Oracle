package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class OAuth2Authorization {
	@Id
	@Column(name = "oAuth2AuthorizationId", nullable = false)
	private Long id;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "userId")
	private Long userId;

	@Column(name = "userName", length = 75)
	private String userName;

	@Column(name = "createDate")
	private Instant createDate;

	@Column(name = "oAuth2ApplicationId")
	private Long oAuth2ApplicationId;

	@Column(name = "oA2AScopeAliasesId")
	private Long oA2AScopeAliasesId;

	@Lob
	@Column(name = "accessTokenContent")
	private String accessTokenContent;

	@Column(name = "accessTokenContentHash")
	private Long accessTokenContentHash;

	@Column(name = "accessTokenCreateDate")
	private Instant accessTokenCreateDate;

	@Column(name = "accessTokenExpirationDate")
	private Instant accessTokenExpirationDate;

	@Column(name = "remoteHostInfo")
	private String remoteHostInfo;

	@Column(name = "remoteIPInfo", length = 75)
	private String remoteIPInfo;

	@Lob
	@Column(name = "refreshTokenContent")
	private String refreshTokenContent;

	@Column(name = "refreshTokenContentHash")
	private Long refreshTokenContentHash;

	@Column(name = "refreshTokenCreateDate")
	private Instant refreshTokenCreateDate;

	@Column(name = "refreshTokenExpirationDate")
	private Instant refreshTokenExpirationDate;

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

	public Long getOAuth2ApplicationId() {
		return oAuth2ApplicationId;
	}

	public void setOAuth2ApplicationId(Long oAuth2ApplicationId) {
		this.oAuth2ApplicationId = oAuth2ApplicationId;
	}

	public Long getOA2AScopeAliasesId() {
		return oA2AScopeAliasesId;
	}

	public void setOA2AScopeAliasesId(Long oA2AScopeAliasesId) {
		this.oA2AScopeAliasesId = oA2AScopeAliasesId;
	}

	public String getAccessTokenContent() {
		return accessTokenContent;
	}

	public void setAccessTokenContent(String accessTokenContent) {
		this.accessTokenContent = accessTokenContent;
	}

	public Long getAccessTokenContentHash() {
		return accessTokenContentHash;
	}

	public void setAccessTokenContentHash(Long accessTokenContentHash) {
		this.accessTokenContentHash = accessTokenContentHash;
	}

	public Instant getAccessTokenCreateDate() {
		return accessTokenCreateDate;
	}

	public void setAccessTokenCreateDate(Instant accessTokenCreateDate) {
		this.accessTokenCreateDate = accessTokenCreateDate;
	}

	public Instant getAccessTokenExpirationDate() {
		return accessTokenExpirationDate;
	}

	public void setAccessTokenExpirationDate(Instant accessTokenExpirationDate) {
		this.accessTokenExpirationDate = accessTokenExpirationDate;
	}

	public String getRemoteHostInfo() {
		return remoteHostInfo;
	}

	public void setRemoteHostInfo(String remoteHostInfo) {
		this.remoteHostInfo = remoteHostInfo;
	}

	public String getRemoteIPInfo() {
		return remoteIPInfo;
	}

	public void setRemoteIPInfo(String remoteIPInfo) {
		this.remoteIPInfo = remoteIPInfo;
	}

	public String getRefreshTokenContent() {
		return refreshTokenContent;
	}

	public void setRefreshTokenContent(String refreshTokenContent) {
		this.refreshTokenContent = refreshTokenContent;
	}

	public Long getRefreshTokenContentHash() {
		return refreshTokenContentHash;
	}

	public void setRefreshTokenContentHash(Long refreshTokenContentHash) {
		this.refreshTokenContentHash = refreshTokenContentHash;
	}

	public Instant getRefreshTokenCreateDate() {
		return refreshTokenCreateDate;
	}

	public void setRefreshTokenCreateDate(Instant refreshTokenCreateDate) {
		this.refreshTokenCreateDate = refreshTokenCreateDate;
	}

	public Instant getRefreshTokenExpirationDate() {
		return refreshTokenExpirationDate;
	}

	public void setRefreshTokenExpirationDate(Instant refreshTokenExpirationDate) {
		this.refreshTokenExpirationDate = refreshTokenExpirationDate;
	}

}