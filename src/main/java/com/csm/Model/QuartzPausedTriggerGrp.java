package com.csm.Model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "QUARTZ_PAUSED_TRIGGER_GRPS")
public class QuartzPausedTriggerGrp {
	@EmbeddedId
	private QuartzPausedTriggerGrpId id;

	public QuartzPausedTriggerGrpId getId() {
		return id;
	}

	public void setId(QuartzPausedTriggerGrpId id) {
		this.id = id;
	}

	//TODO [JPA Buddy] generate columns from DB
}