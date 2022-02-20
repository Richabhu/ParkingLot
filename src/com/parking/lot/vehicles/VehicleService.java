package com.parking.lot.vehicles;

import com.parking.lot.fare.entities.Tickets;
import com.parking.lot.floors.Floor;
import com.parking.lot.parking.ParkingLot;
import com.parking.lot.slots.Slot;

import java.util.List;

public class VehicleService {

    public static void assignVehicle(ParkingLot parkingLot, Vehicle vehicle){

        List<Floor> floors = parkingLot.getFloorList();

        for(Floor f: floors){

            if(!f.isFull()){
                List<Slot> slots = f.getSlots();

                for(Slot s: slots){
                    if(s.isFree()){
                        s.setFree(false);
                        s.setVehicle(vehicle);
                        vehicle.setSlotId(s.getSlotId());

                        f.addSlot();
                        System.out.println("Assigned vehicle to slot " + s.getSlotName() + " on floor "+ f.getFloorName());
                        return;
                    }
                }
            }
        }
        System.out.println("Sorry! Parking lot is full");

    }


    public static void removeVehicle(Vehicle vehicle, List<Tickets> tickets){
        //todo: need to calculate fare and remove it from slot

    }
}
