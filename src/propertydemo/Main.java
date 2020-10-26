package propertydemo;

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

		electricBill.setAmountDue(100.00);

	}
}