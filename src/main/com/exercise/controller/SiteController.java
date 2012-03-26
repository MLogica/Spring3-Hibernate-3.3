package com.exercise.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.exercise.form.Site;
import com.exercise.service.SiteService;

@Controller
public class SiteController {
	
	@Autowired
	private SiteService siteService;
	
	@RequestMapping("/sitesList")
	public String listSites(Map<String, Object> map) {
		map.put("site", new Site());
		map.put("sitesList", siteService.listSites());
		return "newSite";
	}
 	
	@RequestMapping(value = "/newSite", method = RequestMethod.POST)
	public String newSite(Site site, Map<String, Object> map) {
		siteService.newSite(site);
		return "redirect:/sitesList.html";		
		
	}	
	
	@RequestMapping(value = "/editSite.html")
	public String getSiteIdForUpdate(@RequestParam(value="id", required=true) int siteId, Map<String, Object> map) {
		map.put("site", siteService.getSiteById(siteId));
		return "editSite";
	}	

	@RequestMapping(value = "/updateSite.html", method = RequestMethod.POST)
	public String updateUser(Site site, Map<String, Object> map) {
		siteService.updateSite(site);
		return "redirect:/sitesList.html";
	}	
		
	
	@RequestMapping(value = "/removeSite.html")
	public String removeSite(@RequestParam(value="id", required=true) int siteId) {
		siteService.removeSite(siteId);
		return "redirect:/sitesList.html";
	}		

}
