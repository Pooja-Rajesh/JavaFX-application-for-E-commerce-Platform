package sample;

import java.util.ArrayList;

public class Cart {
    private String userName;
    private ArrayList<Purchase> items = new ArrayList<Purchase>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void addItem(Purchase item){
        items.add(item);
    }
}
