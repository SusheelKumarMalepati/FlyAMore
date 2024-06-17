package com.in.fam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.in.fam.entity.FlightEntity;
import com.in.fam.service.FlightService;

@RestController
public class FlightController {
	@Autowired
	FlightService flightService;
	//http://localhost:8080/fam/flight-info?departureIata=<>&arrivalIata=<>&date=<>
	@GetMapping("/fam/flight-info")
	public FlightEntity getFlightInfo(@RequestParam("departureIata") String departureAirportIata,@RequestParam("arrivalIata") String arrivalAirportIata,@RequestParam("date") String flightDate) {
		return flightService.getFlightInfo(departureAirportIata, arrivalAirportIata, flightDate);
	}
	//http://localhost:8080/fam/fnsearch?flightnumber=<>
	@GetMapping("/fam/fnsearch")
	public FlightEntity getInfoNumber(@RequestParam("flightnumber") String flight_number){
		return flightService.getInfoNumber(flight_number);
	}
}
