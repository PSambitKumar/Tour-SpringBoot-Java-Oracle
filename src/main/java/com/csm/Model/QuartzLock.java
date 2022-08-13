package com.csm.Model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "QUARTZ_LOCKS")
public class QuartzLock {
	@EmbeddedId
	private QuartzLockId id;

	public QuartzLockId getId() {
		return id;
	}

	public void setId(QuartzLockId id) {
		this.id = id;
	}

	//TODO [JPA Buddy] generate columns from DB
}