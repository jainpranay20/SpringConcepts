package com.withStrategy.strategy;

import com.withStrategy.strategy.DriveStrategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports drive capability");
    }
}
