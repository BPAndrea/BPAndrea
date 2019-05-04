using System;
using System.Linq;


namespace exercise4
{
    class Program
    {
        static void Main(string[] args)
        {
            //Write a LINQ Expression to find which number squared value is more then 20 from the following array:
            int[] n = new[] { 3, 9, 2, 8, 6, 5 };

            //method syntax
            var methodResult = n.Where(number => number * number > 20);
            //squared values as result:
            //var methodResult = n.Where(number => number * number > 20).Select(number => number * number);
            foreach (var item in methodResult)
            {
                System.Console.WriteLine(item);
            }

            //query syntax
            var queryResult = from number in n
                              where number * number > 20
                              //squared values as result:
                              //select number * number;
                              select number * number;
            foreach (var item in queryResult)
            {
                System.Console.WriteLine("q " + item);
            }
        }
    }
}
