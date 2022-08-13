package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "Contact_")
public class Contact {
	@Id
	@Column(name = "contactId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "companyId")
	private Long companyId;

	@Column(name = "userId")
	private Long userId;

	@Column(name = "userName", length = 75)
	private String userName;

	@Column(name = "createDate")
	private Instant createDate;

	@Column(name = "modifiedDate")
	private Instant modifiedDate;

	@Column(name = "classNameId")
	private Long classNameId;

	@Column(name = "classPK")
	private Long classPK;

	@Column(name = "accountId")
	private Long accountId;

	@Column(name = "parentContactId")
	private Long parentContactId;

	@Column(name = "emailAddress", length = 254)
	private String emailAddress;

	@Column(name = "firstName", length = 75)
	private String firstName;

	@Column(name = "middleName", length = 75)
	private String middleName;

	@Column(name = "lastName", length = 75)
	private String lastName;

	@Column(name = "prefixId")
	private Long prefixId;

	@Column(name = "suffixId")
	private Long suffixId;

	@Column(name = "male")
	private Byte male;

	@Column(name = "birthday")
	private Instant birthday;

	@Column(name = "smsSn", length = 75)
	private String smsSn;

	@Column(name = "facebookSn", length = 75)
	private String facebookSn;

	@Column(name = "jabberSn", length = 75)
	private String jabberSn;

	@Column(name = "skypeSn", length = 75)
	private String skypeSn;

	@Column(name = "twitterSn", length = 75)
	private String twitterSn;

	@Column(name = "employeeStatusId", length = 75)
	private String employeeStatusId;

	@Column(name = "employeeNumber", length = 75)
	private String employeeNumber;

	@Column(name = "jobTitle", length = 100)
	private String jobTitle;

	@Column(name = "jobClass", length = 75)
	private String jobClass;

	@Column(name = "hoursOfOperation", length = 75)
	private String hoursOfOperation;

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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getParentContactId() {
		return parentContactId;
	}

	public void setParentContactId(Long parentContactId) {
		this.parentContactId = parentContactId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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

	public Long getPrefixId() {
		return prefixId;
	}

	public void setPrefixId(Long prefixId) {
		this.prefixId = prefixId;
	}

	public Long getSuffixId() {
		return suffixId;
	}

	public void setSuffixId(Long suffixId) {
		this.suffixId = suffixId;
	}

	public Byte getMale() {
		return male;
	}

	public void setMale(Byte male) {
		this.male = male;
	}

	public Instant getBirthday() {
		return birthday;
	}

	public void setBirthday(Instant birthday) {
		this.birthday = birthday;
	}

	public String getSmsSn() {
		return smsSn;
	}

	public void setSmsSn(String smsSn) {
		this.smsSn = smsSn;
	}

	public String getFacebookSn() {
		return facebookSn;
	}

	public void setFacebookSn(String facebookSn) {
		this.facebookSn = facebookSn;
	}

	public String getJabberSn() {
		return jabberSn;
	}

	public void setJabberSn(String jabberSn) {
		this.jabberSn = jabberSn;
	}

	public String getSkypeSn() {
		return skypeSn;
	}

	public void setSkypeSn(String skypeSn) {
		this.skypeSn = skypeSn;
	}

	public String getTwitterSn() {
		return twitterSn;
	}

	public void setTwitterSn(String twitterSn) {
		this.twitterSn = twitterSn;
	}

	public String getEmployeeStatusId() {
		return employeeStatusId;
	}

	public void setEmployeeStatusId(String employeeStatusId) {
		this.employeeStatusId = employeeStatusId;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobClass() {
		return jobClass;
	}

	public void setJobClass(String jobClass) {
		this.jobClass = jobClass;
	}

	public String getHoursOfOperation() {
		return hoursOfOperation;
	}

	public void setHoursOfOperation(String hoursOfOperation) {
		this.hoursOfOperation = hoursOfOperation;
	}

}