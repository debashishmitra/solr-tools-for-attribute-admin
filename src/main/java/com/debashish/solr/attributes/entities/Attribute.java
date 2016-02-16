/**
 * 
 */
package com.debashish.solr.attributes.entities;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author Raju
 *
 */
public class Attribute {

	private Long id;
	private String attributeName;
	private String domainEntityTypeCode;
	private String domainCode;
	private String brandCode;
	private String managementEntityTypeCode;
	private String valueType;
	private String activeFlag;
	private String multiValueFlag;
	private String attributeType;
	private String requestCode;
	private Timestamp created;
	private String createdBy;
	private Timestamp lastUpdated;
	private String lastUpdatedBy;
	
	private List<AttributeValue> attributeValueList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getValueType() {
		return valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getMultiValueFlag() {
		return multiValueFlag;
	}

	public void setMultiValueFlag(String multiValueFlag) {
		this.multiValueFlag = multiValueFlag;
	}

	public String getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
	}

	public String getRequestCode() {
		return requestCode;
	}

	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

}
