package IteratorPattern.PracticePackage;

public class BiriyaniMenu implements Menu {

    Items[] items = new Items[100];
    static int position = 0;

    @Override
    public void addMenu(Items menu) {
        items[position] = menu;
        position++;
    }

    @Override
    public MenuIterator createIterator() {
        return new BiriyaniIterator(items);
    }
}
