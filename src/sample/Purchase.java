package sample;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Purchase {
    private SimpleStringProperty itemCol;
    private SimpleIntegerProperty qtyCol;
    private SimpleDoubleProperty costCol;
    private SimpleDoubleProperty amountCol;

    public Purchase(String item, int quantity, double price, double totalprice) {
        this.itemCol = new SimpleStringProperty(item);
        this.qtyCol = new SimpleIntegerProperty(quantity);
        this.costCol = new SimpleDoubleProperty(price);
        this.amountCol = new SimpleDoubleProperty(totalprice);
    }
}
