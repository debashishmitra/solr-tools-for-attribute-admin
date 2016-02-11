/**
 * 
 */
package com.debashish.solr.attributes.service;

import org.springframework.stereotype.Service;

/**
 * @author Raju
 *
 */
@Service
public class SolrDataCopyServiceImpl implements SolrDataCopyService {

	@Override
	public void copyFromSolrToSolr(String source, String destination, String query) {
		System.out.println(1);
	}

}
