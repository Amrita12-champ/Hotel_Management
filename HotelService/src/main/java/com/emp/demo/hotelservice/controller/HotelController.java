package com.emp.demo.hotelservice.controller;

import com.emp.demo.hotelservice.entity.Hotel;
import com.emp.demo.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
     private HotelService hs;

    @GetMapping
    public ResponseEntity<List<Hotel>> getAll(){
        List<Hotel> allHotels =hs.getAllHotels();
        return ResponseEntity.status(HttpStatus.OK).body(allHotels);
    }

    @GetMapping("/oneHotel/{id}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String id){
        Hotel hotel =hs.getOneHotel(id);
        return ResponseEntity.status(HttpStatus.OK).body(hotel);
    }

    @PostMapping
    public  ResponseEntity<Hotel> create(@RequestBody Hotel h){
       Hotel h1 =hs.createHotel(h);
        return  ResponseEntity.status(HttpStatus.CREATED).body(h1);
    }

}
