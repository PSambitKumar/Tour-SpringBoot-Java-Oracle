package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "OA2Auths_OA2ScopeGrants")
public class Oa2authsOa2scopegrant {
	@EmbeddedId
	private Oa2authsOa2scopegrantId id;

	@Column(name = "companyId", nullable = false)
	private Long companyId;

	public Oa2authsOa2scopegrantId getId() {
		return id;
	}

	public void setId(Oa2authsOa2scopegrantId id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

}