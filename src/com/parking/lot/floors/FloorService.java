package com.parking.lot.floors;

import java.util.ArrayList;
import java.util.List;

public class FloorService {

    public static List<Floor> createFloors(int noOfFloors){

        List<Floor> floors = new ArrayList<>();
        for(int i = 0; i<noOfFloors; i++)
        {
            Floor f = new Floor("floor"+(i+1));
            floors.add(f);
        }
        return floors;
    }

    public static void addFloor(List<Floor> floors, int no){
        //update floor
        int earlierFloorQty = floors.size();
        for(int i = 0; i<no; i++){
            Floor f = new Floor("floor"+(i+earlierFloorQty+1));
            floors.add(f);
        }
    }

    public static Floor floorPresent(List<Floor> floors, String floorName){

        for(Floor f: floors){
            if(f.getFloorName().equals(floorName)){
                return f;
            }
        }
        return null;
    }


}
