package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "IM_MemberRequest")
public class ImMemberrequest {
	@Id
	@Column(name = "memberRequestId", nullable = false)
	private Long id;

	@Column(name = "groupId")
	private Long groupId;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "userId")
	private Long userId;

	@Column(name = "userName", length = 75)
	private String userName;

	@Column(name = "createDate")
	private Instant createDate;

	@Column(name = "modifiedDate")
	private Instant modifiedDate;

	@Column(name = "key_", length = 75)
	private String key;

	@Column(name = "receiverUserId")
	private Long receiverUserId;

	@Column(name = "invitedRoleId")
	private Long invitedRoleId;

	@Column(name = "invitedTeamId")
	private Long invitedTeamId;

	@Column(name = "status")
	private Integer status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Instant getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Instant createDate) {
		this.createDate = createDate;
	}

	public Instant getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Instant modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Long getReceiverUserId() {
		return receiverUserId;
	}

	public void setReceiverUserId(Long receiverUserId) {
		this.receiverUserId = receiverUserId;
	}

	public Long getInvitedRoleId() {
		return invitedRoleId;
	}

	public void setInvitedRoleId(Long invitedRoleId) {
		this.invitedRoleId = invitedRoleId;
	}

	public Long getInvitedTeamId() {
		return invitedTeamId;
	}

	public void setInvitedTeamId(Long invitedTeamId) {
		this.invitedTeamId = invitedTeamId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}