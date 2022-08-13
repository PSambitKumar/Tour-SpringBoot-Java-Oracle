package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClusterGroup {
	@Id
	@Column(name = "clusterGroupId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "name", length = 75)
	private String name;

	@Column(name = "clusterNodeIds", length = 75)
	private String clusterNodeIds;

	@Column(name = "wholeCluster")
	private Byte wholeCluster;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClusterNodeIds() {
		return clusterNodeIds;
	}

	public void setClusterNodeIds(String clusterNodeIds) {
		this.clusterNodeIds = clusterNodeIds;
	}

	public Byte getWholeCluster() {
		return wholeCluster;
	}

	public void setWholeCluster(Byte wholeCluster) {
		this.wholeCluster = wholeCluster;
	}

}