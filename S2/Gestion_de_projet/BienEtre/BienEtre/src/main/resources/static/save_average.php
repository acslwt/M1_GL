<?php
session_start();

require("loginBD.php");

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $averages = json_decode($_POST["averages"], true);

    // Utilisez l'identifiant stocké dans la session
    $identifiant = $_SESSION["identifiant"];

    // Mettez à jour les attributs spécifiques dans la table bienetreuser
    foreach ($averages as $theme => $average) {
        $stmt = $dbh->prepare("UPDATE bienetreuser SET $theme = ? WHERE identifiant = ?");
        $stmt->execute([$average, $identifiant]);
        $stmt->closeCursor();
    }
}
?>
