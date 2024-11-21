package org.traffic.objects;

import org.traffic.behaviors.Behavior;

public class Truck extends Vehicle {
    public Truck(Behavior behavior) {
        super(behavior);
    }

    @Override
    public void getStatus(){
        System.out.println("Truck currently at " + getTrafficLight() + " and " + getBehavior());
    }
}
