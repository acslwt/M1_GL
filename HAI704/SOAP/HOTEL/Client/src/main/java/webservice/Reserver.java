
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour reserver complex type.
 * 
 * <p>Le fragment de schema suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reserver">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://service.web/}client" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserver", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3"
})
public class Reserver {

    protected Client arg0;
    protected String arg1;
    protected String arg2;
    protected int arg3;

    /**
     * Obtient la valeur de la propriete arg0.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getArg0() {
        return arg0;
    }

    /**
     * Definit la valeur de la propriete arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setArg0(Client value) {
        this.arg0 = value;
    }

    /**
     * Obtient la valeur de la propriete arg1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg1() {
        return arg1;
    }

    /**
     * Definit la valeur de la propriete arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg1(String value) {
        this.arg1 = value;
    }

    /**
     * Obtient la valeur de la propriete arg2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg2() {
        return arg2;
    }

    /**
     * Definit la valeur de la propriete arg2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg2(String value) {
        this.arg2 = value;
    }

    /**
     * Obtient la valeur de la propriete arg3.
     * 
     */
    public int getArg3() {
        return arg3;
    }

    /**
     * Definit la valeur de la propriete arg3.
     * 
     */
    public void setArg3(int value) {
        this.arg3 = value;
    }

}
