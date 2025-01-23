package ocp.after;

public class AlertMain {

    public static void main(String[] args) {
      Alert alert = new Alert();

      ApiStateInfo apiStateInfo = new ApiStateInfo("http://example.com", 1000, 10000, 1);
      ErrorHandler errorHandler = new ErrorHandler(apiStateInfo, new Notification(), new AlertRule());
      alert.addAlertHandler(errorHandler);
      alert.check(apiStateInfo);

    }
}
