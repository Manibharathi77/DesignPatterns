package ObserverPattern;

import ObserverPattern.ObserverImpl.ObserverImplementationOne;
import ObserverPattern.ObserverImpl.ObserverImplementationTwo;
import ObserverPattern.SubjectImplementationPackage.SubjectInterfaceImpl;
import ObserverPattern.SubjectInterfacePackage.SubjectInterface;

public class MainClassToCheckObserver {

    public static void main(String[] args) {

        SubjectInterface subject = new SubjectInterfaceImpl();

         new ObserverImplementationOne(subject);
         new ObserverImplementationTwo(subject);
        subject.publishedReport(10, 20);
      //  subject.publishedReport(1000, 29980);

    }
}
