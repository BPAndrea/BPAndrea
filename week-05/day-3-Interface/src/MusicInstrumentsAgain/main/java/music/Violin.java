package main.java.music;

//Violin (4 strings, "Screech")*/
public class Violin extends StringedInstrument {
  public Violin() {
    this.name = "Violin";
    this.numberOfStrings = 4;
  }

  public Violin(int strings) {
    this();
    this.numberOfStrings = strings;
  }

  @Override
  public String sound() {
    return "Screech";
  }
}
