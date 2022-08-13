package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class MembershipRequest {
	@Id
	@Column(name = "membershipRequestId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "groupId")
	private Long groupId;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "userId")
	private Long userId;

	@Column(name = "createDate")
	private Instant createDate;

	@Lob
	@Column(name = "comments")
	private String comments;

	@Lob
	@Column(name = "replyComments")
	private String replyComments;

	@Column(name = "replyDate")
	private Instant replyDate;

	@Column(name = "replierUserId")
	private Long replierUserId;

	@Column(name = "statusId")
	private Long statusId;

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

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Instant getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Instant createDate) {
		this.createDate = createDate;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getReplyComments() {
		return replyComments;
	}

	public void setReplyComments(String replyComments) {
		this.replyComments = replyComments;
	}

	public Instant getReplyDate() {
		return replyDate;
	}

	public void setReplyDate(Instant replyDate) {
		this.replyDate = replyDate;
	}

	public Long getReplierUserId() {
		return replierUserId;
	}

	public void setReplierUserId(Long replierUserId) {
		this.replierUserId = replierUserId;
	}

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

}