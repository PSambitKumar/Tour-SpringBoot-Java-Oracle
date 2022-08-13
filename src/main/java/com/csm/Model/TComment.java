package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_comments")
public class TComment {
	@Id
	@Column(name = "intCommentId", nullable = false)
	private Integer id;

	@Column(name = "vchName", length = 100)
	private String vchName;

	@Column(name = "vchEmail", length = 100)
	private String vchEmail;

	@Column(name = "vchPhoneNo", length = 15)
	private String vchPhoneNo;

	@Lob
	@Column(name = "vchComment")
	private String vchComment;

	@Column(name = "intApproveStatus")
	private Byte intApproveStatus;

	@Column(name = "intCategoryId")
	private Integer intCategoryId;

	@Column(name = "intPostId")
	private Integer intPostId;

	@Column(name = "dtmSubmittedOn")
	private Instant dtmSubmittedOn;

	@Column(name = "dtmModifiedOn")
	private Instant dtmModifiedOn;

	@Column(name = "dtmModifiedBy")
	private Integer dtmModifiedBy;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

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

	public String getVchEmail() {
		return vchEmail;
	}

	public void setVchEmail(String vchEmail) {
		this.vchEmail = vchEmail;
	}

	public String getVchPhoneNo() {
		return vchPhoneNo;
	}

	public void setVchPhoneNo(String vchPhoneNo) {
		this.vchPhoneNo = vchPhoneNo;
	}

	public String getVchComment() {
		return vchComment;
	}

	public void setVchComment(String vchComment) {
		this.vchComment = vchComment;
	}

	public Byte getIntApproveStatus() {
		return intApproveStatus;
	}

	public void setIntApproveStatus(Byte intApproveStatus) {
		this.intApproveStatus = intApproveStatus;
	}

	public Integer getIntCategoryId() {
		return intCategoryId;
	}

	public void setIntCategoryId(Integer intCategoryId) {
		this.intCategoryId = intCategoryId;
	}

	public Integer getIntPostId() {
		return intPostId;
	}

	public void setIntPostId(Integer intPostId) {
		this.intPostId = intPostId;
	}

	public Instant getDtmSubmittedOn() {
		return dtmSubmittedOn;
	}

	public void setDtmSubmittedOn(Instant dtmSubmittedOn) {
		this.dtmSubmittedOn = dtmSubmittedOn;
	}

	public Instant getDtmModifiedOn() {
		return dtmModifiedOn;
	}

	public void setDtmModifiedOn(Instant dtmModifiedOn) {
		this.dtmModifiedOn = dtmModifiedOn;
	}

	public Integer getDtmModifiedBy() {
		return dtmModifiedBy;
	}

	public void setDtmModifiedBy(Integer dtmModifiedBy) {
		this.dtmModifiedBy = dtmModifiedBy;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}