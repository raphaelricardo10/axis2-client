/**
 * ScheduleServiceCallbackHandler.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.2 Built on : Jul 13,
 * 2022 (06:38:03 EDT)
 */
package schedule.services;

/**
 * ScheduleServiceCallbackHandler Callback class, Users can extend this class and implement their
 * own receiveResult and receiveError methods.
 */
public abstract class ScheduleServiceCallbackHandler {

  protected Object clientData;

  /**
   * User can pass in any object that needs to be accessed once the NonBlocking Web service call is
   * finished and appropriate method of this CallBack is called.
   *
   * @param clientData Object mechanism by which the user can pass in user data that will be
   *     avilable at the time this callback is called.
   */
  public ScheduleServiceCallbackHandler(Object clientData) {
    this.clientData = clientData;
  }

  /** Please use this constructor if you don't want to set any clientData */
  public ScheduleServiceCallbackHandler() {
    this.clientData = null;
  }

  /** Get the client data */
  public Object getClientData() {
    return clientData;
  }

  /**
   * auto generated Axis2 call back method for getFirstAvailableDate method override this method for
   * handling normal response from getFirstAvailableDate operation
   */
  public void receiveResultgetFirstAvailableDate(
      schedule.services.ScheduleServiceStub.GetFirstAvailableDateResponse result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getFirstAvailableDate operation
   */
  public void receiveErrorgetFirstAvailableDate(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for allocateClient method override this method for
   * handling normal response from allocateClient operation
   */
  public void receiveResultallocateClient() {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * allocateClient operation
   */
  public void receiveErrorallocateClient(java.lang.Exception e) {}

  /**
   * auto generated Axis2 call back method for getClientAllocations method override this method for
   * handling normal response from getClientAllocations operation
   */
  public void receiveResultgetClientAllocations(
      schedule.services.ScheduleServiceStub.GetClientAllocationsResponse result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getClientAllocations operation
   */
  public void receiveErrorgetClientAllocations(java.lang.Exception e) {}
}
