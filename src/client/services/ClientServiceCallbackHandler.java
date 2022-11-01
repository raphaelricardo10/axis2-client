/**
 * ClientServiceCallbackHandler.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.2 Built on : Jul 13,
 * 2022 (06:38:03 EDT)
 */
package client.services;

/**
 * ClientServiceCallbackHandler Callback class, Users can extend this class and implement their own
 * receiveResult and receiveError methods.
 */
public abstract class ClientServiceCallbackHandler {

  protected Object clientData;

  /**
   * User can pass in any object that needs to be accessed once the NonBlocking Web service call is
   * finished and appropriate method of this CallBack is called.
   *
   * @param clientData Object mechanism by which the user can pass in user data that will be
   *     avilable at the time this callback is called.
   */
  public ClientServiceCallbackHandler(Object clientData) {
    this.clientData = clientData;
  }

  /** Please use this constructor if you don't want to set any clientData */
  public ClientServiceCallbackHandler() {
    this.clientData = null;
  }

  /** Get the client data */
  public Object getClientData() {
    return clientData;
  }

  /**
   * auto generated Axis2 call back method for createClient method override this method for handling
   * normal response from createClient operation
   */
  public void receiveResultcreateClient(
      client.services.ClientServiceStub.CreateClientResponse result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * createClient operation
   */
  public void receiveErrorcreateClient(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getClients method override this method for handling
   * normal response from getClients operation
   */
  public void receiveResultgetClients(
      client.services.ClientServiceStub.GetClientsResponse result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getClients operation
   */
  public void receiveErrorgetClients(java.lang.Exception e) {}
}
