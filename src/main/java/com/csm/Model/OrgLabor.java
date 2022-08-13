package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrgLabor {
	@Id
	@Column(name = "orgLaborId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "organizationId")
	private Long organizationId;

	@Column(name = "typeId")
	private Long typeId;

	@Column(name = "sunOpen")
	private Integer sunOpen;

	@Column(name = "sunClose")
	private Integer sunClose;

	@Column(name = "monOpen")
	private Integer monOpen;

	@Column(name = "monClose")
	private Integer monClose;

	@Column(name = "tueOpen")
	private Integer tueOpen;

	@Column(name = "tueClose")
	private Integer tueClose;

	@Column(name = "wedOpen")
	private Integer wedOpen;

	@Column(name = "wedClose")
	private Integer wedClose;

	@Column(name = "thuOpen")
	private Integer thuOpen;

	@Column(name = "thuClose")
	private Integer thuClose;

	@Column(name = "friOpen")
	private Integer friOpen;

	@Column(name = "friClose")
	private Integer friClose;

	@Column(name = "satOpen")
	private Integer satOpen;

	@Column(name = "satClose")
	private Integer satClose;

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

	public Long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public Integer getSunOpen() {
		return sunOpen;
	}

	public void setSunOpen(Integer sunOpen) {
		this.sunOpen = sunOpen;
	}

	public Integer getSunClose() {
		return sunClose;
	}

	public void setSunClose(Integer sunClose) {
		this.sunClose = sunClose;
	}

	public Integer getMonOpen() {
		return monOpen;
	}

	public void setMonOpen(Integer monOpen) {
		this.monOpen = monOpen;
	}

	public Integer getMonClose() {
		return monClose;
	}

	public void setMonClose(Integer monClose) {
		this.monClose = monClose;
	}

	public Integer getTueOpen() {
		return tueOpen;
	}

	public void setTueOpen(Integer tueOpen) {
		this.tueOpen = tueOpen;
	}

	public Integer getTueClose() {
		return tueClose;
	}

	public void setTueClose(Integer tueClose) {
		this.tueClose = tueClose;
	}

	public Integer getWedOpen() {
		return wedOpen;
	}

	public void setWedOpen(Integer wedOpen) {
		this.wedOpen = wedOpen;
	}

	public Integer getWedClose() {
		return wedClose;
	}

	public void setWedClose(Integer wedClose) {
		this.wedClose = wedClose;
	}

	public Integer getThuOpen() {
		return thuOpen;
	}

	public void setThuOpen(Integer thuOpen) {
		this.thuOpen = thuOpen;
	}

	public Integer getThuClose() {
		return thuClose;
	}

	public void setThuClose(Integer thuClose) {
		this.thuClose = thuClose;
	}

	public Integer getFriOpen() {
		return friOpen;
	}

	public void setFriOpen(Integer friOpen) {
		this.friOpen = friOpen;
	}

	public Integer getFriClose() {
		return friClose;
	}

	public void setFriClose(Integer friClose) {
		this.friClose = friClose;
	}

	public Integer getSatOpen() {
		return satOpen;
	}

	public void setSatOpen(Integer satOpen) {
		this.satOpen = satOpen;
	}

	public Integer getSatClose() {
		return satClose;
	}

	public void setSatClose(Integer satClose) {
		this.satClose = satClose;
	}

}