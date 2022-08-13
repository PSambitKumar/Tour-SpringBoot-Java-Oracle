package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "m_dictionary")
public class MDictionary {
	@Id
	@Column(name = "intWordId", nullable = false)
	private Integer id;

	@Column(name = "vchWord", length = 45)
	private String vchWord;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "bitDeleteFlag")
	private Boolean bitDeleteFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchWord() {
		return vchWord;
	}

	public void setVchWord(String vchWord) {
		this.vchWord = vchWord;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Boolean getBitDeleteFlag() {
		return bitDeleteFlag;
	}

	public void setBitDeleteFlag(Boolean bitDeleteFlag) {
		this.bitDeleteFlag = bitDeleteFlag;
	}

}