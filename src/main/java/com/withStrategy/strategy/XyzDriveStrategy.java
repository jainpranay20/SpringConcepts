package com.withStrategy.strategy;

public class XyzDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Xyz capability");
    }
}
