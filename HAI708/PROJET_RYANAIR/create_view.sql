CREATE VIEW aeroportdepart AS
SELECT *
FROM aeroport,ventes WHERE cle_aeroport=cle_aeroportDepart;

CREATE VIEW aeroportdepart AS
SELECT *
FROM aeroport,ventes WHERE cle_aeroport=cle_aeroportArrivee;