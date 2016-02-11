/**
 * 
 */
package com.debashish.solr.attributes.service;

/**
 * @author Raju
 *
 */
public interface SolrDataCopyService {
	void copyFromSolrToSolr(String source, String destination, String query);
}
