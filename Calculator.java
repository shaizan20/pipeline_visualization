import java.util.*;


class calculator {
    void add(int x, int y) {
        System.out.println("Addition of x and y: " + (x + y));
    }

    void sub(int x, int y) {
        System.out.println("Subtraction of x and y: " + (x - y));
    }

    public static void main(String[] args) {
        calculator calc = new calculator();

        int x = 10;
        int y = 5;

        calc.add(x, y); 
        calc.sub(x, y);
    }
}
