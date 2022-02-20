package com.parking.lot.fare.entities;

import com.parking.lot.fare.interfaces.fare;
import com.parking.lot.vehicles.Vehicle;

import java.time.LocalDateTime;

public class Fare implements fare {

    @Override
    public int calculateFare(Tickets tickets) {


        LocalDateTime exitTime = LocalDateTime.now();
//        long duration = Vehicle.getDuration();
        return 0;
    }
}
