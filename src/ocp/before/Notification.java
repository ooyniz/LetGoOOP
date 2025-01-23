package ocp.before;

public class Notification {

    public void notify(String urgency, long rate) {
        System.out.println("NotificationEmergencyLevel: " + urgency + ", rate: " + rate);
    }

}
