package entrypoints;

import java.rmi.RemoteException;

import adb.ClientServiceAdb;
import adb.DoctorServiceAdb;
import adb.ScheduleServiceAdb;
import client.services.ClientServiceStub.PersonStub;
import doctor.services.DoctorServiceStub.DoctorStub;
import schedule.services.ScheduleServiceExceptionException;

public class Axis2ClientMain {

    private final static String CLIENT_END_POINT = "http://localhost:8080/axis2/services/ClientService?wsdl";
    private final static String DOCTOR_END_POINT = "http://localhost:8080/axis2/services/DoctorService?wsdl";
    private final static String SCHEDULE_END_POINT = "http://localhost:8080/axis2/services/ScheduleService?wsdl";

    public static void main(String[] args) throws RemoteException, ScheduleServiceExceptionException {
        ClientServiceAdb clientService = new ClientServiceAdb(CLIENT_END_POINT);
        DoctorServiceAdb doctorService = new DoctorServiceAdb(DOCTOR_END_POINT);
        ScheduleServiceAdb scheduleService = new ScheduleServiceAdb(SCHEDULE_END_POINT);

        PersonStub[] clients = clientService.getClients();
        DoctorStub[] doctors = doctorService.getDoctors();

        PersonStub client = clients[0];
        DoctorStub doctor = doctors[0];
        String specialty = doctor.getSpecialties()[0];

        String firstAvailableDate = scheduleService.getFirstAvailableDate(doctor.getCrm());
        scheduleService.allocateClient(client.getCpf(), doctor.getCrm(), specialty, firstAvailableDate);

        scheduleService.getClientAllocations(client.getCpf());

        System.out.println(firstAvailableDate);
    }

}