package org.traffic.behaviors;

public class Passive implements Behavior {
    public String getBehaviorAtRed(){
        return "Stop";
    }

    public String getBehaviorAtYellow(){
        return "Slower";
    }

    public String getBehaviorAtGreen(){
        return "Go Slow";
    }
}
