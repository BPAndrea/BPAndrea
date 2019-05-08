using System.Collections.Generic;

class Farm
{
    public int Slots { get; set; }
    public List<Animal> animals;

    public Farm()
    {
        this.Slots = 2;
        this.animals = new List<Animal>();
    }

    public void Breed()
    {
        if (Slots > 0)
        {
            Animal toCreate = new Animal();
            animals.Add(toCreate);
            Slots--;
            System.Console.WriteLine("New animal was created!");
        }
        else
        {
            System.Console.WriteLine("There is no place for a new animal!");
        }

    }

    public void Slaughter()
    {
        int tempHunger = animals[0].Hunger;
        int index = 0;
        for (int i = 1; i < animals.Count; i++)
        {
            if (animals[i].Hunger < tempHunger)
            {
                tempHunger = animals[i].Hunger;
                index = i;
            }
        }
        System.Console.WriteLine("We have so many animals : " + animals.Count);
        System.Console.WriteLine("The animal at index {0} with hunger {1} will be removed.", index, tempHunger);
        animals.RemoveAt(index);
        System.Console.WriteLine("We have so many animals : " + animals.Count);
    }

    public void Add(Animal animal)
    {
        animals.Add(animal);
    }
}