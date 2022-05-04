package com.example.smartsell

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class Signup : AppCompatActivity() {
/ // Declare a variable for firebase authentication
    private lateinit var firebaseauth: FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        //Assign Instance to firebaseauth
        firebaseauth = FirebaseAuth.getInstance()





        // Define the signup button
        val signup_button: Button = findViewById(R.id.submit_button_signup)

        // Define edit text for user inputs
        val first_name_txt_edit: EditText = findViewById(R.id.first_name_edit_text)
        var firstname = first_name_txt_edit.text

        val last_name_txt_edit: EditText = findViewById(R.id.last_name_edit_text)
        var lastname = last_name_txt_edit.text


        val email_txt_edit:EditText = findViewById(R.id.email_edit_text)
        var email = email_txt_edit.text

        val phone_txt_edit:EditText = findViewById(R.id.phone_number_text_edit)
        var phone = phone_txt_edit.text

        val location_txt_edit: EditText = findViewById(R.id.location_edit_text)
        var location = location_txt_edit.text

        val shop_name_txt_edit: EditText = findViewById(R.id.shop_name_edit_text)
        var shopname = shop_name_txt_edit.text

        val password_txt_edit: EditText = findViewById(R.id.password_edit_text)
        var password = password_txt_edit.text

        val verify_password_txt_edit: EditText =  findViewById(R.id.verify_password_edit_text)
        var verpassword = verify_password_txt_edit.text

        // Make the login button return user to the login activity
        val to_login_btn: Button = findViewById(R.id.to_login_button)

        to_login_btn.setOnClickListener {
            val i = Intent(this, Login::class.java)

            // Launch Login Activity
            startActivity(i)
            finish()

        }



        // Set onlick listener for signup button

        signup_button.setOnClickListener {


        // Check if all fields are filled
            if(firstname.isNotEmpty()&&lastname.isNotEmpty()&&email.isNotEmpty()&&phone.isNotEmpty()&&location.isNotEmpty()&&shopname.isNotEmpty()&&password.isNotEmpty()&&verpassword.isNotEmpty()){

                if(password == verpassword){


                    //Send data to firebase
                    firebaseauth.createUserWithEmailAndPassword(email.toString(), password.toString()).addOnCompleteListener{
                        if(it.isSuccessful){

                            // Return focus to first name edit text
                            email_txt_edit.requestFocus()

                            // Display registration success message
                            Toast.makeText(this, "Registered Successfully", Toast.LENGTH_SHORT).show()

                            // Take user to the login activity for login after registration success
                            var intent= Intent(this, Login::class.java)
                            startActivity(intent)
                            finish()




                        }else{
                    Toast.makeText(this, "Passwords mismatch", Toast.LENGTH_LONG).show()
                }


            }
            else{
                Toast.makeText(this, "All fields are required!", Toast.LENGTH_LONG).show()
            }











                    // Clear the edit texts
                    first_name_txt_edit.setText("")
                    last_name_txt_edit.setText("")
                    email_txt_edit.setText("")
                    phone_txt_edit.setText("")
                    location_txt_edit.setText("")
                    shop_name_txt_edit.setText("")
                    password_txt_edit.setText("")
                    verify_password_txt_edit.setText("")

                    // Return focus to first name edit text
                    first_name_txt_edit.requestFocus()




//            database = FirebaseDatabase.getInstance().getReference("Users")
// Codes to send data to firebase








            Toast.makeText(this, "Complete all Fields", Toast.LENGTH_LONG).show()
        }






             }













    }
}