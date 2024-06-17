package com.in.fam.service;

import org.springframework.stereotype.Component;

import com.in.fam.entity.FlightEntity;

@Component
public interface FlightService {
	public FlightEntity getFlightInfo(String departureAirportIata, String arrivalAirportIata, String flightDate);
	public FlightEntity getInfoNumber(String flight_number);
}
