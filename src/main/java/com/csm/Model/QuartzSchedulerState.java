package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "QUARTZ_SCHEDULER_STATE")
public class QuartzSchedulerState {
	@EmbeddedId
	private QuartzSchedulerStateId id;

	@Column(name = "LAST_CHECKIN_TIME", nullable = false)
	private Long lastCheckinTime;

	@Column(name = "CHECKIN_INTERVAL", nullable = false)
	private Long checkinInterval;

	public QuartzSchedulerStateId getId() {
		return id;
	}

	public void setId(QuartzSchedulerStateId id) {
		this.id = id;
	}

	public Long getLastCheckinTime() {
		return lastCheckinTime;
	}

	public void setLastCheckinTime(Long lastCheckinTime) {
		this.lastCheckinTime = lastCheckinTime;
	}

	public Long getCheckinInterval() {
		return checkinInterval;
	}

	public void setCheckinInterval(Long checkinInterval) {
		this.checkinInterval = checkinInterval;
	}

}