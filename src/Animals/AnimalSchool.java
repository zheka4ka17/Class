package Animals;

public class AnimalSchool {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.run();
        Squirrel squirrel = new Squirrel();
        squirrel.climb();

    }
}
interface Running{
   void run();
}

interface Swimming{
   void swim();
}
interface Climbing{
 void climb();

}

class Rabbit  implements Running, Swimming{

    @Override
    public void run() {
        System.out.println("rabbit runs");
    }

    @Override
    public void swim() {
        System.out.println("rabbit swims");

    }
}

class Squirrel implements Running, Climbing{

    @Override
    public void run() {
        System.out.println("squirrel runs");
    }

    @Override
    public void climb() {
        System.out.println("squirrel climbs");

    }
}
