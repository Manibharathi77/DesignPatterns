package IteratorPattern.PracticePackage;

import java.util.ArrayList;
import java.util.List;

public class PanCakeMenu implements Menu {

    List<Items> panCakeMenu = new ArrayList<>();
    private String Dishes;
    private int Price;

    public PanCakeMenu(String Dishes, int price ){
        this.Dishes = Dishes;
        this.Price = price;
    }

    public PanCakeMenu() {
     //   this.createIterator();
    }

    public void addMenu(Items menu) {
        this.panCakeMenu.add(menu);
    }

    @Override
    public PanCakeIterator createIterator() {
        return new PanCakeIterator(panCakeMenu);
    }

    @Override
    public String toString() {
        return "Items{" +
                "Dishes='" + Dishes + '\'' +
                ", Price=" + Price +
                '}';
    }

}
