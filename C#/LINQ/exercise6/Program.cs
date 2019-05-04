using System;
using System.Linq;

namespace exercise6
{
    class Program
    {
        static void Main(string[] args)
        {
            // Write a LINQ Expression to find the frequency of characters in a given string.
            string countMe = "kxjakaxlaxhixixidx";

            //method syntax:
            var methodResult = countMe.GroupBy(letter => letter);
            foreach (var item in methodResult)
            {
                System.Console.WriteLine(item.Key + ":" + item.Count());
            }

            //query syntax:
            var queryResult = from letter in countMe
                              group letter by letter into m
                              select new { Key = m.Key, Count = m.Count() };
            foreach (var item in queryResult)
            {
                System.Console.WriteLine(item.Key + "-" + item.Count);
            }
        }
    }
}
