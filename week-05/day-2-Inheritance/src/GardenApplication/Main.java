package GardenApplication;
/*
The task is to create a garden application, so in your main method you should create a garden with flowers and trees. The program should demonstrate an example garden with two flowers (yellow and blue) and two trees (purple and orange). In the example after creating them you should show the user, how the garden looks like. After that the program should water the garden twice, first with the amount of 40 then with 70. And after every watering the user should see the state of the garden as you can see in the output.
*/

public class Main {
  public static void main(String[] args) {
    Flower myFlower1 = new Flower("yellow");
    Flower myFlower2 = new Flower("blue");
    Tree myTree1 = new Tree("purple");
    Tree myTree2 = new Tree("orange");
    Garden myGarden = new Garden();

    myGarden.addFlower(myFlower1);
    myGarden.addFlower(myFlower2);
    myGarden.addTree(myTree1);
    myGarden.addTree(myTree2);

    myGarden.gardenInfo();
    //System.out.println(myGarden.countPlantsToBeWatered());
    System.out.println();
    myGarden.gardenWatering(40);
    //System.out.println(myGarden.countPlantsToBeWatered());
    System.out.println();
    myGarden.gardenWatering(70);


    //Tests during coding:
    // GardenItems and watering():
    /*System.out.println(myFlower1.type.equals("Flower"));
    System.out.println(myFlower1.type);
    System.out.println(myFlower1.waterLevel);
    System.out.println(myFlower1.waterNeeded);
    System.out.println(myFlower1.color);
    //System.out.println(myFlower1.needsWater());
    System.out.println(myFlower1.waterCheck);
    System.out.println(myGarden.flowers.get(1).color);
    myFlower1.info();
    myFlower2.info();
    myTree1.info();
    System.out.println(myFlower1.waterLevel);
    myFlower1.watering(10);
    System.out.println(myFlower1.waterLevel);
    myFlower1.watering(10);
    System.out.println(myFlower1.waterLevel);

    System.out.println(myTree1.waterLevel);
    myTree1.watering(10);
    myTree1.watering(10);
    myTree1.watering(10);
    myTree1.watering(10);
    System.out.println(myTree1.waterLevel);
    myFlower1.info();
    myTree1.info();*/

  }
}
