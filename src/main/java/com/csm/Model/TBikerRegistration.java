package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "t_biker_registration")
public class TBikerRegistration {
	@Id
	@Column(name = "intRegistrationId", nullable = false)
	private Integer id;

	@Column(name = "vchFirstName", length = 150)
	private String vchFirstName;

	@Column(name = "vchLastName", length = 150)
	private String vchLastName;

	@Column(name = "vchCallSign", length = 150)
	private String vchCallSign;

	@Column(name = "vchUserName", length = 125)
	private String vchUserName;

	@Column(name = "vchPassword", length = 256)
	private String vchPassword;

	@Column(name = "vchDateOfBirth", length = 24)
	private String vchDateOfBirth;

	@Column(name = "intGender")
	private Integer intGender;

	@Column(name = "intCityId")
	private Integer intCityId;

	@Column(name = "vchAddress", length = 500)
	private String vchAddress;

	@Column(name = "vchPhoneNumber", length = 25)
	private String vchPhoneNumber;

	@Column(name = "vchAlternativeNumber", length = 25)
	private String vchAlternativeNumber;

	@Column(name = "vchVehicleRegdNumber", length = 15)
	private String vchVehicleRegdNumber;

	@Column(name = "vchVehicleModel", length = 50)
	private String vchVehicleModel;

	@Column(name = "vchSuperBikeStatus", length = 10)
	private String vchSuperBikeStatus;

	@Lob
	@Column(name = "vchBikerGroupStatus")
	private String vchBikerGroupStatus;

	@Lob
	@Column(name = "vchBikerGroupName")
	private String vchBikerGroupName;

	@Column(name = "vchOccupationFirst", length = 100)
	private String vchOccupationFirst;

	@Column(name = "vchOccupationSecond", length = 100)
	private String vchOccupationSecond;

	@Lob
	@Column(name = "vchSafetyGearDetail")
	private String vchSafetyGearDetail;

	@Lob
	@Column(name = "vchEquipmentName")
	private String vchEquipmentName;

	@Lob
	@Column(name = "vchBikerAimDetail")
	private String vchBikerAimDetail;

	@Column(name = "vchBloggingStatus", length = 5)
	private String vchBloggingStatus;

	@Column(name = "vchBloggerType", length = 500)
	private String vchBloggerType;

	@Lob
	@Column(name = "vchBlogLinks")
	private String vchBlogLinks;

	@Column(name = "vchSocialMediaType", length = 25)
	private String vchSocialMediaType;

	@Lob
	@Column(name = "vchSocialMediaHandlers")
	private String vchSocialMediaHandlers;

	@Column(name = "vchTravelCompanion", length = 500)
	private String vchTravelCompanion;

	@Lob
	@Column(name = "vchPassions")
	private String vchPassions;

	@Lob
	@Column(name = "vchHelpUsText")
	private String vchHelpUsText;

	@Column(name = "vchFirstImageUpload", length = 100)
	private String vchFirstImageUpload;

	@Column(name = "vchSecondImageUpload", length = 100)
	private String vchSecondImageUpload;

	@Column(name = "vchThirdImageUpload", length = 100)
	private String vchThirdImageUpload;

	@Column(name = "vchThumbimageUpload", length = 100)
	private String vchThumbimageUpload;

	@Column(name = "vchEmegencyContactName", length = 100)
	private String vchEmegencyContactName;

	@Column(name = "vchEmegencyContactRelation", length = 125)
	private String vchEmegencyContactRelation;

	@Column(name = "vchEmergencyPhone1", length = 25)
	private String vchEmergencyPhone1;

	@Column(name = "vchEmergencyPhone2", length = 25)
	private String vchEmergencyPhone2;

	@Column(name = "vchBloodGroup", length = 10)
	private String vchBloodGroup;

