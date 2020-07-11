package AdapterPattern.DuckAndInsectExample;

public class InsectCricket implements Insect {

    @Override
    public void crawl(){
        System.out.println("I cannot fly. I crawl..");
    }

    @Override
    public void chirp() {
        System.out.println("i dont quack. but i buzz or chirp");
    }
}
