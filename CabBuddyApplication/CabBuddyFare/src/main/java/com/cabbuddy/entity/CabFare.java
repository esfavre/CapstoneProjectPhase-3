package com.cabbuddy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CabFare {
	@Id
	Integer fareId;
	Integer typeOfCab;
	Float amount;
	
	public CabFare() {

	}
	
	public CabFare(Integer fareId, Integer typeOfCab, Float amount) {
		this.fareId = fareId;
		this.typeOfCab = typeOfCab;
		this.amount = amount;
	}

	public Integer getFareId() {
		return fareId;
	}
	public void setFareId(Integer fareId) {
		this.fareId = fareId;
	}
	public Integer getTypeOfCab() {
		return typeOfCab;
	}
	public void setTypeOfCab(Integer typeOfCab) {
		this.typeOfCab = typeOfCab;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "CabFare [fareId=" + fareId + ", typeOfCab=" + typeOfCab + ", amount=" + amount + "]";
	}
	
}
