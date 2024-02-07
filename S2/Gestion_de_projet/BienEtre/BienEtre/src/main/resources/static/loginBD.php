<?php // Connexion à MySQL
// Inclure le code de connexion à la base de données
$user="e20190006519";$password="Adam2209";
try{
	$dbh = new PDO('mysql:host=mysql.etu.umontpellier.fr;     
		dbname=e20190006519; charset=UTF8', $user, $password,   // PDO se conncete au serveur mysql et prend les variables $user et $password pour se co 
		array(PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION,));

} catch(PDOException $e){      // prend les erreurs et les stocks dans e 
	echo $e->getMessage();
	die("Connexion impossible !");
}

?>
