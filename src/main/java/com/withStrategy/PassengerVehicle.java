package com.withStrategy;

import com.withStrategy.strategy.NormalDriveStrategy;
import com.withStrategy.strategy.XyzDriveStrategy;

public class PassengerVehicle extends Vehicle {

    PassengerVehicle(){
        super(new XyzDriveStrategy());
    }
}
