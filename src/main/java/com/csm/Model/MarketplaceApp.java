package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "Marketplace_App")
public class MarketplaceApp {
	@Id
	@Column(name = "appId", nullable = false)
	private Long id;

	@Column(name = "uuid_", length = 75)
	private String uuid;

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

	@Column(name = "remoteAppId")
	private Long remoteAppId;

	@Column(name = "title", length = 75)
	private String title;

	@Lob
	@Column(name = "description")
	private String description;

	@Column(name = "category", length = 75)
	private String category;

	@Lob
	@Column(name = "iconURL")
	private String iconURL;

	@Column(name = "version", length = 75)
	private String version;

	@Column(name = "required")
	private Byte required;

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

	public Long getRemoteAppId() {
		return remoteAppId;
	}

	public void setRemoteAppId(Long remoteAppId) {
		this.remoteAppId = remoteAppId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getIconURL() {
		return iconURL;
	}

	public void setIconURL(String iconURL) {
		this.iconURL = iconURL;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Byte getRequired() {
		return required;
	}

	public void setRequired(Byte required) {
		this.required = required;
	}

}