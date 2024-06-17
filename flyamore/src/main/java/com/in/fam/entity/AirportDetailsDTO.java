package com.in.fam.entity;

import lombok.Data;

@Data
public class AirportDetailsDTO {
	private String airportIata;
    private String airportIcao;
    private String airportName;
    private String airportCity;
    private String airportState;
    private String airportCountry;
	public AirportDetailsDTO(String airportIata, String airportIcao, String airportName, String airportCity,
			String airportState, String airportCountry) {
		super();
		this.airportIata = airportIata;
		this.airportIcao = airportIcao;
		this.airportName = airportName;
		this.airportCity = airportCity;
		this.airportState = airportState;
		this.airportCountry = airportCountry;
	}
	public AirportDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
