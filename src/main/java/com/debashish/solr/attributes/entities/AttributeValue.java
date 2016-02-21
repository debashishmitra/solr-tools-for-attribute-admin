/**
 * 
 */
package com.debashish.solr.attributes.entities;

import java.sql.Timestamp;

/**
 * @author Raju
 *
 */
public class AttributeValue {

	private Long id;
	private String attributeValueName;
	private char activeFlag;
	private String businessId;
	private Timestamp created;
	private String createdBy;
	private Timestamp updated;
	private String updatedBy;
	private Attribute parentAttribute;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAttributeValueName() {
		return attributeValueName;
	}
	public void setAttributeValueName(String attributeValueName) {
		this.attributeValueName = attributeValueName;
	}
	public char getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(char activeFlag) {
		this.activeFlag = activeFlag;
	}
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
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
	public Timestamp getUpdated() {
		return updated;
	}
	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Attribute getParentAttribute() {
		return parentAttribute;
	}
	public void setParentAttribute(Attribute parentAttribute) {
		this.parentAttribute = parentAttribute;
	}
}
