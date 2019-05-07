using System;
using System.Collections.Generic;
using System.Linq;

namespace mapIntroduction2
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, string> library = new Dictionary<string, string>();
            library.Add("978-1-60309-452-8", "A Letter to Jo");
            library.Add("978-1-60309-459-7", "Lupus");
            library.Add("978-1-60309-444-3", "Red Panda and Moon Bear");
            library.Add("978-1-60309-461-0", "The Lab");

            //printing all key-value pairs:
            foreach (var item in library)
            {
                System.Console.WriteLine(item.Value + " (ISBN: " + item.Key + ")");
            }
            //delete value based on key:
            library.Remove("978-1-60309-444-3");
            //delete key-value based on value:
            var key = library.FirstOrDefault(v => v.Value == "The Lab").Key;
            library.Remove(key);

            foreach (var item in library)
            {
                System.Console.WriteLine(item.Value + " (ISBN: " + item.Key + ")");
            }
            //adding key-value pairs to the map:
            library.Add("978-1-60309-450-4", "They Called Us Enemy");
            library.Add("978-1-60309-453-5", "Why Did We Trust Him?");
            System.Console.WriteLine(library.ContainsKey("478-0-61159-424-8"));
            System.Console.WriteLine(library.GetValueOrDefault("978-1-60309-453-5"));
        }
    }
}
