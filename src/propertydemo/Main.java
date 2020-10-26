package propertydemo;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;

// https://docs.oracle.com/javafx/2/binding/jfxpub-binding.htm
public class Main {
    public static void main(String[] args) {

        Bill bill1 = new Bill();
        Bill bill2 = new Bill();
        Bill bill3 = new Bill();

        NumberBinding total =
                Bindings.add(bill1.amountDueProperty().add(bill2.amountDueProperty()),
                        bill3.amountDueProperty());
        total.addListener(o -> System.out.println("The binding is now invalid."));

        // First call makes the binding invalid
        bill1.setAmountDue(200.00);

        // The binding is now invalid
        bill2.setAmountDue(100.00);
        bill3.setAmountDue(75.00);

        // Make the binding valid...
        System.out.println(total.getValue());

        // Make invalid...
        bill3.setAmountDue(150.00);

        // Make valid...
        System.out.println(total.getValue());
    }
}
