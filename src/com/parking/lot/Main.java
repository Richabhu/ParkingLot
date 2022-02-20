package com.parking.lot;

import com.parking.lot.fare.entities.Tickets;
import com.parking.lot.floors.Floor;
import com.parking.lot.floors.FloorService;
import com.parking.lot.parking.ParkingLot;
import com.parking.lot.parking.ParkingLotService;
import com.parking.lot.slots.Slot;
import com.parking.lot.slots.SlotService;
import com.parking.lot.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter commands");

         List<ParkingLot> parkingLots = new ArrayList<>();

         List<Floor> floors = new ArrayList<>();
        List<Slot> slot = new ArrayList<>();

        List<Tickets> tickets = new ArrayList<>();
        List<Vehicle> vehicles = new ArrayList<>();


        while(true){

            String inputs  = sc.nextLine();
            String input[] = inputs.split(" ");

            String cmd = input[0];
            if(cmd.equals("add")){

                String cmd1 = input[1];

                if(cmd1.equals("parking_lot")){
                    //todo: assign parking lot
                    if(!ParkingLotService.uniqueParkingName(parkingLots, input[2])){
                        System.out.println("Parking Lot already entered. Please select different name.");
                        continue;
                    }
                    ParkingLot p = new ParkingLot(input[2]);
                    parkingLots.add(p);
                    System.out.println("Parking Lot Added in the system");
                }

                else if(cmd1.equals("floor")){
                    //todo: assign floor
                    String parkingName = input[2];
                    String noOfFloor = input[3];
                    ParkingLot parkingLot = ParkingLotService.parkingLotPresent(parkingLots, parkingName);
                    if(parkingLot != null){
                        //parking present
                        parkingLot.setNoOfFloors(Integer.parseInt(noOfFloor));
                        List<Floor> floorList = FloorService.createFloors(Integer.parseInt(noOfFloor));
                        parkingLot.setFloorList(floorList);
                        System.out.println("Floors added to parking system.");
                    }
                    else{
                        System.out.println("Parking lot is not present in the system. Please enter it!");
                    }
                }
                else if(cmd1.equals("slot")){
                    //todo: assign slots
                    String parkingName = input[2];
                    String floorName = "floor"+input[3];
                    String noOfSlot = input[4];

                    ParkingLot parkingLot = ParkingLotService.parkingLotPresent(parkingLots, parkingName);

                    if(parkingLot != null){
                        // todo: correct parking lot name entered
                        Floor floor = FloorService.floorPresent(parkingLot.getFloorList(), floorName);
                        if(floor != null)
                        {
                            //todo: floor present, assign slot
                            floor.setNoOfSlot(Integer.parseInt(noOfSlot));
                            List<Slot> slots = SlotService.createSlots(Integer.parseInt(noOfSlot));
                            floor.setSlots(slots);
                        }
                        else{
                            System.out.println("Floor no " + input[2]+ "is not  present in parking  "+parkingName);
                        }
                    }
                    else{
                        System.out.println("Parking lot with name "+ parkingName +" doesn't exist.");
                    }


                }
                else{
                    System.out.println("Invalid Input entered");
                }
            }
            else if(cmd.equals("assign")){
                //todo: leave parking lot
            }
            else if(cmd.equals("leave")){
                //todo: leave parking lot
            }
            else if(cmd.equals("status")){
                //todo: show status of display
            }
            else if(cmd.equals("cars_with_white_color")){
                //todo: display all cars with white color
            }
            else if(cmd.equals("EXIT") || cmd.equals("exit"))
                return;
            else
                System.out.println("Invalid input");
        }



    }
}
