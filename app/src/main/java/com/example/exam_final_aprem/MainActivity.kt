package com.example.exam_final_aprem

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.exam_final_aprem.ui.theme.ExamfinalapremTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "Application démarrée")
        Log.e("Database", "Erreur lors de l’initialisation de la base de données")

        val items = listOf("Apple", "Banana", "Cherry")
        processItems(items)

        // Exemple 1 : NullPointerException
        printMessage(null)
        printMessage("Bonjour Kotlin!")

        // Exemple 2 : IndexOutOfBoundsException
        val fruits = listOf("Pomme", "Banane", "Cerise")
        getItemAtIndex(1, fruits) // Correct
        getItemAtIndex(5, fruits) // Incorrect

        // Exemple 3 : Liste vide
        val emptyList = listOf<String>()
        processItems(emptyList) // Affichera un message indiquant que la liste est vide

        val nonEmptyList = listOf("Table", "Chaise")
        processItems(nonEmptyList) // Traite et affiche les éléments

        // Login
        val loginButton = findViewById<Button>(R.id.loginButton)
        val usernameField = findViewById<EditText>(R.id.username)
        val passwordField = findViewById<EditText>(R.id.password)
        val welcomeMessage = findViewById<TextView>(R.id.welcomeMessage)

        // Initialement, cacher le message de bienvenue
        welcomeMessage.visibility = View.GONE

        loginButton.setOnClickListener {
            val username = usernameField.text.toString()
            val password = passwordField.text.toString()

            // Simuler une connexion réussie
            if (username == "user" && password == "password") {
                welcomeMessage.visibility = View.VISIBLE
                welcomeMessage.text = "Bienvenue, $username !"
            } else {
                // Afficher un message d'erreur en cas d'identifiants incorrects
                Toast.makeText(this, "Nom d'utilisateur ou mot de passe incorrect", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

fun processItems(items: List<String>) {
    for (item in items) {
        println(item)
    }
}

fun printMessage(message: String?) {
    if (message != null) {
        println("Message: $message")
    } else {
        println("Aucun message à afficher.")
    }
}

fun getItemAtIndex(index: Int, myList: List<String>) {
    if (index in 0 until myList.size) {
        println("Item à l'index $index : ${myList[index]}")
    } else {
        println("Index $index hors limites. La liste contient ${myList.size} éléments.")
    }
}