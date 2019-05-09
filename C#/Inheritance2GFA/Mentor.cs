namespace Inheritance2GFA
{
    public class Mentor : Person
    {
        private string level;
        public Mentor(string name, int age, string gender, string level) : base(name, age, gender)
        {
            this.level = level;
        }

        public Mentor()
        {
            this.level = "intermediate";
        }
        public override void GetGoal()
        {
            System.Console.WriteLine("My goal is: Educate brilliant junior software developers.");
        }

        public override void Introduce()
        {
            System.Console.WriteLine($"Hi, I'm {Name} a {Age} year old {Gender} {level} mentor.");
        }
    }
}