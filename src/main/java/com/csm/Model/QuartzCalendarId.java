package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class QuartzCalendarId implements Serializable {
	private static final long serialVersionUID = 7134946718015418890L;
	@Column(name = "SCHED_NAME", nullable = false, length = 120)
	private String schedName;

	@Column(name = "CALENDAR_NAME", nullable = false, length = 200)
	private String calendarName;

	public String getSchedName() {
		return schedName;
	}

	public void setSchedName(String schedName) {
		this.schedName = schedName;
	}

	public String getCalendarName() {
		return calendarName;
	}

	public void setCalendarName(String calendarName) {
		this.calendarName = calendarName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		QuartzCalendarId entity = (QuartzCalendarId) o;
		return Objects.equals(this.calendarName, entity.calendarName) &&
			   Objects.equals(this.schedName, entity.schedName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(calendarName, schedName);
	}

}