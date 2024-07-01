package finalexam.task4;

import java.util.ArrayList;
import java.util.List;

public class BeautySalon implements LegalEntity {

    private String address;
    private String vatNumber;
    private List<Appointment> appointments;

    public BeautySalon(String address, String vatNumber) {
        this.address = address;
        this.vatNumber = vatNumber;
        this.appointments = new ArrayList<>();
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    public void addAppointment(String clientName, String date, String time) {
        Appointment appointment = new Appointment(clientName, date, time);
        appointments.add(appointment);
    }

    public boolean cancelAppointment(String clientName, String date, String time) {
        Appointment appointmentToRemove = null;
        for (Appointment appointment : appointments) {
            if (appointment.getClientName().equals(clientName) && appointment.getDate().equals(date)
                    && appointment.getTime().equals(time)) {
                appointmentToRemove = appointment;
                break;
            }
        }
        if (appointmentToRemove != null) {
            appointments.remove(appointmentToRemove);
            return true;
        }
        return false;
    }

    public List<Appointment> getAppointments() {
        return new ArrayList<>(appointments);
    }

}
