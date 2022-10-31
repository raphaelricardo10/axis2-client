package entrypoints;

import org.apache.axis2.AxisFault;

import adb.ClientServiceAdb;
import adb.DoctorServiceAdb;
import adb.ScheduleServiceAdb;

public class ServiceHub {
    private final static String CLIENT_END_POINT = "http://localhost:8080/axis2/services/ClientService?wsdl";
    private final static String DOCTOR_END_POINT = "http://localhost:8080/axis2/services/DoctorService?wsdl";
    private final static String SCHEDULE_END_POINT = "http://localhost:8080/axis2/services/ScheduleService?wsdl";

    protected ClientServiceAdb clientService;
    protected DoctorServiceAdb doctorService;
    protected ScheduleServiceAdb scheduleService;

    ServiceHub() throws AxisFault {
        this.clientService = new ClientServiceAdb(CLIENT_END_POINT);
        this.doctorService = new DoctorServiceAdb(DOCTOR_END_POINT);
        this.scheduleService = new ScheduleServiceAdb(SCHEDULE_END_POINT);
    }
}
