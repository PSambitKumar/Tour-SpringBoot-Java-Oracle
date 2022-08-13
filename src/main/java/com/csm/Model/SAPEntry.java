package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class SAPEntry {
	@Id
	@Column(name = "sapEntryId", nullable = false)
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

	@Lob
	@Column(name = "allowedServiceSignatures")
	private String allowedServiceSignatures;

	@Column(name = "defaultSAPEntry")
	private Byte defaultSAPEntry;

	@Column(name = "enabled")
	private Byte enabled;

	@Column(name = "name", length = 75)
	private String name;

	@Lob
	@Column(name = "title")
	private String title;

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

	public String getAllowedServiceSignatures() {
		return allowedServiceSignatures;
	}

	public void setAllowedServiceSignatures(String allowedServiceSignatures) {
		this.allowedServiceSignatures = allowedServiceSignatures;
	}

	public Byte getDefaultSAPEntry() {
		return defaultSAPEntry;
	}

	public void setDefaultSAPEntry(Byte defaultSAPEntry) {
		this.defaultSAPEntry = defaultSAPEntry;
	}

	public Byte getEnabled() {
		return enabled;
	}

	public void setEnabled(Byte enabled) {
		this.enabled = enabled;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}