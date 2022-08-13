package com.csm.Model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Oa2authsOa2scopegrantId implements Serializable {
	private static final long serialVersionUID = -2414277098149436193L;
	@Column(name = "oAuth2AuthorizationId", nullable = false)
	private Long oAuth2AuthorizationId;

	@Column(name = "oAuth2ScopeGrantId", nullable = false)
	private Long oAuth2ScopeGrantId;

	public Long getOAuth2AuthorizationId() {
		return oAuth2AuthorizationId;
	}

	public void setOAuth2AuthorizationId(Long oAuth2AuthorizationId) {
		this.oAuth2AuthorizationId = oAuth2AuthorizationId;
	}

	public Long getOAuth2ScopeGrantId() {
		return oAuth2ScopeGrantId;
	}

	public void setOAuth2ScopeGrantId(Long oAuth2ScopeGrantId) {
		this.oAuth2ScopeGrantId = oAuth2ScopeGrantId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		Oa2authsOa2scopegrantId entity = (Oa2authsOa2scopegrantId) o;
		return Objects.equals(this.oAuth2AuthorizationId, entity.oAuth2AuthorizationId) &&
			   Objects.equals(this.oAuth2ScopeGrantId, entity.oAuth2ScopeGrantId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(oAuth2AuthorizationId, oAuth2ScopeGrantId);
	}

}