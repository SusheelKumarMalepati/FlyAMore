package com.in.fam.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.in.fam.entity.AirportDetailsDTO;
import com.in.fam.service.AirportDetailsService;

@RestController
public class AirportDetailsController {
	@Autowired
	AirportDetailsService airportDetailsService;
	//http://localhost:8080/fam/getairportdetails
	@GetMapping("/fam/getairportdetails")
	public ResponseEntity<List<AirportDetailsDTO>> details(){
		
		List<AirportDetailsDTO> airportDetailsDTO=airportDetailsService.getAllAirports();
		return ResponseEntity.ok(airportDetailsDTO);
	}
	//http://localhost:8080/fam/search?from=<>&to=<>
	@GetMapping("/fam/search")
    public ResponseEntity<List<AirportDetailsDTO>> searchAirports(@RequestParam("from") String fromLocation,
                                                           @RequestParam("to") String toLocation) {
        List<AirportDetailsDTO> fromAirports = airportDetailsService.getAirportsByLocation(fromLocation);
        List<AirportDetailsDTO> toAirports = airportDetailsService.getAirportsByLocation(toLocation);
        Set<AirportDetailsDTO> suggestions = new HashSet<>();
        suggestions.addAll(fromAirports);
        suggestions.addAll(toAirports);
        return ResponseEntity.ok(new ArrayList<>(suggestions));
    }
}
