package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "QUARTZ_SIMPLE_TRIGGERS")
public class QuartzSimpleTrigger {
	@EmbeddedId
	private QuartzSimpleTriggerId id;

	@Column(name = "REPEAT_COUNT", nullable = false)
	private Long repeatCount;

	@Column(name = "REPEAT_INTERVAL", nullable = false)
	private Long repeatInterval;

	@Column(name = "TIMES_TRIGGERED", nullable = false)
	private Long timesTriggered;

	public QuartzSimpleTriggerId getId() {
		return id;
	}

	public void setId(QuartzSimpleTriggerId id) {
		this.id = id;
	}

	public Long getRepeatCount() {
		return repeatCount;
	}

	public void setRepeatCount(Long repeatCount) {
		this.repeatCount = repeatCount;
	}

	public Long getRepeatInterval() {
		return repeatInterval;
	}

	public void setRepeatInterval(Long repeatInterval) {
		this.repeatInterval = repeatInterval;
	}

	public Long getTimesTriggered() {
		return timesTriggered;
	}

	public void setTimesTriggered(Long timesTriggered) {
		this.timesTriggered = timesTriggered;
	}

}