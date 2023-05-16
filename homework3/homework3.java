package basicpro.homework3;

/**
 * Java. Homework #3.
 * @author Roman Obmaikin
 * @version 15 May, 2023.
 */

public class homework3 {
    public static void main(String[] args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog(150, 10);
        Actions[] animals = {cat, dog};
        for(Actions animal : animals){
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(250));
            System.out.println(animal.run(550));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(15));
        }
        System.out.println("Animals were created: " + Animal.getCountOfAnimals());
    }
}
