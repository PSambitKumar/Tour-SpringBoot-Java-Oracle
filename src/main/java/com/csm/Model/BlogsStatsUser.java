package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class BlogsStatsUser {
	@Id
	@Column(name = "statsUserId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "groupId")
	private Long groupId;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "userId")
	private Long userId;

	@Column(name = "entryCount")
	private Integer entryCount;

	@Column(name = "lastPostDate")
	private Instant lastPostDate;

	@Column(name = "ratingsTotalEntries")
	private Integer ratingsTotalEntries;

	@Column(name = "ratingsTotalScore")
	private Double ratingsTotalScore;

	@Column(name = "ratingsAverageScore")
	private Double ratingsAverageScore;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMvccVersion() {
		return mvccVersion;
	}

	public void setMvccVersion(Long mvccVersion) {
		this.mvccVersion = mvccVersion;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getEntryCount() {
		return entryCount;
	}

	public void setEntryCount(Integer entryCount) {
		this.entryCount = entryCount;
	}

	public Instant getLastPostDate() {
		return lastPostDate;
	}

	public void setLastPostDate(Instant lastPostDate) {
		this.lastPostDate = lastPostDate;
	}

	public Integer getRatingsTotalEntries() {
		return ratingsTotalEntries;
	}

	public void setRatingsTotalEntries(Integer ratingsTotalEntries) {
		this.ratingsTotalEntries = ratingsTotalEntries;
	}

	public Double getRatingsTotalScore() {
		return ratingsTotalScore;
	}

	public void setRatingsTotalScore(Double ratingsTotalScore) {
		this.ratingsTotalScore = ratingsTotalScore;
	}

	public Double getRatingsAverageScore() {
		return ratingsAverageScore;
	}

	public void setRatingsAverageScore(Double ratingsAverageScore) {
		this.ratingsAverageScore = ratingsAverageScore;
	}

}