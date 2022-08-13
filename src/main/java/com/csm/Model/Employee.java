package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@Column(name = "eid", nullable = false)
	private Long id;

	@Column(name = "fname", length = 75)
	private String fname;

	@Column(name = "lname", length = 75)
	private String lname;

	@Column(name = "email", length = 75)
	private String email;

	@Column(name = "mobile", length = 75)
	private String mobile;

	@Column(name = "address", length = 75)
	private String address;

	@Column(name = "scheme", length = 75)
	private String scheme;

	@Column(name = "nScheme", length = 75)
	private String nScheme;

	@Column(name = "amount", length = 75)
	private String amount;

	@Column(name = "tax", length = 75)
	private String tax;

	@Column(name = "panNo", length = 75)
	private String panNo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getNScheme() {
		return nScheme;
	}

	public void setNScheme(String nScheme) {
		this.nScheme = nScheme;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

}