/**
 * ScheduleServiceStub.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.2 Built on : Jul 13,
 * 2022 (06:38:03 EDT)
 */
package schedule.services;

/*
 *  ScheduleServiceStub java implementation
 */

public class ScheduleServiceStub extends org.apache.axis2.client.Stub {
  protected org.apache.axis2.description.AxisOperation[] _operations;

  // hashmaps to keep the fault mapping
  private java.util.Map<org.apache.axis2.client.FaultMapKey, java.lang.String>
      faultExceptionNameMap =
          new java.util.HashMap<org.apache.axis2.client.FaultMapKey, java.lang.String>();
  private java.util.Map<org.apache.axis2.client.FaultMapKey, java.lang.String>
      faultExceptionClassNameMap =
          new java.util.HashMap<org.apache.axis2.client.FaultMapKey, java.lang.String>();
  private java.util.Map<org.apache.axis2.client.FaultMapKey, java.lang.String> faultMessageMap =
      new java.util.HashMap<org.apache.axis2.client.FaultMapKey, java.lang.String>();

  private static int counter = 0;

  private static synchronized java.lang.String getUniqueSuffix() {
    // reset the counter if it is greater than 99999
    if (counter > 99999) {
      counter = 0;
    }
    counter = counter + 1;
    return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
  }

  private void populateAxisService() throws org.apache.axis2.AxisFault {

    // creating the Service with a unique name
    _service = new org.apache.axis2.description.AxisService("ScheduleService" + getUniqueSuffix());
    addAnonymousOperations();

    // creating the operations
    org.apache.axis2.description.AxisOperation __operation;

    _operations = new org.apache.axis2.description.AxisOperation[2];

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://services.schedule/", "getFirstAvailableDate"));
    _service.addOperation(__operation);

    _operations[0] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://services.schedule/", "allocateClient"));
    _service.addOperation(__operation);

    _operations[1] = __operation;
  }

