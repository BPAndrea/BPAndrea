using System;
using System.Linq;

namespace exercise5
{
    class Program
    {
        static void Main(string[] args)
        {
            //Write a LINQ Expression to find the frequency of numbers in the following array:
            int[] n = new int[] { 5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2 };
            //method syntax:

            var methodResult = n.GroupBy(number => number);
            foreach (var item in methodResult)
            {
                System.Console.WriteLine($"{item.Key}:  {item.Count()}");
            }

            //query syntax:
            var queryResult = from num in n
                              group num by num into g
                              select new { Count = g.Count(), Key = g.Key };
            foreach (var item in queryResult)
            {
                System.Console.WriteLine("Query: " + item.Key + ": " + item.Count);
            }

        }
    }
}
