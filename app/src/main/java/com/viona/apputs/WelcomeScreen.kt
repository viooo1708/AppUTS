package com.viona.apputs

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WelcomeScreen : AppCompatActivity() {
    private lateinit var btn_login : Button
    private lateinit var btn_SigUp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_screen)

        btn_login = findViewById(R.id.btn_Login)
        btn_SigUp = findViewById(R.id.btn_SignUp)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btn_login.setOnClickListener(){
            val intent1 = Intent(this, LoginPage::class.java)
            startActivity(intent1)
        }
        btn_SigUp.setOnClickListener(){
            val intent1 = Intent(this, SignUpPage::class.java)
            startActivity(intent1)
        }
    }
}