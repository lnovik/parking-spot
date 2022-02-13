package com.lnovik.parkingcontrol.service;

import com.lnovik.parkingcontrol.dto.ParkingSpotDTO;
import com.lnovik.parkingcontrol.mapper.ParkingSpotModelMapper;
import com.lnovik.parkingcontrol.model.ParkingSpotModel;
import com.lnovik.parkingcontrol.repository.ParkingSpotRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.ZoneId;


@Service
public class ParkingSpotService {

   private final ParkingSpotRepository parkingSpotRepository;

    private final ParkingSpotModelMapper parkingSpotModelMapper = ParkingSpotModelMapper.INSTANCE;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }


    @Transactional
    public ParkingSpotModel save(ParkingSpotDTO parkingSpotDTO) {
        ParkingSpotModel saveParkingSpotModel = parkingSpotModelMapper.toModel(parkingSpotDTO);
        saveParkingSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        ParkingSpotModel parkingSpotModelSave = parkingSpotRepository.save(saveParkingSpotModel);
        return parkingSpotModelSave;
    }


}



