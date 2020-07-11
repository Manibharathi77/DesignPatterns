package AdapterPattern.DuckAndInsectExample;

public class InsectAdapter implements Duck {

    Insect insect;

    public InsectAdapter(Insect insect){
        this.insect = insect;
    }

    @Override
    public void quack() {
        insect.chirp();
    }

    @Override
    public void fly(){
        insect.crawl();
    }

}
