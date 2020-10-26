package propertydemo;

import java.util.Scanner;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

// https://docs.oracle.com/javafx/2/binding/jfxpub-binding.htm
public class Main {
    private static IntegerProperty num1 = new SimpleIntegerProperty(1);
    private static IntegerProperty num2 = new SimpleIntegerProperty(2);
    private static IntegerProperty num3 = new SimpleIntegerProperty(3);
    private static IntegerProperty num4 = new SimpleIntegerProperty(4);
    private static NumberBinding sum = Bindings.add(num1.multiply(num2), num3.multiply(num4));

    public static void main(String[] args) {
        showValues();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter new value for num1: ");
            num1.set(scanner.nextInt());
        }
        showValues();
    }

    private static void showValues() {
        System.out.println("num1: " + num1.getValue() + ", num2: " + num2.getValue() +
                ", num3: " + num3.getValue() + ", num4: " + num4.getValue() +
                ", sum: " + sum.getValue());
    }
}
