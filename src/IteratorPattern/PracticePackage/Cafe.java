package IteratorPattern.PracticePackage;

public class Cafe {

   private MenuIterator menuIterator;
   private Menu panCakeMenu;
   private Menu biriyaniMenu;

   public Cafe(Menu menu, Menu menu2){
        this.panCakeMenu = menu;
        this.biriyaniMenu = menu2;
   }
        public void printMenu(){
       this. menuIterator = panCakeMenu.createIterator();
            while(menuIterator.hasNext()){
                Items p = menuIterator.next();
                System.out.println(p.toString());
            }
       this.menuIterator = biriyaniMenu.createIterator();
            while(menuIterator.hasNext()){
                Items p = menuIterator.next();
                System.out.println(p.toString());
            }
        }


}
