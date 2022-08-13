package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AssetentriesAssetcategoryId implements Serializable {
	private static final long serialVersionUID = 7556784689821910933L;
	@Column(name = "categoryId", nullable = false)
	private Long categoryId;

	@Column(name = "entryId", nullable = false)
	private Long entryId;

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getEntryId() {
		return entryId;
	}

	public void setEntryId(Long entryId) {
		this.entryId = entryId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		AssetentriesAssetcategoryId entity = (AssetentriesAssetcategoryId) o;
		return Objects.equals(this.categoryId, entity.categoryId) &&
			   Objects.equals(this.entryId, entity.entryId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoryId, entryId);
	}

}