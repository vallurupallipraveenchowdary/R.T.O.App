package com.praveen.domain;

import lombok.Data;

@Data
public class OwnerAddress {
	
	
	
	private String FlatNumber;
	
	private String StreetName;
	
	private String CityName;
	
	private String ZipCode;
	
	private Integer ownerId;

	

	public String getFlatNumber() {
		return FlatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		FlatNumber = flatNumber;
	}

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		StreetName = streetName;
	}

	public String getCityName() {
		return CityName;
	}

	public void setCityName(String cityName) {
		CityName = cityName;
	}

	public String getZipCode() {
		return ZipCode;
	}

	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
	

}
