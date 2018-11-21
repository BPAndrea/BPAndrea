package GreenFoxOrganisation;
/*Create a Student class that has the same fields and methods as the Person class, and has the following additional
    fields:
    previousOrganization: the name of the student’s previous company / school
    skippedDays: the number of days skipped from the course

    methods:
    getGoal(): prints out "Be a junior software developer."
    introduce(): "Hi, I'm name, a age year old gender from previousOrganization who skipped skippedDays days from the course already."
    skipDays(numberOfDays): increases skippedDays by numberOfDays

    The Student class has the following constructors:
    Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
    Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0*/

public class Student extends Person implements Cloneable {
  String previousOrganization;
  int skippedDays;

  Student() {
    super();
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public void getGoal() {
    System.out.println("\nBe a junior software developer.");
  }

  public void introduce() {
    super.introduce();
    System.out.print(" from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    numberOfDays++;
  }
/*
  Every Object has a clone() method, so all of your classes, even though the implementation is empty, it doesn't do anything
  Get your Student class from the Greenfox Organization Exercise
      Override and implement the clone() method, so it clones the student
  Instantiate John, a 20 years old male from BME
  Clone him into jonhTheClone
*/

  public Student clone() {
    //Student copy = new Student(inputStud.name, inputStud.age, inputStud.gender, inputStud.previousOrganization);
    return this;
  }
}


