package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "TEMP_TABLE")
public class TempTable {
	@Lob
	@Column(name = "TITLE")
	private String title;

	@Lob
	@Column(name = "COVERIMAGE")
	private String coverimage;

	@Lob
	@Column(name = "FILTERDATA")
	private String filterdata;

	@Lob
	@Column(name = "USERNAME")
	private String username;

	@Lob
	@Column(name = "ENTRYDATE")
	private String entrydate;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCoverimage() {
		return coverimage;
	}

	public void setCoverimage(String coverimage) {
		this.coverimage = coverimage;
	}

	public String getFilterdata() {
		return filterdata;
	}

	public void setFilterdata(String filterdata) {
		this.filterdata = filterdata;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEntrydate() {
		return entrydate;
	}

	public void setEntrydate(String entrydate) {
		this.entrydate = entrydate;
	}

}