package com.edouardondo.moneyklap.controller.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.edouardondo.moneyklap.R
import com.edouardondo.moneyklap.model.User
import com.edouardondo.moneyklap.retrofitClient.Api
import com.edouardondo.moneyklap.retrofitClient.ApiClient
import com.edouardondo.moneyklap.utils.SessionManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUpActivity : AppCompatActivity() {

    private lateinit var alreadySubscribed: TextView
    private lateinit var firstNameEdt: EditText
    private lateinit var nameEdt: EditText
    private lateinit var emailEdt: EditText
    private lateinit var passwordEdt: EditText
    private lateinit var passwordConfirmEdt: EditText
    private lateinit var registerBtn: Button
    private lateinit var progressBar: ProgressBar
    /* private lateinit var queue : RequestQueue
     private lateinit var request : MyRequest
     lateinit var sessionManager: SessionManager*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_sign_up)

        bindView()
        /*queue = VolleySingleton.getInstance(this).requestQueue
        request = MyRequest(this, queue)
        sessionManager = SessionManager(this)*/

        alreadySubscribed.setOnClickListener {
            val intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
        }

        registerBtn.setOnClickListener {
            validateUserData()
        }
    }

    private fun validateUserData() {

        val firstName: String = firstNameEdt.text.toString().trim()
        val lastName: String = nameEdt.text.toString().trim()
        val email: String = emailEdt.text.toString().trim()
        val password: String = passwordEdt.text.toString().trim()
        val passwordConfirm: String = passwordConfirmEdt.text.toString().trim()

        if (password != passwordConfirm) {
            displayToastMessage("Veuillez saisir un même mot de passe")
            return
        } else {

            if (firstName != "" && lastName != "" && email != "" && password != "" && passwordConfirm != "") {

                progressBar.visibility = View.VISIBLE
                /*     request.register(firstName, name, email, password, passwordConfirm, object :  MyRequest.RegisterCallBack{
                         override fun onSuccess(message: String) {
                             progressBar.visibility = View.GONE
                             val intent = Intent(applicationContext, LoginActivity::class.java)
                             intent.putExtra("REGISTER", message)
                             startActivity(intent)
                             finish()
                         }

                         override fun inputError(errors: Map<String, String>) {

                             progressBar.visibility = View.GONE
                             if (errors["userFirstName"] != null){
                                 firstNameEdt.error = errors["userFirstName"]
                             }else{
                                 firstNameEdt.error = null
                             }

                             if (errors["userLastName"] != null){
                                 nameEdt.error = errors["userLastName"]
                             }else{
                                 nameEdt.error = null
                             }

                             if (errors["userEmail"] != null){
                                 emailEdt.error = errors["userEmail"]
                             }else{
                                 emailEdt.error = null
                             }
                         }

                         override fun onError(message: String) {
                             progressBar.visibility = View.GONE

                             Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
                         }
                     })*/

                //After Validating we register User
                registerUser(firstName, lastName, email, password)

            } else {
                displayToastMessage("Veuillez remplir tous les champs")
                return
            }
        }
    }

    private fun registerUser(firstName: String, lastName: String, email: String, password: String) {

        //call retrofit
        //making api call
        val api : Api = ApiClient.getClient().create(Api::class.java)
        val registerCall : Call<User> = api.register(firstName, lastName, email, password)

        registerCall.enqueue(object : Callback<User>{
            override fun onResponse(call: Call<User>, response: Response<User>) {

                if (response.body()?.isSuccess == 1) {

                    val user: User = response.body()!!

                    Log.d("APP_INFO", user.userFirstName)
                    Log.d("APP_INFO", user.userLastName)
                    Log.d("APP_INFO", user.userEmail)

                    progressBar.visibility = View.GONE

                    SessionManager.getInstance(applicationContext)?.storeUserInfo(
                        user.userFirstName,
                        user.userLastName,
                        user.userEmail,
                        user.userPassword
                    )
                    startActivity(Intent(applicationContext, LoginActivity::class.java))
                }
                else if (response.body()?.isSuccess == 0) {
                    if (response.body()?.message == "Email Exists Please Login"){
                        displayToastMessage(response.body()?.message!!)
                        startActivity(Intent(applicationContext, LoginActivity::class.java))

                        Log.d("APP_INFO", response?.body().toString())
                        Log.d("APP_INFO", "ERREUR : Code différent de 1!")

                    }else{
                        displayToastMessage("Une erreur est survenue, veuillez recommencer !")
                    }

                    progressBar.visibility = View.GONE
                }
            }

            override fun onFailure(call: Call<User>, throwable: Throwable) {
                //displayToastMessage(throwable.localizedMessage)
                displayToastMessage("ERREUR : Veuillez recommencer !")
                Log.d("ERREUR", throwable.localizedMessage)
                call.cancel()
                progressBar.visibility = View.GONE
            }
        })
    }

    // Bind View
    private fun bindView() {
        alreadySubscribed = findViewById(R.id.already_subscribed)
        firstNameEdt = findViewById(R.id.firstname_edt)
        nameEdt = findViewById(R.id.name_edt)
        emailEdt = findViewById(R.id.email_edt)
        passwordEdt = findViewById(R.id.password_edt)
        passwordConfirmEdt = findViewById(R.id.password_confirm_edt)
        registerBtn = findViewById(R.id.register_btn)
        progressBar = findViewById(R.id.progress)
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    // Display Toast Message
    private fun displayToastMessage(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}