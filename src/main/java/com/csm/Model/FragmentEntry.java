package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class FragmentEntry {
	@Id
	@Column(name = "fragmentEntryId", nullable = false)
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

	@Column(name = "fragmentCollectionId")
	private Long fragmentCollectionId;

	@Column(name = "fragmentEntryKey", length = 75)
	private String fragmentEntryKey;

	@Column(name = "name", length = 75)
	private String name;

	@Lob
	@Column(name = "css")
	private String css;

	@Lob
	@Column(name = "html")
	private String html;

	@Lob
	@Column(name = "js")
	private String js;

	@Lob
	@Column(name = "configuration")
	private String configuration;

	@Column(name = "previewFileEntryId")
	private Long previewFileEntryId;

	@Column(name = "type_")
	private Integer type;

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

	public Long getFragmentCollectionId() {
		return fragmentCollectionId;
	}

	public void setFragmentCollectionId(Long fragmentCollectionId) {
		this.fragmentCollectionId = fragmentCollectionId;
	}

	public String getFragmentEntryKey() {
		return fragmentEntryKey;
	}

	public void setFragmentEntryKey(String fragmentEntryKey) {
		this.fragmentEntryKey = fragmentEntryKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public String getJs() {
		return js;
	}

	public void setJs(String js) {
		this.js = js;
	}

	public String getConfiguration() {
		return configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public Long getPreviewFileEntryId() {
		return previewFileEntryId;
	}

	public void setPreviewFileEntryId(Long previewFileEntryId) {
		this.previewFileEntryId = previewFileEntryId;
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