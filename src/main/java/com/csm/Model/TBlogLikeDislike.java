package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_blog_like_dislike")
public class TBlogLikeDislike {
	@Id
	@Column(name = "intId", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "intBlogId", columnDefinition = "INT UNSIGNED not null")
	private Long intBlogId;

	@Column(name = "intCreatedBy", columnDefinition = "INT UNSIGNED not null")
	private Long intCreatedBy;

	@Column(name = "tinStatus", columnDefinition = "TINYINT UNSIGNED not null")
	private Short tinStatus;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIntBlogId() {
		return intBlogId;
	}

	public void setIntBlogId(Long intBlogId) {
		this.intBlogId = intBlogId;
	}

	public Long getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Long intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Short getTinStatus() {
		return tinStatus;
	}

	public void setTinStatus(Short tinStatus) {
		this.tinStatus = tinStatus;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

}