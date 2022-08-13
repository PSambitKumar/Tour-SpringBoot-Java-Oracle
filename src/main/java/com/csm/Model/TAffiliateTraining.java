package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_affiliate_training")
public class TAffiliateTraining {
	@Id
	@Column(name = "intTrainingId", nullable = false)
	private Integer id;

	@Column(name = "intAffiliateTagentId", nullable = false)
	private Integer intAffiliateTagentId;

	@Column(name = "intCategoryId", nullable = false)
	private Integer intCategoryId;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntAffiliateTagentId() {
		return intAffiliateTagentId;
	}

	public void setIntAffiliateTagentId(Integer intAffiliateTagentId) {
		this.intAffiliateTagentId = intAffiliateTagentId;
	}

	public Integer getIntCategoryId() {
		return intCategoryId;
	}

	public void setIntCategoryId(Integer intCategoryId) {
		this.intCategoryId = intCategoryId;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

}