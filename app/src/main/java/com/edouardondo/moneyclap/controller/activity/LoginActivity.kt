package com.edouardondo.moneyclap.controller.activity

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.edouardondo.moneyclap.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_login)

        login_btn.setOnClickListener {
            login()
        }

    }

    fun login() {

        if (email_edt.text.toString().trim().isEmpty() || password_edt.text.toString().trim().isEmpty())
        {
            Toast.makeText(applicationContext, "Veuillez saisir votre e-mail et votre mot de passe", Toast.LENGTH_SHORT).show()
        }
        else
        {
            val intent = Intent(this@LoginActivity, HomeActivity::class.java)
            intent.putExtra("Email", email_edt.text.toString().trim())
            intent.putExtra("Password", password_edt.text.toString().trim())
            startActivity(intent)
            finish()
        }
    }
}