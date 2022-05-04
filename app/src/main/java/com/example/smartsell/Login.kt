package com.example.smartsell

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.contentValuesOf
import java.time.Duration

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Create datanase connections
        var helper = MyDBHelper(applicationContext)
        var db = helper.readableDatabase








       // Define username and password edit texts
        val passwd_edit_text: EditText = findViewById(R.id.passwoededittext)
        val username_edit_text: EditText = findViewById(R.id.usernametextedit)

        // Verify user data for login
        val login_button: Button = findViewById(R.id.login_btn)


        // Hardcoded user credentials
        val uname1 = "admin"
        val passwd1 = "admin"

        // Onclick listener of login button
        login_button.setOnClickListener {
        // Read values from edit texts
        var login_password = passwd_edit_text.text
        var login_username = login_button.text













            if(login_password.isEmpty()|| login_username.isEmpty()){
            Toast.makeText(this, "Inputs Required", Toast.LENGTH_SHORT).show()






        }
            if(login_password.toString() == passwd1 &&login_username.equals(uname1)){

                var intent = Intent(this, Home::class.java)
                startActivity(intent)

            }








            else{
                    Toast.makeText(this, "All inputs are required !", Toast.LENGTH_SHORT).show()


            }



        // Make signup button open sign up activity
        val to_sign_up_btn: Button = findViewById(R.id.go_to_signup)

        to_sign_up_btn.setOnClickListener {
            val i = Intent(this, Signup::class.java)

            // Launch Signup activity
            startActivity(i)


        }
    }
}}