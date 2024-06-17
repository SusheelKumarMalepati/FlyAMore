package com.in.fam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="AirportDetails")
public class AirportDetails {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(nullable=false)
	private String code;
	@Column(nullable=false)
	private String airportIcao;
	@Column(nullable=false)
	private String airportName;
	@Column(nullable=false)
	private String airportCity;
	@Column(nullable=false)
	private String airportState;
	@Column(nullable=false)
	private String airportCountry;
	public AirportDetails(Long id, String code, String airportIcao, String airportName, String airportCity,
			String airportState, String airportCountry) {
		super();
		this.id = id;
		this.code = code;
		this.airportIcao = airportIcao;
		this.airportName = airportName;
		this.airportCity = airportCity;
		this.airportState = airportState;
		this.airportCountry = airportCountry;
	}
	public AirportDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
