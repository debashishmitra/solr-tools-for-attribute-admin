/**
 * 
 */
package com.debashish.solr.attributes.web;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author Raju
 *
 */
@ApplicationPath("rest")
public class RestBootstrap extends ResourceConfig {
	
	public RestBootstrap() {
		packages("com.debashish.solr.attributes.web");
	}
}
