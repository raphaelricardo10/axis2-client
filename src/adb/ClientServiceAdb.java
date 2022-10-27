package adb;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import client.services.ClientServiceStub;
import client.services.ClientServiceStub.GetClients;
import client.services.ClientServiceStub.PersonStub;

public class ClientServiceAdb extends AdbClient {
    private ClientServiceStub stub;

    public ClientServiceAdb(String url) throws AxisFault {
        super(url);
        this.stub = new ClientServiceStub(url);
    }

    public PersonStub[] getClients() throws RemoteException {
        GetClients request = new GetClients();

        return this.stub.getClients(request).get_return();
    }
}
