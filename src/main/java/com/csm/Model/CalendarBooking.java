package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class CalendarBooking {
	@Id
	@Column(name = "calendarBookingId", nullable = false)
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

	@Column(name = "calendarId")
	private Long calendarId;

	@Column(name = "calendarResourceId")
	private Long calendarResourceId;

	@Column(name = "parentCalendarBookingId")
	private Long parentCalendarBookingId;

	@Column(name = "recurringCalendarBookingId")
	private Long recurringCalendarBookingId;

	@Column(name = "vEventUid")
	private String vEventUid;

	@Lob
	@Column(name = "title")
	private String title;

	@Lob
	@Column(name = "description")
	private String description;

	@Lob
	@Column(name = "location")
	private String location;

	@Column(name = "startTime")
	private Long startTime;

	@Column(name = "endTime")
	private Long endTime;

	@Column(name = "allDay")
	private Byte allDay;

	@Lob
	@Column(name = "recurrence")
	private String recurrence;

	@Column(name = "firstReminder")
	private Long firstReminder;

	@Column(name = "firstReminderType", length = 75)
	private String firstReminderType;

	@Column(name = "secondReminder")
	private Long secondReminder;

	@Column(name = "secondReminderType", length = 75)
	private String secondReminderType;

	@Column(name = "lastPublishDate")
	private Instant lastPublishDate;

	@Column(name = "status")
	private Integer status;

	@Column(name = "statusByUserId")
	private Long statusByUserId;

	@Column(name = "statusByUserName", length = 75)
	private String statusByUserName;

	@Column(name = "statusDate")
	private Instant statusDate;

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

	public Long getCalendarId() {
		return calendarId;
	}

	public void setCalendarId(Long calendarId) {
		this.calendarId = calendarId;
	}

	public Long getCalendarResourceId() {
		return calendarResourceId;
	}

	public void setCalendarResourceId(Long calendarResourceId) {
		this.calendarResourceId = calendarResourceId;
	}

	public Long getParentCalendarBookingId() {
		return parentCalendarBookingId;
	}

	public void setParentCalendarBookingId(Long parentCalendarBookingId) {
		this.parentCalendarBookingId = parentCalendarBookingId;
	}

	public Long getRecurringCalendarBookingId() {
		return recurringCalendarBookingId;
	}

	public void setRecurringCalendarBookingId(Long recurringCalendarBookingId) {
		this.recurringCalendarBookingId = recurringCalendarBookingId;
	}

	public String getVEventUid() {
		return vEventUid;
	}

	public void setVEventUid(String vEventUid) {
		this.vEventUid = vEventUid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getStartTime() {
		return startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getEndTime() {
		return endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Byte getAllDay() {
		return allDay;
	}

	public void setAllDay(Byte allDay) {
		this.allDay = allDay;
	}

	public String getRecurrence() {
		return recurrence;
	}

	public void setRecurrence(String recurrence) {
		this.recurrence = recurrence;
	}

	public Long getFirstReminder() {
		return firstReminder;
	}

	public void setFirstReminder(Long firstReminder) {
		this.firstReminder = firstReminder;
	}

	public String getFirstReminderType() {
		return firstReminderType;
	}

	public void setFirstReminderType(String firstReminderType) {
		this.firstReminderType = firstReminderType;
	}

	public Long getSecondReminder() {
		return secondReminder;
	}

	public void setSecondReminder(Long secondReminder) {
		this.secondReminder = secondReminder;
	}

	public String getSecondReminderType() {
		return secondReminderType;
	}

	public void setSecondReminderType(String secondReminderType) {
		this.secondReminderType = secondReminderType;
	}

	public Instant getLastPublishDate() {
		return lastPublishDate;
	}

	public void setLastPublishDate(Instant lastPublishDate) {
		this.lastPublishDate = lastPublishDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getStatusByUserId() {
		return statusByUserId;
	}

	public void setStatusByUserId(Long statusByUserId) {
		this.statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		this.statusByUserName = statusByUserName;
	}

	public Instant getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Instant statusDate) {
		this.statusDate = statusDate;
	}

}