package ocp.after;

public abstract  class AlertHandler {

    protected ApiStateInfo apiStateInfo;
    protected Notification notification;
    protected AlertRule rule;

    public AlertHandler(ApiStateInfo apiStateInfo, Notification notification, AlertRule rule) {
        this.apiStateInfo = apiStateInfo;
        this.notification = notification;
        this.rule = rule;
    }

    public abstract void check(ApiStateInfo apiStateInfo) ;

}
