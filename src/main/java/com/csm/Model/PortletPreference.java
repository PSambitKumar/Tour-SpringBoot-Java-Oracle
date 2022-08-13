package com.csm.Model;

import javax.persistence.*;

@Entity
@Table(name = "PortletPreferences")
public class PortletPreference {
	@Id
	@Column(name = "portletPreferencesId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "ownerId")
	private Long ownerId;

	@Column(name = "ownerType")
	private Integer ownerType;

	@Column(name = "plid")
	private Long plid;

	@Column(name = "portletId", length = 200)
	private String portletId;

	@Lob
	@Column(name = "preferences")
	private String preferences;

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

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public Integer getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(Integer ownerType) {
		this.ownerType = ownerType;
	}

	public Long getPlid() {
		return plid;
	}

	public void setPlid(Long plid) {
		this.plid = plid;
	}

	public String getPortletId() {
		return portletId;
	}

	public void setPortletId(String portletId) {
		this.portletId = portletId;
	}

	public String getPreferences() {
		return preferences;
	}

	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}

}