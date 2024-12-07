package com.withStrategy;

import com.withStrategy.strategy.DriveStrategy;
import com.withStrategy.strategy.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new NormalDriveStrategy());
    }
}
