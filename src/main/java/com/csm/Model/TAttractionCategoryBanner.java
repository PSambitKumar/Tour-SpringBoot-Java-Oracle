package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_attraction_category_banner")
public class TAttractionCategoryBanner {
	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "vchBannerImage", length = 500)
	private String vchBannerImage;

	@Column(name = "vchCaption", length = 150)
	private String vchCaption;

	@Column(name = "intCatId")
	private Integer intCatId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchBannerImage() {
		return vchBannerImage;
	}

	public void setVchBannerImage(String vchBannerImage) {
		this.vchBannerImage = vchBannerImage;
	}

	public String getVchCaption() {
		return vchCaption;
	}

	public void setVchCaption(String vchCaption) {
		this.vchCaption = vchCaption;
	}

	public Integer getIntCatId() {
		return intCatId;
	}

	public void setIntCatId(Integer intCatId) {
		this.intCatId = intCatId;
	}

}