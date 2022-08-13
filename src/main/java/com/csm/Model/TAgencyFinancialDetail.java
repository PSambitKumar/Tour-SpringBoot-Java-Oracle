package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "t_agency_financial_details")
public class TAgencyFinancialDetail {
	@Id
	@Column(name = "intFinanceDetailId", nullable = false)
	private Integer id;

	@Column(name = "intAgencyId")
	private Integer intAgencyId;

	@Column(name = "vchCapitalInvested", precision = 10, scale = 2)
	private BigDecimal vchCapitalInvested;

	@Column(name = "vchBankerName", length = 128)
	private String vchBankerName;

	@Column(name = "vchLoanSanctionDoc", length = 256)
	private String vchLoanSanctionDoc;

	@Column(name = "vchAuditorName", length = 128)
	private String vchAuditorName;

	@Column(name = "vchBalancSheetDoc", length = 256)
	private String vchBalancSheetDoc;

	@Column(name = "vchProfLossAcntStatmentDoc", length = 256)
	private String vchProfLossAcntStatmentDoc;

	@Column(name = "vchIncmTaxClreancCertfctDoc", length = 256)
	private String vchIncmTaxClreancCertfctDoc;

	@Column(name = "vchCurrency", length = 6)
	private String vchCurrency;

	@Column(name = "vchPaidUpCapital", precision = 10, scale = 2)
	private BigDecimal vchPaidUpCapital;

	@Column(name = "vchReserves", precision = 10, scale = 2)
	private BigDecimal vchReserves;

	@Column(name = "vchSecuredLoan", precision = 10, scale = 2)
	private BigDecimal vchSecuredLoan;

	@Column(name = "vchUnsecuredLoan", precision = 10, scale = 2)
	private BigDecimal vchUnsecuredLoan;

	@Column(name = "vchCurrentLiablityProv", precision = 10, scale = 2)
	private BigDecimal vchCurrentLiablityProv;

	@Column(name = "vchLiabilityTotalAmt", precision = 10, scale = 2)
	private BigDecimal vchLiabilityTotalAmt;

	@Column(name = "vchFixedAssets", precision = 10, scale = 2)
	private BigDecimal vchFixedAssets;

	@Column(name = "vchInvestment", precision = 10, scale = 2)
	private BigDecimal vchInvestment;

	@Column(name = "vchCurrentAssests", precision = 10, scale = 2)
	private BigDecimal vchCurrentAssests;

	@Column(name = "vchIntangibleAssests", precision = 10, scale = 2)
	private BigDecimal vchIntangibleAssests;

	@Column(name = "vchAssestTotalAmount", precision = 10, scale = 2)
	private BigDecimal vchAssestTotalAmount;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIntAgencyId() {
		return intAgencyId;
	}

	public void setIntAgencyId(Integer intAgencyId) {
		this.intAgencyId = intAgencyId;
	}

	public BigDecimal getVchCapitalInvested() {
		return vchCapitalInvested;
	}

	public void setVchCapitalInvested(BigDecimal vchCapitalInvested) {
		this.vchCapitalInvested = vchCapitalInvested;
	}

	public String getVchBankerName() {
		return vchBankerName;
	}

	public void setVchBankerName(String vchBankerName) {
		this.vchBankerName = vchBankerName;
	}

	public String getVchLoanSanctionDoc() {
		return vchLoanSanctionDoc;
	}

	public void setVchLoanSanctionDoc(String vchLoanSanctionDoc) {
		this.vchLoanSanctionDoc = vchLoanSanctionDoc;
	}

	public String getVchAuditorName() {
		return vchAuditorName;
	}

	public void setVchAuditorName(String vchAuditorName) {
		this.vchAuditorName = vchAuditorName;
	}

	public String getVchBalancSheetDoc() {
		return vchBalancSheetDoc;
	}

	public void setVchBalancSheetDoc(String vchBalancSheetDoc) {
		this.vchBalancSheetDoc = vchBalancSheetDoc;
	}

	public String getVchProfLossAcntStatmentDoc() {
		return vchProfLossAcntStatmentDoc;
	}

	public void setVchProfLossAcntStatmentDoc(String vchProfLossAcntStatmentDoc) {
		this.vchProfLossAcntStatmentDoc = vchProfLossAcntStatmentDoc;
	}

	public String getVchIncmTaxClreancCertfctDoc() {
		return vchIncmTaxClreancCertfctDoc;
	}

	public void setVchIncmTaxClreancCertfctDoc(String vchIncmTaxClreancCertfctDoc) {
		this.vchIncmTaxClreancCertfctDoc = vchIncmTaxClreancCertfctDoc;
	}

	public String getVchCurrency() {
		return vchCurrency;
	}

	public void setVchCurrency(String vchCurrency) {
		this.vchCurrency = vchCurrency;
	}

	public BigDecimal getVchPaidUpCapital() {
		return vchPaidUpCapital;
	}

	public void setVchPaidUpCapital(BigDecimal vchPaidUpCapital) {
		this.vchPaidUpCapital = vchPaidUpCapital;
	}

	public BigDecimal getVchReserves() {
		return vchReserves;
	}

	public void setVchReserves(BigDecimal vchReserves) {
		this.vchReserves = vchReserves;
	}

	public BigDecimal getVchSecuredLoan() {
		return vchSecuredLoan;
	}

	public void setVchSecuredLoan(BigDecimal vchSecuredLoan) {
		this.vchSecuredLoan = vchSecuredLoan;
	}

	public BigDecimal getVchUnsecuredLoan() {
		return vchUnsecuredLoan;
	}

	public void setVchUnsecuredLoan(BigDecimal vchUnsecuredLoan) {
		this.vchUnsecuredLoan = vchUnsecuredLoan;
	}

	public BigDecimal getVchCurrentLiablityProv() {
		return vchCurrentLiablityProv;
	}

	public void setVchCurrentLiablityProv(BigDecimal vchCurrentLiablityProv) {
		this.vchCurrentLiablityProv = vchCurrentLiablityProv;
	}

	public BigDecimal getVchLiabilityTotalAmt() {
		return vchLiabilityTotalAmt;
	}

	public void setVchLiabilityTotalAmt(BigDecimal vchLiabilityTotalAmt) {
		this.vchLiabilityTotalAmt = vchLiabilityTotalAmt;
	}

	public BigDecimal getVchFixedAssets() {
		return vchFixedAssets;
	}

	public void setVchFixedAssets(BigDecimal vchFixedAssets) {
		this.vchFixedAssets = vchFixedAssets;
	}

	public BigDecimal getVchInvestment() {
		return vchInvestment;
	}

	public void setVchInvestment(BigDecimal vchInvestment) {
		this.vchInvestment = vchInvestment;
	}

	public BigDecimal getVchCurrentAssests() {
		return vchCurrentAssests;
	}

	public void setVchCurrentAssests(BigDecimal vchCurrentAssests) {
		this.vchCurrentAssests = vchCurrentAssests;
	}

	public BigDecimal getVchIntangibleAssests() {
		return vchIntangibleAssests;
	}

	public void setVchIntangibleAssests(BigDecimal vchIntangibleAssests) {
		this.vchIntangibleAssests = vchIntangibleAssests;
	}

	public BigDecimal getVchAssestTotalAmount() {
		return vchAssestTotalAmount;
	}

	public void setVchAssestTotalAmount(BigDecimal vchAssestTotalAmount) {
		this.vchAssestTotalAmount = vchAssestTotalAmount;
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

}