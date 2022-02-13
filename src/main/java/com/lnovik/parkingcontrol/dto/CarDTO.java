package com.lnovik.parkingcontrol.dto;

import lombok.*;

import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {

    @NotEmpty
    private String modelCar;

    @NotEmpty
    private String brandCar;

    @NotEmpty
    @Size(max = 7)
    private String licensePlateCar;

    @NotEmpty
    private String colorCar;





}
