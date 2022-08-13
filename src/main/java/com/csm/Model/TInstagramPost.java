package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_instagram_post")
public class TInstagramPost {
	@Id
	@Column(name = "intPostId", nullable = false)
	private Integer id;

	@Column(name = "vchinstaId", length = 48)
	private String vchinstaId;

	@Column(name = "vchPostedBy", length = 64)
	private String vchPostedBy;

	@Column(name = "vchUsername", length = 64)
	private String vchUsername;

	@Column(name = "vchProfilepic", length = 256)
	private String vchProfilepic;

	@Column(name = "vchThumbnail", length = 256)
	private String vchThumbnail;

	@Column(name = "vchLowresolution", length = 256)
	private String vchLowresolution;

	@Column(name = "vchStandard", length = 256)
	private String vchStandard;

	@Column(name = "dtmCreatedtime")
	private Instant dtmCreatedtime;

	@Lob
	@Column(name = "vchTxt")
	private String vchTxt;

	@Column(name = "vchLink", length = 128)
	private String vchLink;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "createdOn")
	private Instant createdOn;

	@Column(name = "createdBy")
	private Integer createdBy;

	@Column(name = "updatedOn")
	private Instant updatedOn;

	@Column(name = "updatedBy")
	private Integer updatedBy;

	@Column(name = "intCategoryId")
	private Integer intCategoryId;

	@Column(name = "intShowHome")
	private Integer intShowHome;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchinstaId() {
		return vchinstaId;
	}

	public void setVchinstaId(String vchinstaId) {
		this.vchinstaId = vchinstaId;
	}

	public String getVchPostedBy() {
		return vchPostedBy;
	}

	public void setVchPostedBy(String vchPostedBy) {
		this.vchPostedBy = vchPostedBy;
	}

	public String getVchUsername() {
		return vchUsername;
	}

	public void setVchUsername(String vchUsername) {
		this.vchUsername = vchUsername;
	}

	public String getVchProfilepic() {
		return vchProfilepic;
	}

	public void setVchProfilepic(String vchProfilepic) {
		this.vchProfilepic = vchProfilepic;
	}

	public String getVchThumbnail() {
		return vchThumbnail;
	}

	public void setVchThumbnail(String vchThumbnail) {
		this.vchThumbnail = vchThumbnail;
	}

	public String getVchLowresolution() {
		return vchLowresolution;
	}

	public void setVchLowresolution(String vchLowresolution) {
		this.vchLowresolution = vchLowresolution;
	}

	public String getVchStandard() {
		return vchStandard;
	}

	public void setVchStandard(String vchStandard) {
		this.vchStandard = vchStandard;
	}

	public Instant getDtmCreatedtime() {
		return dtmCreatedtime;
	}

	public void setDtmCreatedtime(Instant dtmCreatedtime) {
		this.dtmCreatedtime = dtmCreatedtime;
	}

	public String getVchTxt() {
		return vchTxt;
	}

	public void setVchTxt(String vchTxt) {
		this.vchTxt = vchTxt;
	}

	public String getVchLink() {
		return vchLink;
	}

	public void setVchLink(String vchLink) {
		this.vchLink = vchLink;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Instant getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Instant updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Integer getIntCategoryId() {
		return intCategoryId;
	}

	public void setIntCategoryId(Integer intCategoryId) {
		this.intCategoryId = intCategoryId;
	}

	public Integer getIntShowHome() {
		return intShowHome;
	}

	public void setIntShowHome(Integer intShowHome) {
		this.intShowHome = intShowHome;
	}

}