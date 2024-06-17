package com.in.fam.service;

import java.util.List;

import com.in.fam.entity.FlightEntity;

public class FlightApiResponse {
	private List<FlightEntity> data;

    public List<FlightEntity> getData() {
        return data;
    }

    public void setData(List<FlightEntity> data) {
        this.data = data;
    }
}
