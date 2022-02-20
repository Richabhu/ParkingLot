package com.parking.lot.floors;

import com.parking.lot.slots.Slot;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Floor {
    private static final AtomicInteger counter = new AtomicInteger();

    private int floorId;
    private String floorName;
    private int noOfSlot;
    private int noOfAssignedSlot;
    private boolean isFull;
    private List<Slot> slots;


    public Floor(String floorName)
    {
        floorId = counter.incrementAndGet();
        floorName = floorName;
        isFull = false;
        noOfAssignedSlot = 0;
    }

    public Floor(int noOfSlot, List<Slot> slots) {
        floorId = counter.incrementAndGet();
        this.noOfSlot = noOfSlot;
        this.slots = slots;
        isFull = false;
        noOfAssignedSlot = 0;
    }

    public int getNoOfAssignedSlot() {
        return noOfAssignedSlot;
    }

    public void setNoOfAssignedSlot(int noOfAssignedSlot) {
        this.noOfAssignedSlot = noOfAssignedSlot;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public int getNoOfSlot() {
        return noOfSlot;
    }

    public void setNoOfSlot(int noOfSlot) {
        this.noOfSlot = noOfSlot;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }

    public void addSlot(){
        this.noOfAssignedSlot++;
        if(this.noOfAssignedSlot == this.noOfSlot)
            this.isFull = true;
    }

    public void removeSlot(){
        this.noOfAssignedSlot--;
        this.isFull = false;
    }

}
