package com.in.fam.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.in.fam.entity.AirportDetails;
import com.in.fam.entity.AirportDetailsDTO;
import com.in.fam.entity.AirportDetailsMapper;
import com.in.fam.repository.AirportDetailsRepository;

@Service
public class AirportDetailsServiceImpl implements AirportDetailsService{
	@Autowired
	AirportDetailsRepository airportDetailsRepository;
	@Autowired
	AirportDetailsMapper airportDetailsMapper;
	@Cacheable("airports")
	@Override
	public List<AirportDetailsDTO> getAllAirports(){
		List<AirportDetails> airportDetails=airportDetailsRepository.findAll();
		return airportDetails.stream()
				.map(airportDetailsMapper::mapToDTO)
				.collect(Collectors.toList());
	}
	@Override
	public List<AirportDetailsDTO> getAirportsByLocation(String location) {
        List<AirportDetails> airports = airportDetailsRepository.findByAirportCityOrAirportCountryIgnoreCase(location);
        return airports.stream()
                       .map(airportDetailsMapper::mapToDTO)
                       .collect(Collectors.toList());
    }
}
