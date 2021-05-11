package com.edouardondo.moneyklap.controller.activity

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.edouardondo.moneyklap.R
import com.edouardondo.moneyklap.model.User
import com.edouardondo.moneyklap.retrofitClient.Api
import com.edouardondo.moneyklap.retrofitClient.ApiClient
import com.edouardondo.moneyklap.utils.SessionManager
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.regex.Matcher
import java.util.regex.Pattern


class LoginActivity : AppCompatActivity() {

    private lateinit var emailEdt: EditText
    private lateinit var passwordEdt: EditText
    private lateinit var loginBtn: Button
    private lateinit var registerBtn: Button
    private lateinit var rememberMe: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_login)
        bindView()

        loginBtn.setOnClickListener {
            login()
        }

        registerBtn.setOnClickListener {
            val intent = Intent(this@LoginActivity, SignUpActivity::class.java)
            startActivity(intent)
        }
    }

    private fun bindView() {
        emailEdt = findViewById(R.id.email_edt)
        passwordEdt = findViewById(R.id.password_edt)
        loginBtn = findViewById(R.id.login_btn)
        registerBtn = findViewById(R.id.register_btn)
        rememberMe = findViewById(R.id.rememberMe)
    }

    private fun login() {

        val email = emailEdt.text.toString().trim()
        val password = passwordEdt.text.toString().trim()

        if (!isValidEmailId(email)) {
            Toast.makeText(applicationContext, "Email is incorrect", Toast.LENGTH_SHORT).show()
            return
        }

        if (email.isNotEmpty() && password.isNotEmpty()) {

            //making api call
            val api: Api = ApiClient.getClient().create(Api::class.java)
            val login: Call<User> = api.login(email, password)

            login.enqueue(object : Callback<User>{
                override fun onResponse(call: Call<User>, response: Response<User>) {

                    if (response.body()?.isSuccess == 1){

                        // Get User Info
                        val user : User = response.body()!!
                        //storing the user in shared preferences
                        SessionManager.getInstance(applicationContext)?.storeUserInfo(
                            user.userFirstName,
                            user.userLastName,
                            user.userEmail,
                            user.userPassword
                        )

                        startActivity(Intent(applicationContext, HomeActivity::class.java))
                        Toast.makeText(applicationContext, response.body()?.message, Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(applicationContext, response.body()?.message, Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onFailure(call: Call<User>, t: Throwable) {
                    call.cancel()
                }
            })

        } else {
            Toast.makeText(applicationContext, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isValidEmailId(email: String): Boolean {
        return Pattern.compile(
            "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                    + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                    + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                    + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$"
        ).matcher(email).matches()
    }

    fun isValidPassword(password: String?): Boolean {
        val pattern: Pattern
        val PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{4,}$"
        pattern = Pattern.compile(PASSWORD_PATTERN)
        val matcher: Matcher = pattern.matcher(password)
        return matcher.matches()
    }
}