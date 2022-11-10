package Animals;

import java.util.LinkedList;
import java.util.List;

public class Animals {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0]= new Cat();// anonymous object
        animals[1]= new Dog();
        animals[2]=new Mouse();
        for(Animal animal: animals) animal.sound();


        List<Animal> animalsList = new LinkedList<>();
        animalsList.add(new Cat());
        animalsList.add(new Dog());
        animalsList.add(new Mouse());

        for (Animal animal:animalsList) animal.sound();

    }
}

//GUI, CLI


abstract class Animal{
    public abstract void sound();
}

class Cat extends Animal{

    @Override
    public void sound() {
        System.out.println("meow");

    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Auf");
    }
}

class  Mouse extends Animal{
    @Override
    public void sound() {
        System.out.println("Squeak");
    }
}