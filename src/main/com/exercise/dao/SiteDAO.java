package com.exercise.dao;

import java.util.List;

import com.exercise.form.Site;

public interface SiteDAO {
	
	public Site getSiteById(int id);
	public List<Site> listSites();
	public int newSite(Site site);
	public void updateSite(Site site);
	public boolean removeSite(Integer id);
	
}