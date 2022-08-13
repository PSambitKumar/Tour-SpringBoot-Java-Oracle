package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "QUARTZ_BLOB_TRIGGERS")
public class QuartzBlobTrigger {
	@EmbeddedId
	private QuartzBlobTriggerId id;

	@Column(name = "BLOB_DATA")
	private byte[] blobData;

	public QuartzBlobTriggerId getId() {
		return id;
	}

	public void setId(QuartzBlobTriggerId id) {
		this.id = id;
	}

	public byte[] getBlobData() {
		return blobData;
	}

	public void setBlobData(byte[] blobData) {
		this.blobData = blobData;
	}

}