package com.csm.Model;

import javax.persistence.*;

@Entity
@Table(name = "Configuration_")
public class Configuration {
	@Id
	@Column(name = "configurationId", nullable = false)
	private String id;

	@Lob
	@Column(name = "dictionary")
	private String dictionary;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDictionary() {
		return dictionary;
	}

	public void setDictionary(String dictionary) {
		this.dictionary = dictionary;
	}

}