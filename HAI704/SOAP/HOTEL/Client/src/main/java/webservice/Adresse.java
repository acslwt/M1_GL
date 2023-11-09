
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour adresse complex type.
 * 
 * <p>Le fragment de schema suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="adresse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lattitude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lieuDit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresse", propOrder = {
    "lattitude",
    "lieuDit",
    "longitude",
    "numero",
    "pays",
    "rue",
    "ville"
})
public class Adresse {

    protected int lattitude;
    protected String lieuDit;
    protected int longitude;
    protected int numero;
    protected String pays;
    protected String rue;
    protected String ville;

    /**
     * Obtient la valeur de la propriete lattitude.
     * 
     */
    public int getLattitude() {
        return lattitude;
    }

    /**
     * Definit la valeur de la propriete lattitude.
     * 
     */
    public void setLattitude(int value) {
        this.lattitude = value;
    }

    /**
     * Obtient la valeur de la propriete lieuDit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLieuDit() {
        return lieuDit;
    }

    /**
     * Definit la valeur de la propriete lieuDit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLieuDit(String value) {
        this.lieuDit = value;
    }

    /**
     * Obtient la valeur de la propriete longitude.
     * 
     */
    public int getLongitude() {
        return longitude;
    }

    /**
     * Definit la valeur de la propriete longitude.
     * 
     */
    public void setLongitude(int value) {
        this.longitude = value;
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
     * Obtient la valeur de la propriete pays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPays() {
        return pays;
    }

    /**
     * Definit la valeur de la propriete pays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPays(String value) {
        this.pays = value;
    }

    /**
     * Obtient la valeur de la propriete rue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRue() {
        return rue;
    }

    /**
     * Definit la valeur de la propriete rue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRue(String value) {
        this.rue = value;
    }

    /**
     * Obtient la valeur de la propriete ville.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVille() {
        return ville;
    }

    /**
     * Definit la valeur de la propriete ville.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVille(String value) {
        this.ville = value;
    }

}
