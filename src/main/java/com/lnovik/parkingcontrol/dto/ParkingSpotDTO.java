package com.lnovik.parkingcontrol.dto;


import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSpotDTO {

    @NotNull
    private String parkingSpotNumber;

    @NotNull
    private String responsibleName;

    @NotNull
    private String apartament;

    @NotNull
    private String block;

    @NotNull
    private Boolean spotEspecial;

    @NotNull
    private Integer ageWoner;

    @Valid
    @NotNull
    private CarDTO car;

}
