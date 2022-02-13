package com.lnovik.parkingcontrol.mapper;

import com.lnovik.parkingcontrol.dto.ParkingSpotDTO;
import com.lnovik.parkingcontrol.model.ParkingSpotModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ParkingSpotModelMapper {

    ParkingSpotModelMapper INSTANCE = Mappers.getMapper(ParkingSpotModelMapper.class);

    ParkingSpotModel toModel(ParkingSpotDTO parkingSpotDTO);

    ParkingSpotDTO toDTO(ParkingSpotModel parkingSpotModel);


}
