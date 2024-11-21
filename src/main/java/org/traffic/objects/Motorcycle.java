package org.traffic.objects;

import org.traffic.behaviors.Behavior;

public class Motorcycle extends Vehicle {
    public Motorcycle(Behavior behavior) {
        super(behavior);
    }

    @Override
    public void getStatus(){
        System.out.println("Motorcycle currently at " + getTrafficLight() + " and " + getBehavior());
    }
}
