package com.csm.Model;

import javax.persistence.*;

@Entity
@Table(name = "m_attractions_category")
public class MAttractionsCategory {
	@Id
	@Column(name = "intCatId", nullable = false)
	private Integer id;

	@Column(name = "vchName", length = 128)
	private String vchName;

	@Column(name = "vchAlias", length = 128)
	private String vchAlias;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "intCatType")
	private Byte intCatType;

	@Column(name = "vchIcon")
	private String vchIcon;

	@Column(name = "vchMapIcon")
	private String vchMapIcon;

	@Column(name = "intDistId")
	private Integer intDistId;

	@Lob
	@Column(name = "vchMapText")
	private String vchMapText;

	@Column(name = "vchThumbImage", length = 100)
	private String vchThumbImage;

	@Lob
	@Column(name = "txtEssential")
	private String txtEssential;

	@Column(name = "intLocationId")
	private Integer intLocationId;

	@Column(name = "vchLatLong", length = 156)
	private String vchLatLong;

	@Column(name = "vchMetaTitle", length = 210)
	private String vchMetaTitle;

	@Column(name = "vchMetaKeyWord", length = 1024)
	private String vchMetaKeyWord;

	@Column(name = "txtMetaDescription", length = 1024)
	private String txtMetaDescription;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchName() {
		return vchName;
	}

	public void setVchName(String vchName) {
		this.vchName = vchName;
	}

	public String getVchAlias() {
		return vchAlias;
	}

	public void setVchAlias(String vchAlias) {
		this.vchAlias = vchAlias;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Byte getIntCatType() {
		return intCatType;
	}

	public void setIntCatType(Byte intCatType) {
		this.intCatType = intCatType;
	}

	public String getVchIcon() {
		return vchIcon;
	}

	public void setVchIcon(String vchIcon) {
		this.vchIcon = vchIcon;
	}

	public String getVchMapIcon() {
		return vchMapIcon;
	}

	public void setVchMapIcon(String vchMapIcon) {
		this.vchMapIcon = vchMapIcon;
	}

	public Integer getIntDistId() {
		return intDistId;
	}

	public void setIntDistId(Integer intDistId) {
		this.intDistId = intDistId;
	}

	public String getVchMapText() {
		return vchMapText;
	}

	public void setVchMapText(String vchMapText) {
		this.vchMapText = vchMapText;
	}

	public String getVchThumbImage() {
		return vchThumbImage;
	}

	public void setVchThumbImage(String vchThumbImage) {
		this.vchThumbImage = vchThumbImage;
	}

	public String getTxtEssential() {
		return txtEssential;
	}

	public void setTxtEssential(String txtEssential) {
		this.txtEssential = txtEssential;
	}

	public Integer getIntLocationId() {
		return intLocationId;
	}

	public void setIntLocationId(Integer intLocationId) {
		this.intLocationId = intLocationId;
	}

	public String getVchLatLong() {
		return vchLatLong;
	}

	public void setVchLatLong(String vchLatLong) {
		this.vchLatLong = vchLatLong;
	}

	public String getVchMetaTitle() {
		return vchMetaTitle;
	}

	public void setVchMetaTitle(String vchMetaTitle) {
		this.vchMetaTitle = vchMetaTitle;
	}

	public String getVchMetaKeyWord() {
		return vchMetaKeyWord;
	}

	public void setVchMetaKeyWord(String vchMetaKeyWord) {
		this.vchMetaKeyWord = vchMetaKeyWord;
	}

	public String getTxtMetaDescription() {
		return txtMetaDescription;
	}

	public void setTxtMetaDescription(String txtMetaDescription) {
		this.txtMetaDescription = txtMetaDescription;
	}

}