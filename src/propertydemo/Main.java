package propertydemo;

import java.util.Scanner;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

// https://docs.oracle.com/javafx/2/binding/jfxpub-binding.htm
public class Main {
    public static void main(String[] args) {
        Bill electricBill = new Bill();

        electricBill.amountDueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue o, Object oldVal, Object newVal) {
                System.out.println("Electric bill has changed!");
            }
        });
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter amount due: ");
            electricBill.setAmountDue(scanner.nextDouble());
        }
    }
}
