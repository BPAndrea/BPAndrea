namespace Inheritance2GFA
{
    public class Student : Person
    {
        private string previousOrganization;
        private int skippedDays;

        public Student(string name, int age, string gender, string previousOrganization) : base(name, age, gender)
        {
            this.previousOrganization = previousOrganization;
            this.skippedDays = 0;
        }

        public Student()
        {
            this.previousOrganization = "The School of Life";
            this.skippedDays = 0;
        }

        public override void GetGoal()
        {
            System.Console.WriteLine("My goal is: Be a junior software developer.");
        }

        public override void Introduce()
        {
            System.Console.WriteLine($"Hi, I'm {Name} a {Age} year old {Gender} from {previousOrganization} who skipped {skippedDays} days from the course already.");
        }

        public void SkipDays(int numberOfDays)
        {
            skippedDays += numberOfDays;
        }
    }
}