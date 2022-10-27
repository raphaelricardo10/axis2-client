/**
 * ScheduleServiceExceptionException.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.2 Built on : Jul 13,
 * 2022 (06:38:03 EDT)
 */
package schedule.services;

public class ScheduleServiceExceptionException extends java.lang.Exception {

  private static final long serialVersionUID = 1666820872122L;

  private schedule.services.ScheduleServiceStub.ScheduleServiceException faultMessage;

  public ScheduleServiceExceptionException() {
    super("ScheduleServiceExceptionException");
  }

  public ScheduleServiceExceptionException(java.lang.String s) {
    super(s);
  }

  public ScheduleServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
    super(s, ex);
  }

  public ScheduleServiceExceptionException(java.lang.Throwable cause) {
    super(cause);
  }

  public void setFaultMessage(schedule.services.ScheduleServiceStub.ScheduleServiceException msg) {
    faultMessage = msg;
  }

  public schedule.services.ScheduleServiceStub.ScheduleServiceException getFaultMessage() {
    return faultMessage;
  }
}
