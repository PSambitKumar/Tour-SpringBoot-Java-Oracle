package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class LayoutRevision {
	@Id
	@Column(name = "layoutRevisionId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

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

	@Column(name = "layoutSetBranchId")
	private Long layoutSetBranchId;

	@Column(name = "layoutBranchId")
	private Long layoutBranchId;

	@Column(name = "parentLayoutRevisionId")
	private Long parentLayoutRevisionId;

	@Column(name = "head")
	private Byte head;

	@Column(name = "major")
	private Byte major;

	@Column(name = "plid")
	private Long plid;

	@Column(name = "privateLayout")
	private Byte privateLayout;

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

	@Lob
	@Column(name = "typeSettings")
	private String typeSettings;

	@Column(name = "iconImageId")
	private Long iconImageId;

	@Column(name = "themeId", length = 75)
	private String themeId;

	@Column(name = "colorSchemeId", length = 75)
	private String colorSchemeId;

	@Lob
	@Column(name = "css")
	private String css;

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

	public Long getLayoutSetBranchId() {
		return layoutSetBranchId;
	}

	public void setLayoutSetBranchId(Long layoutSetBranchId) {
		this.layoutSetBranchId = layoutSetBranchId;
	}

	public Long getLayoutBranchId() {
		return layoutBranchId;
	}

	public void setLayoutBranchId(Long layoutBranchId) {
		this.layoutBranchId = layoutBranchId;
	}

	public Long getParentLayoutRevisionId() {
		return parentLayoutRevisionId;
	}

	public void setParentLayoutRevisionId(Long parentLayoutRevisionId) {
		this.parentLayoutRevisionId = parentLayoutRevisionId;
	}

	public Byte getHead() {
		return head;
	}

	public void setHead(Byte head) {
		this.head = head;
	}

	public Byte getMajor() {
		return major;
	}

	public void setMajor(Byte major) {
		this.major = major;
	}

	public Long getPlid() {
		return plid;
	}

	public void setPlid(Long plid) {
		this.plid = plid;
	}

	public Byte getPrivateLayout() {
		return privateLayout;
	}

	public void setPrivateLayout(Byte privateLayout) {
		this.privateLayout = privateLayout;
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

	public String getTypeSettings() {
		return typeSettings;
	}

	public void setTypeSettings(String typeSettings) {
		this.typeSettings = typeSettings;
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