package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TPagesGalleryId implements Serializable {
	private static final long serialVersionUID = 3557466540240739324L;
	@Column(name = "intId", nullable = false)
	private Integer intId;

	@Column(name = "intPageId", nullable = false)
	private Integer intPageId;

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public Integer getIntPageId() {
		return intPageId;
	}

	public void setIntPageId(Integer intPageId) {
		this.intPageId = intPageId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		TPagesGalleryId entity = (TPagesGalleryId) o;
		return Objects.equals(this.intId, entity.intId) &&
			   Objects.equals(this.intPageId, entity.intPageId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(intId, intPageId);
	}

}