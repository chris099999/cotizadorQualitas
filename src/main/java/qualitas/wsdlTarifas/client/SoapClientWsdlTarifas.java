package qualitas.wsdlTarifas.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import qualitas.form.QltsTarifasMarcas;
import qualitas.wsdlTarifas.ListaMarcas;
import qualitas.wsdlTarifas.ListaMarcasResponse;
import qualitas.wsdlTarifas.ListaTarifas;
import qualitas.wsdlTarifas.ListaTarifasResponse;

@Service
public class SoapClientWsdlTarifas  extends WebServiceGatewaySupport{
	
	@Autowired
	private Jaxb2Marshaller marshaller;

	private WebServiceTemplate template;
	
	
	public ListaMarcasResponse listaMarcasResponse(String cTarifa , String cUsuario) {
		template = new WebServiceTemplate(marshaller);

		ListaMarcas listaRequest = new ListaMarcas();
		listaRequest.setCTarifa(cTarifa);
		listaRequest.setCUsuario(cUsuario);
		SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/WSQBC/QBCDE/listaMarcas");
		
		ListaMarcasResponse listaMarcasResponse = (ListaMarcasResponse) 
		template.marshalSendAndReceive("https://qbcenter.qualitas.com.mx/wsTarifa/wsTarifa.asmx",listaRequest,soapActionCallback);
//		ListaMarcasResponse listaMarcasResponse = (ListaMarcasResponse) getWebServiceTemplate()
//		.marshalSendAndReceive("https://qbcenter.qualitas.com.mx/wsTarifa/wsTarifa.asmx",listaRequest,soapActionCallback);
		 return listaMarcasResponse;
	}
	
	
	public ListaTarifasResponse listaTarifasResponse ( QltsTarifasMarcas listaTarifas) {
		template = new WebServiceTemplate(marshaller);
	    String cCategoria= String.valueOf(listaTarifas.getcCategoria());

		ListaTarifas listaRequest = new ListaTarifas();
		listaRequest.setCUsuario(listaTarifas.getcUsuario());
		listaRequest.setCTarifa(listaTarifas.getcTarifa());
		listaRequest.setCCategoria(cCategoria);
		
		listaRequest.setCCAMIS("");
		listaRequest.setCMarca("");
		listaRequest.setCModelo("");
		listaRequest.setCNvaAMIS("");
		listaRequest.setCVersion("");
		listaRequest.setCCAMIS("");
		listaRequest.setCTipo("");
		SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/WSQBC/QBCDE/listaTarifas");
		ListaTarifasResponse listaTarifasResponse = (ListaTarifasResponse) 
		template.marshalSendAndReceive("https://qbcenter.qualitas.com.mx/wsTarifa/wsTarifa.asmx",listaRequest,soapActionCallback);
		return listaTarifasResponse;
	}

}
