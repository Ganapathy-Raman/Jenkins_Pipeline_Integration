package com.gana.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "insurance")
public class Insurance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int insuranceid;
	@Column
	private int insurancenumber;
	@Column
	private int insurancetakendate;
	@Column
	private int insurancevaliddate;
	@Column
	private int insuranceamount;
	@Column
	private int customervehicleid;
	@Column
	private int insurancetotal;

	public Insurance() {
		super();

	}

	public Insurance(int insuranceid, int insurancenumber, int insurancetakendate, int insurancevaliddate,
			int insuranceamount, int customervehicleid, int insurancetotal) {
		super();
		this.insuranceid = insuranceid;
		this.insurancenumber = insurancenumber;
		this.insurancetakendate = insurancetakendate;
		this.insurancevaliddate = insurancevaliddate;
		this.insuranceamount = insuranceamount;
		this.customervehicleid = customervehicleid;
		this.insurancetotal = insurancetotal;
	}

	public int getInsuranceid() {
		return insuranceid;
	}

	public void setInsuranceid(int insuranceid) {
		this.insuranceid = insuranceid;
	}

	public int getInsurancenumber() {
		return insurancenumber;
	}

	public void setInsurancenumber(int insurancenumber) {
		this.insurancenumber = insurancenumber;
	}

	public int getInsurancetakendate() {
		return insurancetakendate;
	}

	public void setInsurancetakendate(int insurancetakendate) {
		this.insurancetakendate = insurancetakendate;
	}

	public int getInsurancevaliddate() {
		return insurancevaliddate;
	}

	public void setInsurancevaliddate(int insurancevaliddate) {
		this.insurancevaliddate = insurancevaliddate;
	}

	public int getInsuranceamount() {
		return insuranceamount;
	}

	public void setInsuranceamount(int insuranceamount) {
		this.insuranceamount = insuranceamount;
	}

	public int getCustomervehicleid() {
		return customervehicleid;
	}

	public void setCustomervehicleid(int customervehicleid) {
		this.customervehicleid = customervehicleid;
	}

	public int getInsurancetotal() {
		return insurancetotal;
	}

	public void setInsurancetotal(int insurancetotal) {
		this.insurancetotal = insurancetotal;
	}

	@Override
	public String toString() {
		return "Insurance [insuranceid=" + insuranceid + ", insurancenumber=" + insurancenumber
				+ ", insurancetakendate=" + insurancetakendate + ", insurancevaliddate=" + insurancevaliddate
				+ ", insuranceamount=" + insuranceamount + ", customervehicleid=" + customervehicleid
				+ ", insurancetotal=" + insurancetotal + "]";
	}

}
