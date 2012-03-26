package com.exercise.service;

import java.util.List;

import com.exercise.dao.SiteDAO;
import com.exercise.form.Site;

public interface SiteService {
	
	public Site getSiteById(int id);
	public List<Site> listSites();
	public int newSite(Site site);
	public void updateSite(Site site);
	public boolean removeSite(Integer id);	
	public void setSiteDAO(SiteDAO siteDAO);

}
