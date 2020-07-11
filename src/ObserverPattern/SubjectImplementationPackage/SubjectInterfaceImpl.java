package ObserverPattern.SubjectImplementationPackage;

import ObserverPattern.ObserverPackage.ObserverInterface;
import ObserverPattern.SubjectInterfacePackage.SubjectInterface;

import java.util.ArrayList;
import java.util.List;

public class SubjectInterfaceImpl implements SubjectInterface {

    private List<ObserverInterface> ObserverList = new ArrayList<>();
    int temperature;
    int humidity;


    @Override
    public void addNewObserver(ObserverInterface observer) {
        ObserverList.add(observer);
    }

    @Override
    public void publishedReport(int temperature, int humidity) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.publishReport();
    }

    @Override
    public void publishReport() {
        ObserverList.forEach(observer -> {
            observer.subscribedValue(humidity, temperature);
        });
    }
}
