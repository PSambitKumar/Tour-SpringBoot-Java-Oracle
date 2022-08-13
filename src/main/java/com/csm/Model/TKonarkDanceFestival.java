package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "t_konark_dance_festival")
public class TKonarkDanceFestival {
	@Id
	@Column(name = "transaction_id", nullable = false)
	private Integer id;

	@Column(name = "order_id", length = 24)
	private String orderId;

	@Column(name = "transaction_date")
	private Instant transactionDate;

	@Column(name = "tracking_id", length = 24)
	private String trackingId;

	@Column(name = "bank_ref_no", length = 24)
	private String bankRefNo;

	@Column(name = "order_status")
	private Integer orderStatus;

	@Column(name = "failure_message", length = 45)
	private String failureMessage;

	@Column(name = "is_paid")
	private Integer isPaid;

	@Column(name = "ticketType")
	private Integer ticketType;

	@Column(name = "total_amount")
	private Integer totalAmount;

	@Column(name = "day1_ticket")
	private Integer day1Ticket;

	@Column(name = "day2_ticket")
	private Integer day2Ticket;

	@Column(name = "day3_ticket")
	private Integer day3Ticket;

	@Column(name = "day4_ticket")
	private Integer day4Ticket;

	@Column(name = "day5_ticket")
	private Integer day5Ticket;

	@Column(name = "season_ticket")
	private Integer seasonTicket;

	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "visitor_name", length = 45)
	private String visitorName;

	@Column(name = "visitor_email", length = 45)
	private String visitorEmail;

	@Column(name = "visitor_phone", length = 12)
	private String visitorPhone;

	@Column(name = "visitor_alt_phone", length = 12)
	private String visitorAltPhone;

	@Column(name = "visitor_nationality", length = 12)
	private String visitorNationality;

	@Column(name = "visitor_state", length = 45)
	private String visitorState;

	@Column(name = "total_other_visitors")
	private Integer totalOtherVisitors;

	@Column(name = "deleted_flag")
	private Integer deletedFlag;

	@Column(name = "visitor_id_type", length = 12)
	private String visitorIdType;

	@Column(name = "visitor_id_number", length = 52)
	private String visitorIdNumber;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Instant getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Instant transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}

	public String getBankRefNo() {
		return bankRefNo;
	}

	public void setBankRefNo(String bankRefNo) {
		this.bankRefNo = bankRefNo;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getFailureMessage() {
		return failureMessage;
	}

	public void setFailureMessage(String failureMessage) {
		this.failureMessage = failureMessage;
	}

	public Integer getIsPaid() {
		return isPaid;
	}

	public void setIsPaid(Integer isPaid) {
		this.isPaid = isPaid;
	}

	public Integer getTicketType() {
		return ticketType;
	}

	public void setTicketType(Integer ticketType) {
		this.ticketType = ticketType;
	}

	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Integer getDay1Ticket() {
		return day1Ticket;
	}

	public void setDay1Ticket(Integer day1Ticket) {
		this.day1Ticket = day1Ticket;
	}

	public Integer getDay2Ticket() {
		return day2Ticket;
	}

	public void setDay2Ticket(Integer day2Ticket) {
		this.day2Ticket = day2Ticket;
	}

	public Integer getDay3Ticket() {
		return day3Ticket;
	}

	public void setDay3Ticket(Integer day3Ticket) {
		this.day3Ticket = day3Ticket;
	}

	public Integer getDay4Ticket() {
		return day4Ticket;
	}

	public void setDay4Ticket(Integer day4Ticket) {
		this.day4Ticket = day4Ticket;
	}

	public Integer getDay5Ticket() {
		return day5Ticket;
	}

	public void setDay5Ticket(Integer day5Ticket) {
		this.day5Ticket = day5Ticket;
	}

	public Integer getSeasonTicket() {
		return seasonTicket;
	}

	public void setSeasonTicket(Integer seasonTicket) {
		this.seasonTicket = seasonTicket;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getVisitorEmail() {
		return visitorEmail;
	}

	public void setVisitorEmail(String visitorEmail) {
		this.visitorEmail = visitorEmail;
	}

	public String getVisitorPhone() {
		return visitorPhone;
	}

	public void setVisitorPhone(String visitorPhone) {
		this.visitorPhone = visitorPhone;
	}

	public String getVisitorAltPhone() {
		return visitorAltPhone;
	}

	public void setVisitorAltPhone(String visitorAltPhone) {
		this.visitorAltPhone = visitorAltPhone;
	}

	public String getVisitorNationality() {
		return visitorNationality;
	}

	public void setVisitorNationality(String visitorNationality) {
		this.visitorNationality = visitorNationality;
	}

	public String getVisitorState() {
		return visitorState;
	}

	public void setVisitorState(String visitorState) {
		this.visitorState = visitorState;
	}

	public Integer getTotalOtherVisitors() {
		return totalOtherVisitors;
	}

	public void setTotalOtherVisitors(Integer totalOtherVisitors) {
		this.totalOtherVisitors = totalOtherVisitors;
	}

	public Integer getDeletedFlag() {
		return deletedFlag;
	}

	public void setDeletedFlag(Integer deletedFlag) {
		this.deletedFlag = deletedFlag;
	}

	public String getVisitorIdType() {
		return visitorIdType;
	}

	public void setVisitorIdType(String visitorIdType) {
		this.visitorIdType = visitorIdType;
	}

	public String getVisitorIdNumber() {
		return visitorIdNumber;
	}

	public void setVisitorIdNumber(String visitorIdNumber) {
		this.visitorIdNumber = visitorIdNumber;
	}

}