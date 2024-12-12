
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
![Screenshot from 2024-12-12 15-03-04](https://github.com/user-attachments/assets/927487c6-d991-41d6-94c3-efee0b9bbca2)
![Screenshot from 2024-12-12 15-03-49](https://github.com/user-attachments/assets/7c9ce847-13b5-40b7-a367-00ddd406e7ce)



2. **Gestion des Exceptions**
   - NullPointerException : Vérification des objets avant leur utilisation.
   - IndexOutOfBoundsException : Validation des index dans les listes.
   
![Screenshot from 2024-12-12 15-29-53](https://github.com/user-attachments/assets/61284df1-2034-454c-b9ed-92b42ee11005)

3. **Points d’Arrêt et Inspection**
   - Ajout de points d’arrêt pour inspecter les variables à des étapes clés.

![Screenshot from 2024-12-12 15-19-45](https://github.com/user-attachments/assets/34e51922-83bd-4564-be09-467d4ab3bf2d)
![Screenshot from 2024-12-12 15-20-45](https://github.com/user-attachments/assets/d93a723d-fc0d-4053-9fd1-29f69f489149)

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

     ![Screenshot from 2024-12-12 15-34-37](https://github.com/user-attachments/assets/12ce6764-0645-420a-ab47-3a5ad265ee4e)


2. **Tests d’Interface Utilisateur avec Espresso**
   - Exemple : Vérifier l’affichage d’un bouton :
     ```kotlin
     @Test
     fun button_isDisplayed() {
         onView(withId(R.id.myButton)).check(matches(isDisplayed()))
     }
     ```
![Screenshot from 2024-12-12 15-58-14](https://github.com/user-attachments/assets/b41535a4-c92a-4206-8e2e-e85c3502b190)

     

3. **Création d’un Scénario de Tests**
   - Formulaire de connexion :
      - Entrer le nom d'utilisateur.
      - Entrer le mot de passe.
      - Cliquer sur « Se connecter ».
      - Vérifier l’affichage d’un message de bienvenue.

---

![Screenshot from 2024-12-12 16-11-02](https://github.com/user-attachments/assets/beeb7d43-8a99-4a2d-af6e-eb146b0d5ea0)


## Instructions pour Exécuter

1. **Cloner le Dépôt**
   ```bash
   git clone https://github.com/el-hadji-mamadou-sarr/final-exam-aprem.git
   ```

2. **Importer le Projet**
   - Ouvrez le projet dans Android Studio.
   - Synchronisez les fichiers Gradle.

3. **Exécuter l’Application**
   - Lancez l’application pour vérifier les journaux dans Logcat et le comportement des fonctionnalités.

4. **Exécuter les Tests**
   - Faites un clic droit sur les classes de test et sélectionnez **Run Tests**.

---


## Auteur

- [El Hadji Mamadou SARR](https://github.com/el-hadji-mamadou-sarr)
- [Souleymane SALL](https://github.com/Pvpasall/)
