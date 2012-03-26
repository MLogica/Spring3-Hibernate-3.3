package com.exercise.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SITE")
public class Site {
	
	@Id
    @Column(name="SITE_ID")
    @GeneratedValue		
	private Integer siteId;
    
	@Column(name="SITE")    
	private String site;
	
	@Column(name="URL")    	
	private String url;
	
	@Column(name="DESCRIPTION")    
	private String description;
	
	@Column(name="PROFILE_ID")    	
	private String profileId;
	
	@Column(name="REFERENCE")    	
	private String reference;
	
	@Column(name="DATE_CREATED", columnDefinition = "DEFAULT")    	
	private String dateCreated;
	
	public Integer getSiteId() {
		return siteId;
	}
	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProfileId() {
		return profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
}
