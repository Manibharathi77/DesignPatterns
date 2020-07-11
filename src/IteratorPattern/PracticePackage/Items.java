package IteratorPattern.PracticePackage;

import java.util.ArrayList;
import java.util.List;

public class Items {

    private String Dishes;
    private int Price;

    public Items(String Dishes, int price ){
        this.Dishes = Dishes;
        this.Price = price;
    }

    @Override
    public String toString() {
        return "Items{" +
                "Dishes='" + Dishes + '\'' +
                ", Price=" + Price +
                '}';
    }
}