	@Lob
	@Column(name = "vchMedicalConditionDetail")
	private String vchMedicalConditionDetail;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "vchCreatedBy", length = 150)
	private String vchCreatedBy;

	@Column(name = "dtmUpdatedOn")
	private Instant dtmUpdatedOn;

	@Column(name = "vchUpdatedBy", length = 150)
	private String vchUpdatedBy;

	@Column(name = "userId")
	private Integer userId;

	@Column(name = "destinationFrom")
	private Integer destinationFrom;

	@Column(name = "destinationTo")
	private Integer destinationTo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVchFirstName() {
		return vchFirstName;
	}

	public void setVchFirstName(String vchFirstName) {
		this.vchFirstName = vchFirstName;
	}

	public String getVchLastName() {
		return vchLastName;
	}

	public void setVchLastName(String vchLastName) {
		this.vchLastName = vchLastName;
	}

	public String getVchCallSign() {
		return vchCallSign;
	}

	public void setVchCallSign(String vchCallSign) {
		this.vchCallSign = vchCallSign;
	}

	public String getVchUserName() {
		return vchUserName;
	}

	public void setVchUserName(String vchUserName) {
		this.vchUserName = vchUserName;
	}

	public String getVchPassword() {
		return vchPassword;
	}

	public void setVchPassword(String vchPassword) {
		this.vchPassword = vchPassword;
	}

	public String getVchDateOfBirth() {
		return vchDateOfBirth;
	}

	public void setVchDateOfBirth(String vchDateOfBirth) {
		this.vchDateOfBirth = vchDateOfBirth;
	}

	public Integer getIntGender() {
		return intGender;
	}

	public void setIntGender(Integer intGender) {
		this.intGender = intGender;
	}

	public Integer getIntCityId() {
		return intCityId;
	}

	public void setIntCityId(Integer intCityId) {
		this.intCityId = intCityId;
	}

	public String getVchAddress() {
		return vchAddress;
	}

	public void setVchAddress(String vchAddress) {
		this.vchAddress = vchAddress;
	}

	public String getVchPhoneNumber() {
		return vchPhoneNumber;
	}

	public void setVchPhoneNumber(String vchPhoneNumber) {
		this.vchPhoneNumber = vchPhoneNumber;
	}

	public String getVchAlternativeNumber() {
		return vchAlternativeNumber;
	}

	public void setVchAlternativeNumber(String vchAlternativeNumber) {
		this.vchAlternativeNumber = vchAlternativeNumber;
	}

	public String getVchVehicleRegdNumber() {
		return vchVehicleRegdNumber;
	}

	public void setVchVehicleRegdNumber(String vchVehicleRegdNumber) {
		this.vchVehicleRegdNumber = vchVehicleRegdNumber;
	}

	public String getVchVehicleModel() {
		return vchVehicleModel;
	}

	public void setVchVehicleModel(String vchVehicleModel) {
		this.vchVehicleModel = vchVehicleModel;
	}

	public String getVchSuperBikeStatus() {
		return vchSuperBikeStatus;
	}

	public void setVchSuperBikeStatus(String vchSuperBikeStatus) {
		this.vchSuperBikeStatus = vchSuperBikeStatus;
	}

	public String getVchBikerGroupStatus() {
		return vchBikerGroupStatus;
	}

	public void setVchBikerGroupStatus(String vchBikerGroupStatus) {
		this.vchBikerGroupStatus = vchBikerGroupStatus;
	}

	public String getVchBikerGroupName() {
		return vchBikerGroupName;
	}

	public void setVchBikerGroupName(String vchBikerGroupName) {
		this.vchBikerGroupName = vchBikerGroupName;
	}

	public String getVchOccupationFirst() {
		return vchOccupationFirst;
	}

	public void setVchOccupationFirst(String vchOccupationFirst) {
		this.vchOccupationFirst = vchOccupationFirst;
	}

	public String getVchOccupationSecond() {
		return vchOccupationSecond;
	}

	public void setVchOccupationSecond(String vchOccupationSecond) {
		this.vchOccupationSecond = vchOccupationSecond;
	}

	public String getVchSafetyGearDetail() {
		return vchSafetyGearDetail;
	}

	public void setVchSafetyGearDetail(String vchSafetyGearDetail) {
		this.vchSafetyGearDetail = vchSafetyGearDetail;
	}

	public String getVchEquipmentName() {
		return vchEquipmentName;
	}

	public void setVchEquipmentName(String vchEquipmentName) {
		this.vchEquipmentName = vchEquipmentName;
	}

	public String getVchBikerAimDetail() {
		return vchBikerAimDetail;
	}

	public void setVchBikerAimDetail(String vchBikerAimDetail) {
		this.vchBikerAimDetail = vchBikerAimDetail;
	}

	public String getVchBloggingStatus() {
		return vchBloggingStatus;
	}

	public void setVchBloggingStatus(String vchBloggingStatus) {
		this.vchBloggingStatus = vchBloggingStatus;
	}

	public String getVchBloggerType() {
		return vchBloggerType;
	}

	public void setVchBloggerType(String vchBloggerType) {
		this.vchBloggerType = vchBloggerType;
	}

	public String getVchBlogLinks() {
		return vchBlogLinks;
	}

	public void setVchBlogLinks(String vchBlogLinks) {
		this.vchBlogLinks = vchBlogLinks;
	}

	public String getVchSocialMediaType() {
		return vchSocialMediaType;
	}

	public void setVchSocialMediaType(String vchSocialMediaType) {
		this.vchSocialMediaType = vchSocialMediaType;
	}

	public String getVchSocialMediaHandlers() {
		return vchSocialMediaHandlers;
	}

	public void setVchSocialMediaHandlers(String vchSocialMediaHandlers) {
		this.vchSocialMediaHandlers = vchSocialMediaHandlers;
	}

	public String getVchTravelCompanion() {
		return vchTravelCompanion;
	}

	public void setVchTravelCompanion(String vchTravelCompanion) {
		this.vchTravelCompanion = vchTravelCompanion;
	}

	public String getVchPassions() {
		return vchPassions;
	}

	public void setVchPassions(String vchPassions) {
		this.vchPassions = vchPassions;
	}

	public String getVchHelpUsText() {
		return vchHelpUsText;
	}

	public void setVchHelpUsText(String vchHelpUsText) {
		this.vchHelpUsText = vchHelpUsText;
	}

	public String getVchFirstImageUpload() {
		return vchFirstImageUpload;
	}

	public void setVchFirstImageUpload(String vchFirstImageUpload) {
		this.vchFirstImageUpload = vchFirstImageUpload;
	}

	public String getVchSecondImageUpload() {
		return vchSecondImageUpload;
	}

	public void setVchSecondImageUpload(String vchSecondImageUpload) {
		this.vchSecondImageUpload = vchSecondImageUpload;
	}

	public String getVchThirdImageUpload() {
		return vchThirdImageUpload;
	}

	public void setVchThirdImageUpload(String vchThirdImageUpload) {
		this.vchThirdImageUpload = vchThirdImageUpload;
	}

	public String getVchThumbimageUpload() {
		return vchThumbimageUpload;
	}

	public void setVchThumbimageUpload(String vchThumbimageUpload) {
		this.vchThumbimageUpload = vchThumbimageUpload;
	}

	public String getVchEmegencyContactName() {
		return vchEmegencyContactName;
	}

	public void setVchEmegencyContactName(String vchEmegencyContactName) {
		this.vchEmegencyContactName = vchEmegencyContactName;
	}

	public String getVchEmegencyContactRelation() {
		return vchEmegencyContactRelation;
	}

	public void setVchEmegencyContactRelation(String vchEmegencyContactRelation) {
		this.vchEmegencyContactRelation = vchEmegencyContactRelation;
	}

	public String getVchEmergencyPhone1() {
		return vchEmergencyPhone1;
	}

	public void setVchEmergencyPhone1(String vchEmergencyPhone1) {
		this.vchEmergencyPhone1 = vchEmergencyPhone1;
	}

	public String getVchEmergencyPhone2() {
		return vchEmergencyPhone2;
	}

	public void setVchEmergencyPhone2(String vchEmergencyPhone2) {
		this.vchEmergencyPhone2 = vchEmergencyPhone2;
	}

	public String getVchBloodGroup() {
		return vchBloodGroup;
	}

	public void setVchBloodGroup(String vchBloodGroup) {
		this.vchBloodGroup = vchBloodGroup;
	}

	public String getVchMedicalConditionDetail() {
		return vchMedicalConditionDetail;
	}

	public void setVchMedicalConditionDetail(String vchMedicalConditionDetail) {
		this.vchMedicalConditionDetail = vchMedicalConditionDetail;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public String getVchCreatedBy() {
		return vchCreatedBy;
	}

	public void setVchCreatedBy(String vchCreatedBy) {
		this.vchCreatedBy = vchCreatedBy;
	}

	public Instant getDtmUpdatedOn() {
		return dtmUpdatedOn;
	}

	public void setDtmUpdatedOn(Instant dtmUpdatedOn) {
		this.dtmUpdatedOn = dtmUpdatedOn;
	}

	public String getVchUpdatedBy() {
		return vchUpdatedBy;
	}

	public void setVchUpdatedBy(String vchUpdatedBy) {
		this.vchUpdatedBy = vchUpdatedBy;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getDestinationFrom() {
		return destinationFrom;
	}

	public void setDestinationFrom(Integer destinationFrom) {
		this.destinationFrom = destinationFrom;
	}

	public Integer getDestinationTo() {
		return destinationTo;
	}

	public void setDestinationTo(Integer destinationTo) {
		this.destinationTo = destinationTo;
	}

}