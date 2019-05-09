namespace Inheritance2GFA
{
    public class Person
    {
        private string name;
        private int age;
        private string gender;
        public Person(string name, int age, string gender)
        {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
        public Person()
        {
            this.name = "Jane Doe";
            this.age = 30;
            this.gender = "female";
        }

        public string Name
        {
            get
            {
                return name;
            }
        }

        public int Age
        {
            get
            {
                return age;
            }
        }

        public string Gender
        {
            get
            {
                return gender;
            }
        }

        public virtual void Introduce()
        {
            System.Console.WriteLine($"Hi, I'm {name}, a {age} year old {gender}.");
        }

        public virtual void GetGoal()
        {
            System.Console.WriteLine("My goal is: Live for the moment!");
        }
    }
}