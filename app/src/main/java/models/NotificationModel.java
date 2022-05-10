package models;

public class NotificationModel {
    String event_date, event_month, event_name, ngo_name;

    public NotificationModel(String event_date, String event_month, String event_name, String ngo_name) {
        this.event_date = event_date;
        this.event_month = event_month;
        this.event_name = event_name;
        this.ngo_name = ngo_name;
    }

    public String getEvent_date() {
        return event_date;
    }

    public void setEvent_date(String event_date) {
        this.event_date = event_date;
    }

    public String getEvent_month() {
        return event_month;
    }

    public void setEvent_month(String event_month) {
        this.event_month = event_month;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getNgo_name() {
        return ngo_name;
    }

    public void setNgo_name(String ngo_name) {
        this.ngo_name = ngo_name;
    }
}