  // populates the faults
  private void populateFaults() {

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://services.schedule/", "ScheduleServiceException"),
            "allocateClient"),
        "schedule.services.ScheduleServiceExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://services.schedule/", "ScheduleServiceException"),
            "allocateClient"),
        "schedule.services.ScheduleServiceExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://services.schedule/", "ScheduleServiceException"),
            "allocateClient"),
        "schedule.services.ScheduleServiceStub$ScheduleServiceException");
  }

  /** Constructor that takes in a configContext */
  public ScheduleServiceStub(
      org.apache.axis2.context.ConfigurationContext configurationContext,
      java.lang.String targetEndpoint)
      throws org.apache.axis2.AxisFault {
    this(configurationContext, targetEndpoint, false);
  }

  /** Constructor that takes in a configContext and useseperate listner */
  public ScheduleServiceStub(
      org.apache.axis2.context.ConfigurationContext configurationContext,
      java.lang.String targetEndpoint,
      boolean useSeparateListener)
      throws org.apache.axis2.AxisFault {
    // To populate AxisService
    populateAxisService();
    populateFaults();

    _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

    _serviceClient
        .getOptions()
        .setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
    _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

    // Set the soap version
    _serviceClient
        .getOptions()
        .setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
  }

  /** Default Constructor */
  public ScheduleServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext)
      throws org.apache.axis2.AxisFault {

    this(configurationContext, "http://localhost:8080/axis2/services/ScheduleService");
  }

  /** Default Constructor */
  public ScheduleServiceStub() throws org.apache.axis2.AxisFault {

    this("http://localhost:8080/axis2/services/ScheduleService");
  }

  /** Constructor taking the target endpoint */
  public ScheduleServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
    this(null, targetEndpoint);
  }

  /**
   * Auto generated method signature
   *
   * @see schedule.services.ScheduleService#getFirstAvailableDate
   * @param getFirstAvailableDate1
   */
  public schedule.services.ScheduleServiceStub.GetFirstAvailableDateResponse getFirstAvailableDate(
      schedule.services.ScheduleServiceStub.GetFirstAvailableDate getFirstAvailableDate1)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[0].getName());
      _operationClient.getOptions().setAction("urn:getFirstAvailableDate");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getFirstAvailableDate1,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://services.schedule/", "getFirstAvailableDate")),
              new javax.xml.namespace.QName("http://services.schedule/", "getFirstAvailableDate"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              schedule.services.ScheduleServiceStub.GetFirstAvailableDateResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (schedule.services.ScheduleServiceStub.GetFirstAvailableDateResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "getFirstAvailableDate"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getFirstAvailableDate"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getFirstAvailableDate"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations
   *
   * @see schedule.services.ScheduleService#startgetFirstAvailableDate
   * @param getFirstAvailableDate1
   */
  public void startgetFirstAvailableDate(
      schedule.services.ScheduleServiceStub.GetFirstAvailableDate getFirstAvailableDate1,
      final schedule.services.ScheduleServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[0].getName());
    _operationClient.getOptions().setAction("urn:getFirstAvailableDate");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            getFirstAvailableDate1,
            optimizeContent(
                new javax.xml.namespace.QName(
                    "http://services.schedule/", "getFirstAvailableDate")),
            new javax.xml.namespace.QName("http://services.schedule/", "getFirstAvailableDate"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    _operationClient.setCallback(
        new org.apache.axis2.client.async.AxisCallback() {
          public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
              org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

              java.lang.Object object =
                  fromOM(
                      resultEnv.getBody().getFirstElement(),
                      schedule.services.ScheduleServiceStub.GetFirstAvailableDateResponse.class);
              callback.receiveResultgetFirstAvailableDate(
                  (schedule.services.ScheduleServiceStub.GetFirstAvailableDateResponse) object);

            } catch (org.apache.axis2.AxisFault e) {
              callback.receiveErrorgetFirstAvailableDate(e);
            }
          }

          public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
              org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
              org.apache.axiom.om.OMElement faultElt = f.getDetail();
              if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getFirstAvailableDate"))) {
                  // make the fault by reflection
                  try {
                    java.lang.String exceptionClassName =
                        faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "getFirstAvailableDate"));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor =
                        exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex =
                        (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    java.lang.String messageClassName =
                        faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "getFirstAvailableDate"));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m =
                        exceptionClass.getMethod(
                            "setFaultMessage", new java.lang.Class[] {messageClass});
                    m.invoke(ex, new java.lang.Object[] {messageObject});

                    callback.receiveErrorgetFirstAvailableDate(
                        new java.rmi.RemoteException(ex.getMessage(), ex));
                  } catch (java.lang.ClassCastException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorgetFirstAvailableDate(f);
                  } catch (java.lang.ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorgetFirstAvailableDate(f);
                  } catch (java.lang.NoSuchMethodException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorgetFirstAvailableDate(f);
                  } catch (java.lang.reflect.InvocationTargetException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorgetFirstAvailableDate(f);
                  } catch (java.lang.IllegalAccessException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorgetFirstAvailableDate(f);
                  } catch (java.lang.InstantiationException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorgetFirstAvailableDate(f);
                  } catch (org.apache.axis2.AxisFault e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrorgetFirstAvailableDate(f);
                  }
                } else {
                  callback.receiveErrorgetFirstAvailableDate(f);
                }
              } else {
                callback.receiveErrorgetFirstAvailableDate(f);
              }
            } else {
              callback.receiveErrorgetFirstAvailableDate(error);
            }
          }

          public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault =
                org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
            onError(fault);
          }

          public void onComplete() {
            try {
              _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
              callback.receiveErrorgetFirstAvailableDate(axisFault);
            }
          }
        });

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[0].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[0].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  /**
   * Auto generated method signature
   *
   * @see schedule.services.ScheduleService#allocateClient
   * @param allocateClient3
   * @throws schedule.services.ScheduleServiceExceptionException :
   */
  public void allocateClient(schedule.services.ScheduleServiceStub.AllocateClient allocateClient3)
      throws java.rmi.RemoteException, schedule.services.ScheduleServiceExceptionException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[1].getName());
      _operationClient.getOptions().setAction("urn:allocateClient");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              allocateClient3,
              optimizeContent(
                  new javax.xml.namespace.QName("http://services.schedule/", "allocateClient")),
              new javax.xml.namespace.QName("http://services.schedule/", "allocateClient"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      return;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "allocateClient"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "allocateClient"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "allocateClient"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof schedule.services.ScheduleServiceExceptionException) {
              throw (schedule.services.ScheduleServiceExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature for Asynchronous Invocations
   *
   * @see schedule.services.ScheduleService#startallocateClient
   * @param allocateClient3
   */
  public void startallocateClient(
      schedule.services.ScheduleServiceStub.AllocateClient allocateClient3,
      final schedule.services.ScheduleServiceCallbackHandler callback)
      throws java.rmi.RemoteException {

    org.apache.axis2.client.OperationClient _operationClient =
        _serviceClient.createClient(_operations[1].getName());
    _operationClient.getOptions().setAction("urn:allocateClient");
    _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

    addPropertyToOperationClient(
        _operationClient,
        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
        "&");

    // create SOAP envelope with that payload
    org.apache.axiom.soap.SOAPEnvelope env = null;
    final org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    // Style is Doc.

    env =
        toEnvelope(
            getFactory(_operationClient.getOptions().getSoapVersionURI()),
            allocateClient3,
            optimizeContent(
                new javax.xml.namespace.QName("http://services.schedule/", "allocateClient")),
            new javax.xml.namespace.QName("http://services.schedule/", "allocateClient"));

    // adding SOAP soap_headers
    _serviceClient.addHeadersToEnvelope(env);
    // create message context with that soap envelope
    _messageContext.setEnvelope(env);

    // add the message context to the operation client
    _operationClient.addMessageContext(_messageContext);

    // Nothing to pass as the callback!!!

    org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
    if (_operations[1].getMessageReceiver() == null
        && _operationClient.getOptions().isUseSeparateListener()) {
      _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
      _operations[1].setMessageReceiver(_callbackReceiver);
    }

    // execute the operation client
    _operationClient.execute(false);
  }

  private javax.xml.namespace.QName[] opNameArray = null;

  private boolean optimizeContent(javax.xml.namespace.QName opName) {

    if (opNameArray == null) {
      return false;
    }
    for (int i = 0; i < opNameArray.length; i++) {
      if (opName.equals(opNameArray[i])) {
        return true;
      }
    }
    return false;
  }
  // http://localhost:8080/axis2/services/ScheduleService
  public static class GetFirstAvailableDate implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName("http://services.schedule/", "getFirstAvailableDate", "ns4");

    /** field for Crm */
    protected java.lang.String localCrm;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCrmTracker = false;

    public boolean isCrmSpecified() {
      return localCrmTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCrm() {
      return localCrm;
    }

    /**
     * Auto generated setter method
     *
     * @param param Crm
     */
    public void setCrm(java.lang.String param) {
      localCrmTracker = true;

      this.localCrm = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://services.schedule/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getFirstAvailableDate",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getFirstAvailableDate",
              xmlWriter);
        }
      }
      if (localCrmTracker) {
        namespace = "http://services.schedule/";
        writeStartElement(null, namespace, "crm", xmlWriter);

        if (localCrm == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localCrm);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://services.schedule/")) {
        return "ns4";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static GetFirstAvailableDate parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        GetFirstAvailableDate object = new GetFirstAvailableDate();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            java.lang.String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getFirstAvailableDate".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetFirstAvailableDate) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://services.schedule/", "crm")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              java.lang.String content = reader.getElementText();

              object.setCrm(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class AllocateClient implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName("http://services.schedule/", "allocateClient", "ns4");

    /** field for ClientCpf */
    protected java.lang.String localClientCpf;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localClientCpfTracker = false;

    public boolean isClientCpfSpecified() {
      return localClientCpfTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getClientCpf() {
      return localClientCpf;
    }

    /**
     * Auto generated setter method
     *
     * @param param ClientCpf
     */
    public void setClientCpf(java.lang.String param) {
      localClientCpfTracker = true;

      this.localClientCpf = param;
    }

    /** field for DoctorCrm */
    protected java.lang.String localDoctorCrm;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDoctorCrmTracker = false;

    public boolean isDoctorCrmSpecified() {
      return localDoctorCrmTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDoctorCrm() {
      return localDoctorCrm;
    }

    /**
     * Auto generated setter method
     *
     * @param param DoctorCrm
     */
    public void setDoctorCrm(java.lang.String param) {
      localDoctorCrmTracker = true;

      this.localDoctorCrm = param;
    }

    /** field for Specialty */
    protected java.lang.String localSpecialty;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSpecialtyTracker = false;

    public boolean isSpecialtySpecified() {
      return localSpecialtyTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSpecialty() {
      return localSpecialty;
    }

    /**
     * Auto generated setter method
     *
     * @param param Specialty
     */
    public void setSpecialty(java.lang.String param) {
      localSpecialtyTracker = true;

      this.localSpecialty = param;
    }

    /** field for AvailableTime */
    protected java.lang.String localAvailableTime;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAvailableTimeTracker = false;

    public boolean isAvailableTimeSpecified() {
      return localAvailableTimeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAvailableTime() {
      return localAvailableTime;
    }

    /**
     * Auto generated setter method
     *
     * @param param AvailableTime
     */
    public void setAvailableTime(java.lang.String param) {
      localAvailableTimeTracker = true;

      this.localAvailableTime = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://services.schedule/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":allocateClient",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "allocateClient",
              xmlWriter);
        }
      }
      if (localClientCpfTracker) {
        namespace = "http://services.schedule/";
        writeStartElement(null, namespace, "clientCpf", xmlWriter);

        if (localClientCpf == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localClientCpf);
        }

        xmlWriter.writeEndElement();
      }
      if (localDoctorCrmTracker) {
        namespace = "http://services.schedule/";
        writeStartElement(null, namespace, "doctorCrm", xmlWriter);

        if (localDoctorCrm == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localDoctorCrm);
        }

        xmlWriter.writeEndElement();
      }
      if (localSpecialtyTracker) {
        namespace = "http://services.schedule/";
        writeStartElement(null, namespace, "specialty", xmlWriter);

        if (localSpecialty == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localSpecialty);
        }

        xmlWriter.writeEndElement();
      }
      if (localAvailableTimeTracker) {
        namespace = "http://services.schedule/";
        writeStartElement(null, namespace, "availableTime", xmlWriter);

        if (localAvailableTime == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localAvailableTime);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://services.schedule/")) {
        return "ns4";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static AllocateClient parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        AllocateClient object = new AllocateClient();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            java.lang.String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"allocateClient".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (AllocateClient) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://services.schedule/", "clientCpf")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              java.lang.String content = reader.getElementText();

              object.setClientCpf(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://services.schedule/", "doctorCrm")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              java.lang.String content = reader.getElementText();

              object.setDoctorCrm(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://services.schedule/", "specialty")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              java.lang.String content = reader.getElementText();

              object.setSpecialty(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://services.schedule/", "availableTime")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              java.lang.String content = reader.getElementText();

              object.setAvailableTime(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class ExtensionMapper {

    public static java.lang.Object getTypeObject(
        java.lang.String namespaceURI,
        java.lang.String typeName,
        javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {

      if ("http://services.schedule/".equals(namespaceURI) && "Exception".equals(typeName)) {

        return Exception.Factory.parse(reader);
      }

      throw new org.apache.axis2.databinding.ADBException(
          "Unsupported type " + namespaceURI + " " + typeName);
    }
  }

  public static class ScheduleServiceException implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://services.schedule/", "ScheduleServiceException", "ns4");

    /** field for ScheduleServiceException */
    protected Exception localScheduleServiceException;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localScheduleServiceExceptionTracker = false;

    public boolean isScheduleServiceExceptionSpecified() {
      return localScheduleServiceExceptionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return Exception
     */
    public Exception getScheduleServiceException() {
      return localScheduleServiceException;
    }

    /**
     * Auto generated setter method
     *
     * @param param ScheduleServiceException
     */
    public void setScheduleServiceException(Exception param) {
      localScheduleServiceExceptionTracker = true;

      this.localScheduleServiceException = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://services.schedule/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":ScheduleServiceException",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "ScheduleServiceException",
              xmlWriter);
        }
      }
      if (localScheduleServiceExceptionTracker) {
        if (localScheduleServiceException == null) {

          writeStartElement(
              null, "http://services.schedule/", "ScheduleServiceException", xmlWriter);

          // write the nil attribute
          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
          xmlWriter.writeEndElement();
        } else {
          localScheduleServiceException.serialize(
              new javax.xml.namespace.QName(
                  "http://services.schedule/", "ScheduleServiceException"),
              xmlWriter);
        }
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://services.schedule/")) {
        return "ns4";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static ScheduleServiceException parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        ScheduleServiceException object = new ScheduleServiceException();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          nillableValue =
              reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
          if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
            // Skip the element and report the null value.  It cannot have subelements.
            while (!reader.isEndElement()) reader.next();

            return null;
          }

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            java.lang.String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"ScheduleServiceException".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (ScheduleServiceException)
                    ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName(
                      "http://services.schedule/", "ScheduleServiceException")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              object.setScheduleServiceException(null);
              reader.next();

              reader.next();

            } else {

              object.setScheduleServiceException(Exception.Factory.parse(reader));

              reader.next();
            }
          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetFirstAvailableDateResponse
      implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://services.schedule/", "getFirstAvailableDateResponse", "ns4");

    /** field for _return */
    protected java.lang.String local_return;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_returnTracker = false;

    public boolean is_returnSpecified() {
      return local_returnTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String get_return() {
      return local_return;
    }

    /**
     * Auto generated setter method
     *
     * @param param _return
     */
    public void set_return(java.lang.String param) {
      local_returnTracker = true;

      this.local_return = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://services.schedule/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getFirstAvailableDateResponse",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getFirstAvailableDateResponse",
              xmlWriter);
        }
      }
      if (local_returnTracker) {
        namespace = "http://services.schedule/";
        writeStartElement(null, namespace, "return", xmlWriter);

        if (local_return == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_return);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://services.schedule/")) {
        return "ns4";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static GetFirstAvailableDateResponse parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        GetFirstAvailableDateResponse object = new GetFirstAvailableDateResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            java.lang.String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getFirstAvailableDateResponse".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetFirstAvailableDateResponse)
                    ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://services.schedule/", "return")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              java.lang.String content = reader.getElementText();

              object.set_return(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class Exception implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
    name = Exception
    Namespace URI = http://services.schedule/
    Namespace Prefix = ns4
    */

    /** field for Message */
    protected java.lang.String localMessage;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMessageTracker = false;

    public boolean isMessageSpecified() {
      return localMessageTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMessage() {
      return localMessage;
    }

    /**
     * Auto generated setter method
     *
     * @param param Message
     */
    public void setMessage(java.lang.String param) {
      localMessageTracker = true;

      this.localMessage = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://services.schedule/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":Exception",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "Exception", xmlWriter);
        }
      }
      if (localMessageTracker) {
        namespace = "http://services.schedule/";
        writeStartElement(null, namespace, "Message", xmlWriter);

        if (localMessage == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localMessage);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://services.schedule/")) {
        return "ns4";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        java.lang.String prefix,
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        java.lang.String namespace,
        java.lang.String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static Exception parse(javax.xml.stream.XMLStreamReader reader)
          throws java.lang.Exception {
        Exception object = new Exception();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            java.lang.String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"Exception".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (Exception) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://services.schedule/", "Message")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              java.lang.String content = reader.getElementText();

              object.setMessage(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  private org.apache.axiom.om.OMElement toOM(
      schedule.services.ScheduleServiceStub.GetFirstAvailableDate param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          schedule.services.ScheduleServiceStub.GetFirstAvailableDate.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      schedule.services.ScheduleServiceStub.GetFirstAvailableDateResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          schedule.services.ScheduleServiceStub.GetFirstAvailableDateResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      schedule.services.ScheduleServiceStub.AllocateClient param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          schedule.services.ScheduleServiceStub.AllocateClient.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      schedule.services.ScheduleServiceStub.ScheduleServiceException param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          schedule.services.ScheduleServiceStub.ScheduleServiceException.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      schedule.services.ScheduleServiceStub.GetFirstAvailableDate param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  schedule.services.ScheduleServiceStub.GetFirstAvailableDate.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      schedule.services.ScheduleServiceStub.AllocateClient param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  schedule.services.ScheduleServiceStub.AllocateClient.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  /** get the default envelope */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
    return factory.getDefaultEnvelope();
  }

  private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type)
      throws org.apache.axis2.AxisFault {

    try {

      if (schedule.services.ScheduleServiceStub.AllocateClient.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            schedule.services.ScheduleServiceStub.AllocateClient.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (schedule.services.ScheduleServiceStub.GetFirstAvailableDate.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            schedule.services.ScheduleServiceStub.GetFirstAvailableDate.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (schedule.services.ScheduleServiceStub.GetFirstAvailableDateResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            schedule.services.ScheduleServiceStub.GetFirstAvailableDateResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (schedule.services.ScheduleServiceStub.ScheduleServiceException.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            schedule.services.ScheduleServiceStub.ScheduleServiceException.Factory.parse(reader);
        reader.close();
        return result;
      }

    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
    return null;
  }
}
