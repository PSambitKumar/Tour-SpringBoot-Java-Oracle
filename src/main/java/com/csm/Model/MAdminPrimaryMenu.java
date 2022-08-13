package com.csm.Model;

import javax.persistence.*;

@Entity
@Table(name = "m_admin_primary_menu")
public class MAdminPrimaryMenu {
	@Id
	@Column(name = "INT_ID", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "INT_ADMIN_GL_ID", nullable = false)
	private MAdminGlobalMenu intAdminGl;

	@Column(name = "VCH_PL_NAME", nullable = false, length = 45)
	private String vchPlName;

	@Column(name = "INT_DELETED_FLAG", columnDefinition = "INT UNSIGNED")
	private Long intDeletedFlag;

	@Column(name = "VCH_URL", length = 100)
	private String vchUrl;

	@Column(name = "INT_ADMIN_PL_ID", columnDefinition = "INT UNSIGNED not null")
	private Long intAdminPlId;

	@Column(name = "VCH_RELATED_PAGES", length = 500)
	private String vchRelatedPages;

	@Column(name = "INT_FUNCTION_ID", columnDefinition = "INT UNSIGNED")
	private Long intFunctionId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MAdminGlobalMenu getIntAdminGl() {
		return intAdminGl;
	}

	public void setIntAdminGl(MAdminGlobalMenu intAdminGl) {
		this.intAdminGl = intAdminGl;
	}

	public String getVchPlName() {
		return vchPlName;
	}

	public void setVchPlName(String vchPlName) {
		this.vchPlName = vchPlName;
	}

	public Long getIntDeletedFlag() {
		return intDeletedFlag;
	}

	public void setIntDeletedFlag(Long intDeletedFlag) {
		this.intDeletedFlag = intDeletedFlag;
	}

	public String getVchUrl() {
		return vchUrl;
	}

	public void setVchUrl(String vchUrl) {
		this.vchUrl = vchUrl;
	}

	public Long getIntAdminPlId() {
		return intAdminPlId;
	}

	public void setIntAdminPlId(Long intAdminPlId) {
		this.intAdminPlId = intAdminPlId;
	}

	public String getVchRelatedPages() {
		return vchRelatedPages;
	}

	public void setVchRelatedPages(String vchRelatedPages) {
		this.vchRelatedPages = vchRelatedPages;
	}

	public Long getIntFunctionId() {
		return intFunctionId;
	}

	public void setIntFunctionId(Long intFunctionId) {
		this.intFunctionId = intFunctionId;
	}

}