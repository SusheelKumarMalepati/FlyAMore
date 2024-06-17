package com.in.fam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.in.fam.entity.AirportDetails;

@Repository
public interface AirportDetailsRepository extends JpaRepository<AirportDetails,Long>{
	@Query("SELECT a FROM AirportDetails a WHERE LOWER(a.airportCity) = LOWER(:location) OR LOWER(a.airportCountry) = LOWER(:location)")
	List<AirportDetails> findByAirportCityOrAirportCountryIgnoreCase(String location);

}
