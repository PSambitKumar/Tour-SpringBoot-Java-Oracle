package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_odisha_through_lens")
public class TOdishaThroughLen {
	@Id
	@Column(name = "contestUserId", nullable = false)
	private Integer id;

	@Column(name = "userName", length = 150)
	private String userName;

	@Column(name = "userMail", length = 50)
	private String userMail;

	@Column(name = "userPhone", length = 20)
	private String userPhone;

	@Column(name = "roadtripCaption", length = 100)
	private String roadtripCaption;

	@Column(name = "roadtripPhotoTakenTime", length = 20)
	private String roadtripPhotoTakenTime;

	@Column(name = "roadtripLocation", length = 100)
	private String roadtripLocation;

	@Column(name = "roadtripDescription", length = 350)
	private String roadtripDescription;

	@Column(name = "bitDeletedFlag", nullable = false)
	private Boolean bitDeletedFlag = false;

	@Column(name = "dtmCreatedOn", nullable = false)
	private Instant dtmCreatedOn;

	@Column(name = "roadtripCategoryImg", length = 100)
	private String roadtripCategoryImg;

	@Column(name = "adventureCategoryImg", length = 100)
	private String adventureCategoryImg;

	@Column(name = "natureCategoryImg", length = 100)
	private String natureCategoryImg;

	@Column(name = "artCategoryImg", length = 100)
	private String artCategoryImg;

	@Column(name = "heritageCategoryImg", length = 100)
	private String heritageCategoryImg;

	@Column(name = "odiaCusineCategoryImg", length = 100)
	private String odiaCusineCategoryImg;

	@Column(name = "peopleCategoryImg", length = 100)
	private String peopleCategoryImg;

	@Column(name = "adventureCaption", length = 100)
	private String adventureCaption;

	@Column(name = "adventurePhotoTakenTime", length = 100)
	private String adventurePhotoTakenTime;

	@Column(name = "adventureLocation", length = 100)
	private String adventureLocation;

	@Column(name = "adventureDescription", length = 350)
	private String adventureDescription;

	@Column(name = "naturecampCaption", length = 100)
	private String naturecampCaption;

	@Column(name = "naturecampPhotoTakenTime", length = 100)
	private String naturecampPhotoTakenTime;

	@Column(name = "naturecampLocation", length = 100)
	private String naturecampLocation;

	@Column(name = "naturecampDescription", length = 350)
	private String naturecampDescription;

	@Column(name = "artsCaption", length = 100)
	private String artsCaption;

	@Column(name = "artsPhotoTakenTime", length = 100)
	private String artsPhotoTakenTime;

	@Column(name = "artsPhotoLocation", length = 100)
	private String artsPhotoLocation;

	@Column(name = "artsPhotoDescription", length = 350)
	private String artsPhotoDescription;

	@Column(name = "heritageCaption", length = 100)
	private String heritageCaption;

	@Column(name = "heritagePhotoTakenTime", length = 100)
	private String heritagePhotoTakenTime;

	@Column(name = "heritageLocation", length = 100)
	private String heritageLocation;

	@Column(name = "heritageDescription", length = 350)
	private String heritageDescription;

	@Column(name = "odiacusinsCaption", length = 100)
	private String odiacusinsCaption;

	@Column(name = "odiacusinsPhotoTakenTime", length = 100)
	private String odiacusinsPhotoTakenTime;

	@Column(name = "odiacusinsLocation", length = 100)
	private String odiacusinsLocation;

	@Column(name = "odiacusinsDescription", length = 350)
	private String odiacusinsDescription;

	@Column(name = "peopleCaption", length = 100)
	private String peopleCaption;

	@Column(name = "peoplePhotoTakenTime", length = 100)
	private String peoplePhotoTakenTime;

	@Column(name = "peopleLocation", length = 100)
	private String peopleLocation;

	@Column(name = "peopleDescription", length = 350)
	private String peopleDescription;

	@Column(name = "selectedRoadtripImgFlag", nullable = false)
	private Integer selectedRoadtripImgFlag;

	@Column(name = "selectedAdventureImgFlag", nullable = false)
	private Integer selectedAdventureImgFlag;

	@Column(name = "selectedNatureImgFlag", nullable = false)
	private Integer selectedNatureImgFlag;

	@Column(name = "selectedArtImgFlag", nullable = false)
	private Integer selectedArtImgFlag;

	@Column(name = "selectedHeritageImgFlag", nullable = false)
	private Integer selectedHeritageImgFlag;

	@Column(name = "selectedOdiaCuisineImgFlag", nullable = false)
	private Integer selectedOdiaCuisineImgFlag;

	@Column(name = "selectedPeopleImgFlag", nullable = false)
	private Integer selectedPeopleImgFlag;

	@Column(name = "selectedImgFlag")
	private Integer selectedImgFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getRoadtripCaption() {
		return roadtripCaption;
	}

