package com.pasificCarComp.model;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****   TEST   *****");
        Car car = new Car(4,"skeleton:");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println("*******---Pacific Car Company---*******");

        Car carR = new Car(8, "Base car");
        System.out.println(carR.startEngine());
        System.out.println(carR.accelerate());
        System.out.println(carR.brake());


        System.out.println("*****   Mitsubishi   *****");

        Car mitsubishi = new Mitsubishi(6, "Out lander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());


        System.out.println("*****   Ford   *****");

        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());


        System.out.println("*****   Holden   *****");

        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}
