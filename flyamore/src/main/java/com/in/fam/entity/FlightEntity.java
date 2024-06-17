package com.in.fam.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class FlightEntity {
	@JsonProperty("filght_date")
	private String filghtDate;
	@JsonProperty("filght_status")
	private String flightStatus;
	private Departure departure;
	private Arrival arrival;
	private Airline airline;
	private Flight flight;
	private Aircraft aircraft;
	private Live live;

	@Data
	public static class Departure {
		private String airport;
		private String timezone;
		private String iata;
		private String icao;
		private String terminal;
		private String gate;
		private Integer delay;
		private String scheduled;
		private String estimated;
		private String actual;
		private String estimatedRunway;
		private String actualRunway;
	}
	@Data
	public static class Arrival {
		private String airport;
		private String timezone;
		private String iata;
		private String icao;
		private String terminal;
		private String gate;
		private String baggage;
		private Integer delay;
		private String scheduled;
		private String estimated;
		private String actual;
		private String estimatedRunway;
		private String actualRunway;
	}
	@Data
	public static class Airline {
        private String name;
        private String iata;
        private String icao;
	}
	@Data
	public static class Flight {
        private String number;
        private String iata;
        private String icao;
        private String codeshared;
	}
	@Data
	public static class Aircraft {
        private String registration;
        private String iata;
        private String icao;
        private String icao24;
	}
	@Data
	public static class Live {
        private String updated;
        private Double latitude;
        private Double longitude;
        private Double altitude;
        private Double direction;
        private Double speed_horizontal;
        private Double speed_vertical;
        private boolean is_ground;
	}
}
