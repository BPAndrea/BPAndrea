package TeacherStudents;

/* Create Student and Teacher classes
                 Student
                 -learn()
                 - question(teacher) -> calls the teachers answer method
                 Teacher
                 -teach(student) -> calls the students learn method
                 - answer()*/
public class Student {
    public void learn() {
        System.out.println("learn");
    }

    public void guestion(Teacher inputTeacher) {
        System.out.println("question");
        inputTeacher.answer();
    }


}
