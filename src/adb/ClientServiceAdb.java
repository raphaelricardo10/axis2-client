package adb;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import client.services.ClientServiceStub;
import client.services.ClientServiceStub.GetClients;
import client.services.ClientServiceStub.PersonStub;
import client.services.ClientServiceStub.RemoveClient;
import client.services.ClientServiceStub.UpdateClient;
import client.services.ClientServiceStub.CreateClient;
import client.services.ClientServiceExceptionException;

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
    
    public PersonStub createClient(String name, String email, String cpf, String gender, String phoneNumber, String birthDate) throws RemoteException, ClientServiceExceptionException {
        CreateClient request = new CreateClient();
        request.setCpf(cpf);
        request.setName(name);
        request.setEmail(email);
        request.setGender(gender);
        request.setBirthDate(birthDate);
        request.setPhoneNumber(phoneNumber);

        return this.stub.createClient(request).get_return();
    }

    public void removeClient(String cpf) throws RemoteException, ClientServiceExceptionException {
        RemoveClient request = new RemoveClient();
        request.setCpf(cpf);

        this.stub.removeClient(request);
    }

    public void updateClient(PersonStub client) throws RemoteException, ClientServiceExceptionException {
        UpdateClient request = new UpdateClient();
        request.setClient(client);

        this.stub.updateClient(request);
    }
}
