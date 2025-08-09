package com.tnsif.mallservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mall {
	@Id
	@Column(name = "General Manager")
	private String generalmanager;
	@Column(name = "Parking Attendant")
	private String parkingAttendant;
	@Column(name = "Customer Service")
	private String Customerservice;
	@Column(name = "Store Manager")
	private String StoreManager;
	@Column(name = "Security Officer")
	private String SecurityOfficer;
	@Column(name = "Maintenance Technician")
	private String MaintenanceTechnician;
	public Mall() {
		 
	}
	
	public Mall(String generalmanager, String parkingAttendant, String customerservice, String storeManager,
			String securityOfficer, String maintenanceTechnician) {
		super();
		this.generalmanager = generalmanager;
		this.parkingAttendant = parkingAttendant;
		Customerservice = customerservice;
		StoreManager = storeManager;
		SecurityOfficer = securityOfficer;
		MaintenanceTechnician = maintenanceTechnician;
	}

	public String getGeneralmanager() {
		return generalmanager;
	}
	public void setGeneralmanager(String generalmanager) {
		this.generalmanager = generalmanager;
	}
	public String getParkingAttendant() {
		return parkingAttendant;
	}
	public void setParkingAttendant(String parkingAttendant) {
		this.parkingAttendant = parkingAttendant;
	}
	public String getCustomerservice() {
		return Customerservice;
	}
	public void setCustomerservice(String customerservice) {
		Customerservice = customerservice;
	}
	public String getStoreManager() {
		return StoreManager;
	}
	public void setStoreManager(String storeManager) {
		StoreManager = storeManager;
	}
	public String getSecurityOfficer() {
		return SecurityOfficer;
	}
	public void setSecurityOfficer(String securityOfficer) {
		SecurityOfficer = securityOfficer;
	}
	public String getMaintenanceTechnician() {
		return MaintenanceTechnician;
	}
	public void setMaintenanceTechnician(String maintenanceTechnician) {
		MaintenanceTechnician = maintenanceTechnician;
	}

	@Override
	public String toString() {
		return "Mall [generalmanager=" + generalmanager + ", parkingAttendant=" + parkingAttendant
				+ ", Customerservice=" + Customerservice + ", StoreManager=" + StoreManager + ", SecurityOfficer="
				+ SecurityOfficer + ", MaintenanceTechnician=" + MaintenanceTechnician + "]";
	}
	
	

}
