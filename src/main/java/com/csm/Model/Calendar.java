package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class Calendar {
	@Id
	@Column(name = "calendarId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "uuid_", length = 75)
	private String uuid;

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

	@Column(name = "calendarResourceId")
	private Long calendarResourceId;

	@Lob
	@Column(name = "name")
	private String name;

	@Lob
	@Column(name = "description")
	private String description;

	@Column(name = "timeZoneId", length = 75)
	private String timeZoneId;

	@Column(name = "color")
	private Integer color;

	@Column(name = "defaultCalendar")
	private Byte defaultCalendar;

	@Column(name = "enableComments")
	private Byte enableComments;

	@Column(name = "enableRatings")
	private Byte enableRatings;

	@Column(name = "lastPublishDate")
	private Instant lastPublishDate;

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

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
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

	public Long getCalendarResourceId() {
		return calendarResourceId;
	}

	public void setCalendarResourceId(Long calendarResourceId) {
		this.calendarResourceId = calendarResourceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTimeZoneId() {
		return timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	public Integer getColor() {
		return color;
	}

	public void setColor(Integer color) {
		this.color = color;
	}

	public Byte getDefaultCalendar() {
		return defaultCalendar;
	}

	public void setDefaultCalendar(Byte defaultCalendar) {
		this.defaultCalendar = defaultCalendar;
	}

	public Byte getEnableComments() {
		return enableComments;
	}

	public void setEnableComments(Byte enableComments) {
		this.enableComments = enableComments;
	}

	public Byte getEnableRatings() {
		return enableRatings;
	}

	public void setEnableRatings(Byte enableRatings) {
		this.enableRatings = enableRatings;
	}

	public Instant getLastPublishDate() {
		return lastPublishDate;
	}

	public void setLastPublishDate(Instant lastPublishDate) {
		this.lastPublishDate = lastPublishDate;
	}

}