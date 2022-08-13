package com.csm.Model;

import javax.persistence.*;

@Entity
@Table(name = "t_menus")
public class TMenu {
	@Id
	@Column(name = "intId", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "intPageId", nullable = false)
	private TPage intPage;

	@Column(name = "intParentId", columnDefinition = "INT UNSIGNED not null")
	private Long intParentId;

	@Column(name = "tinMenuType", columnDefinition = "TINYINT UNSIGNED not null")
	private Short tinMenuType;

	@Column(name = "intMenuOrder", columnDefinition = "INT UNSIGNED not null")
	private Long intMenuOrder;

	@Column(name = "vchLinkType", length = 24)
	private String vchLinkType;

	@Column(name = "vchPageNavigation", nullable = false, length = 128)
	private String vchPageNavigation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TPage getIntPage() {
		return intPage;
	}

	public void setIntPage(TPage intPage) {
		this.intPage = intPage;
	}

	public Long getIntParentId() {
		return intParentId;
	}

	public void setIntParentId(Long intParentId) {
		this.intParentId = intParentId;
	}

	public Short getTinMenuType() {
		return tinMenuType;
	}

	public void setTinMenuType(Short tinMenuType) {
		this.tinMenuType = tinMenuType;
	}

	public Long getIntMenuOrder() {
		return intMenuOrder;
	}

	public void setIntMenuOrder(Long intMenuOrder) {
		this.intMenuOrder = intMenuOrder;
	}

	public String getVchLinkType() {
		return vchLinkType;
	}

	public void setVchLinkType(String vchLinkType) {
		this.vchLinkType = vchLinkType;
	}

	public String getVchPageNavigation() {
		return vchPageNavigation;
	}

	public void setVchPageNavigation(String vchPageNavigation) {
		this.vchPageNavigation = vchPageNavigation;
	}

}