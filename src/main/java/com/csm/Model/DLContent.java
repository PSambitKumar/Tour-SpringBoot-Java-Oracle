package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DLContent {
	@Id
	@Column(name = "contentId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "groupId")
	private Long groupId;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "repositoryId")
	private Long repositoryId;

	@Column(name = "path_")
	private String path;

	@Column(name = "version", length = 75)
	private String version;

	@Column(name = "data_")
	private byte[] data;

	@Column(name = "size_")
	private Long size;

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

	public Long getRepositoryId() {
		return repositoryId;
	}

	public void setRepositoryId(Long repositoryId) {
		this.repositoryId = repositoryId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

}