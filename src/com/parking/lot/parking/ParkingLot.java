package com.parking.lot.parking;

import com.parking.lot.floors.Floor;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ParkingLot {

    private static final AtomicInteger counter = new AtomicInteger();

    private int parkingLotId;
    private String parkingLotName;
    private int noOfFloors;
    private List<Floor> floorList;

    public ParkingLot(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public String getParkingLotName() {
        return parkingLotName;
    }

    public void setParkingLotName(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    public List<Floor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<Floor> floorList) {
        this.floorList = floorList;
    }
}
