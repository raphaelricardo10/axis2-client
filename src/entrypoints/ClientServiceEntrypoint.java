package entrypoints;

import java.rmi.RemoteException;

import client.services.ClientServiceStub.PersonStub;
import client.services.ClientServiceExceptionException;

public class ClientServiceEntrypoint {

    public static void main(String[] args) throws RemoteException, ClientServiceExceptionException {
        ServiceHub services = new ServiceHub();

        PersonStub createdClient = services.clientService.createClient("Raphael Gonçalves", "raphaelricardo10@gmail.com", "161.491.137-10", "MALE",
        "(21) 98678-6884", "1996-12-27");

        System.out.println(createdClient.getName());
    }
}
