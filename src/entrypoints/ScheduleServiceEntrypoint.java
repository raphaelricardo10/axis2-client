package entrypoints;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import client.services.ClientServiceExceptionException;
import client.services.ClientServiceStub.PersonStub;
import doctor.services.DoctorServiceStub.DoctorStub;
import schedule.services.ScheduleServiceExceptionException;

public class ScheduleServiceEntrypoint{

    ScheduleServiceEntrypoint() throws AxisFault {
        super();
    }

    public static void main(String[] args) throws RemoteException, ScheduleServiceExceptionException, ClientServiceExceptionException {
        ServiceHub services = new ServiceHub();

        PersonStub[] clients = services.clientService.getClients();
        DoctorStub[] doctors = services.doctorService.getDoctors();

        PersonStub client = clients[0];
        DoctorStub doctor = doctors[0];
        String specialty = doctor.getSpecialties()[0];

        String firstAvailableDate = services.scheduleService.getFirstAvailableDate(doctor.getCrm());
        services.scheduleService.allocateClient(client.getCpf(), doctor.getCrm(), specialty, firstAvailableDate);

        System.out.println(services.scheduleService.getClientAllocations(client.getCpf()));
    }

}