package chatt.showcase.kotlin;

public class Main {

    public static void main(String[] args) {

        int a = 4;
        int b = 7;
        System.out.println("Sum of " + a + " and " + b + " is " + (a + b) + ".");
        System.out.println(String.format("Max of %s and %s is %s.", a, b, max(a, b)));

    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}
