package com.cabbuddy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookCab {
	@Id
	Integer bookId;
	String name;
	String fromLocation;
	String toLocation;
	Integer typeOfCab;
	Float fareAmount; 
	public BookCab() {

	}
	public BookCab(Integer bookId, String name, String fromLocation, String toLocation, Integer typeOfCab,
			Float fareAmount) {
		this.bookId = bookId;
		this.name = name;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.typeOfCab = typeOfCab;
		this.fareAmount = fareAmount;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	public Integer getTypeOfCab() {
		return typeOfCab;
	}
	public void setTypeOfCab(Integer typeOfCab) {
		this.typeOfCab = typeOfCab;
	}
	public Float getFareAmount() {
		return fareAmount;
	}
	public void setFareAmount(Float fareAmount) {
		this.fareAmount = fareAmount;
	}
	@Override
	public String toString() {
		return "BookCab [bookId=" + bookId + ", name=" + name + ", fromLocation=" + fromLocation + ", toLocation="
				+ toLocation + ", typeOfCab=" + typeOfCab + ", fareAmount=" + fareAmount + "]";
	}
	
}
