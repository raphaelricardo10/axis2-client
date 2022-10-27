package adb;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import schedule.services.ScheduleServiceExceptionException;
import schedule.services.ScheduleServiceStub;
import schedule.services.ScheduleServiceStub.AllocateClient;
import schedule.services.ScheduleServiceStub.GetFirstAvailableDate;

public class ScheduleServiceAdb extends AdbClient {
    private ScheduleServiceStub stub;

    public ScheduleServiceAdb(String url) throws AxisFault {
        super(url);
        this.stub = new ScheduleServiceStub(url);
    }
    
    public String getFirstAvailableDate(String doctorCrm) throws RemoteException {
        GetFirstAvailableDate request = new GetFirstAvailableDate();
        request.setCrm(doctorCrm);

        return this.stub.getFirstAvailableDate(request).get_return();
    }

    public void allocateClient(String clientCpf, String doctorCrm, String specialty, String availableTime) throws RemoteException, ScheduleServiceExceptionException {
        AllocateClient request = new AllocateClient();
        request.setClientCpf(clientCpf);
        request.setDoctorCrm(doctorCrm);
        request.setSpecialty(specialty);
        request.setAvailableTime(availableTime);

        this.stub.allocateClient(request);
    }
}
