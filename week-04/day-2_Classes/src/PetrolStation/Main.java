package PetrolStation;

public class Main {
    public static void main(String[] args) {
        Car sampleCar=new Car(0,100);
        Station station=new Station();
        station.gasAmount=400;
        station.refill(sampleCar);

    }
}
