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