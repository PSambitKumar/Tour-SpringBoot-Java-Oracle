package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class UserTrackerPath {
	@Id
	@Column(name = "userTrackerPathId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "userTrackerId")
	private Long userTrackerId;

	@Lob
	@Column(name = "path_")
	private String path;

	@Column(name = "pathDate")
	private Instant pathDate;

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

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getUserTrackerId() {
		return userTrackerId;
	}

	public void setUserTrackerId(Long userTrackerId) {
		this.userTrackerId = userTrackerId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Instant getPathDate() {
		return pathDate;
	}

	public void setPathDate(Instant pathDate) {
		this.pathDate = pathDate;
	}

}