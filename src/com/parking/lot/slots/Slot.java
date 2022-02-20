package com.parking.lot.slots;

import com.parking.lot.vehicles.Vehicle;

import java.util.concurrent.atomic.AtomicInteger;

public class Slot {

    private static final AtomicInteger counter = new AtomicInteger();

    private int slotId;
    private String slotName;
    private boolean isFree;
    private Vehicle vehicle;

    public Slot(String slotName) {

        slotId = counter.incrementAndGet();
        this.slotName = slotName;
        this.isFree = true;
    }

    public Slot(Vehicle vehicle, boolean isFree){
        slotId = counter.incrementAndGet();
        isFree = isFree;
        this.vehicle = vehicle;
    }

    public String getSlotName() {
        return slotName;
    }

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
