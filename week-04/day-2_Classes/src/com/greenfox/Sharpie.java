package com.greenfox;

public class Sharpie {
    public static void main(String[] args) {
        Sharpie sharpie1=new Sharpie("blue", (float)1.2);
        Sharpie sharpie2=new Sharpie("red", (float)3.2);
        sharpie1.use();
        System.out.println(sharpie1.inkAmount);
        System.out.println(sharpie2.inkAmount);


    }

  /*  Create Sharpie class
    We should know about each sharpie their color (which should be a string), width (which will be a floating point number),
    inkAmount (another floating point number)
    When creating one, we need to specify the color and the width
    Every sharpie is created with a default 100 as inkAmount
    We can use() the sharpie objects
    which decreases inkAmount*/

  String color;
  float width;
  float inkAmount=100;

  Sharpie(String color, float width){
      this.color=color;
      this.width=width;
  }

  public void use(){
      inkAmount--;
  }

}
