<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="stylesIndex.css">
    <script src="https://cdn.tailwindcss.com"></script>
    <title>Connexion</title>
</head>
<body>
<?php
if (isset($_SESSION["connexionReussie"]) && $_SESSION["connexionReussie"]) {
    // Afficher les boutons 1 et 2 si l'utilisateur est connecté
    echo '<a href="QuestApp.html"><button> Questionnaire Appronfondie</button></a>';
    echo '<a href="QuestRap.html"><button> Questionnaire Rapide </button></a>';
    // Vous pouvez également ajouter un bouton pour se déconnecter
    echo '<a href="deconnexion.php"><button>Se déconnecter</button></a>';
}
else{
?>
    <div class="h-screen flex justify-center">
        <div class="m-auto w-1/2 content-center flex justify-center">JUL</div>
        <div class="m-auto w-2/3 content-center flex justify-center">
        <div class="w-4/5 ">
        <h2>Connexion</h2>

<?php
session_start();
if (isset($_SESSION["erreurConnexion"])) {
    // Afficher le message d'erreur si disponible
    echo '<p style="color: red;">' . $_SESSION["erreurConnexion"] . '</p>';
    unset($_SESSION["erreurConnexion"]); // Supprimer la variable de session après l'avoir affichée
}

// Vérifier si l'utilisateur est connecté (variable de session)
    // Afficher le formulaire de connexion et le message d'erreur
?>
    
        <form action="connexion.php" method="post" class="w-full">
        <!-- Champs du formulaire -->
        <label for="username_login">Nom d'utilisateur :</label>
        <input type="text" id="username_login" name="username_login" required><br>

        <label for="password_login">Mot de passe :</label>
        <input type="password" id="password_login" name="password_login" required><br>

        <button type="submit">Se connecter</button>
    </form>
    

    <!-- Bouton pour rediriger vers la page d'inscription -->
    <button onclick="window.location.href='inscription.html'">Créer un Compte</button>
    </div>
<?php
}
?>
        </div>
    </div>
</body>
</html>
