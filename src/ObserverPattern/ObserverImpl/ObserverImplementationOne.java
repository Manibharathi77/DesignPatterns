package ObserverPattern.ObserverImpl;

import ObserverPattern.ObserverPackage.ObserverInterface;
import ObserverPattern.SubjectInterfacePackage.SubjectInterface;

public class ObserverImplementationOne implements ObserverInterface {

    public ObserverImplementationOne(SubjectInterface subject){
        subject.addNewObserver(this);
    }

    @Override
    public void subscribedValue(int temperature, int humidity) {
        System.out.println("Observer one :: The value from subject :: " + temperature + " "+ humidity);
    }
}
