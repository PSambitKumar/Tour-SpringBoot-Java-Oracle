package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class BlogsEntry {
	@Id
	@Column(name = "entryId", nullable = false)
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

	@Column(name = "title", length = 150)
	private String title;

	@Lob
	@Column(name = "subtitle")
	private String subtitle;

	@Column(name = "urlTitle")
	private String urlTitle;

	@Lob
	@Column(name = "description")
	private String description;

	@Lob
	@Column(name = "content")
	private String content;

	@Column(name = "displayDate")
	private Instant displayDate;

	@Column(name = "allowPingbacks")
	private Byte allowPingbacks;

	@Column(name = "allowTrackbacks")
	private Byte allowTrackbacks;

	@Lob
	@Column(name = "trackbacks")
	private String trackbacks;

	@Lob
	@Column(name = "coverImageCaption")
	private String coverImageCaption;

	@Column(name = "coverImageFileEntryId")
	private Long coverImageFileEntryId;

	@Lob
	@Column(name = "coverImageURL")
	private String coverImageURL;

	@Column(name = "smallImage")
	private Byte smallImage;

	@Column(name = "smallImageFileEntryId")
	private Long smallImageFileEntryId;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getUrlTitle() {
		return urlTitle;
	}

	public void setUrlTitle(String urlTitle) {
		this.urlTitle = urlTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Instant getDisplayDate() {
		return displayDate;
	}

	public void setDisplayDate(Instant displayDate) {
		this.displayDate = displayDate;
	}

	public Byte getAllowPingbacks() {
		return allowPingbacks;
	}

	public void setAllowPingbacks(Byte allowPingbacks) {
		this.allowPingbacks = allowPingbacks;
	}

	public Byte getAllowTrackbacks() {
		return allowTrackbacks;
	}

	public void setAllowTrackbacks(Byte allowTrackbacks) {
		this.allowTrackbacks = allowTrackbacks;
	}

	public String getTrackbacks() {
		return trackbacks;
	}

	public void setTrackbacks(String trackbacks) {
		this.trackbacks = trackbacks;
	}

	public String getCoverImageCaption() {
		return coverImageCaption;
	}

	public void setCoverImageCaption(String coverImageCaption) {
		this.coverImageCaption = coverImageCaption;
	}

	public Long getCoverImageFileEntryId() {
		return coverImageFileEntryId;
	}

	public void setCoverImageFileEntryId(Long coverImageFileEntryId) {
		this.coverImageFileEntryId = coverImageFileEntryId;
	}

	public String getCoverImageURL() {
		return coverImageURL;
	}

	public void setCoverImageURL(String coverImageURL) {
		this.coverImageURL = coverImageURL;
	}

	public Byte getSmallImage() {
		return smallImage;
	}

	public void setSmallImage(Byte smallImage) {
		this.smallImage = smallImage;
	}

	public Long getSmallImageFileEntryId() {
		return smallImageFileEntryId;
	}

	public void setSmallImageFileEntryId(Long smallImageFileEntryId) {
		this.smallImageFileEntryId = smallImageFileEntryId;
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