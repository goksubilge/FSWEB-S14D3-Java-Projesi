package com.pasificCarComp.model;

import java.util.Objects;

public class Car {
    private boolean engine ;

    private int cylinders ;

    private String name ;

    private int wheels ;

    public Car(int cylinders,String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
        // set.engine(true);
        // set.wheels(4);
    }
    public int getCylinders() {return cylinders;}

    public String getName() {return name;}

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        /**
          Carcar = (Car) o;
         return cylinders == car.cylinders && Objects.equals(name, car.name);
         */
        return ((Car) o).name.equals(name) && ((Car) o).cylinders == cylinders;
    }
    public String startEngine() {
        System.out.println(" Class Name: "+ getClass().getSimpleName());
        return "the car's engine is starting";
    }
    public String accelerate() {
        System.out.println(" Class Name: "+ getClass().getSimpleName());
        return "the car is accelerating";
    }
    public String brake() {
        System.out.println(" Class Name: "+ getClass().getSimpleName());
        return "the car is braking";
    }
}
