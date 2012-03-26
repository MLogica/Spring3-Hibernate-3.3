package com.exercise.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exercise.dao.SiteDAO;
import com.exercise.form.Site;

@Service
public class SiteServiceImpl implements SiteService{

	@Autowired
	private SiteDAO siteDAO;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public Site getSiteById(int id) {
		Site site = (Site) sessionFactory.getCurrentSession().get(Site.class, id);
		return site;
	}

	@Transactional
	public List<Site> listSites() {
		return sessionFactory.getCurrentSession().createQuery("from Site").list();
	}

	@Transactional
	public int newSite(Site site) {
		return (Integer) sessionFactory.getCurrentSession().save(site);
	}

	@Transactional
	public void updateSite(Site site) {
		siteDAO.updateSite(site);
	}

	@Transactional
	public boolean removeSite(Integer siteId) {
		return siteDAO.removeSite(siteId);
	}
	
	@Override
	public void setSiteDAO(SiteDAO siteDAO) {
	   this.siteDAO = siteDAO;
	}	

}
