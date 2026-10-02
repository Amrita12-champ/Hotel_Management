package com.example.demo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Rating;
import com.example.demo.repository.RatingRepo;
import com.example.demo.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {
	
	@Autowired
	private RatingRepo rr;

	@Override
	public Rating create(Rating r) {
		// TODO Auto-generated method stub
		return rr.save(r);
	}

	@Override
	public List<Rating> getAllRatings() {
		// TODO Auto-generated method stub
		return rr.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return rr.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return rr.findByHotelId(hotelId);
	}

}
