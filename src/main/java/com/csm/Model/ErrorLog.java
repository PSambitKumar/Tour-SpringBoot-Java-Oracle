package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "error_log")
public class ErrorLog {
	@Id
	@Column(name = "INT_ERROR_ID", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Lob
	@Column(name = "VCH_ERROR_DESC")
	private String vchErrorDesc;

	@Lob
	@Column(name = "VCH_TABALE_NAME")
	private String vchTabaleName;

	@Column(name = "VCH_ACTION_CODE", length = 15)
	private String vchActionCode;

	@Lob
	@Column(name = "VCH_SQL_QUERY")
	private String vchSqlQuery;

	@Column(name = "DTM_CREATED_ON")
	private Instant dtmCreatedOn;

	@Column(name = "STM_UPDATED_ON")
	private Instant stmUpdatedOn;

	@Column(name = "INT_CREATED_BY", columnDefinition = "INT UNSIGNED")
	private Long intCreatedBy;

	@Column(name = "INT_UPDATED_BY", columnDefinition = "INT UNSIGNED")
	private Long intUpdatedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVchErrorDesc() {
		return vchErrorDesc;
	}

	public void setVchErrorDesc(String vchErrorDesc) {
		this.vchErrorDesc = vchErrorDesc;
	}

	public String getVchTabaleName() {
		return vchTabaleName;
	}

	public void setVchTabaleName(String vchTabaleName) {
		this.vchTabaleName = vchTabaleName;
	}

	public String getVchActionCode() {
		return vchActionCode;
	}

	public void setVchActionCode(String vchActionCode) {
		this.vchActionCode = vchActionCode;
	}

	public String getVchSqlQuery() {
		return vchSqlQuery;
	}

	public void setVchSqlQuery(String vchSqlQuery) {
		this.vchSqlQuery = vchSqlQuery;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Instant getStmUpdatedOn() {
		return stmUpdatedOn;
	}

	public void setStmUpdatedOn(Instant stmUpdatedOn) {
		this.stmUpdatedOn = stmUpdatedOn;
	}

	public Long getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Long intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Long getIntUpdatedBy() {
		return intUpdatedBy;
	}

	public void setIntUpdatedBy(Long intUpdatedBy) {
		this.intUpdatedBy = intUpdatedBy;
	}

}