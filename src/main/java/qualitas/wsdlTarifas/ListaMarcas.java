//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.02.15 a las 11:07:23 PM CST 
//


package qualitas.wsdlTarifas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cUsuario",
    "cTarifa"
})
@XmlRootElement(name = "listaMarcas", namespace = "http://tempuri.org/WSQBC/QBCDE")
public class ListaMarcas {

    @XmlElement(namespace = "http://tempuri.org/WSQBC/QBCDE")
    protected String cUsuario;
    @XmlElement(namespace = "http://tempuri.org/WSQBC/QBCDE")
    protected String cTarifa;

    /**
     * Obtiene el valor de la propiedad cUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUsuario() {
        return cUsuario;
    }

    /**
     * Define el valor de la propiedad cUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUsuario(String value) {
        this.cUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad cTarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTarifa() {
        return cTarifa;
    }

    /**
     * Define el valor de la propiedad cTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTarifa(String value) {
        this.cTarifa = value;
    }


    
}
