/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RatingOptionTemplate implements java.io.Serializable {

	private static final long serialVersionUID = -1558119836;

	private java.lang.Integer idRatingOptionsTemplate;
	private java.lang.String  name;
	private java.lang.Integer value;
	private java.lang.Integer template;

	public RatingOptionTemplate() {}

	public RatingOptionTemplate(
		java.lang.Integer idRatingOptionsTemplate,
		java.lang.String  name,
		java.lang.Integer value,
		java.lang.Integer template
	) {
		this.idRatingOptionsTemplate = idRatingOptionsTemplate;
		this.name = name;
		this.value = value;
		this.template = template;
	}

	public java.lang.Integer getIdRatingOptionsTemplate() {
		return this.idRatingOptionsTemplate;
	}

	public void setIdRatingOptionsTemplate(java.lang.Integer idRatingOptionsTemplate) {
		this.idRatingOptionsTemplate = idRatingOptionsTemplate;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getValue() {
		return this.value;
	}

	public void setValue(java.lang.Integer value) {
		this.value = value;
	}

	public java.lang.Integer getTemplate() {
		return this.template;
	}

	public void setTemplate(java.lang.Integer template) {
		this.template = template;
	}
}