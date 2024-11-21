package org.traffic.behaviors;

public class Normal implements Behavior {
    public String getBehaviorAtRed(){
        return "Stop";
    }

    public String getBehaviorAtYellow(){
        return "Slow";
    }

    public String getBehaviorAtGreen(){
        return "Go";
    }
}
