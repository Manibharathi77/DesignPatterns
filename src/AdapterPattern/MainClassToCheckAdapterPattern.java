package AdapterPattern;

import AdapterPattern.DuckAndInsectExample.Duck;
import AdapterPattern.DuckAndInsectExample.InsectAdapter;
import AdapterPattern.DuckAndInsectExample.InsectCricket;

public class MainClassToCheckAdapterPattern {

    public static void main(String[] args) {

        InsectCricket insectCricket = new InsectCricket();
        Duck insectAdapter = new InsectAdapter(insectCricket);
        insectAdapter.fly();
        insectAdapter.quack();
    }
}
