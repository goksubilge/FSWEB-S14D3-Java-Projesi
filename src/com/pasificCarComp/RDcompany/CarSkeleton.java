package com.pasificCarComp.RDcompany;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

public String startEngine() {
    System.out.println("Class name: " + getClass().getName());
    return getName() + " is driving... ";
}
public String  drive(){
        runEngine(this); // bu sınıf PARENT old. için diğer tüm sınıflar car sınıfını extends edeceği iin hepsi bunun bir alt türü olacak, hepsi this olmaya aday olacak o yüzden aldık bu this'i buraya
        return getName() + " is driving...";
}

/**
 * RUNENGINE her arabda çalışacak, her arabada farklı farklı çalışacak! oyüzden parametre olarak car skeleton koyduk ve istediğim aman farklı şekillere convert ederim.
 *  Burda CLASS CAST EXCEPTION 'dan kaçıyorum.
  */
protected void runEngine(CarSkeleton carSkeleton){
if(carSkeleton instanceof GasPoweredCar) {
    double avgKmPerLitre = ((GasPoweredCar)carSkeleton).getAvgKmPerLitre();
    System.out.println("The car with GAS." + " KM per Lt: " + avgKmPerLitre);
} else if (carSkeleton instanceof HybridCar) {
    int battSize = ((HybridCar)carSkeleton).getBatterySize();
    double avgKmPerLitre = ((HybridCar) carSkeleton).getAvgKmPerLitre(); // carSkeleton.get yazdığında seçeneklerim geliyor zaten !! CAsting 'i otomatik yapabiliyor bu.
    startEngine();
    System.out.println("The car with ELECTRIC  & GAS." + " Battery: " + battSize + " KM per Lt: " + avgKmPerLitre);
} else if (carSkeleton instanceof  ElectricCar) {
    double avgKmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
    int batterySize = ((ElectricCar) carSkeleton).getBatterySize();
    System.out.println("The car with ELECTRIC." + " Battery: " + batterySize + " KM per Charge: " + avgKmPerCharge);
} else {
    System.out.println("CAR TYPE IS NOT VALID");
}
}
}
// aynı hiyerarşik düzende duran sınıfları birbirine cast etmeye çalışırsa : ClassCastException !!
