using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;

namespace mapIntroduction1
{
    class Program
    {
        static void Main(string[] args)
        {
            //creating an empty map:
            Dictionary<int, char> myMap = new Dictionary<int, char>();
            //printing whether the map is empty
            if (myMap.Count == 0)
            {
                System.Console.WriteLine("Dictionary is empty!");
            }
            else
            {
                System.Console.WriteLine("Something is in the dictionary.");
            }
            //adding key-value pairs to map:
            myMap.Add(97, 'a');
            myMap.Add(98, 'b');
            myMap.Add(99, 'c');
            myMap.Add(65, 'A');
            myMap.Add(66, 'B');
            myMap.Add(67, 'C');
            //print all keys:
            foreach (int key in myMap.Keys)
            {
                System.Console.WriteLine(key);
            }
            //print all values:
            foreach (char value in myMap.Values)
            {
                System.Console.WriteLine(value);
            }
            myMap.Add(68, 'D');
            System.Console.WriteLine(myMap.Count);
            //print value of the key 999
            System.Console.WriteLine(myMap.GetValueOrDefault(99));
            //print key-value pair where key is 99:
            var result = myMap
                .Where(x => x.Key.Equals(99))
                .ToDictionary(x => x.Key, x => x.Value);
            foreach (var item in result)
            {
                System.Console.WriteLine(item);
            }
            //removing element with key 97:
            myMap.Remove(97);
            foreach (var item in myMap)
            {
                System.Console.WriteLine(item);
            }
            //returns whether map contains key 100:
            System.Console.WriteLine(myMap.ContainsKey(100));
            //delete all key-value pairs
            myMap.Clear();
            System.Console.WriteLine(myMap.Count);




        }
    }
}
