using System;
using System.Collections.Generic;

namespace listIntroduction2
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> A = new List<string>() { "Apple", "Avocado", "Blueberries", "Durian", "Lychee" };
            List<string> B = A;
            System.Console.WriteLine(A.Contains("Durian"));
            B.Remove("Durian");
            //add Kiwifruit as 4th element:
            A.Insert(4, "Kiwifruit");
            //compare size of A and B:
            System.Console.WriteLine(A.Count == B.Count);
            System.Console.WriteLine(A.IndexOf("Avocado"));
            System.Console.WriteLine(B.IndexOf("Durian"));
            //add new elements to the list in a single statement:
            A.AddRange(new List<string>() { "Passion Fruit", "Pummelo" });
            foreach (string item in A)
            {
                System.Console.WriteLine(item);
            };
            //print 3rd element:
            System.Console.WriteLine(A[2]);
        }
    }
}
