/**
 * 
 */
package com.debashish.solr.attributes.entities;

import java.sql.Timestamp;

/**
 * @author Debashish Mitra
 *
 */
public class AttributeDefinitionConstraint {

	private Long id;
	private Attribute attribute;
	private AttributeValue attributeValue;
	private char isAllFlag;
	private Timestamp created;
	private String createdBy;
	private Timestamp updated;
	private String updatedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	public AttributeValue getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(AttributeValue attributeValue) {
		this.attributeValue = attributeValue;
	}

	public char getIsAllFlag() {
		return isAllFlag;
	}

	public void setIsAllFlag(char isAllFlag) {
		this.isAllFlag = isAllFlag;
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

}
