package com.exercise.dao;

import static org.easymock.EasyMock.createStrictMock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.ArrayList;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import com.exercise.dao.SiteDAO;
import com.exercise.form.Site;
import com.exercise.service.SiteService;
import com.exercise.service.SiteServiceImpl;

public class SiteDAOEasyMonkTest {
    private SiteServiceImpl service;
    private SiteDAO mockDao;

    @Before
    public void setUp() {
         service = new SiteServiceImpl();
         mockDao = createStrictMock(SiteDAO.class);
         service.setSiteDAO(mockDao);
    }
    
    @Test
    public void testDAO() {
    	
    	Site site = new Site();
    	site.setSiteId(1);
    	site.setSite("test.com");
    	
    	List<Site> contactList = new ArrayList<Site>(1); 
    	contactList.add(site);
    	
    	assertEquals("test.com", site.getSite());
    	assertNull("flower.com", site.getReference());
    	
    	EasyMock.expect(mockDao.listSites()).andReturn(contactList).anyTimes(); 
    	EasyMock.expect(mockDao.getSiteById(1)).andReturn(site);
    	
    	EasyMock.replay(mockDao); 
   
    	assertEquals("Contact list", contactList, service.listSites());

    	EasyMock.verify(mockDao);

     }   
}
