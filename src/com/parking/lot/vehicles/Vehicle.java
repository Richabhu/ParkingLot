package com.parking.lot.vehicles;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Vehicle {

    private static final AtomicInteger counter = new AtomicInteger();

    private int vehicleId;
    private String vehicleNo;
    private String vehicleName;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private int slotId;


    public Vehicle(String vehicleNo, String vehicleName, LocalDateTime entryTime){
        this.vehicleId = counter.incrementAndGet();

        vehicleNo= vehicleNo;
        vehicleName = vehicleName;
        entryTime = entryTime;

    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public int getSlotId() {
        return slotId;
    }



    public void setSlotId(int slotId){
        this.slotId = slotId;
    }

    public void setExitTime(LocalDateTime exitTime)
    {
        this.exitTime = exitTime;
    }

    public long getDuration()
    {
        long minutes = ChronoUnit.MINUTES.between(this.exitTime, this.entryTime);
        long hours = ChronoUnit.HOURS.between(this.exitTime, this.entryTime);
        return hours;
    }



}
