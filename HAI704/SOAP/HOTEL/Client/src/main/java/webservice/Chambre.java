
package webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour chambre complex type.
 * 
 * <p>Le fragment de schema suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="chambre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disponibilite" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://service.web/}reservation" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chambre", propOrder = {
    "disponibilite",
    "lits",
    "numero",
    "prix"
})
public class Chambre {

    protected Chambre.Disponibilite disponibilite;
    protected int lits;
    protected int numero;
    protected double prix;

    /**
     * Obtient la valeur de la propriete disponibilite.
     * 
     * @return
     *     possible object is
     *     {@link Chambre.Disponibilite }
     *     
     */
    public Chambre.Disponibilite getDisponibilite() {
        return disponibilite;
    }

    /**
     * Definit la valeur de la propriete disponibilite.
     * 
     * @param value
     *     allowed object is
     *     {@link Chambre.Disponibilite }
     *     
     */
    public void setDisponibilite(Chambre.Disponibilite value) {
        this.disponibilite = value;
    }

    /**
     * Obtient la valeur de la propriete lits.
     * 
     */
    public int getLits() {
        return lits;
    }

    /**
     * Definit la valeur de la propriete lits.
     * 
     */
    public void setLits(int value) {
        this.lits = value;
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
     * Obtient la valeur de la propriete prix.
     * 
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Definit la valeur de la propriete prix.
     * 
     */
    public void setPrix(double value) {
        this.prix = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schema suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://service.web/}reservation" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reservation"
    })
    public static class Disponibilite {

        @XmlElement(namespace = "http://service.web/")
        protected List<Reservation> reservation;

        /**
         * Gets the value of the reservation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reservation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReservation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Reservation }
         * 
         * 
         */
        public List<Reservation> getReservation() {
            if (reservation == null) {
                reservation = new ArrayList<Reservation>();
            }
            return this.reservation;
        }

    }

}
