abstract class Animal {
    public Animal() {
        System.out.println("A wild animal has appeared!");
    }
}

class Cat extends Animal {
    public Cat() {
        super();

        String className = this.getClass().getName();
        System.out.println("A wild " + className +  " has appeared!");
    }

    public void sleep() {
        String className = this.getClass().getName();
        System.out.println("A " + className + " is sleeping...");
    }

    public void purr() {
        String className = this.getClass().getName();
        System.out.println("A " + className + " is purring delightfully.");
    }

    public void sits_on() {
        String className = this.getClass().getName();
        System.out.println("A " + className + " is sitting on your laptop.");
    }
}

class Dog extends Animal {
    public Dog() {
        super();

        String className = this.getClass().getName();
        System.out.println("A wild " + className +  " has appeared!");
    }

    public void sleep() {
        String className = this.getClass().getName();
        System.out.println("A " + className + " sleeps...");
    }

    public void woof() {
        String className = this.getClass().getName();
        System.out.println("A " + className + " barks loudly.");
    }

    public void chase() {
        String className = this.getClass().getName();
        System.out.println("A " + className + " is currently chasing the mailman.");
    }
}

public class AnimalInheritance {
    public static void main(String[] args) {
        Cat apollo = new Cat();

        apollo.sleep();
        apollo.purr();
        apollo.sits_on();


        Dog max = new Dog();

        max.sleep();
        max.woof();
        max.chase();
    }
}



