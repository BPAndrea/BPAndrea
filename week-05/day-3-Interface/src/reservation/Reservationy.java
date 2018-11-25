package reservation;

public interface Reservationy {
  public String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  public String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

  String getDowBooking();

  String getCodeBooking();
}

