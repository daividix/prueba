package com.usco.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PendingSite")
public class PendingSite implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="id", unique=true)
	private long id;
	
	@Column(name="site", nullable= false)
	private long site;
	
	@Column(name="userId", nullable= false)
	private long userId;
	
	public PendingSite() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getSite() {
		return site;
	}

	public void setSite(long site) {
		this.site = site;
	}

	public long getUserId() {
		return userId;
	}

	public void setUser(long userId) {
		this.userId = userId;
	}
	
	
	
}
