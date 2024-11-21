package org.traffic.objects;

import org.traffic.behaviors.Behavior;

public abstract class Vehicle {
    private final Behavior behavior;
    private boolean red;
    private boolean yellow;
    private boolean green;

    public Vehicle(Behavior behavior) {
        this.behavior = behavior;
        red = false;
        yellow = false;
        green = false;
    }

    protected void getTrafficLightUpdate(TrafficLight trafficLight){
        int light = trafficLight.getTrafficLight();

        switch(light){
            case 0:
                red = true;
                yellow = false;
                green = false;
                break;
            case 1:
                red = false;
                yellow = true;
                green = false;
                break;
            case 2:
                red = false;
                yellow = false;
                green = true;
                break;
        }
    }

    protected String getTrafficLight(){
        if(red)
            return "red";
        if(yellow)
            return "yellow";
        return "green";
    }

    protected String getBehavior(){
        if(red)
            return behavior.getBehaviorAtRed();
        if(yellow)
            return behavior.getBehaviorAtYellow();
        return behavior.getBehaviorAtGreen();
    }

    public void getStatus(){
        System.out.println("Vehicle currently at " + getTrafficLight() + " and " + getBehavior());
    }
}
