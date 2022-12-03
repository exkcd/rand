interface RuminantTester {
    void testIfRuminant();

    void testHasMultipleStomachs();

    void grazes();

    void chewsCud();
}

abstract class Mammal {

    public void nursesYoung() {
        String className = this.getClass().getSimpleName();
        System.out.println("I am a " + className + ". I nurse my young.");
    }
}

abstract class GrazingMammal extends Mammal implements RuminantTester {

    @Override
    public void testIfRuminant() {
        String className = this.getClass().getName();
        if (this instanceof Ruminant) {
            System.out.println("I am a " + className + ". I am a Ruminant.");
        } else {
            System.out.println("I am a " + className + ". I am not Ruminant.");
        }
    }

    @Override
    public void testHasMultipleStomachs() {
        String className = this.getClass().getName();
        if (this instanceof Ruminant) {
            System.out.println("I am a " + className + ". I have multiple stomachs.");
        } else {
            System.out.println("I am a " + className + ". I do not have multiple stomachs.");
        }
    }

    @Override
    public void grazes() {
        String className = this.getClass().getName();
        System.out.println("I am a " + className + ". I am grazing.");
    }

    @Override
    public void chewsCud() {
        String className = this.getClass().getName();
        System.out.println("I am a " + className + ". I am chewing cud.");
    }
}

abstract class Ruminant extends GrazingMammal {
}

class Cow extends Ruminant {

}

class Goat extends Ruminant {

}

class Horse extends GrazingMammal {

}

public class GrazingAnimals {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.nursesYoung();
        cow.grazes();
        cow.chewsCud();
        cow.testIfRuminant();
        cow.testHasMultipleStomachs();
        System.out.println();

        Goat goat = new Goat();
        goat.nursesYoung();
        goat.grazes();
        goat.chewsCud();
        goat.testIfRuminant();
        goat.testHasMultipleStomachs();
        System.out.println();

        Horse horse = new Horse();
        horse.nursesYoung();
        horse.grazes();
        horse.testIfRuminant();
        horse.testHasMultipleStomachs();
    }
}