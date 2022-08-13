package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "QUARTZ_CALENDARS")
public class QuartzCalendar {
	@EmbeddedId
	private QuartzCalendarId id;

	@Column(name = "CALENDAR", nullable = false)
	private byte[] calendar;

	public QuartzCalendarId getId() {
		return id;
	}

	public void setId(QuartzCalendarId id) {
		this.id = id;
	}

	public byte[] getCalendar() {
		return calendar;
	}

	public void setCalendar(byte[] calendar) {
		this.calendar = calendar;
	}

}