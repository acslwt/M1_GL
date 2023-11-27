CREATE TABLE client (
    cle_client NUMBER PRIMARY KEY,
    nom VARCHAR2(50),
    prenom VARCHAR2(50),
    age NUMBER,
    sexe VARCHAR2(10),
    nationalite VARCHAR2(50),
    numero_passeport VARCHAR2(20),
    numero_telephone VARCHAR2(20),
    rue VARCHAR2(100),
    numero_rue VARCHAR2(10),
    ville VARCHAR2(50),
    pays VARCHAR2(50)
);

CREATE TABLE aeroport (
    cle_aeroport NUMBER PRIMARY KEY,
    nom VARCHAR2(50),
    ville VARCHAR2(50),
    region VARCHAR2(50),
    pays VARCHAR2(50),
    latitude NUMBER(9, 6),
    longitude NUMBER(9, 6),
    capacite NUMBER,
    volInternational BOOLEAN,
    distanceAvecVille NUMBER,
    aeroportStatus bool
);

CREATE TABLE heure (
    cle_heureDepart NUMBER PRIMARY KEY,
    temps VARCHAR2(20),
    heure NUMBER,
    minute NUMBER,
    seconde NUMBER,
    am_pm VARCHAR2(2),
    heureHiver BOOLEAN,
    momentJournee NUMBER, mat soir apres midi
    quartHeure NUMBER,
    heureTravail VARCHAR2(3)
);

CREATE TABLE date (
    cle_date NUMBER PRIMARY KEY,
    date DATE,
    nombreJourMoisFiscal NUMBER,
    DateFinSemaineCivil DATE,
    numeroSemaine NUMBER,
    nomMois VARCHAR2(20),
    trimestre NUMBER,
    semaine NUMBER,
    mois NUMBER,
    annee NUMBER,
    vacances BOOLEAN
);

CREATE TABLE vol (
    cle_vol NUMBER PRIMARY KEY,
    id_vol VARCHAR2(50),
    volPrevu DATE,
    code_itineraire VARCHAR2(20),
    origine VARCHAR2(50),
    destination VARCHAR2(50),
    capaciteVol NUMBER,
    AvionFabriquePar VARCHAR2(50),
    numeroPiste VARCHAR2(10),
    revisionPar VARCHAR2(50)
);

CREATE TABLE ventes (
    cle_client NUMBER,
    cle_aeroport NUMBER,
    cle_dateDepart NUMBER,
    cle_dateArrivee NUMBER,
    cle_heureDepart NUMBER,
    cle_heureArrivee NUMBER,
    cle_aeroportDepart NUMBER,
    cle_aeroportArrivee NUMBER,
    idVol VARCHAR2(50),
    classe VARCHAR2(20),
    prix NUMBER,
    remise NUMBER(3, 2) CHECK (remise >= 0 AND remise <= 1),
    prixFinal NUMBER,
    id_vente NUMBER PRIMARY KEY,
    FOREIGN KEY (cle_client) REFERENCES clients (cle_client),
    FOREIGN KEY (cle_aeroport) REFERENCES aeroports (cle_aeroport),
    FOREIGN KEY (cle_dateDepart) REFERENCES date (cle_dateDepart),
    FOREIGN KEY (cle_dateArrivee) REFERENCES date (cle_dateArrivee),
    FOREIGN KEY (cle_heureDepart) REFERENCES heure (cle_heureDepart),
    FOREIGN KEY (cle_heureArrivee) REFERENCES heure (cle_heureArrivee),
    FOREIGN KEY (cle_aeroportDepart) REFERENCES aeroports (cle_aeroport),
    FOREIGN KEY (cle_aeroportArrivee) REFERENCES aeroports (cle_aeroport)
);