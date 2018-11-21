package main.java.music;

/*it reserves (e.g. protected) the name of the instrument
    it should provide a play() method.*/
abstract public class Instrument {
  protected String name;

  public void play() {
  }

  public void setName(String name) {
    this.name = name;
  }
}
