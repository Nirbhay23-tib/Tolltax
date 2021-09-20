package com.iit;

/**
 * @author tibadiya nirbhay & muaaz patel
 */
public class Vehicle {
    public static int SYSTEMID = 0; //unique system id
    private int vehicleArrivalTime; //time that the vehicle arrives at the toll booth line
    private int vehicleTollBoothTime; //time the vehicle gets to the front of the line
    private int vehicleLeaveTime; //time the vehicle leaves
	int i = 1; //this is the value that the system ID will use


    public Vehicle(int vehicleArrivalTime, int vehicleTollBoothTime, int vehicleLeaveTime) {
        SYSTEMID += i; //increases the id by one everytime a new object is made so each object has a unique id
		i++; //the value of i is increased by 1 so that the next vehicl object will have a different system ID
        this.vehicleArrivalTime = vehicleArrivalTime; //sets the vehicle arrival time
        this.vehicleTollBoothTime = vehicleTollBoothTime; //sets the vehicleTollBoothTime
        this.vehicleLeaveTime = vehicleLeaveTime; //sets the vehicleLeaveTime
        System.out.println("system ID  is:" + SYSTEMID);
    }

    //returns the vehicles' arrival time
    public int getVehicleArrivalTime() {
        return vehicleArrivalTime;
    }

    //sets a new vehicle arrival time
    public void setVehicleArrivalTime(int vehicleArrivalTime) {
        if (vehicleArrivalTime > 0) {
            this.vehicleArrivalTime = vehicleArrivalTime;
        } else {
            this.vehicleArrivalTime = 0;
        }


    }

    //returns the time that the vehicle got to the front of the line
    public int getVehicleTollBoothTime() {
        return vehicleTollBoothTime;
    }

    //sets a new time that the vehicle got to the front of the line
    public void setVehicleTollBoothTime(int vehicleTollBoothTime) {
        if (vehicleTollBoothTime > 0 && vehicleTollBoothTime >= this.vehicleArrivalTime) {
            this.vehicleTollBoothTime = vehicleTollBoothTime;
        } else {
            this.vehicleTollBoothTime = 0;
        }
    }

    //returns the time that the vehicle leaves
    public int getVehicleLeaveTime() {
        return vehicleLeaveTime;
    }

    //sets a new time for when the vehicle leaves
    public void setVehicleLeaveTime(int vehicleLeaveTime) {
        if (vehicleLeaveTime > 0 && vehicleLeaveTime > this.vehicleTollBoothTime) {
            this.vehicleLeaveTime = vehicleLeaveTime;
        } else {
            this.vehicleLeaveTime = 0;
        }
    }


}

