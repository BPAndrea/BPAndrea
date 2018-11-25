package reservation;
/*Create a Reservation class by implementing all the features as required by the interface.
    The booked reservations should look like the output below.
    Please note that the reservation code should contain 8 characters randomly from 0-Z, all uppercase letters.
    String.format acts similarly as System.out.printf(); in the previous exercise, however the string will not be automatically printed.
    Also, the DOW is randomly ordered to the bookings from an array.
    DOW stands for Day of the Week (MON, TUE, etc.)*/

//Booking# 1WBA3OMU for THU
//Booking# 0V5OH7VS for WED

public class Reservation implements Reservationy {
  String name;
  String dowBooking;
  String codeOfBooking;
  String reset = "\u001B[0m"; //Thanks Bali!
  String red = "\u001B[31m"; //Thanks Bali!

  public Reservation() {
    this.name = "Booking#";
    this.dowBooking = getDowBooking();
    this.codeOfBooking = getCodeBooking();
    System.out.println(this.toString());
  }

  public int random(int number) {
    return (int) (Math.random() * number);
  }

  @Override
  public String getDowBooking() {
    int random = random(7);
    return days[random];
  }

  @Override
  public String getCodeBooking() {
    String res = "";
    for (int i = 0; i < 8; i++) {
      int random = random(35);
      res += letters[random];
    }
    return res;
  }

  @Override
  public String toString() {
    return this.name + " " + this.codeOfBooking + red + " for " + reset + this.dowBooking;
  }
}

