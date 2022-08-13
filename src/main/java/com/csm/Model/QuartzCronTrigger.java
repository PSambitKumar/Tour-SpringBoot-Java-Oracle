package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "QUARTZ_CRON_TRIGGERS")
public class QuartzCronTrigger {
	@EmbeddedId
	private QuartzCronTriggerId id;

	@Column(name = "CRON_EXPRESSION", nullable = false, length = 200)
	private String cronExpression;

	@Column(name = "TIME_ZONE_ID", length = 80)
	private String timeZoneId;

	public QuartzCronTriggerId getId() {
		return id;
	}

	public void setId(QuartzCronTriggerId id) {
		this.id = id;
	}

	public String getCronExpression() {
		return cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public String getTimeZoneId() {
		return timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

}