using System.Collections.Generic;

namespace Inheritance2GFA


{
    public class Cohort
    {
        private string name;
        private List<Student> students;
        private List<Mentor> mentors;

        public Cohort(string name)
        {
            this.name = name;
            students = new List<Student>();
            mentors = new List<Mentor>();
        }

        public void AddStudent(Student student)
        {
            students.Add(student);
        }

        public void AddMentor(Mentor mentor)
        {
            mentors.Add(mentor);
        }

        public void Info()
        {
            System.Console.WriteLine("The {0} cohort has {1} students and {2} mentors.", name, students.Count, mentors.Count);
        }
    }
}