package com.parking.lot.fare.entities;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class Tickets {

    private static final AtomicInteger counter = new AtomicInteger();

    private  int ticketId;
    private LocalDateTime entryTime;
    private int parkingLotId;
    private int floorId;
    private int slotId;
    private int vehicleId;

    public Tickets(LocalDateTime entryTime, int parkingLotId, int floorId, int slotId, int vehicleId) {

        this.ticketId = counter.incrementAndGet();

        this.entryTime = entryTime;
        this.parkingLotId = parkingLotId;
        this.floorId = floorId;
        this.slotId = slotId;
        this.vehicleId = vehicleId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
}
