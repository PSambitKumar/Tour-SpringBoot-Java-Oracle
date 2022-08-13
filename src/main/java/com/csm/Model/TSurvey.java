package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_survey")
public class TSurvey {
	@Id
	@Column(name = "surveyId", nullable = false)
	private Integer id;

	@Column(name = "surveyQuestionId")
	private Integer surveyQuestionId;

	@Lob
	@Column(name = "surveyQuestionDesc")
	private String surveyQuestionDesc;

	@Column(name = "OptionId")
	private Integer optionId;

	@Lob
	@Column(name = "Options")
	private String options;

	@Column(name = "Options_count")
	private Integer optionsCount;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSurveyQuestionId() {
		return surveyQuestionId;
	}

	public void setSurveyQuestionId(Integer surveyQuestionId) {
		this.surveyQuestionId = surveyQuestionId;
	}

	public String getSurveyQuestionDesc() {
		return surveyQuestionDesc;
	}

	public void setSurveyQuestionDesc(String surveyQuestionDesc) {
		this.surveyQuestionDesc = surveyQuestionDesc;
	}

	public Integer getOptionId() {
		return optionId;
	}

	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public Integer getOptionsCount() {
		return optionsCount;
	}

	public void setOptionsCount(Integer optionsCount) {
		this.optionsCount = optionsCount;
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