package com.in.fam.entity;

import org.springframework.stereotype.Component;

@Component
public class AirportDetailsMapper {
	public AirportDetailsDTO mapToDTO(AirportDetails airportDetails) {
		AirportDetailsDTO dto = new AirportDetailsDTO();
		dto.setAirportIata(airportDetails.getCode());
		dto.setAirportIcao(airportDetails.getAirportIcao());
		dto.setAirportName(airportDetails.getAirportName());
		dto.setAirportCity(airportDetails.getAirportCity());
		dto.setAirportState(airportDetails.getAirportState());
		dto.setAirportCountry(airportDetails.getAirportCountry());
		return dto;
	}
}
