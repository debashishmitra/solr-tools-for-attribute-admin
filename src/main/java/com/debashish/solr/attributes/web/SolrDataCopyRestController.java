/**
 * 
 */
package com.debashish.solr.attributes.web;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.debashish.solr.attributes.service.SolrDataCopyService;

/**
 * @author Raju
 *
 */
@Path("/dataCopy")
@Controller
public class SolrDataCopyRestController {

	@Autowired
	private SolrDataCopyService solrDataCopyService;
	
	@POST
	@Consumes("application/json")
	@Path("/fromSolrToSolr")
	public void copyFromSolrToSolr(String payload) {
		System.out.println("0");
	}
	
	@GET
	@Path("/test")
	public void test() {
		System.out.println("0");
		solrDataCopyService.copyFromSolrToSolr(null, null, null);
	}
}
