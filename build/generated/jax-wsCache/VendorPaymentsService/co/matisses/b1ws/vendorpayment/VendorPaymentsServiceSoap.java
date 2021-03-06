
package co.matisses.b1ws.vendorpayment;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "VendorPaymentsServiceSoap", targetNamespace = "VendorPaymentsService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VendorPaymentsServiceSoap {


    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.vendorpayment.AddResponse
     */
    @WebMethod(operationName = "Add", action = "VendorPaymentsService/Add")
    @WebResult(name = "AddResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public AddResponse add(
        @WebParam(name = "Add", targetNamespace = "VendorPaymentsService", partName = "parameters")
        Add parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.vendorpayment.GetByParamsResponse
     */
    @WebMethod(operationName = "GetByParams", action = "VendorPaymentsService/GetByParams")
    @WebResult(name = "GetByParamsResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public GetByParamsResponse getByParams(
        @WebParam(name = "GetByParams", targetNamespace = "VendorPaymentsService", partName = "parameters")
        GetByParams parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.vendorpayment.UpdateResponse
     */
    @WebMethod(operationName = "Update", action = "VendorPaymentsService/Update")
    @WebResult(name = "UpdateResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public UpdateResponse update(
        @WebParam(name = "Update", targetNamespace = "VendorPaymentsService", partName = "parameters")
        Update parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.vendorpayment.RemoveResponse
     */
    @WebMethod(operationName = "Remove", action = "VendorPaymentsService/Remove")
    @WebResult(name = "RemoveResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public RemoveResponse remove(
        @WebParam(name = "Remove", targetNamespace = "VendorPaymentsService", partName = "parameters")
        Remove parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.vendorpayment.CancelResponse
     */
    @WebMethod(operationName = "Cancel", action = "VendorPaymentsService/Cancel")
    @WebResult(name = "CancelResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public CancelResponse cancel(
        @WebParam(name = "Cancel", targetNamespace = "VendorPaymentsService", partName = "parameters")
        Cancel parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.vendorpayment.SaveDraftToDocumentResponse
     */
    @WebMethod(operationName = "SaveDraftToDocument", action = "VendorPaymentsService/SaveDraftToDocument")
    @WebResult(name = "SaveDraftToDocumentResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public SaveDraftToDocumentResponse saveDraftToDocument(
        @WebParam(name = "SaveDraftToDocument", targetNamespace = "VendorPaymentsService", partName = "parameters")
        SaveDraftToDocument parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.vendorpayment.GetApprovalTemplatesResponse
     */
    @WebMethod(operationName = "GetApprovalTemplates", action = "VendorPaymentsService/GetApprovalTemplates")
    @WebResult(name = "GetApprovalTemplatesResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public GetApprovalTemplatesResponse getApprovalTemplates(
        @WebParam(name = "GetApprovalTemplates", targetNamespace = "VendorPaymentsService", partName = "parameters")
        GetApprovalTemplates parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

    /**
     * 
     * @param requestHeader
     * @param parameters
     * @return
     *     returns co.matisses.b1ws.vendorpayment.CancelbyCurrentSystemDateResponse
     */
    @WebMethod(operationName = "CancelbyCurrentSystemDate", action = "VendorPaymentsService/CancelbyCurrentSystemDate")
    @WebResult(name = "CancelbyCurrentSystemDateResponse", targetNamespace = "http://www.sap.com/SBO/DIS", partName = "parameters")
    public CancelbyCurrentSystemDateResponse cancelbyCurrentSystemDate(
        @WebParam(name = "CancelbyCurrentSystemDate", targetNamespace = "VendorPaymentsService", partName = "parameters")
        CancelbyCurrentSystemDate parameters,
        @WebParam(name = "MsgHeader", targetNamespace = "http://www.sap.com/SBO/DIS", header = true, partName = "request_header")
        MsgHeader requestHeader);

}
