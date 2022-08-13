package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_user_permission")
public class TUserPermission {
	@Id
	@Column(name = "INT_ID", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "INT_USER_ID", columnDefinition = "INT UNSIGNED not null")
	private Long intUserId;

	@Column(name = "INT_GL_ID")
	private Integer intGlId;

	@Column(name = "INT_PL_ID")
	private Integer intPlId;

	@Column(name = "INT_AUTHOR", columnDefinition = "INT UNSIGNED")
	private Long intAuthor;

	@Column(name = "INT_EDITOR", columnDefinition = "INT UNSIGNED")
	private Long intEditor;

	@Column(name = "INT_PUBLISHER", columnDefinition = "INT UNSIGNED")
	private Long intPublisher;

	@Column(name = "INT_MANAGER", columnDefinition = "INT UNSIGNED")
	private Long intManager;

	@Column(name = "INT_PRIVILEGE", columnDefinition = "INT UNSIGNED not null")
	private Long intPrivilege;

	@Column(name = "INT_CREATED_BY", columnDefinition = "INT UNSIGNED")
	private Long intCreatedBy;

	@Column(name = "DTM_CREATED_ON", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "INT_UPDATED_BY", columnDefinition = "INT UNSIGNED")
	private Long intUpdatedBy;

	@Column(name = "DTM_UPDATED_ON")
	private Instant dtmUpdatedOn;

	@Column(name = "BIT_DELETED_FLAG", nullable = false)
	private Boolean bitDeletedFlag = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIntUserId() {
		return intUserId;
	}

	public void setIntUserId(Long intUserId) {
		this.intUserId = intUserId;
	}

	public Integer getIntGlId() {
		return intGlId;
	}

	public void setIntGlId(Integer intGlId) {
		this.intGlId = intGlId;
	}

	public Integer getIntPlId() {
		return intPlId;
	}

	public void setIntPlId(Integer intPlId) {
		this.intPlId = intPlId;
	}

	public Long getIntAuthor() {
		return intAuthor;
	}

	public void setIntAuthor(Long intAuthor) {
		this.intAuthor = intAuthor;
	}

	public Long getIntEditor() {
		return intEditor;
	}

	public void setIntEditor(Long intEditor) {
		this.intEditor = intEditor;
	}

	public Long getIntPublisher() {
		return intPublisher;
	}

	public void setIntPublisher(Long intPublisher) {
		this.intPublisher = intPublisher;
	}

	public Long getIntManager() {
		return intManager;
	}

	public void setIntManager(Long intManager) {
		this.intManager = intManager;
	}

	public Long getIntPrivilege() {
		return intPrivilege;
	}

	public void setIntPrivilege(Long intPrivilege) {
		this.intPrivilege = intPrivilege;
	}

	public Long getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Long intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Long getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Long intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}