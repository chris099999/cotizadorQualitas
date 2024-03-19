package qualitas.wsdlTarifas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;



@Configuration
public class SoapConfigWsTarifas {
    
	@Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("qualitas.wsdlTarifas");
        return marshaller;
    }
    
//    @Bean
//    public SoapClientWsdlTarifas getSoapClient(Jaxb2Marshaller marshaller){
//    	SoapClientWsdlTarifas soapClient = new SoapClientWsdlTarifas();
//        soapClient.setDefaultUri("https://qbcenter.qualitas.com.mx/wsTarifa/wsTarifa.asmx");
//        soapClient.setMarshaller(marshaller);
//        soapClient.setUnmarshaller(marshaller);
//        return soapClient;
//    }

}
