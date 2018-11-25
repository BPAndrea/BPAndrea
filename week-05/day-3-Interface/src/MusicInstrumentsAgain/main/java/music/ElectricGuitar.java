package main.java.music;
//Electric Guitar (6 strings, "Twang")

public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar() {
    this.name = "Electric Guitar";
    this.numberOfStrings = 6;
  }

  public ElectricGuitar(int strings) {
   this();
   this.numberOfStrings = strings;
  }

  @Override
  public String sound() {
    return "Twang";
  }
 }
