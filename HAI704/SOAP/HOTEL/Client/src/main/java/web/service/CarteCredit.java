
package web.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour carteCredit complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété cvc.
     * 
     */
    public int getCvc() {
        return cvc;
    }

    /**
     * Définit la valeur de la propriété cvc.
     * 
     */
    public void setCvc(int value) {
        this.cvc = value;
    }

    /**
     * Obtient la valeur de la propriété dateExp.
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
     * Définit la valeur de la propriété dateExp.
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

    /**
     * Obtient la valeur de la propriété numero.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Définit la valeur de la propriété numero.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Obtient la valeur de la propriété prenom.
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
     * Définit la valeur de la propriété prenom.
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
