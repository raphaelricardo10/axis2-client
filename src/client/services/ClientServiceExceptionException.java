/**
 * ClientServiceExceptionException.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.2 Built on : Jul 13,
 * 2022 (06:38:03 EDT)
 */
package client.services;

public class ClientServiceExceptionException extends java.lang.Exception {

  private static final long serialVersionUID = 1667263269750L;

  private client.services.ClientServiceStub.ClientServiceException faultMessage;

  public ClientServiceExceptionException() {
    super("ClientServiceExceptionException");
  }

  public ClientServiceExceptionException(java.lang.String s) {
    super(s);
  }

  public ClientServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
    super(s, ex);
  }

  public ClientServiceExceptionException(java.lang.Throwable cause) {
    super(cause);
  }

  public void setFaultMessage(client.services.ClientServiceStub.ClientServiceException msg) {
    faultMessage = msg;
  }

  public client.services.ClientServiceStub.ClientServiceException getFaultMessage() {
    return faultMessage;
  }
}
