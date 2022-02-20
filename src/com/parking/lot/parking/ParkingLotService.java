package com.parking.lot.parking;

import com.parking.lot.floors.Floor;

import java.util.List;

public class ParkingLotService {

    public static boolean uniqueParkingName(List<ParkingLot> parkingLotList, String newParking){

        for(ParkingLot p: parkingLotList){
            if(p.getParkingLotName().equals(newParking))
                return false;
        }
        return true;
    }

    public static ParkingLot parkingLotPresent(List<ParkingLot> parkingLotList, String parkingName){

        for(ParkingLot p: parkingLotList){
            if(p.getParkingLotName().equals(parkingName))
                return p;
        }

        return null;
    }


    public static void display(List<ParkingLot> parkingLotList, String parkingName){

        for(ParkingLot p: parkingLotList){
            if(p.getParkingLotName().equals(parkingName))
            {
                List<Floor> floors = p.getFloorList();
            }
        }
    }
}
