package com.csm.Model;

import javax.persistence.*;

@Entity
@Table(name = "site_map")
public class SiteMap {
	@Id
	@Column(name = "ID", nullable = false)
	private Integer id;

	@Lob
	@Column(name = "VCH_SITEMAP", nullable = false)
	private String vchSitemap;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchSitemap() {
		return vchSitemap;
	}

	public void setVchSitemap(String vchSitemap) {
		this.vchSitemap = vchSitemap;
	}

}