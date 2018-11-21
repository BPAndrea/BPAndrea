package ToDo;

public class ToDo {

    private String name;
    private boolean completed;

    public ToDo(String name) {
      this.name = name;
    }

    public void complete() {
      this.completed = true;
    }

    @Override
    public String toString() {
      return (completed ? "[x] " : "[ ] ") + name;
    }
  }


