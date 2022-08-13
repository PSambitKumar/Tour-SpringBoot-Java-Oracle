package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class QuartzPausedTriggerGrpId implements Serializable {
	private static final long serialVersionUID = -2545494993982328019L;
	@Column(name = "SCHED_NAME", nullable = false, length = 120)
	private String schedName;

	@Column(name = "TRIGGER_GROUP", nullable = false, length = 200)
	private String triggerGroup;

	public String getSchedName() {
		return schedName;
	}

	public void setSchedName(String schedName) {
		this.schedName = schedName;
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
		QuartzPausedTriggerGrpId entity = (QuartzPausedTriggerGrpId) o;
		return Objects.equals(this.triggerGroup, entity.triggerGroup) &&
			   Objects.equals(this.schedName, entity.schedName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(triggerGroup, schedName);
	}

}