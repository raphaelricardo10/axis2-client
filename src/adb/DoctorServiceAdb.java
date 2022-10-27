package adb;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import doctor.services.DoctorServiceStub;
import doctor.services.DoctorServiceStub.DoctorStub;
import doctor.services.DoctorServiceStub.GetDoctors;

public class DoctorServiceAdb extends AdbClient {
    private DoctorServiceStub stub;

    public DoctorServiceAdb(String url) throws AxisFault {
        super(url);
        this.stub = new DoctorServiceStub(url);
    }

    public DoctorStub[] getDoctors() throws RemoteException {
        GetDoctors request = new GetDoctors();

        return this.stub.getDoctors(request).get_return();
    }
}
