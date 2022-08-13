package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class UserNotificationEvent {
	@Id
	@Column(name = "userNotificationEventId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "uuid_", length = 75)
	private String uuid;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "userId")
	private Long userId;

	@Column(name = "type_", length = 200)
	private String type;

	@Column(name = "timestamp")
	private Long timestamp;

	@Column(name = "deliveryType")
	private Integer deliveryType;

	@Column(name = "deliverBy")
	private Long deliverBy;

	@Column(name = "delivered")
	private Byte delivered;

	@Lob
	@Column(name = "payload")
	private String payload;

	@Column(name = "actionRequired")
	private Byte actionRequired;

	@Column(name = "archived")
	private Byte archived;

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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(Integer deliveryType) {
		this.deliveryType = deliveryType;
	}

	public Long getDeliverBy() {
		return deliverBy;
	}

	public void setDeliverBy(Long deliverBy) {
		this.deliverBy = deliverBy;
	}

	public Byte getDelivered() {
		return delivered;
	}

	public void setDelivered(Byte delivered) {
		this.delivered = delivered;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public Byte getActionRequired() {
		return actionRequired;
	}

	public void setActionRequired(Byte actionRequired) {
		this.actionRequired = actionRequired;
	}

	public Byte getArchived() {
		return archived;
	}

	public void setArchived(Byte archived) {
		this.archived = archived;
	}

}