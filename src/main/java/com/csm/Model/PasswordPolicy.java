package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.time.Instant;

@Entity
public class PasswordPolicy {
	@Id
	@Column(name = "passwordPolicyId", nullable = false)
	private Long id;

	@Column(name = "mvccVersion", nullable = false)
	private Long mvccVersion;

	@Column(name = "uuid_", length = 75)
	private String uuid;

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

	@Column(name = "defaultPolicy")
	private Byte defaultPolicy;

	@Column(name = "name", length = 75)
	private String name;

	@Lob
	@Column(name = "description")
	private String description;

	@Column(name = "changeable")
	private Byte changeable;

	@Column(name = "changeRequired")
	private Byte changeRequired;

	@Column(name = "minAge")
	private Long minAge;

	@Column(name = "checkSyntax")
	private Byte checkSyntax;

	@Column(name = "allowDictionaryWords")
	private Byte allowDictionaryWords;

	@Column(name = "minAlphanumeric")
	private Integer minAlphanumeric;

	@Column(name = "minLength")
	private Integer minLength;

	@Column(name = "minLowerCase")
	private Integer minLowerCase;

	@Column(name = "minNumbers")
	private Integer minNumbers;

	@Column(name = "minSymbols")
	private Integer minSymbols;

	@Column(name = "minUpperCase")
	private Integer minUpperCase;

	@Lob
	@Column(name = "regex")
	private String regex;

	@Column(name = "history")
	private Byte history;

	@Column(name = "historyCount")
	private Integer historyCount;

	@Column(name = "expireable")
	private Byte expireable;

	@Column(name = "maxAge")
	private Long maxAge;

	@Column(name = "warningTime")
	private Long warningTime;

	@Column(name = "graceLimit")
	private Integer graceLimit;

	@Column(name = "lockout")
	private Byte lockout;

	@Column(name = "maxFailure")
	private Integer maxFailure;

	@Column(name = "lockoutDuration")
	private Long lockoutDuration;

	@Column(name = "requireUnlock")
	private Byte requireUnlock;

	@Column(name = "resetFailureCount")
	private Long resetFailureCount;

	@Column(name = "resetTicketMaxAge")
	private Long resetTicketMaxAge;

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

	public Byte getDefaultPolicy() {
		return defaultPolicy;
	}

	public void setDefaultPolicy(Byte defaultPolicy) {
		this.defaultPolicy = defaultPolicy;
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

	public Byte getChangeable() {
		return changeable;
	}

	public void setChangeable(Byte changeable) {
		this.changeable = changeable;
	}

	public Byte getChangeRequired() {
		return changeRequired;
	}

	public void setChangeRequired(Byte changeRequired) {
		this.changeRequired = changeRequired;
	}

	public Long getMinAge() {
		return minAge;
	}

	public void setMinAge(Long minAge) {
		this.minAge = minAge;
	}

	public Byte getCheckSyntax() {
		return checkSyntax;
	}

	public void setCheckSyntax(Byte checkSyntax) {
		this.checkSyntax = checkSyntax;
	}

	public Byte getAllowDictionaryWords() {
		return allowDictionaryWords;
	}

	public void setAllowDictionaryWords(Byte allowDictionaryWords) {
		this.allowDictionaryWords = allowDictionaryWords;
	}

	public Integer getMinAlphanumeric() {
		return minAlphanumeric;
	}

	public void setMinAlphanumeric(Integer minAlphanumeric) {
		this.minAlphanumeric = minAlphanumeric;
	}

	public Integer getMinLength() {
		return minLength;
	}

	public void setMinLength(Integer minLength) {
		this.minLength = minLength;
	}

	public Integer getMinLowerCase() {
		return minLowerCase;
	}

	public void setMinLowerCase(Integer minLowerCase) {
		this.minLowerCase = minLowerCase;
	}

	public Integer getMinNumbers() {
		return minNumbers;
	}

	public void setMinNumbers(Integer minNumbers) {
		this.minNumbers = minNumbers;
	}

	public Integer getMinSymbols() {
		return minSymbols;
	}

	public void setMinSymbols(Integer minSymbols) {
		this.minSymbols = minSymbols;
	}

	public Integer getMinUpperCase() {
		return minUpperCase;
	}

	public void setMinUpperCase(Integer minUpperCase) {
		this.minUpperCase = minUpperCase;
	}

	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}

	public Byte getHistory() {
		return history;
	}

	public void setHistory(Byte history) {
		this.history = history;
	}

	public Integer getHistoryCount() {
		return historyCount;
	}

	public void setHistoryCount(Integer historyCount) {
		this.historyCount = historyCount;
	}

	public Byte getExpireable() {
		return expireable;
	}

	public void setExpireable(Byte expireable) {
		this.expireable = expireable;
	}

	public Long getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(Long maxAge) {
		this.maxAge = maxAge;
	}

	public Long getWarningTime() {
		return warningTime;
	}

	public void setWarningTime(Long warningTime) {
		this.warningTime = warningTime;
	}

	public Integer getGraceLimit() {
		return graceLimit;
	}

	public void setGraceLimit(Integer graceLimit) {
		this.graceLimit = graceLimit;
	}

	public Byte getLockout() {
		return lockout;
	}

	public void setLockout(Byte lockout) {
		this.lockout = lockout;
	}

	public Integer getMaxFailure() {
		return maxFailure;
	}

	public void setMaxFailure(Integer maxFailure) {
		this.maxFailure = maxFailure;
	}

	public Long getLockoutDuration() {
		return lockoutDuration;
	}

	public void setLockoutDuration(Long lockoutDuration) {
		this.lockoutDuration = lockoutDuration;
	}

	public Byte getRequireUnlock() {
		return requireUnlock;
	}

	public void setRequireUnlock(Byte requireUnlock) {
		this.requireUnlock = requireUnlock;
	}

	public Long getResetFailureCount() {
		return resetFailureCount;
	}

	public void setResetFailureCount(Long resetFailureCount) {
		this.resetFailureCount = resetFailureCount;
	}

	public Long getResetTicketMaxAge() {
		return resetTicketMaxAge;
	}

	public void setResetTicketMaxAge(Long resetTicketMaxAge) {
		this.resetTicketMaxAge = resetTicketMaxAge;
	}

}