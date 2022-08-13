package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_function_master")
public class TFunctionMaster {
	@Id
	@Column(name = "INT_FN_ID", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "VCH_NAME", nullable = false, length = 45)
	private String vchName;

	@Column(name = "VCH_ADMIN_LAND_URL", length = 45)
	private String vchAdminLandUrl;

	@Column(name = "VCH_WEB_LAND_URL", nullable = false, length = 45)
	private String vchWebLandUrl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVchName() {
		return vchName;
	}

	public void setVchName(String vchName) {
		this.vchName = vchName;
	}

	public String getVchAdminLandUrl() {
		return vchAdminLandUrl;
	}

	public void setVchAdminLandUrl(String vchAdminLandUrl) {
		this.vchAdminLandUrl = vchAdminLandUrl;
	}

	public String getVchWebLandUrl() {
		return vchWebLandUrl;
	}

	public void setVchWebLandUrl(String vchWebLandUrl) {
		this.vchWebLandUrl = vchWebLandUrl;
	}

}