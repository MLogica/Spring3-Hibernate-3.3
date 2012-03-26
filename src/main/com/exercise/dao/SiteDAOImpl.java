package com.exercise.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exercise.form.Site;

@Repository
public class SiteDAOImpl implements SiteDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public Site getSiteById(int id) {
		Site site = (Site) sessionFactory.getCurrentSession().get(Site.class, id);
		return site; 
	}
	
	public Site getSiteBySite(String siteName) {
		Site site = (Site) sessionFactory.getCurrentSession().get(Site.class, siteName);
		return site; 
	}	

	public List<Site> listSites() {
	   return sessionFactory.getCurrentSession().createQuery("from Site").list();
	}

	public int newSite(Site site) {
		return (Integer) sessionFactory.getCurrentSession().save(site);
	}

	public void updateSite(Site site) {
		sessionFactory.getCurrentSession().update(site);
	}
 
	public boolean removeSite(Integer siteId) {
		Site site = (Site) sessionFactory.getCurrentSession().load(Site.class, siteId);
		if (null != site) {
			sessionFactory.getCurrentSession().delete(site);
			return true;
		} 
		return false;
	}

}
