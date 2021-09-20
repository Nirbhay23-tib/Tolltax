package com.iit;

import java.util.Scanner;

public class VehicleClient {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in); //scanner required for user inputs
        Vehicle obj = new Vehicle(1, 2, 3); //creates the first vehicle object
        System.out.println("Enter arrival time:");
        obj.setVehicleArrivalTime(in.nextInt()); //sets the vehicle arrival time as the users next input
        System.out.println("The vehicles arrival time is: " + obj.getVehicleArrivalTime());   // toString method used
        System.out.println("Enter the time when the vehicle reached the front of the line:");
        obj.setVehicleTollBoothTime(in.nextInt()); //sets the vehicle toll booth time as the users next input
        System.out.println(obj.getVehicleTollBoothTime());
        System.out.println("Enter the time that the vehicle left:");
        obj.setVehicleLeaveTime(in.nextInt()); //sets the vehicles leaving time as the users next input
        System.out.println(obj.getVehicleLeaveTime());
        //Integer.toString method used
        System.out.println("This vehicle arrived at: " + Integer.toString(obj.getVehicleArrivalTime()) + ", it reached the front of the line at: " + Integer.toString(obj.getVehicleTollBoothTime()) + ", and it left at: " + Integer.toString(obj.getVehicleLeaveTime()) + "."); //prints out the arrival, toll boot, and leaving times for this vehicle object

        Vehicle obj1 = new Vehicle(1, 2, 3); //creates the second vehicle object
        System.out.println("Enter arrival time:");
        obj1.setVehicleArrivalTime(in.nextInt()); //sets the vehicle arrival time as the users next input
        System.out.println("The vehicles arrival time is: " + Integer.toString(obj1.getVehicleArrivalTime()));   // toString method used
        System.out.println("Enter the time when the vehicle reached the front of the line:");
        obj1.setVehicleTollBoothTime(in.nextInt()); //sets the vehicle toll booth time as the users next input
        System.out.println(obj1.getVehicleTollBoothTime());
        System.out.println("Enter the time that the vehicle left:");
        obj1.setVehicleLeaveTime(in.nextInt()); //sets the vehicles leaving time as the users next input
        System.out.println(obj1.getVehicleLeaveTime());
      //Integer.toString method used
        System.out.println("This vehicle arrived at: " + Integer.toString(obj1.getVehicleArrivalTime()) + ", it reached the front of the line at: " + Integer.toString(obj1.getVehicleTollBoothTime()) + ", and it left at: " + Integer.toString(obj1.getVehicleLeaveTime()) + "."); //prints out the arrival, toll boot, and leaving times for this vehicle object
    }

}
