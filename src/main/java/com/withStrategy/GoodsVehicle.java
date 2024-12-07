package com.withStrategy;

import com.withStrategy.strategy.DriveStrategy;
import com.withStrategy.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    //is a call to the constructor of the superclass Vehicle from the subclass PassengerVehicle.
    //In this case, it is calling the Vehicle constructor and passing
    // a specific DriveStrategy instance (new XyzDriveStrategy()) to it.

    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
