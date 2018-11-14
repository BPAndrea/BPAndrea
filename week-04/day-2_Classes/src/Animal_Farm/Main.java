package Animal_Farm;

public class Main {
    public static void main(String[] args) {
        /* Animal
         Create an Animal class
         Every animal has a hunger value, which is a whole number
         Every animal has a thirst value, which is a whole number
         when creating a new animal object these values are created with the default 50 value
         Every animal can eat() which decreases their hunger by one
         Every animal can drink() which decreases their thirst by one
         Every animal can play() which increases both by one*/

            Animal cat = new Animal();
            Animal dog = new Animal();

            //Test:
            System.out.println(cat.hunger);
            cat.eat();
            System.out.println(cat.hunger);
            cat.play();
            System.out.println(cat.hunger+ " "+cat.thirst);
        }
    }

