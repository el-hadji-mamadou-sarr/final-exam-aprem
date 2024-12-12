
# Projet Final Android Studio - Débogage et Tests

## Description

Ce projet Android a été conçu dans le cadre d’un examen final pour démontrer les compétences en **débogage** et **tests**. Il inclut :

- La gestion des erreurs courantes avec des journaux et points d’arrêt.
- La mise en œuvre de tests unitaires avec JUnit.
- La réalisation de tests d’interface utilisateur avec Espresso.
- La simulation d’un formulaire de connexion fonctionnel.

---

## Fonctionnalités

### Module 4 : Debugging (Débogage)

1. **Utilisation de Logcat**
   - Ajout de journaux dans le code pour surveiller l'état de l'application :
     ```kotlin
     Log.d("MainActivity", "Application démarrée")
     Log.e("Database", "Erreur lors de l’initialisation de la base de données")
     ```

2. **Gestion des Exceptions**
   - NullPointerException : Vérification des objets avant leur utilisation.
   - IndexOutOfBoundsException : Validation des index dans les listes.

3. **Points d’Arrêt et Inspection**
   - Ajout de points d’arrêt pour inspecter les variables à des étapes clés.

---

### Module 5 : Testing (Tests)

1. **Tests Unitaires avec JUnit**
   - Exemple :
     ```kotlin
     class CalculatorTest {
         @Test
         fun addition_isCorrect() {
             assertEquals(4, 2 + 2)
         }
     }
     ```

2. **Tests d’Interface Utilisateur avec Espresso**
   - Exemple : Vérifier l’affichage d’un bouton :
     ```kotlin
     @Test
     fun button_isDisplayed() {
         onView(withId(R.id.myButton)).check(matches(isDisplayed()))
     }
     ```

3. **Création d’un Scénario de Tests**
   - Formulaire de connexion :
      - Entrer le nom d'utilisateur.
      - Entrer le mot de passe.
      - Cliquer sur « Se connecter ».
      - Vérifier l’affichage d’un message de bienvenue.

---

## Instructions pour Exécuter

1. **Cloner le Dépôt**
   ```bash
   git clone https://github.com/votre-utilisateur/exam-final-aprem.git
   ```

2. **Importer le Projet**
   - Ouvrez le projet dans Android Studio.
   - Synchronisez les fichiers Gradle.

3. **Exécuter l’Application**
   - Lancez l’application pour vérifier les journaux dans Logcat et le comportement des fonctionnalités.

4. **Exécuter les Tests**
   - Faites un clic droit sur les classes de test et sélectionnez **Run Tests**.

---

## Soumission

1. **Exporter le Projet**
   - Compressez le projet en un fichier `.zip`.

2. **Publier sur GitHub**
   - Ajoutez les captures d’écran des résultats des tests et incluez-les dans le README.md.

3. **Documenter**
   - Documentez clairement le projet pour mettre en valeur vos compétences.

---

## Auteur

- [Votre Nom](https://github.com/votre-utilisateur)