/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Experimentspopulation implements java.io.Serializable {

	private static final long serialVersionUID = -1266076887;

	private java.lang.Integer idexperimentspopulation;
	private java.lang.Integer populationUser;
	private java.lang.Integer referencedPopulation;
	private java.lang.Integer referencedPlatform;

	public Experimentspopulation() {}

	public Experimentspopulation(
		java.lang.Integer idexperimentspopulation,
		java.lang.Integer populationUser,
		java.lang.Integer referencedPopulation,
		java.lang.Integer referencedPlatform
	) {
		this.idexperimentspopulation = idexperimentspopulation;
		this.populationUser = populationUser;
		this.referencedPopulation = referencedPopulation;
		this.referencedPlatform = referencedPlatform;
	}

	public java.lang.Integer getIdexperimentspopulation() {
		return this.idexperimentspopulation;
	}

	public void setIdexperimentspopulation(java.lang.Integer idexperimentspopulation) {
		this.idexperimentspopulation = idexperimentspopulation;
	}

	public java.lang.Integer getPopulationUser() {
		return this.populationUser;
	}

	public void setPopulationUser(java.lang.Integer populationUser) {
		this.populationUser = populationUser;
	}

	public java.lang.Integer getReferencedPopulation() {
		return this.referencedPopulation;
	}

	public void setReferencedPopulation(java.lang.Integer referencedPopulation) {
		this.referencedPopulation = referencedPopulation;
	}

	public java.lang.Integer getReferencedPlatform() {
		return this.referencedPlatform;
	}

	public void setReferencedPlatform(java.lang.Integer referencedPlatform) {
		this.referencedPlatform = referencedPlatform;
	}
}
