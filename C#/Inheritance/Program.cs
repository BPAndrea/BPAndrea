using System;

namespace Inheritance
{
    class Program
    {
        static void Main(string[] args)
        {
            Flower yellow = new Flower("yellow");
            Flower blue = new Flower("blue");
            System.Console.WriteLine(yellow.Color, yellow.Absorbation, yellow.WaterAmount);
        }
    }
}
