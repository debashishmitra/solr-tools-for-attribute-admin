/**
 * 
 */
package com.debashish.solr.attributes.entities;

/**
 * @author Raju
 *
 */
public class Attribute {

	private Long attributeDefinitionId;
	private String attributeName;
	private String domainEntityTypeCode;
	private String domainCode;
	private String brandCode;
	private String managementEntityTypeCode;

	public Long getAttributeDefinitionId() {
		return attributeDefinitionId;
	}

	public void setAttributeDefinitionId(Long attributeDefinitionId) {
		this.attributeDefinitionId = attributeDefinitionId;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getDomainEntityTypeCode() {
		return domainEntityTypeCode;
	}

	public void setDomainEntityTypeCode(String domainEntityTypeCode) {
		this.domainEntityTypeCode = domainEntityTypeCode;
	}

	public String getDomainCode() {
		return domainCode;
	}

	public void setDomainCode(String domainCode) {
		this.domainCode = domainCode;
	}

	public String getBrandCode() {
		return brandCode;
	}

	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getManagementEntityTypeCode() {
		return managementEntityTypeCode;
	}

	public void setManagementEntityTypeCode(String managementEntityTypeCode) {
		this.managementEntityTypeCode = managementEntityTypeCode;
	}

}
