package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Rating;
import com.example.demo.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	
	@Autowired
	private RatingService rs;
	
	@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating r){
		return ResponseEntity.status(HttpStatus.CREATED).body(rs.create(r));
	}
	
	@GetMapping
	public ResponseEntity<List<Rating>> getAllRatings(){
		return ResponseEntity.status(HttpStatus.CREATED).body(rs.getAllRatings());
	}
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getAllRatingsbyUserId(@PathVariable String userId){
		return ResponseEntity.status(HttpStatus.CREATED).body(rs.getRatingByUserId(userId));
	}
	
	
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getAllRatingsByHotelId(@PathVariable String hotelId){
		return ResponseEntity.status(HttpStatus.CREATED).body(rs.getRatingByHotelId(hotelId));
	}
}
