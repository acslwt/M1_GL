
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getEtoilesResponse complex type.
 * 
 * <p>Le fragment de schema suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getEtoilesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEtoilesResponse", propOrder = {
    "_return"
})
public class GetEtoilesResponse {

    @XmlElement(name = "return")
    protected int _return;

    /**
     * Obtient la valeur de la propriete return.
     * 
     */
    public int getReturn() {
        return _return;
    }

    /**
     * Definit la valeur de la propriete return.
     * 
     */
    public void setReturn(int value) {
        this._return = value;
    }

}
