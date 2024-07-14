package com.bishnu.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PostOffice {
	@JsonProperty("Name")
	private String name;
	@JsonProperty("Description")
	private String description;
	@JsonProperty("BranchType")
	private String branchtype;
	@JsonProperty("DeliveryStatus")
	private String deliveryStatus;
	@JsonProperty("Circle")
	private String circle;
	@JsonProperty("District")
	private String district;
	@JsonProperty("Division")
	private String division;
	@JsonProperty("Region")
	private String region;
	@JsonProperty("State")
	private String state;
	@JsonProperty("Country")
	private String country;
	@JsonProperty("Pincode")
	private Long pincode;
	
	
	public PostOffice(String name, String description, String branchtype, String deliveryStatus, String circle,
			String district, String division, String region, String state, String country, Long pincode) {
		super();
		this.name = name;
		this.description = description;
		this.branchtype = branchtype;
		this.deliveryStatus = deliveryStatus;
		this.circle = circle;
		this.district = district;
		this.division = division;
		this.region = region;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBranchtype() {
		return branchtype;
	}
	public void setBranchtype(String branchtype) {
		this.branchtype = branchtype;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	
	

}
