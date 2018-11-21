package main.java.music;

//Electric Guitar, a 6-stringed instrument that goes Twang
public class ElectricGuitar extends StringedInstrument {

  ElectricGuitar() {
    this.setName("Electric Guitar");
    this.numberOfStrings = 6;
   }

  public ElectricGuitar(int numberOfStrings) {
    this();
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public void sound() {
    System.out.print("Twang");
  }

  public void play() {
    System.out.print(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes ");
    this.sound();
    System.out.println();
  }
}
