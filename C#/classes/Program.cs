using System;

namespace classes
{
    class Program
    {
        static void Main(string[] args)
        {
            //PostIt:
            PostIt first = new PostIt();
            first.BackgroundColor = "orange";
            first.Text = "Idea 1";
            first.TextColor = "blue";
            PostIt second = new PostIt("pink", "Awesome", "black");

            first.PrintFields();
            second.PrintFields();

            //BlogPost:
            BlogPost myFirstPost = new BlogPost("John Doe", "Lorem Ipsum", "Bla -bla-bla", new DateTime(2000, 05, 20));
            myFirstPost.PrintPostFields();

            //Animal:
            System.Console.WriteLine("Animal Farm:");
            Farm myFarm = new Farm();
            Animal myFirstAnimal = new Animal();
            Animal mySecondAnimal = new Animal();
            Animal third = new Animal();
            myFarm.Add(myFirstAnimal);
            myFarm.Add(mySecondAnimal);
            myFarm.Add(third);
            myFirstAnimal.Eat();
            myFirstAnimal.Eat();
            myFirstAnimal.Eat();
            myFirstAnimal.Eat();
            System.Console.WriteLine(myFirstAnimal.Hunger);
            myFirstAnimal.Drink();
            System.Console.WriteLine(myFirstAnimal.Thirst);
            myFirstAnimal.Play();
            System.Console.WriteLine(myFirstAnimal.Hunger);
            System.Console.WriteLine(myFirstAnimal.Thirst);
            myFarm.Breed();
            myFarm.Breed();
            myFarm.Breed();
            myFarm.Breed();
            myFarm.Slaughter();

            //Counter:
            System.Console.WriteLine("Counter task:");
            Counter myFirstCounter = new Counter();
            Counter mySecondCounter = new Counter(54);
            myFirstCounter.Add();
            mySecondCounter.Add();
            System.Console.WriteLine(myFirstCounter.Value);
            System.Console.WriteLine(mySecondCounter.Value);
            myFirstCounter.Add(10);
            mySecondCounter.Add(10);
            System.Console.WriteLine(myFirstCounter.Get());
            System.Console.WriteLine(mySecondCounter.Get());
            myFirstCounter.Reset();
            mySecondCounter.Reset();
            System.Console.WriteLine(myFirstCounter.Get());
            System.Console.WriteLine(mySecondCounter.Get());

        }

        public struct PostIt
        {
            public string BackgroundColor { get; set; }
            public string Text { get; set; }
            public string TextColor { get; set; }

            public PostIt(string BackgroundColor, string Text, string TextColor)
            {
                this.BackgroundColor = BackgroundColor;
                this.Text = Text;
                this.TextColor = TextColor;
            }

            public void PrintFields()
            {
                string output = string.Format("Background color: {0}, Text: {1}, Textcolor: {2}", BackgroundColor, Text, TextColor);
                System.Console.WriteLine(output);
            }
        }
    }
}
