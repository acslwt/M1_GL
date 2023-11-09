
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Client_QNAME = new QName("http://service.web/", "client");
    private final static QName _GetEtoiles_QNAME = new QName("http://service.web/", "getEtoiles");
    private final static QName _Hotel_QNAME = new QName("http://service.web/", "hotel");
    private final static QName _Reservation_QNAME = new QName("http://service.web/", "reservation");
    private final static QName _Adresse_QNAME = new QName("http://service.web/", "adresse");
    private final static QName _GetAdresseResponse_QNAME = new QName("http://service.web/", "getAdresseResponse");
    private final static QName _GetChambresResponse_QNAME = new QName("http://service.web/", "getChambresResponse");
    private final static QName _GetEtoilesResponse_QNAME = new QName("http://service.web/", "getEtoilesResponse");
    private final static QName _GetNom_QNAME = new QName("http://service.web/", "getNom");
    private final static QName _GetAdresse_QNAME = new QName("http://service.web/", "getAdresse");
    private final static QName _GetNomResponse_QNAME = new QName("http://service.web/", "getNomResponse");
    private final static QName _ReserverResponse_QNAME = new QName("http://service.web/", "reserverResponse");
    private final static QName _Reserver_QNAME = new QName("http://service.web/", "reserver");
    private final static QName _Chambre_QNAME = new QName("http://service.web/", "chambre");
    private final static QName _GetChambres_QNAME = new QName("http://service.web/", "getChambres");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Chambre }
     * 
     */
    public Chambre createChambre() {
        return new Chambre();
    }

    /**
     * Create an instance of {@link Reserver }
     * 
     */
    public Reserver createReserver() {
        return new Reserver();
    }

    /**
     * Create an instance of {@link GetChambres }
     * 
     */
    public GetChambres createGetChambres() {
        return new GetChambres();
    }

    /**
     * Create an instance of {@link GetNomResponse }
     * 
     */
    public GetNomResponse createGetNomResponse() {
        return new GetNomResponse();
    }

    /**
     * Create an instance of {@link ReserverResponse }
     * 
     */
    public ReserverResponse createReserverResponse() {
        return new ReserverResponse();
    }

    /**
     * Create an instance of {@link Adresse }
     * 
     */
    public Adresse createAdresse() {
        return new Adresse();
    }

    /**
     * Create an instance of {@link GetAdresseResponse }
     * 
     */
    public GetAdresseResponse createGetAdresseResponse() {
        return new GetAdresseResponse();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link GetEtoiles }
     * 
     */
    public GetEtoiles createGetEtoiles() {
        return new GetEtoiles();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link GetAdresse }
     * 
     */
    public GetAdresse createGetAdresse() {
        return new GetAdresse();
    }

    /**
     * Create an instance of {@link GetNom }
     * 
     */
    public GetNom createGetNom() {
        return new GetNom();
    }

    /**
     * Create an instance of {@link GetChambresResponse }
     * 
     */
    public GetChambresResponse createGetChambresResponse() {
        return new GetChambresResponse();
    }

    /**
     * Create an instance of {@link GetEtoilesResponse }
     * 
     */
    public GetEtoilesResponse createGetEtoilesResponse() {
        return new GetEtoilesResponse();
    }

    /**
     * Create an instance of {@link CarteCredit }
     * 
     */
    public CarteCredit createCarteCredit() {
        return new CarteCredit();
    }

    /**
     * Create an instance of {@link Chambre.Disponibilite }
     * 
     */
    public Chambre.Disponibilite createChambreDisponibilite() {
        return new Chambre.Disponibilite();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Client }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "client")
    public JAXBElement<Client> createClient(Client value) {
        return new JAXBElement<Client>(_Client_QNAME, Client.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtoiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "getEtoiles")
    public JAXBElement<GetEtoiles> createGetEtoiles(GetEtoiles value) {
        return new JAXBElement<GetEtoiles>(_GetEtoiles_QNAME, GetEtoiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "hotel")
    public JAXBElement<Hotel> createHotel(Hotel value) {
        return new JAXBElement<Hotel>(_Hotel_QNAME, Hotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "reservation")
    public JAXBElement<Reservation> createReservation(Reservation value) {
        return new JAXBElement<Reservation>(_Reservation_QNAME, Reservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Adresse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "adresse")
    public JAXBElement<Adresse> createAdresse(Adresse value) {
        return new JAXBElement<Adresse>(_Adresse_QNAME, Adresse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdresseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "getAdresseResponse")
    public JAXBElement<GetAdresseResponse> createGetAdresseResponse(GetAdresseResponse value) {
        return new JAXBElement<GetAdresseResponse>(_GetAdresseResponse_QNAME, GetAdresseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChambresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "getChambresResponse")
    public JAXBElement<GetChambresResponse> createGetChambresResponse(GetChambresResponse value) {
        return new JAXBElement<GetChambresResponse>(_GetChambresResponse_QNAME, GetChambresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEtoilesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "getEtoilesResponse")
    public JAXBElement<GetEtoilesResponse> createGetEtoilesResponse(GetEtoilesResponse value) {
        return new JAXBElement<GetEtoilesResponse>(_GetEtoilesResponse_QNAME, GetEtoilesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "getNom")
    public JAXBElement<GetNom> createGetNom(GetNom value) {
        return new JAXBElement<GetNom>(_GetNom_QNAME, GetNom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdresse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "getAdresse")
    public JAXBElement<GetAdresse> createGetAdresse(GetAdresse value) {
        return new JAXBElement<GetAdresse>(_GetAdresse_QNAME, GetAdresse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "getNomResponse")
    public JAXBElement<GetNomResponse> createGetNomResponse(GetNomResponse value) {
        return new JAXBElement<GetNomResponse>(_GetNomResponse_QNAME, GetNomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "reserverResponse")
    public JAXBElement<ReserverResponse> createReserverResponse(ReserverResponse value) {
        return new JAXBElement<ReserverResponse>(_ReserverResponse_QNAME, ReserverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reserver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "reserver")
    public JAXBElement<Reserver> createReserver(Reserver value) {
        return new JAXBElement<Reserver>(_Reserver_QNAME, Reserver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Chambre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "chambre")
    public JAXBElement<Chambre> createChambre(Chambre value) {
        return new JAXBElement<Chambre>(_Chambre_QNAME, Chambre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChambres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.web/", name = "getChambres")
    public JAXBElement<GetChambres> createGetChambres(GetChambres value) {
        return new JAXBElement<GetChambres>(_GetChambres_QNAME, GetChambres.class, null, value);
    }

}
