package com.lnovik.parkingcontrol.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "CAR_TB")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CAR")
    private UUID id;

    @Column(nullable = false, length = 70)
    private String modelCar;


    @Column(nullable = false, length = 70)
    private String brandCar;

    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;


    @Column(nullable = false, length = 70)
    private String colorCar;






}
