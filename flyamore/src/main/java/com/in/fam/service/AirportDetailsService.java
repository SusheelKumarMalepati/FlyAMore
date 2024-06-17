package com.in.fam.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.in.fam.entity.AirportDetailsDTO;

@Component
public interface AirportDetailsService {
	public List<AirportDetailsDTO> getAllAirports();
	public List<AirportDetailsDTO> getAirportsByLocation(String location);
}
