package com.example.interfaces;

public interface Vehicle {
    void start();
    void stop();
    void accelerate(int speed);
    void brake();
    String getVehicleType();
}
