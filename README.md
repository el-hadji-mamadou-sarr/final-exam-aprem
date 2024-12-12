
# ExamFinalAprem

## Description

Ce projet Android met en œuvre plusieurs fonctionnalités pour démontrer des concepts de développement Android modernes :
- Gestion des erreurs courantes (NullPointerException, IndexOutOfBoundsException).
- Fonctionnalités de connexion utilisateur.
- Tests unitaires avec JUnit et tests instrumentés avec Espresso.
- Gestion et traitement des listes.

---

## Fonctionnalités

1. **Gestion des Listes**
    - Traitement et affichage des éléments d'une liste.
    - Gestion des listes vides avec des journaux pour faciliter le débogage.

2. **Gestion des Exceptions**
    - NullPointerException : Vérifie la nullité avant utilisation.
    - IndexOutOfBoundsException : Assure que les index sont dans les limites.

3. **Formulaire de Connexion**
    - Champs pour le nom d'utilisateur et le mot de passe.
    - Bouton "Se connecter" pour valider les identifiants.
    - Affichage d'un message de bienvenue en cas de succès.

4. **Tests**
    - Tests unitaires avec JUnit pour vérifier les calculs.
    - Tests instrumentés avec Espresso pour valider l'interface utilisateur.

---

## Installation

1. Clonez le dépôt :

   ```bash
   git clone https://github.com/votre-utilisateur/exam-final-aprem.git
   ```

2. Ouvrez le projet dans Android Studio.

3. Synchronisez les fichiers Gradle pour résoudre toutes les dépendances.

4. Construisez et exécutez le projet sur un émulateur ou un appareil physique.

---

## Utilisation

1. **Traitement des Listes**
    - Exemple de traitement d'une liste simple :
      ```kotlin
      val items = listOf("Apple", "Banana", "Cherry")
      processItems(items)
      ```

2. **Connexion**
    - Saisissez `user` comme nom d'utilisateur et `password` comme mot de passe.
    - Cliquez sur "Se connecter".
    - Un message `Bienvenue, user !` sera affiché.

3. **Gestion des Exceptions**
    - NullPointerException :
      ```kotlin
      printMessage(null) // Affichera : "Aucun message à afficher."
      ```
    - IndexOutOfBoundsException :
      ```kotlin
      getItemAtIndex(5, listOf("Pomme", "Banane")) // Affichera un message d'erreur.
      ```

---

## Tests

### Tests Unitaires
Exemple d'un test JUnit :
```kotlin
class CalculatorTest {
    @Test
    fun addition_isCorrect() {
        Assert.assertEquals(4, 2 + 2)
    }
}
```

### Tests Instrumentés
Exemple de test Espresso :
```kotlin
@Test
fun loginForm_isFunctional() {
    val scenario = ActivityScenario.launch(MainActivity::class.java)
    onView(withId(R.id.username)).perform(typeText("user"), closeSoftKeyboard())
    onView(withId(R.id.password)).perform(typeText("password"), closeSoftKeyboard())
    onView(withId(R.id.loginButton)).perform(click())
    onView(withId(R.id.welcomeMessage)).check(matches(isDisplayed()))
}
```

---

## Dépendances

- **Espresso** : `androidx.test.espresso:espresso-core:3.4.0`
- **JUnit** : `androidx.test.ext:junit:1.1.3`

---

## Auteur

- [Votre Nom](https://github.com/votre-utilisateur)