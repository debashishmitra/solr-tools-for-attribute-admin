/**
 * 
 */
package com.debashish.solr.attributes.entities;

/**
 * @author Debashish Mitra
 *
 */
public class AttributeDefinitionMetadata {

	private Long id;
	private Attribute parentAttribute;
	private AttributeDefinitionMetadataDefinition attributeDefinitionMetadataDefinition;
	private AttributeDefinitionMetadataValue attributeDefinitionMetadataValue;
	private String scalarValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Attribute getParentAttribute() {
		return parentAttribute;
	}

	public void setParentAttribute(Attribute parentAttribute) {
		this.parentAttribute = parentAttribute;
	}

	public AttributeDefinitionMetadataDefinition getAttributeDefinitionMetadataDefinition() {
		return attributeDefinitionMetadataDefinition;
	}

	public void setAttributeDefinitionMetadataDefinition(AttributeDefinitionMetadataDefinition attributeDefinitionMetadataDefinition) {
		this.attributeDefinitionMetadataDefinition = attributeDefinitionMetadataDefinition;
	}

	public AttributeDefinitionMetadataValue getAttributeDefinitionMetadataValue() {
		return attributeDefinitionMetadataValue;
	}

	public void setAttributeDefinitionMetadataValue(AttributeDefinitionMetadataValue attributeDefinitionMetadataValue) {
		this.attributeDefinitionMetadataValue = attributeDefinitionMetadataValue;
	}

	public String getScalarValue() {
		return scalarValue;
	}

	public void setScalarValue(String scalarValue) {
		this.scalarValue = scalarValue;
	}
}
