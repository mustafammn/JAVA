package com.syntax.class23.abstraction;

public class VehicleTester {
    public static void main(String[] args) {
        BMW bmw=new BMW("132xl","Sedan",
                "BMW","X5");
bmw.printVehicleCount();
bmw.speed();
bmw.start();
bmw.drive();
bmw.stop();

Vehicle toyota=new Toyota("452ty","Sedan","Toyota","Yaris");
// Break till 2:10

    }
}
