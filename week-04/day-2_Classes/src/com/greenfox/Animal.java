package com.greenfox;

public class Animal {
    /* Animal
     Create an Animal class
     Every animal has a hunger value, which is a whole number
     Every animal has a thirst value, which is a whole number
     when creating a new animal object these values are created with the default 50 value
     Every animal can eat() which decreases their hunger by one
     Every animal can drink() which decreases their thirst by one
     Every animal can play() which increases both by one*/
    public static void main(String[] args) {
        Animal cat = new Animal();
        Animal dog = new Animal();

        //Test:
        System.out.println(cat.hunger);
        cat.eat();
        System.out.println(cat.hunger);
        cat.play();
        System.out.println(cat.hunger+ " "+cat.thirst);
    }

    int hunger = 50;
    int thirst = 50;

    public void eat() {
        hunger--;
    }

    public void drink() {
        thirst--;
    }

    public void play() {
        hunger++;
        thirst++;
    }


}
