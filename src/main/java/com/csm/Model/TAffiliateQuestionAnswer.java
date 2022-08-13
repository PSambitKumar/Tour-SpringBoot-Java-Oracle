package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_affiliate_question_answer")
public class TAffiliateQuestionAnswer {
	@Id
	@Column(name = "intQuestionId", nullable = false)
	private Integer id;

	@Column(name = "intCategoryId", nullable = false)
	private Integer intCategoryId;

	@Column(name = "vchquestion", length = 500)
	private String vchquestion;

	@Column(name = "vchAnsOption1", length = 30)
	private String vchAnsOption1;

	@Column(name = "vchAnsOption2", length = 30)
	private String vchAnsOption2;

	@Column(name = "vchAnsOption3", length = 30)
	private String vchAnsOption3;

	@Column(name = "vchAnsOption4", length = 30)
	private String vchAnsOption4;

	@Column(name = "vchAnswer", length = 50)
	private String vchAnswer;

	@Column(name = "vchquestionImage", length = 25)
	private String vchquestionImage;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntCategoryId() {
		return intCategoryId;
	}

	public void setIntCategoryId(Integer intCategoryId) {
		this.intCategoryId = intCategoryId;
	}

	public String getVchquestion() {
		return vchquestion;
	}

	public void setVchquestion(String vchquestion) {
		this.vchquestion = vchquestion;
	}

	public String getVchAnsOption1() {
		return vchAnsOption1;
	}

	public void setVchAnsOption1(String vchAnsOption1) {
		this.vchAnsOption1 = vchAnsOption1;
	}

	public String getVchAnsOption2() {
		return vchAnsOption2;
	}

	public void setVchAnsOption2(String vchAnsOption2) {
		this.vchAnsOption2 = vchAnsOption2;
	}

	public String getVchAnsOption3() {
		return vchAnsOption3;
	}

	public void setVchAnsOption3(String vchAnsOption3) {
		this.vchAnsOption3 = vchAnsOption3;
	}

	public String getVchAnsOption4() {
		return vchAnsOption4;
	}

	public void setVchAnsOption4(String vchAnsOption4) {
		this.vchAnsOption4 = vchAnsOption4;
	}

	public String getVchAnswer() {
		return vchAnswer;
	}

	public void setVchAnswer(String vchAnswer) {
		this.vchAnswer = vchAnswer;
	}

	public String getVchquestionImage() {
		return vchquestionImage;
	}

	public void setVchquestionImage(String vchquestionImage) {
		this.vchquestionImage = vchquestionImage;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}