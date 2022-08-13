package com.csm.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "User_")
public class User {
	@Id
	@Column(name = "userId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "uuid_", length = 75)
	private String uuid;

	@Column(name = "externalReferenceCode", length = 75)
	private String externalReferenceCode;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "createDate")
	private Instant createDate;

	@Column(name = "modifiedDate")
	private Instant modifiedDate;

	@Column(name = "defaultUser")
	private Byte defaultUser;

	@Column(name = "contactId")
	private Long contactId;

	@Column(name = "password_", length = 75)
	private String password;

	@Column(name = "passwordEncrypted")
	private Byte passwordEncrypted;

	@Column(name = "passwordReset")
	private Byte passwordReset;

	@Column(name = "passwordModifiedDate")
	private Instant passwordModifiedDate;

	@Column(name = "digest")
	private String digest;

	@Column(name = "reminderQueryQuestion", length = 75)
	private String reminderQueryQuestion;

	@Column(name = "reminderQueryAnswer", length = 75)
	private String reminderQueryAnswer;

	@Column(name = "graceLoginCount")
	private Integer graceLoginCount;

	@Column(name = "screenName", length = 75)
	private String screenName;

	@Column(name = "emailAddress", length = 254)
	private String emailAddress;

	@Column(name = "facebookId")
	private Long facebookId;

	@Column(name = "googleUserId", length = 75)
	private String googleUserId;

	@Column(name = "ldapServerId")
	private Long ldapServerId;

	@Column(name = "openId", length = 1024)
	private String openId;

	@Column(name = "portraitId")
	private Long portraitId;

	@Column(name = "languageId", length = 75)
	private String languageId;

	@Column(name = "timeZoneId", length = 75)
	private String timeZoneId;

	@Column(name = "greeting")
	private String greeting;

	@Lob
	@Column(name = "comments")
	private String comments;

	@Column(name = "firstName", length = 75)
	private String firstName;

	@Column(name = "middleName", length = 75)
	private String middleName;

	@Column(name = "lastName", length = 75)
	private String lastName;

	@Column(name = "jobTitle", length = 100)
	private String jobTitle;

	@Column(name = "loginDate")
	private Instant loginDate;

	@Column(name = "loginIP", length = 75)
	private String loginIP;

	@Column(name = "lastLoginDate")
	private Instant lastLoginDate;

	@Column(name = "lastLoginIP", length = 75)
	private String lastLoginIP;

	@Column(name = "lastFailedLoginDate")
	private Instant lastFailedLoginDate;

	@Column(name = "failedLoginAttempts")
	private Integer failedLoginAttempts;

	@Column(name = "lockout")
	private Byte lockout;

	@Column(name = "lockoutDate")
	private Instant lockoutDate;

	@Column(name = "agreedToTermsOfUse")
	private Byte agreedToTermsOfUse;

	@Column(name = "emailAddressVerified")
	private Byte emailAddressVerified;

	@Column(name = "status")
	private Integer status;

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

	public String getExternalReferenceCode() {
		return externalReferenceCode;
	}

	public void setExternalReferenceCode(String externalReferenceCode) {
		this.externalReferenceCode = externalReferenceCode;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Instant getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Instant createDate) {
		this.createDate = createDate;
	}

	public Instant getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Instant modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Byte getDefaultUser() {
		return defaultUser;
	}

	public void setDefaultUser(Byte defaultUser) {
		this.defaultUser = defaultUser;
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Byte getPasswordEncrypted() {
		return passwordEncrypted;
	}

	public void setPasswordEncrypted(Byte passwordEncrypted) {
		this.passwordEncrypted = passwordEncrypted;
	}

	public Byte getPasswordReset() {
		return passwordReset;
	}

	public void setPasswordReset(Byte passwordReset) {
		this.passwordReset = passwordReset;
	}

	public Instant getPasswordModifiedDate() {
		return passwordModifiedDate;
	}

	public void setPasswordModifiedDate(Instant passwordModifiedDate) {
		this.passwordModifiedDate = passwordModifiedDate;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public String getReminderQueryQuestion() {
		return reminderQueryQuestion;
	}

	public void setReminderQueryQuestion(String reminderQueryQuestion) {
		this.reminderQueryQuestion = reminderQueryQuestion;
	}

	public String getReminderQueryAnswer() {
		return reminderQueryAnswer;
	}

	public void setReminderQueryAnswer(String reminderQueryAnswer) {
		this.reminderQueryAnswer = reminderQueryAnswer;
	}

	public Integer getGraceLoginCount() {
		return graceLoginCount;
	}

	public void setGraceLoginCount(Integer graceLoginCount) {
		this.graceLoginCount = graceLoginCount;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Long getFacebookId() {
		return facebookId;
	}

	public void setFacebookId(Long facebookId) {
		this.facebookId = facebookId;
	}

	public String getGoogleUserId() {
		return googleUserId;
	}

	public void setGoogleUserId(String googleUserId) {
		this.googleUserId = googleUserId;
	}

	public Long getLdapServerId() {
		return ldapServerId;
	}

	public void setLdapServerId(Long ldapServerId) {
		this.ldapServerId = ldapServerId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPortraitId() {
		return portraitId;
	}

	public void setPortraitId(Long portraitId) {
		this.portraitId = portraitId;
	}

	public String getLanguageId() {
		return languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

	public String getTimeZoneId() {
		return timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Instant getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Instant loginDate) {
		this.loginDate = loginDate;
	}

	public String getLoginIP() {
		return loginIP;
	}

	public void setLoginIP(String loginIP) {
		this.loginIP = loginIP;
	}

	public Instant getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Instant lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getLastLoginIP() {
		return lastLoginIP;
	}

	public void setLastLoginIP(String lastLoginIP) {
		this.lastLoginIP = lastLoginIP;
	}

	public Instant getLastFailedLoginDate() {
		return lastFailedLoginDate;
	}

	public void setLastFailedLoginDate(Instant lastFailedLoginDate) {
		this.lastFailedLoginDate = lastFailedLoginDate;
	}

	public Integer getFailedLoginAttempts() {
		return failedLoginAttempts;
	}

	public void setFailedLoginAttempts(Integer failedLoginAttempts) {
		this.failedLoginAttempts = failedLoginAttempts;
	}

	public Byte getLockout() {
		return lockout;
	}

	public void setLockout(Byte lockout) {
		this.lockout = lockout;
	}

	public Instant getLockoutDate() {
		return lockoutDate;
	}

	public void setLockoutDate(Instant lockoutDate) {
		this.lockoutDate = lockoutDate;
	}

	public Byte getAgreedToTermsOfUse() {
		return agreedToTermsOfUse;
	}

	public void setAgreedToTermsOfUse(Byte agreedToTermsOfUse) {
		this.agreedToTermsOfUse = agreedToTermsOfUse;
	}

	public Byte getEmailAddressVerified() {
		return emailAddressVerified;
	}

	public void setEmailAddressVerified(Byte emailAddressVerified) {
		this.emailAddressVerified = emailAddressVerified;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}