package ocp.after;

public class ApiStateInfo {
    private String api;
    private long requestCount;
    private long errorCount;
    private long duration;

    public ApiStateInfo(String api, long requestCount, long errorCount, long duration) {
        this.api = api;
        this.requestCount = requestCount;
        this.errorCount = errorCount;
        this.duration = duration;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public long getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(long requestCount) {
        this.requestCount = requestCount;
    }

    public long getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(long errorCount) {
        this.errorCount = errorCount;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}
