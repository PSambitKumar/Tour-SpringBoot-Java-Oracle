package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class AssetEntryUsage {
	@Id
	@Column(name = "assetEntryUsageId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "uuid_", length = 75)
	private String uuid;

	@Column(name = "groupId")
	private Long groupId;

	@Column(name = "createDate")
	private Instant createDate;

	@Column(name = "modifiedDate")
	private Instant modifiedDate;

	@Column(name = "assetEntryId")
	private Long assetEntryId;

	@Column(name = "containerType")
	private Long containerType;

	@Column(name = "containerKey", length = 200)
	private String containerKey;

	@Column(name = "plid")
	private Long plid;

	@Column(name = "type_")
	private Integer type;

	@Column(name = "lastPublishDate")
	private Instant lastPublishDate;

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

	public Long getAssetEntryId() {
		return assetEntryId;
	}

	public void setAssetEntryId(Long assetEntryId) {
		this.assetEntryId = assetEntryId;
	}

	public Long getContainerType() {
		return containerType;
	}

	public void setContainerType(Long containerType) {
		this.containerType = containerType;
	}

	public String getContainerKey() {
		return containerKey;
	}

	public void setContainerKey(String containerKey) {
		this.containerKey = containerKey;
	}

	public Long getPlid() {
		return plid;
	}

	public void setPlid(Long plid) {
		this.plid = plid;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Instant getLastPublishDate() {
		return lastPublishDate;
	}

	public void setLastPublishDate(Instant lastPublishDate) {
		this.lastPublishDate = lastPublishDate;
	}

}