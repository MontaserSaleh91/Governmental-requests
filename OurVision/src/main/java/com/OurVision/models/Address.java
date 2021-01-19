package com.OurVision.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="addresses")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=2, message="Please provide a street")
	private String street;
	
	@Size(min=2, message="Please provide a city")
	private String city;
	
	@Column(updatable=false)
	private Date createdAt;
	
	private Date updatedAt;
	
	@ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user_address;

	public Address() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public User getUser_address() {
		return user_address;
	}

	public void setUser_address(User user_address) {
		this.user_address = user_address;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	
}

