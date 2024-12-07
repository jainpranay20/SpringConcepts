package com.withStrategy;

import com.withStrategy.strategy.SportsDriveStrategy;
import com.withStrategy.strategy.XyzDriveStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
