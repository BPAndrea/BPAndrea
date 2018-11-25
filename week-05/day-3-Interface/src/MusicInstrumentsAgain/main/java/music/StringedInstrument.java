package main.java.music;
/*Next, we add another abstract class, StringedInstrument which extends Instrument. It
    introduces numberOfStrings and
    sound() method what's implementation is yet unknown
    but with the help of the sound() the play() method is fully implementable

    StingedInstrument has 3 descendants, namely:-
Electric Guitar (6 strings, "Twang")
Bass Guitar (4 strings, "Duum-duum-duum")
Violin (4 strings, "Screech")*/

public abstract class StringedInstrument extends Instrument{
  int numberOfStrings;

  abstract public String sound();

  @Override
  public void play() {
    System.out.println(this.name+ ", a " + this.numberOfStrings+ "-stringed instrument that goes " + this.sound());
  }
}
