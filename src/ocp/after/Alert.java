package ocp.after;

import java.util.ArrayList;
import java.util.List;

public class Alert {

    private List<AlertHandler> alertHandlerList = new ArrayList<AlertHandler>();

    public void addAlertHandler(AlertHandler alertHandler) {
        this.alertHandlerList.add(alertHandler);
    }

    public void check(ApiStateInfo alertInfo) {

        for (AlertHandler alertHandler : alertHandlerList) {
            alertHandler.check(alertInfo);
        }

     /*   long tps = requestCount / duration;
        long errorRate = errorCount / requestCount;

        if (tps > rule.getMatchedRuleCount(api)) {
            notification.notify(NotificationEmergencyLevel.URGENCY, tps);
        }

        if (errorRate > rule.getMatchedRuleCount(api)) {
            notification.notify(NotificationEmergencyLevel.SEVERE, errorRate);
        }*/
    }
}
