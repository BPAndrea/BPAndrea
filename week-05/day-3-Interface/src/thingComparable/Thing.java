package thingComparable;
/*Make your Todo class implement Comparable
    It should compare the completed field first
    Then the description
    Or if you haven't got a separate Todo class, or it doesn't contain fields like description and completed, use your Thing class*/
public class Thing implements Comparable<Thing> {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing other) {
    if (this.completed && !other.completed)
      return -1;
    else if (this.completed == other.completed)
      return (this.name.compareTo(other.name));
    else
      return 1;
  }
}

