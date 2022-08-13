package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class QuartzSimpropTriggerId implements Serializable {
	private static final long serialVersionUID = 6327651171026784309L;
	@Column(name = "SCHED_NAME", nullable = false, length = 120)
	private String schedName;

	@Column(name = "TRIGGER_NAME", nullable = false, length = 200)
	private String triggerName;

	@Column(name = "TRIGGER_GROUP", nullable = false, length = 200)
	private String triggerGroup;

	public String getSchedName() {
		return schedName;
	}

	public void setSchedName(String schedName) {
		this.schedName = schedName;
	}

	public String getTriggerName() {
		return triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

	public String getTriggerGroup() {
		return triggerGroup;
	}

	public void setTriggerGroup(String triggerGroup) {
		this.triggerGroup = triggerGroup;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		QuartzSimpropTriggerId entity = (QuartzSimpropTriggerId) o;
		return Objects.equals(this.triggerGroup, entity.triggerGroup) &&
			   Objects.equals(this.triggerName, entity.triggerName) &&
			   Objects.equals(this.schedName, entity.schedName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(triggerGroup, triggerName, schedName);
	}

}