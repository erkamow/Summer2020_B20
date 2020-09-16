package day54_Abstract.CarTask;

public class ParkingLot {

    public static void main(String[] args) {

        BMW bmw = new BMW();
        Jeep jeep = new Jeep();
        Tesla tesla = new Tesla();

        bmw.start();
        jeep.start();
        tesla.start();
    }
}
