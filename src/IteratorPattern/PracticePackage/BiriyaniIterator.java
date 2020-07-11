package IteratorPattern.PracticePackage;

public class BiriyaniIterator implements MenuIterator {

    Items[] items;
    int position;

    public BiriyaniIterator(Items[] items){
     this.items = items;
    }

    @Override
    public boolean hasNext() {
        return items.length > position;
    }

    @Override
    public Items next() {
        Items menu = items[position];
        position++;
        return menu;
    }
}
