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
@Table(name = "VEHILCE_DETAILS")
public class VehicleDetailsEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "VEHICLE_ID")
	
	private Integer VehicleId;

    private String SelectVehicle;
	
	private String VehicleCompany;
	
	private String ManufacturingYear;
	
	private String VehicleColor;
	
	@OneToOne
	@JoinColumn(name = "OWNER_ID")
	private OwnerEntity owner;

	public Integer getVehicleId() {
		return VehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		VehicleId = vehicleId;
	}

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

	public void setOwner(OwnerEntity ownerEntity) {
		// TODO Auto-generated method stub
		
	}
	
	
}
