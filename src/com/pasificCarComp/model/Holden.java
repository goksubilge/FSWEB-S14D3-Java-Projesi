package com.pasificCarComp.model;

public class Holden extends  Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        super.startEngine();
        return getName() + " engine is starting";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return getName() + "is eccelerating";
    }

    @Override
    public String brake() {
        super.brake();
        return getName() + " is breaking ";
    }
}