	public void setRoadtripCaption(String roadtripCaption) {
		this.roadtripCaption = roadtripCaption;
	}

	public String getRoadtripPhotoTakenTime() {
		return roadtripPhotoTakenTime;
	}

	public void setRoadtripPhotoTakenTime(String roadtripPhotoTakenTime) {
		this.roadtripPhotoTakenTime = roadtripPhotoTakenTime;
	}

	public String getRoadtripLocation() {
		return roadtripLocation;
	}

	public void setRoadtripLocation(String roadtripLocation) {
		this.roadtripLocation = roadtripLocation;
	}

	public String getRoadtripDescription() {
		return roadtripDescription;
	}

	public void setRoadtripDescription(String roadtripDescription) {
		this.roadtripDescription = roadtripDescription;
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

	public String getRoadtripCategoryImg() {
		return roadtripCategoryImg;
	}

	public void setRoadtripCategoryImg(String roadtripCategoryImg) {
		this.roadtripCategoryImg = roadtripCategoryImg;
	}

	public String getAdventureCategoryImg() {
		return adventureCategoryImg;
	}

	public void setAdventureCategoryImg(String adventureCategoryImg) {
		this.adventureCategoryImg = adventureCategoryImg;
	}

	public String getNatureCategoryImg() {
		return natureCategoryImg;
	}

	public void setNatureCategoryImg(String natureCategoryImg) {
		this.natureCategoryImg = natureCategoryImg;
	}

	public String getArtCategoryImg() {
		return artCategoryImg;
	}

	public void setArtCategoryImg(String artCategoryImg) {
		this.artCategoryImg = artCategoryImg;
	}

	public String getHeritageCategoryImg() {
		return heritageCategoryImg;
	}

	public void setHeritageCategoryImg(String heritageCategoryImg) {
		this.heritageCategoryImg = heritageCategoryImg;
	}

	public String getOdiaCusineCategoryImg() {
		return odiaCusineCategoryImg;
	}

	public void setOdiaCusineCategoryImg(String odiaCusineCategoryImg) {
		this.odiaCusineCategoryImg = odiaCusineCategoryImg;
	}

	public String getPeopleCategoryImg() {
		return peopleCategoryImg;
	}

	public void setPeopleCategoryImg(String peopleCategoryImg) {
		this.peopleCategoryImg = peopleCategoryImg;
	}

	public String getAdventureCaption() {
		return adventureCaption;
	}

	public void setAdventureCaption(String adventureCaption) {
		this.adventureCaption = adventureCaption;
	}

	public String getAdventurePhotoTakenTime() {
		return adventurePhotoTakenTime;
	}

	public void setAdventurePhotoTakenTime(String adventurePhotoTakenTime) {
		this.adventurePhotoTakenTime = adventurePhotoTakenTime;
	}

	public String getAdventureLocation() {
		return adventureLocation;
	}

	public void setAdventureLocation(String adventureLocation) {
		this.adventureLocation = adventureLocation;
	}

	public String getAdventureDescription() {
		return adventureDescription;
	}

	public void setAdventureDescription(String adventureDescription) {
		this.adventureDescription = adventureDescription;
	}

	public String getNaturecampCaption() {
		return naturecampCaption;
	}

	public void setNaturecampCaption(String naturecampCaption) {
		this.naturecampCaption = naturecampCaption;
	}

	public String getNaturecampPhotoTakenTime() {
		return naturecampPhotoTakenTime;
	}

	public void setNaturecampPhotoTakenTime(String naturecampPhotoTakenTime) {
		this.naturecampPhotoTakenTime = naturecampPhotoTakenTime;
	}

	public String getNaturecampLocation() {
		return naturecampLocation;
	}

	public void setNaturecampLocation(String naturecampLocation) {
		this.naturecampLocation = naturecampLocation;
	}

	public String getNaturecampDescription() {
		return naturecampDescription;
	}

	public void setNaturecampDescription(String naturecampDescription) {
		this.naturecampDescription = naturecampDescription;
	}

	public String getArtsCaption() {
		return artsCaption;
	}

	public void setArtsCaption(String artsCaption) {
		this.artsCaption = artsCaption;
	}

	public String getArtsPhotoTakenTime() {
		return artsPhotoTakenTime;
	}

	public void setArtsPhotoTakenTime(String artsPhotoTakenTime) {
		this.artsPhotoTakenTime = artsPhotoTakenTime;
	}

	public String getArtsPhotoLocation() {
		return artsPhotoLocation;
	}

	public void setArtsPhotoLocation(String artsPhotoLocation) {
		this.artsPhotoLocation = artsPhotoLocation;
	}

	public String getArtsPhotoDescription() {
		return artsPhotoDescription;
	}

	public void setArtsPhotoDescription(String artsPhotoDescription) {
		this.artsPhotoDescription = artsPhotoDescription;
	}

	public String getHeritageCaption() {
		return heritageCaption;
	}

	public void setHeritageCaption(String heritageCaption) {
		this.heritageCaption = heritageCaption;
	}

	public String getHeritagePhotoTakenTime() {
		return heritagePhotoTakenTime;
	}

	public void setHeritagePhotoTakenTime(String heritagePhotoTakenTime) {
		this.heritagePhotoTakenTime = heritagePhotoTakenTime;
	}

	public String getHeritageLocation() {
		return heritageLocation;
	}

	public void setHeritageLocation(String heritageLocation) {
		this.heritageLocation = heritageLocation;
	}

	public String getHeritageDescription() {
		return heritageDescription;
	}

	public void setHeritageDescription(String heritageDescription) {
		this.heritageDescription = heritageDescription;
	}

	public String getOdiacusinsCaption() {
		return odiacusinsCaption;
	}

	public void setOdiacusinsCaption(String odiacusinsCaption) {
		this.odiacusinsCaption = odiacusinsCaption;
	}

	public String getOdiacusinsPhotoTakenTime() {
		return odiacusinsPhotoTakenTime;
	}

	public void setOdiacusinsPhotoTakenTime(String odiacusinsPhotoTakenTime) {
		this.odiacusinsPhotoTakenTime = odiacusinsPhotoTakenTime;
	}

	public String getOdiacusinsLocation() {
		return odiacusinsLocation;
	}

	public void setOdiacusinsLocation(String odiacusinsLocation) {
		this.odiacusinsLocation = odiacusinsLocation;
	}

	public String getOdiacusinsDescription() {
		return odiacusinsDescription;
	}

	public void setOdiacusinsDescription(String odiacusinsDescription) {
		this.odiacusinsDescription = odiacusinsDescription;
	}

	public String getPeopleCaption() {
		return peopleCaption;
	}

	public void setPeopleCaption(String peopleCaption) {
		this.peopleCaption = peopleCaption;
	}

	public String getPeoplePhotoTakenTime() {
		return peoplePhotoTakenTime;
	}

	public void setPeoplePhotoTakenTime(String peoplePhotoTakenTime) {
		this.peoplePhotoTakenTime = peoplePhotoTakenTime;
	}

	public String getPeopleLocation() {
		return peopleLocation;
	}

	public void setPeopleLocation(String peopleLocation) {
		this.peopleLocation = peopleLocation;
	}

	public String getPeopleDescription() {
		return peopleDescription;
	}

	public void setPeopleDescription(String peopleDescription) {
		this.peopleDescription = peopleDescription;
	}

	public Integer getSelectedRoadtripImgFlag() {
		return selectedRoadtripImgFlag;
	}

	public void setSelectedRoadtripImgFlag(Integer selectedRoadtripImgFlag) {
		this.selectedRoadtripImgFlag = selectedRoadtripImgFlag;
	}

	public Integer getSelectedAdventureImgFlag() {
		return selectedAdventureImgFlag;
	}

	public void setSelectedAdventureImgFlag(Integer selectedAdventureImgFlag) {
		this.selectedAdventureImgFlag = selectedAdventureImgFlag;
	}

	public Integer getSelectedNatureImgFlag() {
		return selectedNatureImgFlag;
	}

	public void setSelectedNatureImgFlag(Integer selectedNatureImgFlag) {
		this.selectedNatureImgFlag = selectedNatureImgFlag;
	}

	public Integer getSelectedArtImgFlag() {
		return selectedArtImgFlag;
	}

	public void setSelectedArtImgFlag(Integer selectedArtImgFlag) {
		this.selectedArtImgFlag = selectedArtImgFlag;
	}

	public Integer getSelectedHeritageImgFlag() {
		return selectedHeritageImgFlag;
	}

	public void setSelectedHeritageImgFlag(Integer selectedHeritageImgFlag) {
		this.selectedHeritageImgFlag = selectedHeritageImgFlag;
	}

	public Integer getSelectedOdiaCuisineImgFlag() {
		return selectedOdiaCuisineImgFlag;
	}

	public void setSelectedOdiaCuisineImgFlag(Integer selectedOdiaCuisineImgFlag) {
		this.selectedOdiaCuisineImgFlag = selectedOdiaCuisineImgFlag;
	}

	public Integer getSelectedPeopleImgFlag() {
		return selectedPeopleImgFlag;
	}

	public void setSelectedPeopleImgFlag(Integer selectedPeopleImgFlag) {
		this.selectedPeopleImgFlag = selectedPeopleImgFlag;
	}

	public Integer getSelectedImgFlag() {
		return selectedImgFlag;
	}

	public void setSelectedImgFlag(Integer selectedImgFlag) {
		this.selectedImgFlag = selectedImgFlag;
	}

}