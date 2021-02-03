package com.oyo.paisa.service;


import com.oyo.paisa.entity.FloorRequest;
import com.oyo.paisa.repo.FloorRequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    FloorRequestRepo floorRequestRepo;

    public FloorRequest postFloorRequest(FloorRequest floorRequest)
    {
        return floorRequestRepo.save(floorRequest);
    }
    public List<FloorRequest> getFloorRequestByHotelId(Integer hotelId)
    {
        return floorRequestRepo.findAllByHotelIds(hotelId);
    }
}
