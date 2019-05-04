using System;
using System.Linq;

namespace exercise8
{
    class Program
    {
        static void Main(string[] args)
        {
            //Write a LINQ Expression to find the uppercase characters in a string.
            string myString = "SHLAJjskWm";

            //method syntax:
            var methodResult = myString.Where(letter => char.IsUpper(letter));
            foreach (var item in methodResult)
            {
                System.Console.WriteLine(item);
            }

            //query syntax:
            var queryResult = from letter in myString
                              where char.IsUpper(letter)
                              select letter;
            foreach (var item in queryResult)
            {
                System.Console.WriteLine("Query:" + item);
            }

        }
    }
}
