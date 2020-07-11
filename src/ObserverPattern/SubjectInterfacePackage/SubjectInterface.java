package ObserverPattern.SubjectInterfacePackage;


import ObserverPattern.ObserverPackage.ObserverInterface;

public interface SubjectInterface {

    void addNewObserver(ObserverInterface observer);
    void publishedReport(int temperature, int humidity);
    void publishReport();

}
