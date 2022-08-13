package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_admin_global_menu")
public class MAdminGlobalMenu {
	@Id
	@Column(name = "INT_ADMIN_GL_ID", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "VCH_GL_NAME", length = 45)
	private String vchGlName;

	@Column(name = "INT_PERMISSION", columnDefinition = "INT UNSIGNED")
	private Long intPermission;

	@Column(name = "INT_DELETED_FLAG", columnDefinition = "INT UNSIGNED")
	private Long intDeletedFlag;

	@Column(name = "VCH_IMAGE", length = 50)
	private String vchImage;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVchGlName() {
		return vchGlName;
	}

	public void setVchGlName(String vchGlName) {
		this.vchGlName = vchGlName;
	}

	public Long getIntPermission() {
		return intPermission;
	}

	public void setIntPermission(Long intPermission) {
		this.intPermission = intPermission;
	}

	public Long getIntDeletedFlag() {
		return intDeletedFlag;
	}

	public void setIntDeletedFlag(Long intDeletedFlag) {
		this.intDeletedFlag = intDeletedFlag;
	}

	public String getVchImage() {
		return vchImage;
	}

	public void setVchImage(String vchImage) {
		this.vchImage = vchImage;
	}

}