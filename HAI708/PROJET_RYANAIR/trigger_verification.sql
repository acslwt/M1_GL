CREATE OR REPLACE TRIGGER check_dates_trigger
BEFORE INSERT OR UPDATE ON ventes
FOR EACH ROW
DECLARE
    cle_dateArrivee DATE;
    cle_dateDepart DATE;
BEGIN
    SELECT cle_date INTO dateArrivee FROM date WHERE cle_date = :NEW.cle_dateArrivee;
    SELECT cle_date INTO dateDepart FROM date WHERE cle_date = :NEW.cle_dateDepart;
    
    IF dateDepart >= dateRetour THEN
        DBMS_OUTPUT.PUT_LINE('Erreur : date d''arrivee doit être inférieure à la date de retour...');
    END IF;
END;
/

CREATE OR REPLACE TRIGGER calcule_prixFinal
BEFORE INSERT OR UPDATE OF prix, remise ON ventes
FOR EACH ROW
BEGIN
    :NEW.prixFinal := :NEW.prix * (1 - :NEW.remise);
END;
/

CREATE OR REPLACE TRIGGER verifie_aeroport_vol
BEFORE INSERT ON vol
FOR EACH ROW
DECLARE
    v_count_origine NUMBER;
    v_count_destination NUMBER;
BEGIN
    SELECT COUNT(*) INTO v_count_origine
    FROM aeroports
    WHERE cle_aeroport = :NEW.origine;

    SELECT COUNT(*) INTO v_count_destination
    FROM aeroports
    WHERE cle_aeroport = :NEW.destination;

    IF v_count_origine = 0 THEN
        DBMS_OUTPUT.PUT_LINE('Erreur : La ville d''origine spécifiée n''existe pas dans la table des aéroports.');
    END IF;

    IF v_count_destination = 0 THEN
        DBMS_OUTPUT.PUT_LINE('Erreur : La ville de destination spécifie n''existe pas dans la table des aéroports.');
    END IF;
END;
/