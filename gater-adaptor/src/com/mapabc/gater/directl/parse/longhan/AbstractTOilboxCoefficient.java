package com.mapabc.gater.directl.parse.longhan;

/**
 * AbstractTOilboxCoefficient generated by MyEclipse Persistence Tools
 */

public abstract class AbstractTOilboxCoefficient implements
		java.io.Serializable {

	// Fields

	private Long id;

	private Long coefficientNum;

	private Float resistanceS;

	private Float voltageS;

	private Float oilMass;

	private String name;

	private String grade;

	private Float resistanceE;

	private Float voltageE;
	
	private Float tankCapacity;

	// Constructors

	/** default constructor */
	public AbstractTOilboxCoefficient() {
	}

	/** full constructor */
	public AbstractTOilboxCoefficient(Long coefficientNum, Float resistanceS,
			Float voltageS, Float oilMass, String name, String grade,
			Float resistanceE, Float voltageE) {
		this.coefficientNum = coefficientNum;
		this.resistanceS = resistanceS;
		this.voltageS = voltageS;
		this.oilMass = oilMass;
		this.name = name;
		this.grade = grade;
		this.resistanceE = resistanceE;
		this.voltageE = voltageE;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCoefficientNum() {
		return this.coefficientNum;
	}

	public void setCoefficientNum(Long coefficientNum) {
		this.coefficientNum = coefficientNum;
	}

	public Float getResistanceS() {
		return this.resistanceS;
	}

	public void setResistanceS(Float resistanceS) {
		this.resistanceS = resistanceS;
	}

	public Float getVoltageS() {
		return this.voltageS;
	}

	public void setVoltageS(Float voltageS) {
		this.voltageS = voltageS;
	}

	public Float getOilMass() {
		return this.oilMass;
	}

	public void setOilMass(Float oilMass) {
		this.oilMass = oilMass;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Float getResistanceE() {
		return this.resistanceE;
	}

	public void setResistanceE(Float resistanceE) {
		this.resistanceE = resistanceE;
	}

	public Float getVoltageE() {
		return this.voltageE;
	}

	public void setVoltageE(Float voltageE) {
		this.voltageE = voltageE;
	}

	public Float getTankCapacity() {
		return tankCapacity;
	}

	public void setTankCapacity(Float tankCapacity) {
		this.tankCapacity = tankCapacity;
	}

}