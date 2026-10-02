package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Rating;

public interface RatingService {
	
	//create
	Rating create(Rating r);
	
	//get all ratings
	List<Rating> getAllRatings();
	
	
	//get all by user id
	List<Rating> getRatingByUserId(String userId);
	
	
	//get all by hotel
	List<Rating> getRatingByHotelId(String hotelId);
	
}
