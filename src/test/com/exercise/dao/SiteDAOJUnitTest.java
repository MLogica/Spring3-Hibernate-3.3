package com.exercise.dao;

import static org.junit.Assert.assertEquals;
import java.util.List;
import javax.annotation.Resource;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import com.exercise.form.Site;
import com.exercise.service.SiteService;

@TransactionConfiguration 
@ContextConfiguration({"classpath:spring-servlet.xml"})
@Transactional
@RunWith(SpringJUnit4ClassRunner.class) 
public class SiteDAOJUnitTest {

	@Resource
	private SiteService siteService;
    
	@Test
	public void testNewSite() {
    	Site site = new Site();
    	site.setSite("www.xpalpn.com");
    	site.setDescription("desc");
    	site.setProfileId("profileid");
    	site.setReference("reference");
    	site.setUrl("url");
    	int id = siteService.newSite(site);
    	Site retrieveSite = siteService.getSiteById(id);
    	assertEquals(site, retrieveSite);     
	}    
	
    @Test
    public void testUpdateData() {
        List<Site> siteList = siteService.listSites();
        Assert.assertNotNull(siteList.size());
        Site siteExpected = siteList.get(5);
        siteExpected.setSite("www.testo.com");
        Site siteResult = siteService.getSiteById(siteExpected.getSiteId());        
        Assert.assertEquals(siteExpected.getSite(), siteResult.getSite());
    }	
    
    @Test
    public void testDeleteData() {
    	boolean flag = siteService.removeSite(22);
    	Assert.assertTrue(flag);
    } 	
	
}
