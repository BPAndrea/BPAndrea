using System;
using System.Collections.Generic;
using System.Linq;

namespace arraysAndFunctions
{
    class Program
    {
        static void Main(string[] args)
        {
            //third
            int[] q = new int[] { 4, 5, 6, 7 };
            System.Console.WriteLine(q[2]);

            //compare length
            int[] p1 = new int[] { 5, 4, 1, 2, 3 };
            int[] p2 = new int[] { 4, 5 };
            if (p1.Length > p2.Length)
            {
                System.Console.WriteLine("P1 has more elements than P2");
            }
            else
            {
                System.Console.WriteLine("P2 has more elements than P1");
            }
            //Console.WriteLine(Sum(GetInput()));
            Array.Sort(p1);
            Array.Reverse(p2);
            p1.ToList().ForEach(Console.WriteLine);
            Console.WriteLine(IsAnagram("Anagram", "margnaa"));

            string[] animals = new string[] { "koal", "pand", "zebr" };
            for (int i = 0; i < animals.Length; i++)
            {
                System.Console.WriteLine(animals[i] + "a");
            }
            List<int> result = UniqueNumbers(new int[] { 1, 11, 34, 11, 52, 61, 1, 34 });
            foreach (var item in result)
            {
                System.Console.Write(item + ", ");
            }
        }

        public static int[] GetInput()
        {
            Console.WriteLine("Give me a number: ");
            var myInput = Console.ReadLine();
            int myNumber = Convert.ToInt32(myInput);
            int[] myArray = new int[myNumber];
            for (int i = 0; i < myNumber; i++)
            {
                System.Console.WriteLine($"Give me the {i + 1}. number between 1 - 100: ");
                var temp = Console.ReadLine();
                int tempNumb = Convert.ToInt32(temp);
                myArray[i] = tempNumb;
            }
            System.Console.WriteLine($"These are the numbers you gave me: ");
            foreach (var item in myArray)
            {
                System.Console.Write(item + ", ");
                System.Console.WriteLine();

            };
            return myArray;
        }

        public static int Sum(int[] input)
        {
            int sum = 0;
            for (int i = 0; i < input.Length; i++)
            {
                sum += input[i];
            }
            return sum;
        }

        public static string IsAnagram(string first, string second)
        {
            if (first.Length != second.Length)
            {
                return "Not Anagramm";
            }
            else
            {
                first = first.ToLower();
                second = second.ToLower();
                char[] firstWord = first.ToCharArray();
                char[] secondWord = second.ToCharArray();
                Array.Sort(firstWord);
                Array.Sort(secondWord);
                string sotredA = new string(firstWord);
                string sotredB = new string(secondWord);
                if (sotredA.Equals(sotredB))
                {
                    return "Anagramm";
                }
                else
                {
                    return "Not Anagramm";
                }
            }
        }

        public static List<int> UniqueNumbers(int[] input)
        {
            List<int> unique = new List<int>();
            for (int i = 0; i < input.Length; i++)
            {
                if (!unique.Contains(input[i]))
                {
                    unique.Add(input[i]);
                }
            }
            return unique;
        }


    }
}
