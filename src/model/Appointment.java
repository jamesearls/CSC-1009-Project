package model;
import java.io.Serializable;
import java.util.ArrayList;

public class Appointment implements Serializable {
	private static final long serialVersionUID = 1L;

	public String uniqueId;
	public String patientEmail;
	public String patientForename;
	public String patientSurname;
	public String location;
	public int totalAppointments;
}	