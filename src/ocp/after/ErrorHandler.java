package ocp.after;

public class ErrorHandler extends AlertHandler{

    private long errorRate;
    public ErrorHandler(ApiStateInfo apiStateInfo, Notification notification, AlertRule rule) {
        super(apiStateInfo, notification, rule);
    }

    @Override
    public void check(ApiStateInfo apiStateInfo) {
        long errorRate = apiStateInfo.getRequestCount() / apiStateInfo.getDuration();
        if (errorRate > rule.getMatchedRuleCount(apiStateInfo.getApi())) {
            notification.notify(NotificationEmergencyLevel.SEVERE, errorRate);
        }
    }
}
