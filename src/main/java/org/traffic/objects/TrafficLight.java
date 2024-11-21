package org.traffic.objects;

import java.util.ArrayList;
import java.util.Random;

public class TrafficLight {
    private static TrafficLight trafficLight;
    private final ArrayList<Vehicle> vehicles;
    private boolean red;
    private boolean yellow;
    private boolean green;

    private TrafficLight(){
        Random random = new Random();
        vehicles = new ArrayList<>();

        red = false;
        yellow = false;
        green = false;

        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        switchLights();
                        notifyObservers();
                    }
                },
                random.nextInt(100, 500)
        );
    }

    public static TrafficLight getInstance(){
        if(trafficLight == null){
            trafficLight = new TrafficLight();
        }
        return trafficLight;
    }

    public void activateRed(){
        red = true;
        yellow = false;
        green = false;
    }

    public void activateYellow(){
        yellow = true;
        red = false;
        green = false;
    }

    public void activateGreen(){
        green = true;
        red = false;
        yellow = false;
    }

    public void switchLights(){
        if(red)
            activateGreen();
        if(yellow)
            activateRed();
        if(green)
            activateYellow();
    }

    public int getTrafficLight(){
        if(red)
            return 0;
        if(yellow)
            return 1;
        return 2;
    }

    // This class also handle printing out the traffic light status of each vehicle
    private void notifyObservers(){
        for(Vehicle vehicle : vehicles){
            vehicle.getTrafficLightUpdate(trafficLight);
            vehicle.getStatus();
        }
        System.out.println();
    }

    public void attachObserver(Vehicle vehicle){
        vehicles.add(vehicle);
    }
}
