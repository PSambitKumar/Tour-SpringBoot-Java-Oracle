package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_friends_of_odisha")
public class TFriendsOfOdisha {
	@Id
	@Column(name = "intFriendAgentId", nullable = false)
	private Integer id;

	@Column(name = "vchFriendAgentName", nullable = false, length = 150)
	private String vchFriendAgentName;

	@Column(name = "intCountryId", nullable = false)
	private Integer intCountryId;

	@Column(name = "vchContactPersonName", nullable = false, length = 120)
	private String vchContactPersonName;

	@Column(name = "vchEmail", nullable = false, length = 128)
	private String vchEmail;

	@Column(name = "vchPhoneNumber", nullable = false, length = 16)
	private String vchPhoneNumber;

	@Column(name = "vchFacebook", length = 500)
	private String vchFacebook;

	@Column(name = "vchTwitter", length = 500)
	private String vchTwitter;

	@Column(name = "vchInstagram", length = 500)
	private String vchInstagram;

	@Column(name = "vchPartnershipReason", length = 150)
	private String vchPartnershipReason;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchFriendAgentName() {
		return vchFriendAgentName;
	}

	public void setVchFriendAgentName(String vchFriendAgentName) {
		this.vchFriendAgentName = vchFriendAgentName;
	}

	public Integer getIntCountryId() {
		return intCountryId;
	}

	public void setIntCountryId(Integer intCountryId) {
		this.intCountryId = intCountryId;
	}

	public String getVchContactPersonName() {
		return vchContactPersonName;
	}

	public void setVchContactPersonName(String vchContactPersonName) {
		this.vchContactPersonName = vchContactPersonName;
	}

	public String getVchEmail() {
		return vchEmail;
	}

	public void setVchEmail(String vchEmail) {
		this.vchEmail = vchEmail;
	}

	public String getVchPhoneNumber() {
		return vchPhoneNumber;
	}

	public void setVchPhoneNumber(String vchPhoneNumber) {
		this.vchPhoneNumber = vchPhoneNumber;
	}

	public String getVchFacebook() {
		return vchFacebook;
	}

	public void setVchFacebook(String vchFacebook) {
		this.vchFacebook = vchFacebook;
	}

	public String getVchTwitter() {
		return vchTwitter;
	}

	public void setVchTwitter(String vchTwitter) {
		this.vchTwitter = vchTwitter;
	}

	public String getVchInstagram() {
		return vchInstagram;
	}

	public void setVchInstagram(String vchInstagram) {
		this.vchInstagram = vchInstagram;
	}

	public String getVchPartnershipReason() {
		return vchPartnershipReason;
	}

	public void setVchPartnershipReason(String vchPartnershipReason) {
		this.vchPartnershipReason = vchPartnershipReason;
	}

}