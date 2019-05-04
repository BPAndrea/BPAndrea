using System;
using System.Linq;

namespace exercise1
{
    class Program
    {
        static void Main(string[] args)
        {
            //Write a LINQ Expression to get the even numbers from the following array:
            int[] n = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };

            //method syntax
            var evenNumbers = n.Where(number => number % 2 == 0);
            foreach (var item in evenNumbers)
            {
                Console.WriteLine(item);
            }

            //query syntax
            var queryResult = from number in n
                              where number % 2 == 0
                              select number;
            foreach (var item in queryResult)
            {
                Console.WriteLine(item);
            }
        }
    }
}
