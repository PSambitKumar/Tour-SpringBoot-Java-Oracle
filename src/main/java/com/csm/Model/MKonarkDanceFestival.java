package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_konark_dance_festival")
public class MKonarkDanceFestival {
	@Id
	@Column(name = "kdf_id", nullable = false)
	private Integer id;

	@Column(name = "day1_ticket_allowed")
	private Integer day1TicketAllowed;

	@Column(name = "day1_ticket_left")
	private Integer day1TicketLeft;

	@Column(name = "day2_ticket_allowed")
	private Integer day2TicketAllowed;

	@Column(name = "day2_ticket_left")
	private Integer day2TicketLeft;

	@Column(name = "day3_ticket_allowed")
	private Integer day3TicketAllowed;

	@Column(name = "day3_ticket_left")
	private Integer day3TicketLeft;

	@Column(name = "day4_ticket_allowed")
	private Integer day4TicketAllowed;

	@Column(name = "day4_ticket_left")
	private Integer day4TicketLeft;

	@Column(name = "day5_ticket_allowed")
	private Integer day5TicketAllowed;

	@Column(name = "day5_ticket_left")
	private Integer day5TicketLeft;

	@Column(name = "season_ticket_allowed")
	private Integer seasonTicketAllowed;

	@Column(name = "season_ticket_left")
	private Integer seasonTicketLeft;

	@Column(name = "deleted_flag")
	private Integer deletedFlag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDay1TicketAllowed() {
		return day1TicketAllowed;
	}

	public void setDay1TicketAllowed(Integer day1TicketAllowed) {
		this.day1TicketAllowed = day1TicketAllowed;
	}

	public Integer getDay1TicketLeft() {
		return day1TicketLeft;
	}

	public void setDay1TicketLeft(Integer day1TicketLeft) {
		this.day1TicketLeft = day1TicketLeft;
	}

	public Integer getDay2TicketAllowed() {
		return day2TicketAllowed;
	}

	public void setDay2TicketAllowed(Integer day2TicketAllowed) {
		this.day2TicketAllowed = day2TicketAllowed;
	}

	public Integer getDay2TicketLeft() {
		return day2TicketLeft;
	}

	public void setDay2TicketLeft(Integer day2TicketLeft) {
		this.day2TicketLeft = day2TicketLeft;
	}

	public Integer getDay3TicketAllowed() {
		return day3TicketAllowed;
	}

	public void setDay3TicketAllowed(Integer day3TicketAllowed) {
		this.day3TicketAllowed = day3TicketAllowed;
	}

	public Integer getDay3TicketLeft() {
		return day3TicketLeft;
	}

	public void setDay3TicketLeft(Integer day3TicketLeft) {
		this.day3TicketLeft = day3TicketLeft;
	}

	public Integer getDay4TicketAllowed() {
		return day4TicketAllowed;
	}

	public void setDay4TicketAllowed(Integer day4TicketAllowed) {
		this.day4TicketAllowed = day4TicketAllowed;
	}

	public Integer getDay4TicketLeft() {
		return day4TicketLeft;
	}

	public void setDay4TicketLeft(Integer day4TicketLeft) {
		this.day4TicketLeft = day4TicketLeft;
	}

	public Integer getDay5TicketAllowed() {
		return day5TicketAllowed;
	}

	public void setDay5TicketAllowed(Integer day5TicketAllowed) {
		this.day5TicketAllowed = day5TicketAllowed;
	}

	public Integer getDay5TicketLeft() {
		return day5TicketLeft;
	}

	public void setDay5TicketLeft(Integer day5TicketLeft) {
		this.day5TicketLeft = day5TicketLeft;
	}

	public Integer getSeasonTicketAllowed() {
		return seasonTicketAllowed;
	}

	public void setSeasonTicketAllowed(Integer seasonTicketAllowed) {
		this.seasonTicketAllowed = seasonTicketAllowed;
	}

	public Integer getSeasonTicketLeft() {
		return seasonTicketLeft;
	}

	public void setSeasonTicketLeft(Integer seasonTicketLeft) {
		this.seasonTicketLeft = seasonTicketLeft;
	}

	public Integer getDeletedFlag() {
		return deletedFlag;
	}

	public void setDeletedFlag(Integer deletedFlag) {
		this.deletedFlag = deletedFlag;
	}

}