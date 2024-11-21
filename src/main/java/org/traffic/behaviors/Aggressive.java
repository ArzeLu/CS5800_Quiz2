package org.traffic.behaviors;

public class Aggressive implements Behavior {
    public String getBehaviorAtRed(){
        return "Slam Brake";
    }

    public String getBehaviorAtYellow(){
        return "Faster";
    }

    public String getBehaviorAtGreen(){
        return "Need4Speed";
    }
}
