package com.example.smartsell

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //Define the action bar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)



        // Create a humburger to open and close the navigation drawer

        // Define drawerLayout
        val drawerLayout: DrawerLayout = findViewById(R.id.drawerLayout)
        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)

        // Add a drawer listener
        drawerLayout.addDrawerListener(toggle)
        // Make the drawable indivcator visible
        toggle.isDrawerIndicatorEnabled = true
        // Obtain the state when the drawer is open or closed
        toggle.syncState()

        val navView:NavigationView = findViewById(R.id.nav_home)
        // Make home to be enabled all the time
        supportActionBar?.setDisplayHomeAsUpEnabled(true)




//        //nav view
//        navView.setNavigationItemSelectedListener {
//            if(R.id.nav_home){
//                // Define intents
//                val intent_home = Intent(this, Home::class.java )
//                startActivity(intent)
//            }
//        }

    }
}

