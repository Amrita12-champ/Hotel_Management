package com.emp.demo.hotelservice.impl;

import com.emp.demo.hotelservice.entity.Hotel;
import com.emp.demo.hotelservice.repository.HotelRepo;
import com.emp.demo.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelImpl implements HotelService {
    @Autowired
    private HotelRepo hr;

    @Override
    public List<Hotel> getAllHotels() {
        return hr.findAll();
    }

    @Override
    public Hotel getOneHotel(String id) {
        return hr.findById(id).get();
    }

    @Override
    public Hotel createHotel(Hotel h) {
        String x= UUID.randomUUID().toString();
        h.setId(x);
        return hr.save(h);
    }
}
