package com.praveen.domain;

import lombok.Data;

@Data
public class VehicleDetails {
	
	private String SelectVehicle;
	
	private String VehicleCompany;
	
	private String ManufacturingYear;
	
	private String VehicleColor;
	
	private Integer ownerId;

	public String getSelectVehicle() {
		return SelectVehicle;
	}

	public void setSelectVehicle(String selectVehicle) {
		SelectVehicle = selectVehicle;
	}

	public String getVehicleCompany() {
		return VehicleCompany;
	}

	public void setVehicleCompany(String vehicleCompany) {
		VehicleCompany = vehicleCompany;
	}

	public String getManufacturingYear() {
		return ManufacturingYear;
	}

	public void setManufacturingYear(String manufacturingYear) {
		ManufacturingYear = manufacturingYear;
	}

	public String getVehicleColor() {
		return VehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		VehicleColor = vehicleColor;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
   
	
	
}
