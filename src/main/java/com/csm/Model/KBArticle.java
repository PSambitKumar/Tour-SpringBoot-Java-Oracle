package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class KBArticle {
	@Id
	@Column(name = "kbArticleId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "uuid_", length = 75)
	private String uuid;

	@Column(name = "resourcePrimKey")
	private Long resourcePrimKey;

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

	@Column(name = "rootResourcePrimKey")
	private Long rootResourcePrimKey;

	@Column(name = "parentResourceClassNameId")
	private Long parentResourceClassNameId;

	@Column(name = "parentResourcePrimKey")
	private Long parentResourcePrimKey;

	@Column(name = "kbFolderId")
	private Long kbFolderId;

	@Column(name = "version")
	private Integer version;

	@Lob
	@Column(name = "title")
	private String title;

	@Column(name = "urlTitle", length = 75)
	private String urlTitle;

	@Lob
	@Column(name = "content")
	private String content;

	@Lob
	@Column(name = "description")
	private String description;

	@Column(name = "priority")
	private Double priority;

	@Lob
	@Column(name = "sections")
	private String sections;

	@Column(name = "viewCount")
	private Integer viewCount;

	@Column(name = "latest")
	private Byte latest;

	@Column(name = "main")
	private Byte main;

	@Lob
	@Column(name = "sourceURL")
	private String sourceURL;

	@Column(name = "lastPublishDate")
	private Instant lastPublishDate;

	@Column(name = "status")
	private Integer status;

	@Column(name = "statusByUserId")
	private Long statusByUserId;

	@Column(name = "statusByUserName", length = 75)
	private String statusByUserName;

	@Column(name = "statusDate")
	private Instant statusDate;

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

	public Long getResourcePrimKey() {
		return resourcePrimKey;
	}

	public void setResourcePrimKey(Long resourcePrimKey) {
		this.resourcePrimKey = resourcePrimKey;
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

	public Long getRootResourcePrimKey() {
		return rootResourcePrimKey;
	}

	public void setRootResourcePrimKey(Long rootResourcePrimKey) {
		this.rootResourcePrimKey = rootResourcePrimKey;
	}

	public Long getParentResourceClassNameId() {
		return parentResourceClassNameId;
	}

	public void setParentResourceClassNameId(Long parentResourceClassNameId) {
		this.parentResourceClassNameId = parentResourceClassNameId;
	}

	public Long getParentResourcePrimKey() {
		return parentResourcePrimKey;
	}

	public void setParentResourcePrimKey(Long parentResourcePrimKey) {
		this.parentResourcePrimKey = parentResourcePrimKey;
	}

	public Long getKbFolderId() {
		return kbFolderId;
	}

	public void setKbFolderId(Long kbFolderId) {
		this.kbFolderId = kbFolderId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrlTitle() {
		return urlTitle;
	}

	public void setUrlTitle(String urlTitle) {
		this.urlTitle = urlTitle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPriority() {
		return priority;
	}

	public void setPriority(Double priority) {
		this.priority = priority;
	}

	public String getSections() {
		return sections;
	}

	public void setSections(String sections) {
		this.sections = sections;
	}

	public Integer getViewCount() {
		return viewCount;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	public Byte getLatest() {
		return latest;
	}

	public void setLatest(Byte latest) {
		this.latest = latest;
	}

	public Byte getMain() {
		return main;
	}

	public void setMain(Byte main) {
		this.main = main;
	}

	public String getSourceURL() {
		return sourceURL;
	}

	public void setSourceURL(String sourceURL) {
		this.sourceURL = sourceURL;
	}

	public Instant getLastPublishDate() {
		return lastPublishDate;
	}

	public void setLastPublishDate(Instant lastPublishDate) {
		this.lastPublishDate = lastPublishDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getStatusByUserId() {
		return statusByUserId;
	}

	public void setStatusByUserId(Long statusByUserId) {
		this.statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		this.statusByUserName = statusByUserName;
	}

	public Instant getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Instant statusDate) {
		this.statusDate = statusDate;
	}

}