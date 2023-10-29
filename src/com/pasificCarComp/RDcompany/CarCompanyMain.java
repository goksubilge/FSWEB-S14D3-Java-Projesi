package com.pasificCarComp.RDcompany;

public class CarCompanyMain {
    public static void main(String[] args) {
        CarSkeleton ALFAROMEO = new GasPoweredCar("ALFA & ROMEO", "10", 100,4);
        CarSkeleton MD = new HybridCar("MD", "",0.08,100,4);
        CarSkeleton MAZDA = new ElectricCar("MAZDA", "Electric", 10,100);

        System.out.println("*****---- ALFA & ROMEO ----*****");
        System.out.println( ALFAROMEO.drive());;
        System.out.println("*****---- MD ----*****");
        System.out.println( MD.drive());;
        System.out.println("*****---- MAZDA ----*****");
        System.out.println( MAZDA.drive());;

        // ((HybridCar)MAZDA).getAvgKmPerLitre(); // MAZDA ElectricCar sınıfında olduğu için burda hybrid'e convert eteye çalışır. RUNTIME => CAST EXC hatası alırsın !! ElectricCar olarak cast etmelisin dikkat et !  // compiler 'ım hata vermez buna çünkü MAZDA bir CarSkeleton Tipi'dir !

        // DOĞRUSU:
        System.out.println(((ElectricCar)MAZDA).getBatterySize());;

    }
}
