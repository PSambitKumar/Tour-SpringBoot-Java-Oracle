package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class JournalFeed {
	@Id
	@Column(name = "id_", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

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

	@Column(name = "feedId", length = 75)
	private String feedId;

	@Column(name = "name", length = 75)
	private String name;

	@Lob
	@Column(name = "description")
	private String description;

	@Column(name = "DDMStructureKey", length = 75)
	private String dDMStructureKey;

	@Column(name = "DDMTemplateKey", length = 75)
	private String dDMTemplateKey;

	@Column(name = "DDMRendererTemplateKey", length = 75)
	private String dDMRendererTemplateKey;

	@Column(name = "delta")
	private Integer delta;

	@Column(name = "orderByCol", length = 75)
	private String orderByCol;

	@Column(name = "orderByType", length = 75)
	private String orderByType;

	@Column(name = "targetLayoutFriendlyUrl")
	private String targetLayoutFriendlyUrl;

	@Column(name = "targetPortletId", length = 200)
	private String targetPortletId;

	@Column(name = "contentField", length = 75)
	private String contentField;

	@Column(name = "feedFormat", length = 75)
	private String feedFormat;

	@Column(name = "feedVersion")
	private Double feedVersion;

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

	public String getFeedId() {
		return feedId;
	}

	public void setFeedId(String feedId) {
		this.feedId = feedId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDDMStructureKey() {
		return dDMStructureKey;
	}

	public void setDDMStructureKey(String dDMStructureKey) {
		this.dDMStructureKey = dDMStructureKey;
	}

	public String getDDMTemplateKey() {
		return dDMTemplateKey;
	}

	public void setDDMTemplateKey(String dDMTemplateKey) {
		this.dDMTemplateKey = dDMTemplateKey;
	}

	public String getDDMRendererTemplateKey() {
		return dDMRendererTemplateKey;
	}

	public void setDDMRendererTemplateKey(String dDMRendererTemplateKey) {
		this.dDMRendererTemplateKey = dDMRendererTemplateKey;
	}

	public Integer getDelta() {
		return delta;
	}

	public void setDelta(Integer delta) {
		this.delta = delta;
	}

	public String getOrderByCol() {
		return orderByCol;
	}

	public void setOrderByCol(String orderByCol) {
		this.orderByCol = orderByCol;
	}

	public String getOrderByType() {
		return orderByType;
	}

	public void setOrderByType(String orderByType) {
		this.orderByType = orderByType;
	}

	public String getTargetLayoutFriendlyUrl() {
		return targetLayoutFriendlyUrl;
	}

	public void setTargetLayoutFriendlyUrl(String targetLayoutFriendlyUrl) {
		this.targetLayoutFriendlyUrl = targetLayoutFriendlyUrl;
	}

	public String getTargetPortletId() {
		return targetPortletId;
	}

	public void setTargetPortletId(String targetPortletId) {
		this.targetPortletId = targetPortletId;
	}

	public String getContentField() {
		return contentField;
	}

	public void setContentField(String contentField) {
		this.contentField = contentField;
	}

	public String getFeedFormat() {
		return feedFormat;
	}

	public void setFeedFormat(String feedFormat) {
		this.feedFormat = feedFormat;
	}

	public Double getFeedVersion() {
		return feedVersion;
	}

	public void setFeedVersion(Double feedVersion) {
		this.feedVersion = feedVersion;
	}

	public Instant getLastPublishDate() {
		return lastPublishDate;
	}

	public void setLastPublishDate(Instant lastPublishDate) {
		this.lastPublishDate = lastPublishDate;
	}

}