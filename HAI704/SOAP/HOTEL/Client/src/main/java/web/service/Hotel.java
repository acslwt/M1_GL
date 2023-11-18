
package web.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour hotel complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="hotel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chambres" type="{http://service.web/}chambre" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="etoiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotel", propOrder = {
    "chambres",
    "etoiles",
    "nom"
})
public class Hotel {

    @XmlElement(nillable = true)
    protected List<Chambre> chambres;
    protected int etoiles;
    protected String nom;

    /**
     * Gets the value of the chambres property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chambres property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChambres().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Chambre }
     * 
     * 
     */
    public List<Chambre> getChambres() {
        if (chambres == null) {
            chambres = new ArrayList<Chambre>();
        }
        return this.chambres;
    }

    /**
     * Obtient la valeur de la propriété etoiles.
     * 
     */
    public int getEtoiles() {
        return etoiles;
    }

    /**
     * Définit la valeur de la propriété etoiles.
     * 
     */
    public void setEtoiles(int value) {
        this.etoiles = value;
    }

    /**
     * Obtient la valeur de la propriété nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit la valeur de la propriété nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

}
