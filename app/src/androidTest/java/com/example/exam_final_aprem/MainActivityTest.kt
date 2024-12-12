package com.example.exam_final_aprem

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Test
    fun button_isDisplayed() {
        val scenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.myButton)).check(matches(isDisplayed()))
    }

    @Test
    fun loginForm_isFunctional() {
        val scenario = ActivityScenario.launch(MainActivity::class.java)
        // Saisir le nom d’utilisateur
        onView(withId(R.id.username)).perform(typeText("user"), closeSoftKeyboard())

        // Saisir le mot de passe
        onView(withId(R.id.password)).perform(typeText("password"), closeSoftKeyboard())

        // Cliquer sur le bouton « Se connecter »
        onView(withId(R.id.loginButton)).perform(click())

        // Vérifier que le message de bienvenue est affiché
        onView(withId(R.id.welcomeMessage)).check(matches(isDisplayed()))
    }
}