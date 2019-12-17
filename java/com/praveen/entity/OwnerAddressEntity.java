package com.praveen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name = "OWNER_ADDRESS_DETAILS")
public class OwnerAddressEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "ADDRESS_Id")

	private Integer AddressId;
	
    private String FlatNumber;
	
	private String StreetName;
	
	private String CityName;
	
	private String ZipCode;

	@OneToOne
	@JoinColumn(name = "OWNER_ID")
	
	private OwnerEntity owner;

	public Integer getAddressId() {
		return AddressId;
	}

	public void setAddressId(Integer addressId) {
		AddressId = addressId;
	}

	

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

	public void setOwner(OwnerEntity ownerEntity) {
		// TODO Auto-generated method stub
		
	}
	
	
}
