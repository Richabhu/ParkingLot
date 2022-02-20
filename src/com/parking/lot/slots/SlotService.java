package com.parking.lot.slots;

import com.parking.lot.floors.Floor;

import java.util.ArrayList;
import java.util.List;

public class SlotService {

    public static List<Slot> createSlots(int noOfSlots){

        List<Slot> slots = new ArrayList<>();
        for(int i = 0; i<noOfSlots; i++)
        {
            Slot f = new Slot("slot"+(i+1));
            slots.add(f);
        }
        return slots;
    }

    public static void addSlot(List<Slot> slots, int no){
        //update slot
        int earlierFloorQty = slots.size();
        for(int i = 0; i<no; i++){
            Slot f = new Slot("slot"+(i+earlierFloorQty+1));
            slots.add(f);
        }
    }




}
