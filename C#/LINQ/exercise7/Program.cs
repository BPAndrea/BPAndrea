using System;
using System.Linq;

namespace exercise7
{
    class Program
    {
        static void Main(string[] args)
        {
            //Write a LINQ Expression to find the strings which starts with A and ends with I in the following array:

            string[] cities = { "ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS" };
            //method syntax:
            var methodResult = cities.Where(word => word.StartsWith('A') && word.EndsWith("I"));

            foreach (var item in methodResult)
            {
                System.Console.WriteLine(item);
            }

            //query syntax:
            var queryResult = from city in cities
                              where city.StartsWith("A") && city.EndsWith("I")
                              select city;

            foreach (var item in queryResult)
            {
                System.Console.WriteLine("Query result: " + item);
            }
        }
    }
}
