package com.lnovik.parkingcontrol.controller;

import com.lnovik.parkingcontrol.dto.ParkingSpotDTO;
import com.lnovik.parkingcontrol.model.ParkingSpotModel;
import com.lnovik.parkingcontrol.service.ParkingSpotService;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.Utilities;
import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class ParkingSportController {

    final ParkingSpotService parkingSpotService;

    public ParkingSportController(ParkingSpotService parkingSpotService) {
        this.parkingSpotService = parkingSpotService;
    }

    @PostMapping
    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotDTO parkingSpotDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotService.save(parkingSpotDTO));
    }








}





