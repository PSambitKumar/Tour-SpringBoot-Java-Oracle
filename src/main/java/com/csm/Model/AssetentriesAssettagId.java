package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AssetentriesAssettagId implements Serializable {
	private static final long serialVersionUID = -5395761501726137194L;
	@Column(name = "entryId", nullable = false)
	private Long entryId;

	@Column(name = "tagId", nullable = false)
	private Long tagId;

	public Long getEntryId() {
		return entryId;
	}

	public void setEntryId(Long entryId) {
		this.entryId = entryId;
	}

	public Long getTagId() {
		return tagId;
	}

	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		AssetentriesAssettagId entity = (AssetentriesAssettagId) o;
		return Objects.equals(this.tagId, entity.tagId) &&
			   Objects.equals(this.entryId, entity.entryId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(tagId, entryId);
	}

}