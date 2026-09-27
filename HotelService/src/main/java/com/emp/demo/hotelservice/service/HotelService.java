package com.emp.demo.hotelservice.service;

import com.emp.demo.hotelservice.entity.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> getAllHotels();
    Hotel getOneHotel(String id);
    Hotel createHotel(Hotel h);
}
