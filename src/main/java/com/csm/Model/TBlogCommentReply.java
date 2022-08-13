package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_blog_comment_replies")
public class TBlogCommentReply {
	@Id
	@Column(name = "intReplyId", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "intBlogId", nullable = false)
	private Integer intBlogId;

	@Column(name = "intCommentId", nullable = false)
	private Integer intCommentId;

	@Column(name = "vchReply", nullable = false, length = 512)
	private String vchReply;

	@Column(name = "intCreatedBy", nullable = false)
	private Integer intCreatedBy;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "intPublishStatus", nullable = false)
	private Boolean intPublishStatus = false;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIntBlogId() {
		return intBlogId;
	}

	public void setIntBlogId(Integer intBlogId) {
		this.intBlogId = intBlogId;
	}

	public Integer getIntCommentId() {
		return intCommentId;
	}

	public void setIntCommentId(Integer intCommentId) {
		this.intCommentId = intCommentId;
	}

	public String getVchReply() {
		return vchReply;
	}

	public void setVchReply(String vchReply) {
		this.vchReply = vchReply;
	}

	public Integer getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Integer intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Boolean getIntPublishStatus() {
		return intPublishStatus;
	}

	public void setIntPublishStatus(Boolean intPublishStatus) {
		this.intPublishStatus = intPublishStatus;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}