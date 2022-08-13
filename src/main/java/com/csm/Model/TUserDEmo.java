package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`t-userDEmo`")
public class TUserDEmo {
	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "vchName", length = 100)
	private String vchName;

	@Column(name = "vchFathername", length = 100)
	private String vchFathername;

	@Column(name = "vchMothername", length = 100)
	private String vchMothername;

	@Column(name = "vchAddress", length = 150)
	private String vchAddress;

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

	public String getVchFathername() {
		return vchFathername;
	}

	public void setVchFathername(String vchFathername) {
		this.vchFathername = vchFathername;
	}

	public String getVchMothername() {
		return vchMothername;
	}

	public void setVchMothername(String vchMothername) {
		this.vchMothername = vchMothername;
	}

	public String getVchAddress() {
		return vchAddress;
	}

	public void setVchAddress(String vchAddress) {
		this.vchAddress = vchAddress;
	}

}