
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour carteCredit complex type.
 * 
 * <p>Le fragment de schema suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="carteCredit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cvc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dateExp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "carteCredit", propOrder = {
    "cvc",
    "dateExp",
    "nom",
    "numero",
    "prenom"
})
public class CarteCredit {

    protected int cvc;
    protected String dateExp;
    protected String nom;
    protected int numero;
    protected String prenom;

    /**
     * Obtient la valeur de la propriete cvc.
     * 
     */
    public int getCvc() {
        return cvc;
    }

    /**
     * Definit la valeur de la propriete cvc.
     * 
     */
    public void setCvc(int value) {
        this.cvc = value;
    }

    /**
     * Obtient la valeur de la propriete dateExp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateExp() {
        return dateExp;
    }

    /**
     * Definit la valeur de la propriete dateExp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateExp(String value) {
        this.dateExp = value;
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
     * Obtient la valeur de la propriete numero.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Definit la valeur de la propriete numero.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
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
