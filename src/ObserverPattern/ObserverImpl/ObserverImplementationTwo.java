package ObserverPattern.ObserverImpl;

import ObserverPattern.ObserverPackage.ObserverInterface;
import ObserverPattern.SubjectInterfacePackage.SubjectInterface;

public class ObserverImplementationTwo implements ObserverInterface {

    public ObserverImplementationTwo(SubjectInterface subject){
        subject.addNewObserver(this);
    }

    @Override
    public void subscribedValue(int one, int two) {
        System.out.println("Observer two :: The value from subject :: " + two + " "+ one);
    }
}
