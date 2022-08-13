package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class LayoutSetVersion {
	@Id
	@Column(name = "layoutSetVersionId", nullable = false)
	private Long id;

	@Column(name = "version")
	private Integer version;

	@Column(name = "layoutSetId")
	private Long layoutSetId;

	@Column(name = "groupId")
	private Long groupId;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "createDate")
	private Instant createDate;

	@Column(name = "modifiedDate")
	private Instant modifiedDate;

	@Column(name = "privateLayout")
	private Byte privateLayout;

	@Column(name = "logoId")
	private Long logoId;

	@Column(name = "themeId", length = 75)
	private String themeId;

	@Column(name = "colorSchemeId", length = 75)
	private String colorSchemeId;

	@Lob
	@Column(name = "css")
	private String css;

	@Column(name = "pageCount")
	private Integer pageCount;

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

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Long getLayoutSetId() {
		return layoutSetId;
	}

	public void setLayoutSetId(Long layoutSetId) {
		this.layoutSetId = layoutSetId;
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

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
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