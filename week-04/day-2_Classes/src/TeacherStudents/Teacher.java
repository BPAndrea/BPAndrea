package TeacherStudents;

/* Create Student and Teacher classes
                 Student
                 -learn()
                 - question(teacher) -> calls the teachers answer method
                 Teacher
                 -teach(student) -> calls the students learn method
                 - answer()*/
public class Teacher {
  public void teach(Student inputStudent) {
    System.out.println("teach");
    inputStudent.learn();

  }

  public void answer() {
    System.out.println("answer");
  }
}

