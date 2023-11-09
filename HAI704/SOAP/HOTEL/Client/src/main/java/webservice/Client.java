
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour client complex type.
 * 
 * <p>Le fragment de schema suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="client">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carteCredit" type="{http://service.web/}carteCredit" minOccurs="0"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client", propOrder = {
    "carteCredit",
    "nom",
    "prenom"
})
public class Client {

    protected CarteCredit carteCredit;
    protected String nom;
    protected String prenom;

    /**
     * Obtient la valeur de la propriete carteCredit.
     * 
     * @return
     *     possible object is
     *     {@link CarteCredit }
     *     
     */
    public CarteCredit getCarteCredit() {
        return carteCredit;
    }

    /**
     * Definit la valeur de la propriete carteCredit.
     * 
     * @param value
     *     allowed object is
     *     {@link CarteCredit }
     *     
     */
    public void setCarteCredit(CarteCredit value) {
        this.carteCredit = value;
    }

    /**
     * Obtient la valeur de la propriete nom.
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
     * Definit la valeur de la propriete nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propriete prenom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Definit la valeur de la propriete prenom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenom(String value) {
        this.prenom = value;
    }

}
