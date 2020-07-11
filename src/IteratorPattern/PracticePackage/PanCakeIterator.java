package IteratorPattern.PracticePackage;

import java.util.List;

public class PanCakeIterator implements MenuIterator {

    List<Items> itemsList;
    int position;

    public PanCakeIterator(List<Items> items){
        this.itemsList = items;
    }

    @Override
    public boolean hasNext() {
        while(itemsList.size() > position){
            return true;
        }
        return false;
    }

    @Override
    public Items next() {
        Items menu = itemsList.get(position);
        position++;
        return menu;
    }
}
