package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "t_agent_financial_details")
public class TAgentFinancialDetail {
	@Id
	@Column(name = "intFinanceId", nullable = false)
	private Integer id;

	@Column(name = "decInvestedCapital", precision = 10, scale = 2)
	private BigDecimal decInvestedCapital;

	@Column(name = "intAgentAppId")
	private Integer intAgentAppId;

	@Column(name = "vchBankerName", length = 100)
	private String vchBankerName;

	@Column(name = "vchRefDocument", length = 100)
	private String vchRefDocument;

	@Column(name = "vchAuditorName", length = 100)
	private String vchAuditorName;

	@Column(name = "vchBalanceSheet", length = 100)
	private String vchBalanceSheet;

	@Column(name = "vchAccountStatement", length = 100)
	private String vchAccountStatement;

	@Column(name = "vchTaxClearanceCertificate", length = 100)
	private String vchTaxClearanceCertificate;

	@Column(name = "decPaidUpCapital", precision = 10, scale = 2)
	private BigDecimal decPaidUpCapital;

	@Column(name = "decReserves", precision = 10, scale = 2)
	private BigDecimal decReserves;

	@Column(name = "decSecureLoan", precision = 10, scale = 2)
	private BigDecimal decSecureLoan;

	@Column(name = "decUnSecureloan", precision = 10, scale = 2)
	private BigDecimal decUnSecureloan;

	@Column(name = "decLiabilities", precision = 10, scale = 2)
	private BigDecimal decLiabilities;

	@Column(name = "decFixedAssets", precision = 10, scale = 2)
	private BigDecimal decFixedAssets;

	@Column(name = "decInvestments", precision = 10, scale = 2)
	private BigDecimal decInvestments;

	@Column(name = "decCurrentAsset", precision = 10, scale = 2)
	private BigDecimal decCurrentAsset;

	@Column(name = "decIntangibleAsset", precision = 10, scale = 2)
	private BigDecimal decIntangibleAsset;

	@Column(name = "decLoanTotal", precision = 10, scale = 2)
	private BigDecimal decLoanTotal;

	@Column(name = "decAssetTotal", precision = 10, scale = 2)
	private BigDecimal decAssetTotal;

	@Column(name = "intCreatedBy")
	private Integer intCreatedBy;

	@Column(name = "dtmCreatedOn")
	private Instant dtmCreatedOn;

	@Column(name = "bitDeletedFlag")
	private Boolean bitDeletedFlag;

	@Column(name = "vchGSTClearances", length = 128)
	private String vchGSTClearances;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getDecInvestedCapital() {
		return decInvestedCapital;
	}

	public void setDecInvestedCapital(BigDecimal decInvestedCapital) {
		this.decInvestedCapital = decInvestedCapital;
	}

	public Integer getIntAgentAppId() {
		return intAgentAppId;
	}

	public void setIntAgentAppId(Integer intAgentAppId) {
		this.intAgentAppId = intAgentAppId;
	}

	public String getVchBankerName() {
		return vchBankerName;
	}

	public void setVchBankerName(String vchBankerName) {
		this.vchBankerName = vchBankerName;
	}

	public String getVchRefDocument() {
		return vchRefDocument;
	}

	public void setVchRefDocument(String vchRefDocument) {
		this.vchRefDocument = vchRefDocument;
	}

	public String getVchAuditorName() {
		return vchAuditorName;
	}

	public void setVchAuditorName(String vchAuditorName) {
		this.vchAuditorName = vchAuditorName;
	}

	public String getVchBalanceSheet() {
		return vchBalanceSheet;
	}

	public void setVchBalanceSheet(String vchBalanceSheet) {
		this.vchBalanceSheet = vchBalanceSheet;
	}

	public String getVchAccountStatement() {
		return vchAccountStatement;
	}

	public void setVchAccountStatement(String vchAccountStatement) {
		this.vchAccountStatement = vchAccountStatement;
	}

	public String getVchTaxClearanceCertificate() {
		return vchTaxClearanceCertificate;
	}

	public void setVchTaxClearanceCertificate(String vchTaxClearanceCertificate) {
		this.vchTaxClearanceCertificate = vchTaxClearanceCertificate;
	}

	public BigDecimal getDecPaidUpCapital() {
		return decPaidUpCapital;
	}

	public void setDecPaidUpCapital(BigDecimal decPaidUpCapital) {
		this.decPaidUpCapital = decPaidUpCapital;
	}

	public BigDecimal getDecReserves() {
		return decReserves;
	}

	public void setDecReserves(BigDecimal decReserves) {
		this.decReserves = decReserves;
	}

	public BigDecimal getDecSecureLoan() {
		return decSecureLoan;
	}

	public void setDecSecureLoan(BigDecimal decSecureLoan) {
		this.decSecureLoan = decSecureLoan;
	}

	public BigDecimal getDecUnSecureloan() {
		return decUnSecureloan;
	}

	public void setDecUnSecureloan(BigDecimal decUnSecureloan) {
		this.decUnSecureloan = decUnSecureloan;
	}

	public BigDecimal getDecLiabilities() {
		return decLiabilities;
	}

	public void setDecLiabilities(BigDecimal decLiabilities) {
		this.decLiabilities = decLiabilities;
	}

	public BigDecimal getDecFixedAssets() {
		return decFixedAssets;
	}

	public void setDecFixedAssets(BigDecimal decFixedAssets) {
		this.decFixedAssets = decFixedAssets;
	}

	public BigDecimal getDecInvestments() {
		return decInvestments;
	}

	public void setDecInvestments(BigDecimal decInvestments) {
		this.decInvestments = decInvestments;
	}

	public BigDecimal getDecCurrentAsset() {
		return decCurrentAsset;
	}

	public void setDecCurrentAsset(BigDecimal decCurrentAsset) {
		this.decCurrentAsset = decCurrentAsset;
	}

	public BigDecimal getDecIntangibleAsset() {
		return decIntangibleAsset;
	}

	public void setDecIntangibleAsset(BigDecimal decIntangibleAsset) {
		this.decIntangibleAsset = decIntangibleAsset;
	}

	public BigDecimal getDecLoanTotal() {
		return decLoanTotal;
	}

	public void setDecLoanTotal(BigDecimal decLoanTotal) {
		this.decLoanTotal = decLoanTotal;
	}

	public BigDecimal getDecAssetTotal() {
		return decAssetTotal;
	}

	public void setDecAssetTotal(BigDecimal decAssetTotal) {
		this.decAssetTotal = decAssetTotal;
	}

	public Integer getIntCreatedBy() {
		return intCreatedBy;
	}

	public void setIntCreatedBy(Integer intCreatedBy) {
		this.intCreatedBy = intCreatedBy;
	}

	public Instant getDtmCreatedOn() {
		return dtmCreatedOn;
	}

	public void setDtmCreatedOn(Instant dtmCreatedOn) {
		this.dtmCreatedOn = dtmCreatedOn;
	}

	public Boolean getBitDeletedFlag() {
		return bitDeletedFlag;
	}

	public void setBitDeletedFlag(Boolean bitDeletedFlag) {
		this.bitDeletedFlag = bitDeletedFlag;
	}

	public String getVchGSTClearances() {
		return vchGSTClearances;
	}

	public void setVchGSTClearances(String vchGSTClearances) {
		this.vchGSTClearances = vchGSTClearances;
	}

}