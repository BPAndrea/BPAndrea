package GardenApplication;

import java.util.ArrayList;

/*is able to hold unlimited amount of flowers or trees
    when watering it should only water those what needs water with equally divided amount amongst them
    eg. watering with 40 and 4 of them need water then each gets watered with 10*/
public class Garden {
  ArrayList<Flower> flowers;
  ArrayList<Tree> trees;

  Garden() {
    this.flowers = new ArrayList<>();
    this.trees = new ArrayList<>();
  }

  public void addFlower(Flower inputFlower) {
    flowers.add(inputFlower);
  }

  public void addTree(Tree inputTree) {
    trees.add(inputTree);
  }


  public int countPlantsToBeWatered() {
    int result = 0;
    for (int i = 0; i < flowers.size(); i++) {
      if (flowers.get(i).watercheck())
        result++;
    }
    for (int i = 0; i < trees.size(); i++) {
      if (trees.get(i).watercheck())
        result++;
    }
    return result;
  }

  public void gardenWatering(int waterAmount) {
    int plantsToBeWatered = countPlantsToBeWatered();
    //System.out.println(plantsToBeWatered);
    System.out.println("Watering with " + waterAmount);
    int portion = waterAmount / plantsToBeWatered;
    for (int i = 0; i < flowers.size(); i++) {
      flowers.get(i).watering(portion);
    }
    for (int i = 0; i < trees.size(); i++) {
      trees.get(i).watering(portion);
    }
    gardenInfo();
  }


  public void gardenInfo() {
    for (int i = 0; i < flowers.size(); i++) {
      flowers.get(i).info();
    }
    for (int i = 0; i < trees.size(); i++) {
      trees.get(i).info();
    }
  }

}
