package com.csm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "t_hit_counter")
public class THitCounter {
	@Id
	@Column(name = "intId", columnDefinition = "INT UNSIGNED not null")
	private Long id;

	@Column(name = "dteHitDate")
	private LocalDate dteHitDate;

	@Column(name = "vchIPAddress", length = 16)
	private String vchIPAddress;

	@Column(name = "intHitCounter", columnDefinition = "INT UNSIGNED not null")
	private Long intHitCounter;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDteHitDate() {
		return dteHitDate;
	}

	public void setDteHitDate(LocalDate dteHitDate) {
		this.dteHitDate = dteHitDate;
	}

	public String getVchIPAddress() {
		return vchIPAddress;
	}

	public void setVchIPAddress(String vchIPAddress) {
		this.vchIPAddress = vchIPAddress;
	}

	public Long getIntHitCounter() {
		return intHitCounter;
	}

	public void setIntHitCounter(Long intHitCounter) {
		this.intHitCounter = intHitCounter;
	}

}