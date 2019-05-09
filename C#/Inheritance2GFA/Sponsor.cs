namespace Inheritance2GFA
{
    public class Sponsor : Person
    {
        private string company;
        private int hiredStudents;

        public Sponsor(string name, int age, string gender, string company) : base(name, age, gender)
        {
            this.company = company;
            this.hiredStudents = 0;
        }
        public Sponsor()
        {
            this.company = "Google";
            this.hiredStudents = 0;
        }

        public override void Introduce()
        {
            System.Console.WriteLine($"Hi, I'm {Name}, a {Age} year old {Gender} who represents {company} and hired {hiredStudents} students so far.");
        }

        public override void GetGoal()
        {
            System.Console.WriteLine("My goal is: Hire brilliant junior software developers.");
        }

        public void Hire()
        {
            hiredStudents++;
        }
    }
}