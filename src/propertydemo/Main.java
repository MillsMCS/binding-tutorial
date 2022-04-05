package propertydemo;

import java.util.Scanner;

// https://docs.oracle.com/javafx/2/binding/jfxpub-binding.htm
public class Main {
    public static void main(String[] args) {
        Bill electricBill = new Bill();

        electricBill.amountDueProperty().addListener(
                (o, oldVal, newVal) -> System.out.println(
                        "Electric bill has changed from " + oldVal + " to " + newVal));

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter amount due: ");
            electricBill.setAmountDue(scanner.nextDouble());
        }
    }
}
