package finalexam.task4;

public class Appointment {

    private String clientName;
    private String date;
    private String time;

    public Appointment(String clientName, String date, String time) {
        this.clientName = clientName;
        this.date = date;
        this.time = time;
    }


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "clientName='" + clientName + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
