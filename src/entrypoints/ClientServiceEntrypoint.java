package entrypoints;

import java.rmi.RemoteException;

import client.services.ClientServiceStub.PersonStub;
import client.services.ClientServiceExceptionException;

public class ClientServiceEntrypoint {

    public static void main(String[] args) throws RemoteException, ClientServiceExceptionException {
        ServiceHub services = new ServiceHub();

        PersonStub createdClient = services.clientService.createClient("Raphael Gonçalves", "raphaelricardo10@gmail.com", "161.491.137-10", "MALE",
        "(21) 98678-6884", "1996-12-27");

        createdClient.setName("Lucas Ferreira");

        services.clientService.updateClient(createdClient);

        createdClient = services.clientService.getClients()[0];
        
        System.out.println(createdClient.getName());

        services.clientService.removeClient(createdClient.getCpf());

        System.out.println(services.clientService.getClients());

    }
}
