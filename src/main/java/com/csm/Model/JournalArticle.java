package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class JournalArticle {
	@Id
	@Column(name = "id_", nullable = false)
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

	@Column(name = "folderId")
	private Long folderId;

	@Column(name = "classNameId")
	private Long classNameId;

	@Column(name = "classPK")
	private Long classPK;

	@Lob
	@Column(name = "treePath")
	private String treePath;

	@Column(name = "articleId", length = 75)
	private String articleId;

	@Column(name = "version")
	private Double version;

	@Column(name = "urlTitle")
	private String urlTitle;

	@Lob
	@Column(name = "content")
	private String content;

	@Column(name = "DDMStructureKey", length = 75)
	private String dDMStructureKey;

	@Column(name = "DDMTemplateKey", length = 75)
	private String dDMTemplateKey;

	@Column(name = "defaultLanguageId", length = 75)
	private String defaultLanguageId;

	@Column(name = "layoutUuid", length = 75)
	private String layoutUuid;

	@Column(name = "displayDate")
	private Instant displayDate;

	@Column(name = "expirationDate")
	private Instant expirationDate;

	@Column(name = "reviewDate")
	private Instant reviewDate;

	@Column(name = "indexable")
	private Byte indexable;

	@Column(name = "smallImage")
	private Byte smallImage;

	@Column(name = "smallImageId")
	private Long smallImageId;

	@Lob
	@Column(name = "smallImageURL")
	private String smallImageURL;

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

	public Long getFolderId() {
		return folderId;
	}

	public void setFolderId(Long folderId) {
		this.folderId = folderId;
	}

	public Long getClassNameId() {
		return classNameId;
	}

	public void setClassNameId(Long classNameId) {
		this.classNameId = classNameId;
	}

	public Long getClassPK() {
		return classPK;
	}

	public void setClassPK(Long classPK) {
		this.classPK = classPK;
	}

	public String getTreePath() {
		return treePath;
	}

	public void setTreePath(String treePath) {
		this.treePath = treePath;
	}

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public Double getVersion() {
		return version;
	}

	public void setVersion(Double version) {
		this.version = version;
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

	public String getDefaultLanguageId() {
		return defaultLanguageId;
	}

	public void setDefaultLanguageId(String defaultLanguageId) {
		this.defaultLanguageId = defaultLanguageId;
	}

	public String getLayoutUuid() {
		return layoutUuid;
	}

	public void setLayoutUuid(String layoutUuid) {
		this.layoutUuid = layoutUuid;
	}

	public Instant getDisplayDate() {
		return displayDate;
	}

	public void setDisplayDate(Instant displayDate) {
		this.displayDate = displayDate;
	}

	public Instant getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Instant expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Instant getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Instant reviewDate) {
		this.reviewDate = reviewDate;
	}

	public Byte getIndexable() {
		return indexable;
	}

	public void setIndexable(Byte indexable) {
		this.indexable = indexable;
	}

	public Byte getSmallImage() {
		return smallImage;
	}

	public void setSmallImage(Byte smallImage) {
		this.smallImage = smallImage;
	}

	public Long getSmallImageId() {
		return smallImageId;
	}

	public void setSmallImageId(Long smallImageId) {
		this.smallImageId = smallImageId;
	}

	public String getSmallImageURL() {
		return smallImageURL;
	}

	public void setSmallImageURL(String smallImageURL) {
		this.smallImageURL = smallImageURL;
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