package qualitas.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import qualitas.form.QltsDetallesCobertura;
import qualitas.form.QltsPaquetes;
import qualitas.form.QltsTarifasMarcas;
import qualitas.service.MarcasTarifaService;
import qualitas.service.QltsDetallesCoberturaService;
import qualitas.service.QltsPaquetesService;
import qualitas.wsdlTarifas.ListaMarcas;
import qualitas.wsdlTarifas.ListaMarcasResponse;
import qualitas.wsdlTarifas.client.SoapClientWsdlTarifas;

@SpringBootApplication
@RestController
public class WsTarifasController {

	@Autowired
	SoapClientWsdlTarifas clientWsdlTarifas;
	
	@Autowired
	MarcasTarifaService marcasTarifaService;

	@Autowired
	QltsDetallesCoberturaService coberturaService;
	
	@Autowired
	QltsPaquetesService paquetesService;
	
	
	@PostMapping("/qualitas/cotizador/listarMarcas")
	public @ResponseBody String getmarcas(@RequestBody ListaMarcas marcas) {
		ListaMarcasResponse response = clientWsdlTarifas.listaMarcasResponse("LINEA", "LINEA");
		ObjectMapper objectMapper = new ObjectMapper();

		String jsonResponse = "";
		try {
			jsonResponse = objectMapper.writeValueAsString(clientWsdlTarifas.listaMarcasResponse("LINEA", "LINEA"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		String[] parts = jsonResponse.split("content");
		String xmlParst = parts[1];
		String xmlParstJson = xmlParst.replace("}}", "");
		xmlParstJson = xmlParstJson.replace(":[", "");
		xmlParstJson = xmlParstJson.replace("]", "");
		xmlParstJson = xmlParstJson.replace("\\", "");

		//CONVERTI EL CONTENIDO DEL XML A JSON
		JSONObject jsonObject = XML.toJSONObject(xmlParstJson);
		xmlParstJson = jsonObject.toString(2);		

		return xmlParstJson;
	}
	
	// inserta el arreglo de objetos de todas las marcas
	@PostMapping("/qualitas/cotizador/insertaMarcas")
	public  List<QltsTarifasMarcas> insertaMarcas(@RequestBody List <QltsTarifasMarcas> wstarfiasMarcas) {
		 return marcasTarifaService.insertarMarcasTarifas(wstarfiasMarcas);
	}
	
	@PostMapping("/qualitas/cotizador/listarTarifas")
	public @ResponseBody String getTarifas (@RequestBody  QltsTarifasMarcas listaTarifas) {
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonResponse = "";
		try {
			jsonResponse = objectMapper.writeValueAsString(clientWsdlTarifas.listaTarifasResponse(listaTarifas));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String[] parts = jsonResponse.split("content");
		String xmlParst = parts[1];
		String xmlParstJson = xmlParst.replace("}}", "");
		xmlParstJson = xmlParstJson.replace(":[", "");
		xmlParstJson = xmlParstJson.replace("]", "");
		xmlParstJson = xmlParstJson.replace("\\", "");
		xmlParstJson = xmlParstJson.replace("CAMIS", "cAmis");

		//CONVERTI EL CONTENIDO DEL XML A JSON
		JSONObject jsonObject = XML.toJSONObject(xmlParstJson);
		xmlParstJson = jsonObject.toString(2);	
		
		
		return xmlParstJson;
	}
	
	// retorna marcas largar primer select
	@GetMapping("/qualitas/cotizador/listar/MarcasLargas")
	public @ResponseBody List<String> getMarcaLarga() {
		 return marcasTarifaService.getMarcasLargas();
	}

	// toda la informacion de los carro
	@GetMapping("/qualitas/cotizador/listar/dataCar")
	public  List<Integer> getDataCar(@RequestParam String cMarcaLarga) {
	    return marcasTarifaService.getModel(cMarcaLarga);
	}
	
	
	// retorna la submarca tercer select 
	@GetMapping("/qualitas/cotizador/listar/subMarca")
	public @ResponseBody List<String> getSubMarcaCtipo(@RequestParam String cMarcaLarga, int cModelo) {
		 return marcasTarifaService.getSubMarcaCtipo(cMarcaLarga, cModelo);
	}
	
	// retorna la version cuarto select

	@GetMapping("/qualitas/cotizador/listar/version")
	public @ResponseBody List<String> getVersion(@RequestParam String cMarcaLarga , int cModelo, String cTipo) {
		 return marcasTarifaService.getVersion(cMarcaLarga, cModelo,cTipo);
	}
	
	//********************DETALLECOBERTURAS*****************************
	@GetMapping("/qualitas/cotizador/get/detail/coverage")
	public @ResponseBody List<QltsDetallesCobertura> getDetailCoverage(@RequestParam Integer cCategoria  ,  String cTipo) {		
		 return coberturaService.getDetailCoverage(cCategoria , cTipo);
	}
	
	//********************PAQUETES*****************************
	@GetMapping("/qualitas/cotizador/get/packages")
	public @ResponseBody List<QltsPaquetes> getPackages(@RequestParam Integer cCategoria ){
		return paquetesService.getPackages(cCategoria);
	}


	
	
	
}
