package com.example.interfaces.impl;

import com.example.interfaces.Vehicle;

public class Car implements Vehicle {
    private boolean isRunning;
    private int currentSpeed;

    @Override
    public void start() {
        isRunning = true;
        System.out.println("Car engine started");
    }

    @Override
    public void stop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Car engine stopped");
    }

    @Override
    public void accelerate(int speed) {
        if (isRunning) {
            currentSpeed += speed;
            System.out.println("Car accelerating to " + currentSpeed + " km/h");
        }
    }

    @Override
    public void brake() {
        currentSpeed = 0;
        System.out.println("Car braking");
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}
