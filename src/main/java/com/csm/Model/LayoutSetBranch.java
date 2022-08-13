package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class LayoutSetBranch {
	@Id
	@Column(name = "layoutSetBranchId", nullable = false)
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

	@Column(name = "privateLayout")
	private Byte privateLayout;

	@Column(name = "name", length = 75)
	private String name;

	@Lob
	@Column(name = "description")
	private String description;

	@Column(name = "master")
	private Byte master;

	@Column(name = "logoId")
	private Long logoId;

	@Column(name = "themeId", length = 75)
	private String themeId;

	@Column(name = "colorSchemeId", length = 75)
	private String colorSchemeId;

	@Lob
	@Column(name = "css")
	private String css;

	@Lob
	@Column(name = "settings_")
	private String settings;

	@Column(name = "layoutSetPrototypeUuid", length = 75)
	private String layoutSetPrototypeUuid;

	@Column(name = "layoutSetPrototypeLinkEnabled")
	private Byte layoutSetPrototypeLinkEnabled;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Byte getMaster() {
		return master;
	}

	public void setMaster(Byte master) {
		this.master = master;
	}

	public Long getLogoId() {
		return logoId;
	}

	public void setLogoId(Long logoId) {
		this.logoId = logoId;
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

	public String getSettings() {
		return settings;
	}

	public void setSettings(String settings) {
		this.settings = settings;
	}

	public String getLayoutSetPrototypeUuid() {
		return layoutSetPrototypeUuid;
	}

	public void setLayoutSetPrototypeUuid(String layoutSetPrototypeUuid) {
		this.layoutSetPrototypeUuid = layoutSetPrototypeUuid;
	}

	public Byte getLayoutSetPrototypeLinkEnabled() {
		return layoutSetPrototypeLinkEnabled;
	}

	public void setLayoutSetPrototypeLinkEnabled(Byte layoutSetPrototypeLinkEnabled) {
		this.layoutSetPrototypeLinkEnabled = layoutSetPrototypeLinkEnabled;
	}

}