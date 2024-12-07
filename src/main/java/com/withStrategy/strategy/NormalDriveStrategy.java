package com.withStrategy.strategy;

import com.withStrategy.strategy.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("normal drive capability");
    }
}
