package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class FragmentEntryLink {
	@Id
	@Column(name = "fragmentEntryLinkId", nullable = false)
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

	@Column(name = "originalFragmentEntryLinkId")
	private Long originalFragmentEntryLinkId;

	@Column(name = "fragmentEntryId")
	private Long fragmentEntryId;

	@Column(name = "classNameId")
	private Long classNameId;

	@Column(name = "classPK")
	private Long classPK;

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

	@Lob
	@Column(name = "editableValues")
	private String editableValues;

	@Column(name = "namespace", length = 75)
	private String namespace;

	@Column(name = "position")
	private Integer position;

	@Column(name = "rendererKey", length = 200)
	private String rendererKey;

	@Column(name = "lastPropagationDate")
	private Instant lastPropagationDate;

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

	public Long getOriginalFragmentEntryLinkId() {
		return originalFragmentEntryLinkId;
	}

	public void setOriginalFragmentEntryLinkId(Long originalFragmentEntryLinkId) {
		this.originalFragmentEntryLinkId = originalFragmentEntryLinkId;
	}

	public Long getFragmentEntryId() {
		return fragmentEntryId;
	}

	public void setFragmentEntryId(Long fragmentEntryId) {
		this.fragmentEntryId = fragmentEntryId;
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

	public String getEditableValues() {
		return editableValues;
	}

	public void setEditableValues(String editableValues) {
		this.editableValues = editableValues;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getRendererKey() {
		return rendererKey;
	}

	public void setRendererKey(String rendererKey) {
		this.rendererKey = rendererKey;
	}

	public Instant getLastPropagationDate() {
		return lastPropagationDate;
	}

	public void setLastPropagationDate(Instant lastPropagationDate) {
		this.lastPropagationDate = lastPropagationDate;
	}

	public Instant getLastPublishDate() {
		return lastPublishDate;
	}

	public void setLastPublishDate(Instant lastPublishDate) {
		this.lastPublishDate = lastPublishDate;
	}

}