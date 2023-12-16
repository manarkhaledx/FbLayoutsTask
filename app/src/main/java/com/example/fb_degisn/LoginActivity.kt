package com.example.fb_degisn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidtask1.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val loginButton: Button = findViewById(R.id.btn_login)

        loginButton.setOnClickListener {
            val intent = Intent(this, PostActivity::class.java)
            startActivity(intent)

        }
    }
}
