using System;
using System.Linq;

namespace exercise3
{
    class Program
    {
        static void Main(string[] args)
        {
            //3. Write a LINQ Expression to get the squared value of the positive numbers from the following array:
            int[] n = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };

            //method syntax
            var methodResult = n.Where(number => number > 0).Select(number => number * number);
            foreach (var item in methodResult)
            {
                System.Console.WriteLine(item);
            }

            //query syntax
            var queryResult = from number in n
                              where number > 0
                              select number * number;

            foreach (var item in queryResult)
            {
                System.Console.WriteLine("q " + item);
            }
        }
    }
}
