package com.csm.Model;

import javax.persistence.*;

@Entity
@Table(name = "Group_")
public class Group {
	@Id
	@Column(name = "groupId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "uuid_", length = 75)
	private String uuid;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "creatorUserId")
	private Long creatorUserId;

	@Column(name = "classNameId")
	private Long classNameId;

	@Column(name = "classPK")
	private Long classPK;

	@Column(name = "parentGroupId")
	private Long parentGroupId;

	@Column(name = "liveGroupId")
	private Long liveGroupId;

	@Lob
	@Column(name = "treePath")
	private String treePath;

	@Column(name = "groupKey", length = 150)
	private String groupKey;

	@Lob
	@Column(name = "name")
	private String name;

	@Lob
	@Column(name = "description")
	private String description;

	@Column(name = "type_")
	private Integer type;

	@Lob
	@Column(name = "typeSettings")
	private String typeSettings;

	@Column(name = "manualMembership")
	private Byte manualMembership;

	@Column(name = "membershipRestriction")
	private Integer membershipRestriction;

	@Column(name = "friendlyURL")
	private String friendlyURL;

	@Column(name = "site")
	private Byte site;

	@Column(name = "remoteStagingGroupCount")
	private Integer remoteStagingGroupCount;

	@Column(name = "inheritContent")
	private Byte inheritContent;

	@Column(name = "active_")
	private Byte active;

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

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getCreatorUserId() {
		return creatorUserId;
	}

	public void setCreatorUserId(Long creatorUserId) {
		this.creatorUserId = creatorUserId;
	}

	public Long getClassNameId() {
		return classNameId;
	}

	public void setClassNameId(Long classNameId) {
		this.classNameId = classNameId;
	}

	public Long getClassPK() {
		return classPK;
	}

	public void setClassPK(Long classPK) {
		this.classPK = classPK;
	}

	public Long getParentGroupId() {
		return parentGroupId;
	}

	public void setParentGroupId(Long parentGroupId) {
		this.parentGroupId = parentGroupId;
	}

	public Long getLiveGroupId() {
		return liveGroupId;
	}

	public void setLiveGroupId(Long liveGroupId) {
		this.liveGroupId = liveGroupId;
	}

	public String getTreePath() {
		return treePath;
	}

	public void setTreePath(String treePath) {
		this.treePath = treePath;
	}

	public String getGroupKey() {
		return groupKey;
	}

	public void setGroupKey(String groupKey) {
		this.groupKey = groupKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getTypeSettings() {
		return typeSettings;
	}

	public void setTypeSettings(String typeSettings) {
		this.typeSettings = typeSettings;
	}

	public Byte getManualMembership() {
		return manualMembership;
	}

	public void setManualMembership(Byte manualMembership) {
		this.manualMembership = manualMembership;
	}

	public Integer getMembershipRestriction() {
		return membershipRestriction;
	}

	public void setMembershipRestriction(Integer membershipRestriction) {
		this.membershipRestriction = membershipRestriction;
	}

	public String getFriendlyURL() {
		return friendlyURL;
	}

	public void setFriendlyURL(String friendlyURL) {
		this.friendlyURL = friendlyURL;
	}

	public Byte getSite() {
		return site;
	}

	public void setSite(Byte site) {
		this.site = site;
	}

	public Integer getRemoteStagingGroupCount() {
		return remoteStagingGroupCount;
	}

	public void setRemoteStagingGroupCount(Integer remoteStagingGroupCount) {
		this.remoteStagingGroupCount = remoteStagingGroupCount;
	}

	public Byte getInheritContent() {
		return inheritContent;
	}

	public void setInheritContent(Byte inheritContent) {
		this.inheritContent = inheritContent;
	}

	public Byte getActive() {
		return active;
	}

	public void setActive(Byte active) {
		this.active = active;
	}

}