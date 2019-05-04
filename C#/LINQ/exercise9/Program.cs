using System;
using System.Linq;

namespace exercise9
{
    class Program
    {
        static void Main(string[] args)
        {
            char[] myName = new char[] { 'A', 'N', 'D', 'I' };
            //method syntax:
            //1. string andi = String.Join("", myName.Select(p => p.ToString()).ToArray());
            //2. string andi = String.Join("", myName.Select(p => p.ToString()));
            string andi = String.Join("", myName.Select(p => p));
            System.Console.WriteLine(andi);

        }
    }
}
