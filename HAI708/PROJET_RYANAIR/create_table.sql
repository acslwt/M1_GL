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
    volInternational VARCHAR2(3),
    distanceAvecVille NUMBER,
    aeroportStatus VARCHAR2(20)
);

CREATE TABLE heure (
    cle_heureDepart NUMBER PRIMARY KEY,
    temps VARCHAR2(20),
    heure NUMBER,
    minute NUMBER,
    seconde NUMBER,
    am_pm VARCHAR2(2),
    heureHiver VARCHAR2(3),
    momentJournee VARCHAR2(20),
    quartHeure NUMBER,
    heureTravail VARCHAR2(3)
);

CREATE TABLE date (
    cle_dateArrivee NUMBER PRIMARY KEY,
    date DATE,
    nombreJourMoisFiscal NUMBER,
    DateFinSemaineCivil DATE,
    numeroSemaine NUMBER,
    nomMois VARCHAR2(20),
    trimestre NUMBER,
    semaine NUMBER,
    mois NUMBER,
    annee NUMBER,
    vacances VARCHAR2(3)
);

CREATE TABLE vol (
    cle_vol NUMBER PRIMARY KEY,
    id_vol VARCHAR2(50),
    volPrevu DATE,
    tarif NUMBER,
    code_itineraire VARCHAR2(20),
    origine VARCHAR2(50),
    destination VARCHAR2(50),
    capaciteVol NUMBER,
    AvionFabriquePar VARCHAR2(50),
    numeroPiste VARCHAR2(10),
    revisionPar VARCHAR2(50)
);