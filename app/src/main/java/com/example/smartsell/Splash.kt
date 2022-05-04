package com.example.smartsell

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Create a splash screen
        var iv: ImageView = findViewById(R.id.iv_splash)
        iv.alpha = 0f
        iv.animate().setDuration(1500).alpha(1f).withEndAction {
            val i = Intent(this, Login::class.java)

            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
    }
}
}