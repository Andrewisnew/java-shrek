package com.shrek.task00002;

public class Runner implements Comparable<Runner> {

    private String name = "";
    private int time = 0;
    public Runner(String name, int time){
        this.name = name;
        this.time = time;
    }
    public String getName(){
        return name;
    }

    public int getTime() {
        return time;
    }

    public int compareTo(Runner r) {
        return this.time - r.time;
    }
}
