package com.csm.Model;

import javax.persistence.*;

@Entity
@Table(name = "t_pages_content_e")
public class TPagesContentE {
	@Id
	@Column(name = "intContentId", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "intPageId", columnDefinition = "INT UNSIGNED not null")
	private Long intPageId;

	@Column(name = "intPageNo", columnDefinition = "INT UNSIGNED not null")
	private Long intPageNo;

	@Lob
	@Column(name = "vchContentE")
	private String vchContentE;

	@Column(name = "intPortalType", columnDefinition = "SMALLINT UNSIGNED")
	private Integer intPortalType;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIntPageId() {
		return intPageId;
	}

	public void setIntPageId(Long intPageId) {
		this.intPageId = intPageId;
	}

	public Long getIntPageNo() {
		return intPageNo;
	}

	public void setIntPageNo(Long intPageNo) {
		this.intPageNo = intPageNo;
	}

	public String getVchContentE() {
		return vchContentE;
	}

	public void setVchContentE(String vchContentE) {
		this.vchContentE = vchContentE;
	}

	public Integer getIntPortalType() {
		return intPortalType;
	}

	public void setIntPortalType(Integer intPortalType) {
		this.intPortalType = intPortalType;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}