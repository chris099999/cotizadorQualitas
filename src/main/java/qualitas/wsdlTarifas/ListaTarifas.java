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
 *         &lt;element name="cMarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cModelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cCAMIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cCategoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cNvaAMIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "cTarifa",
    "cMarca",
    "cTipo",
    "cVersion",
    "cModelo",
    "ccamis",
    "cCategoria",
    "cNvaAMIS"
})
@XmlRootElement(name = "listaTarifas", namespace = "http://tempuri.org/WSQBC/QBCDE")
public class ListaTarifas {

    @XmlElement(namespace = "http://tempuri.org/WSQBC/QBCDE")
    protected String cUsuario;
    @XmlElement(namespace = "http://tempuri.org/WSQBC/QBCDE")
    protected String cTarifa;
    @XmlElement(namespace = "http://tempuri.org/WSQBC/QBCDE")
    protected String cMarca;
    @XmlElement(namespace = "http://tempuri.org/WSQBC/QBCDE")
    protected String cTipo;
    @XmlElement(namespace = "http://tempuri.org/WSQBC/QBCDE")
    protected String cVersion;
    @XmlElement(namespace = "http://tempuri.org/WSQBC/QBCDE")
    protected String cModelo;
    @XmlElement(name = "cCAMIS", namespace = "http://tempuri.org/WSQBC/QBCDE")
    protected String ccamis;
    @XmlElement(namespace = "http://tempuri.org/WSQBC/QBCDE")
    protected String cCategoria;
    @XmlElement(namespace = "http://tempuri.org/WSQBC/QBCDE")
    protected String cNvaAMIS;

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

    /**
     * Obtiene el valor de la propiedad cMarca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMarca() {
        return cMarca;
    }

    /**
     * Define el valor de la propiedad cMarca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMarca(String value) {
        this.cMarca = value;
    }

    /**
     * Obtiene el valor de la propiedad cTipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTipo() {
        return cTipo;
    }

    /**
     * Define el valor de la propiedad cTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTipo(String value) {
        this.cTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad cVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVersion() {
        return cVersion;
    }

    /**
     * Define el valor de la propiedad cVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVersion(String value) {
        this.cVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad cModelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCModelo() {
        return cModelo;
    }

    /**
     * Define el valor de la propiedad cModelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCModelo(String value) {
        this.cModelo = value;
    }

    /**
     * Obtiene el valor de la propiedad ccamis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCAMIS() {
        return ccamis;
    }

    /**
     * Define el valor de la propiedad ccamis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCAMIS(String value) {
        this.ccamis = value;
    }

    /**
     * Obtiene el valor de la propiedad cCategoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCategoria() {
        return cCategoria;
    }

    /**
     * Define el valor de la propiedad cCategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCategoria(String value) {
        this.cCategoria = value;
    }

    /**
     * Obtiene el valor de la propiedad cNvaAMIS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNvaAMIS() {
        return cNvaAMIS;
    }

    /**
     * Define el valor de la propiedad cNvaAMIS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNvaAMIS(String value) {
        this.cNvaAMIS = value;
    }

}
