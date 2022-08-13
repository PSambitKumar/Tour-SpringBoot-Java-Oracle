package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class DLFileEntry {
	@Id
	@Column(name = "fileEntryId", nullable = false)
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

	@Column(name = "classNameId")
	private Long classNameId;

	@Column(name = "classPK")
	private Long classPK;

	@Column(name = "repositoryId")
	private Long repositoryId;

	@Column(name = "folderId")
	private Long folderId;

	@Lob
	@Column(name = "treePath")
	private String treePath;

	@Column(name = "name")
	private String name;

	@Column(name = "fileName")
	private String fileName;

	@Column(name = "extension", length = 75)
	private String extension;

	@Column(name = "mimeType", length = 75)
	private String mimeType;

	@Column(name = "title")
	private String title;

	@Lob
	@Column(name = "description")
	private String description;

	@Lob
	@Column(name = "extraSettings")
	private String extraSettings;

	@Column(name = "fileEntryTypeId")
	private Long fileEntryTypeId;

	@Column(name = "version", length = 75)
	private String version;

	@Column(name = "size_")
	private Long size;

	@Column(name = "readCount")
	private Integer readCount;

	@Column(name = "smallImageId")
	private Long smallImageId;

	@Column(name = "largeImageId")
	private Long largeImageId;

	@Column(name = "custom1ImageId")
	private Long custom1ImageId;

	@Column(name = "custom2ImageId")
	private Long custom2ImageId;

	@Column(name = "manualCheckInRequired")
	private Byte manualCheckInRequired;

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

	public Long getRepositoryId() {
		return repositoryId;
	}

	public void setRepositoryId(Long repositoryId) {
		this.repositoryId = repositoryId;
	}

	public Long getFolderId() {
		return folderId;
	}

	public void setFolderId(Long folderId) {
		this.folderId = folderId;
	}

	public String getTreePath() {
		return treePath;
	}

	public void setTreePath(String treePath) {
		this.treePath = treePath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
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

	public String getExtraSettings() {
		return extraSettings;
	}

	public void setExtraSettings(String extraSettings) {
		this.extraSettings = extraSettings;
	}

	public Long getFileEntryTypeId() {
		return fileEntryTypeId;
	}

	public void setFileEntryTypeId(Long fileEntryTypeId) {
		this.fileEntryTypeId = fileEntryTypeId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Integer getReadCount() {
		return readCount;
	}

	public void setReadCount(Integer readCount) {
		this.readCount = readCount;
	}

	public Long getSmallImageId() {
		return smallImageId;
	}

	public void setSmallImageId(Long smallImageId) {
		this.smallImageId = smallImageId;
	}

	public Long getLargeImageId() {
		return largeImageId;
	}

	public void setLargeImageId(Long largeImageId) {
		this.largeImageId = largeImageId;
	}

	public Long getCustom1ImageId() {
		return custom1ImageId;
	}

	public void setCustom1ImageId(Long custom1ImageId) {
		this.custom1ImageId = custom1ImageId;
	}

	public Long getCustom2ImageId() {
		return custom2ImageId;
	}

	public void setCustom2ImageId(Long custom2ImageId) {
		this.custom2ImageId = custom2ImageId;
	}

	public Byte getManualCheckInRequired() {
		return manualCheckInRequired;
	}

	public void setManualCheckInRequired(Byte manualCheckInRequired) {
		this.manualCheckInRequired = manualCheckInRequired;
	}

	public Instant getLastPublishDate() {
		return lastPublishDate;
	}

	public void setLastPublishDate(Instant lastPublishDate) {
		this.lastPublishDate = lastPublishDate;
	}

}