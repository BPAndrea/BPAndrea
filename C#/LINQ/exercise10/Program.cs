using System;
using System.Collections.Generic;
using System.Linq;

namespace exercise10
{
    class Program
    {
        static void Main(string[] args)
        {
            Fox firstFox = new Fox("Mr.Green", "student", "green");
            Fox secondFox = new Fox("Mr.John", "teacher", "green");
            Fox thirdFox = new Fox("Mr.Kyle", "pallida", "red");
            Fox forthFox = new Fox("Ms.Ashley", "pallida", "green");
            Fox fifthFox = new Fox("Ms.Ann", "student", "brown");
            List<Fox> foxes = new List<Fox>();
            foxes.Add(firstFox);
            foxes.Add(secondFox);
            foxes.Add(thirdFox);
            foxes.Add(forthFox);
            foxes.Add(fifthFox);

            var greenFoxes = foxes.Where(f => f.color.Equals("green"));
            foreach (var item in greenFoxes
            )
            {
                System.Console.WriteLine(item.name);
            }

            var greenPallidaFoxes = foxes.Where(f => f.color == "green" && f.type == "pallida");
            foreach (var item in greenPallidaFoxes)
            {
                System.Console.WriteLine("Green and Pallida: " + item.name);
            }
        }
    }
}
