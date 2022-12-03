class Calculation {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers: " + z);
    }

    public void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers: " + z);
    }

    public void Division(int x, int y) {
        z = x / y;
        System.out.println("The quotient between the given numbers: " + z);
    }

}

public class RichPresence extends Calculation {

    public static void main(String[] args) {
        int a = 20, b = 10;
        RichPresence demo = new RichPresence();

        System.out.println("The numbers provided are: " + a + " and " + b);
        demo.addition(a, b);
        demo.Subtraction(a, b);
        demo.multiplication(a, b);
        demo.Division(a, b);
    }

    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers: " + z);
    }

}