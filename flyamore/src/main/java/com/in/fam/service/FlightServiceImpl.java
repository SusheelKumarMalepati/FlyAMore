package com.in.fam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.in.fam.entity.FlightEntity;

@Service
public class FlightServiceImpl implements FlightService{
	private final String apiUrl="https://api.aviationstack.com/v1/flights";
	private final String accesskey="";
	@Autowired
	RestTemplate restTemplate;
	@Override
	public FlightEntity getFlightInfo(String departureAirportIata, String arrivalAirportIata, String flightDate) {
		String url=apiUrl+"?access_key="+accesskey+"&departure_iata="+departureAirportIata+"&arrival_iata=" + arrivalAirportIata +"&flight_date=" + flightDate;
		FlightApiResponse response=restTemplate.getForObject(url,FlightApiResponse.class);
		if (response != null && response.getData() != null && !response.getData().isEmpty()) {
            return response.getData().get(0); // Assuming we only want the first result
        }
        return null;		
	}
	@Override
	public FlightEntity getInfoNumber(String flight_number) {
		String url=apiUrl+"?access_key="+accesskey+"&flight_number="+flight_number;
		FlightApiResponse response=restTemplate.getForObject(url,FlightApiResponse.class);
		if (response != null && response.getData() != null && !response.getData().isEmpty()) {
            return response.getData().get(0); // Assuming we only want the first result
        }
        return null;
	}
}
