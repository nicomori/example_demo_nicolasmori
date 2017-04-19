package com.demo.nicolas.mori.objects;

public class ApartmentsDetails {

	public String title;
	public String metros;
	public String precio;
	public String availableFrom;
	public String availableTo;
	public String address;
	public String contact_id;
	public String contact_name;
	public String flat_details;
	
	public ApartmentsDetails() {
		super();
	}

	public ApartmentsDetails(String title, String metros, String precio, String availableFrom, String availableTo,
			String address, String contact_id, String contact_name, String flat_details) {
		super();
		this.title = title;
		this.metros = metros;
		this.precio = precio;
		this.availableFrom = availableFrom;
		this.availableTo = availableTo;
		this.address = address;
		this.contact_id = contact_id;
		this.contact_name = contact_name;
		this.flat_details = flat_details;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMetros() {
		return metros;
	}

	public void setMetros(String metros) {
		this.metros = metros;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getAvailableFrom() {
		return availableFrom;
	}

	public void setAvailableFrom(String availableFrom) {
		this.availableFrom = availableFrom;
	}

	public String getAvailableTo() {
		return availableTo;
	}

	public void setAvailableTo(String availableTo) {
		this.availableTo = availableTo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact_id() {
		return contact_id;
	}

	public void setContact_id(String contact_id) {
		this.contact_id = contact_id;
	}

	public String getContact_name() {
		return contact_name;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	public String getFlat_details() {
		return flat_details;
	}

	public void setFlat_details(String flat_details) {
		this.flat_details = flat_details;
	}
	
	
	
}
