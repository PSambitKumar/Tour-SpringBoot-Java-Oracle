package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class LayoutVersion {
	@Id
	@Column(name = "layoutVersionId", nullable = false)
	private Long id;

	@Column(name = "version")
	private Integer version;

	@Column(name = "uuid_", length = 75)
	private String uuid;

	@Column(name = "plid")
	private Long plid;

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

	@Column(name = "parentPlid")
	private Long parentPlid;

	@Column(name = "privateLayout")
	private Byte privateLayout;

	@Column(name = "layoutId")
	private Long layoutId;

	@Column(name = "parentLayoutId")
	private Long parentLayoutId;

	@Column(name = "classNameId")
	private Long classNameId;

	@Column(name = "classPK")
	private Long classPK;

	@Lob
	@Column(name = "name")
	private String name;

	@Lob
	@Column(name = "title")
	private String title;

	@Lob
	@Column(name = "description")
	private String description;

	@Lob
	@Column(name = "keywords")
	private String keywords;

	@Lob
	@Column(name = "robots")
	private String robots;

	@Column(name = "type_", length = 75)
	private String type;

	@Lob
	@Column(name = "typeSettings")
	private String typeSettings;

	@Column(name = "hidden_")
	private Byte hidden;

	@Column(name = "system_")
	private Byte system;

	@Column(name = "friendlyURL")
	private String friendlyURL;

	@Column(name = "iconImageId")
	private Long iconImageId;

	@Column(name = "themeId", length = 75)
	private String themeId;

	@Column(name = "colorSchemeId", length = 75)
	private String colorSchemeId;

	@Lob
	@Column(name = "css")
	private String css;

	@Column(name = "priority")
	private Integer priority;

	@Column(name = "layoutPrototypeUuid", length = 75)
	private String layoutPrototypeUuid;

	@Column(name = "layoutPrototypeLinkEnabled")
	private Byte layoutPrototypeLinkEnabled;

	@Column(name = "sourcePrototypeLayoutUuid", length = 75)
	private String sourcePrototypeLayoutUuid;

	@Column(name = "publishDate")
	private Instant publishDate;

	@Column(name = "lastPublishDate")
	private Instant lastPublishDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Long getPlid() {
		return plid;
	}

	public void setPlid(Long plid) {
		this.plid = plid;
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

	public Long getParentPlid() {
		return parentPlid;
	}

	public void setParentPlid(Long parentPlid) {
		this.parentPlid = parentPlid;
	}

	public Byte getPrivateLayout() {
		return privateLayout;
	}

	public void setPrivateLayout(Byte privateLayout) {
		this.privateLayout = privateLayout;
	}

	public Long getLayoutId() {
		return layoutId;
	}

	public void setLayoutId(Long layoutId) {
		this.layoutId = layoutId;
	}

	public Long getParentLayoutId() {
		return parentLayoutId;
	}

	public void setParentLayoutId(Long parentLayoutId) {
		this.parentLayoutId = parentLayoutId;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getRobots() {
		return robots;
	}

	public void setRobots(String robots) {
		this.robots = robots;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeSettings() {
		return typeSettings;
	}

	public void setTypeSettings(String typeSettings) {
		this.typeSettings = typeSettings;
	}

	public Byte getHidden() {
		return hidden;
	}

	public void setHidden(Byte hidden) {
		this.hidden = hidden;
	}

	public Byte getSystem() {
		return system;
	}

	public void setSystem(Byte system) {
		this.system = system;
	}

	public String getFriendlyURL() {
		return friendlyURL;
	}

	public void setFriendlyURL(String friendlyURL) {
		this.friendlyURL = friendlyURL;
	}

	public Long getIconImageId() {
		return iconImageId;
	}

	public void setIconImageId(Long iconImageId) {
		this.iconImageId = iconImageId;
	}

	public String getThemeId() {
		return themeId;
	}

	public void setThemeId(String themeId) {
		this.themeId = themeId;
	}

	public String getColorSchemeId() {
		return colorSchemeId;
	}

	public void setColorSchemeId(String colorSchemeId) {
		this.colorSchemeId = colorSchemeId;
	}

	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getLayoutPrototypeUuid() {
		return layoutPrototypeUuid;
	}

	public void setLayoutPrototypeUuid(String layoutPrototypeUuid) {
		this.layoutPrototypeUuid = layoutPrototypeUuid;
	}

	public Byte getLayoutPrototypeLinkEnabled() {
		return layoutPrototypeLinkEnabled;
	}

	public void setLayoutPrototypeLinkEnabled(Byte layoutPrototypeLinkEnabled) {
		this.layoutPrototypeLinkEnabled = layoutPrototypeLinkEnabled;
	}

	public String getSourcePrototypeLayoutUuid() {
		return sourcePrototypeLayoutUuid;
	}

	public void setSourcePrototypeLayoutUuid(String sourcePrototypeLayoutUuid) {
		this.sourcePrototypeLayoutUuid = sourcePrototypeLayoutUuid;
	}

	public Instant getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Instant publishDate) {
		this.publishDate = publishDate;
	}

	public Instant getLastPublishDate() {
		return lastPublishDate;
	}

	public void setLastPublishDate(Instant lastPublishDate) {
		this.lastPublishDate = lastPublishDate;
	}

}