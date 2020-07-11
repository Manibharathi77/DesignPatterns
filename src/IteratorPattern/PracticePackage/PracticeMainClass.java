package IteratorPattern.PracticePackage;

public class PracticeMainClass {

    public static void main(String[] args) {

        PanCakeMenu panCakeMenuList = new PanCakeMenu();
        panCakeMenuList.addMenu(new Items("dish one", 10));
        panCakeMenuList.addMenu(new Items("dish two", 100));
        panCakeMenuList.addMenu(new Items("dish three", 1000));

        BiriyaniMenu biriyaniMenu = new BiriyaniMenu();
        biriyaniMenu.addMenu(new Items("Biriyani", 150));
        biriyaniMenu.addMenu(new Items("Biriyani 2", 120));
        biriyaniMenu.addMenu(new Items("Biriyani 3", 100));

        Cafe cafe = new Cafe(panCakeMenuList, biriyaniMenu);
        cafe.printMenu();
    }
}
