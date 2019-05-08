using System;
class Animal
{
    public int Hunger { get; set; }
    public int Thirst { get; set; }

    public Animal()
    {
        this.Hunger = 50;
        this.Thirst = 50;

    }

    public void Eat()
    {
        this.Hunger--;
    }
    public void Drink()
    {
        this.Thirst--;
    }
    public void Play()
    {
        this.Hunger++;
        this.Thirst++;
    }
}