package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class QuartzSchedulerStateId implements Serializable {
	private static final long serialVersionUID = 8290166767852082453L;
	@Column(name = "SCHED_NAME", nullable = false, length = 120)
	private String schedName;

	@Column(name = "INSTANCE_NAME", nullable = false, length = 200)
	private String instanceName;

	public String getSchedName() {
		return schedName;
	}

	public void setSchedName(String schedName) {
		this.schedName = schedName;
	}

	public String getInstanceName() {
		return instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		QuartzSchedulerStateId entity = (QuartzSchedulerStateId) o;
		return Objects.equals(this.instanceName, entity.instanceName) &&
			   Objects.equals(this.schedName, entity.schedName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(instanceName, schedName);
	}

}