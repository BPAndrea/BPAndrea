using System;
using System.Collections.Generic;

namespace listIntroduction1
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> names = new List<string>();
            System.Console.WriteLine(names.Count);
            names.Add("William");
            if (names.Count == 0)
            {
                System.Console.WriteLine("The names list is empty");
            }
            else
            {
                System.Console.WriteLine("The names list is not empty.");
            }
            names.Add("John");
            names.Add("Amanda");
            System.Console.WriteLine("The number of elements in the list: " + names.Count);
            System.Console.WriteLine($"The 3rd element in the list: {names[2]}");
            foreach (string item in names)
            {
                System.Console.WriteLine(item);
            }
            for (int i = 0; i < names.Count; i++)
            {
                System.Console.WriteLine((i + 1) + "." + names[i]);
            }
            names.RemoveAt(1);
            for (int i = names.Count - 1; i >= 0; i--)
            {
                System.Console.WriteLine(names[i]);
            }
            for (int i = names.Count - 1; i >= 0; i--)
            {
                names.RemoveAt(i);
            };
            System.Console.WriteLine(names.Count);
        }
    }
}
