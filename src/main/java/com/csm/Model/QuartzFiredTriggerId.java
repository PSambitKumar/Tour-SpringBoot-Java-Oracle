package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class QuartzFiredTriggerId implements Serializable {
	private static final long serialVersionUID = 759549987045040387L;
	@Column(name = "SCHED_NAME", nullable = false, length = 120)
	private String schedName;

	@Column(name = "ENTRY_ID", nullable = false, length = 95)
	private String entryId;

	public String getSchedName() {
		return schedName;
	}

	public void setSchedName(String schedName) {
		this.schedName = schedName;
	}

	public String getEntryId() {
		return entryId;
	}

	public void setEntryId(String entryId) {
		this.entryId = entryId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		QuartzFiredTriggerId entity = (QuartzFiredTriggerId) o;
		return Objects.equals(this.schedName, entity.schedName) &&
			   Objects.equals(this.entryId, entity.entryId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(schedName, entryId);
	}

}