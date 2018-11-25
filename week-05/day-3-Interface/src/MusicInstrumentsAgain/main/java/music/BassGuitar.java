package main.java.music;

//Bass Guitar (4 strings, "Duum-duum-duum")
public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    this.name = "Bass Guitar";
    this.numberOfStrings = 4;
  }

  public BassGuitar(int strings) {
    this();
    this.numberOfStrings = strings;
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }
}
