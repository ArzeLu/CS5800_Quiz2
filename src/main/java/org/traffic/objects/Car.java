package org.traffic.objects;

import org.traffic.behaviors.Behavior;

public class Car extends Vehicle {
   public Car(Behavior behavior) {
       super(behavior);
   }

   @Override
   public void getStatus(){
       System.out.println("Car currently at " + getTrafficLight() + " and " + getBehavior());
   }
}
