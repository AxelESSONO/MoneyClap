package com.edouardondo.moneyklap.utils

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import com.edouardondo.moneyklap.controller.activity.LoginActivity

class SessionManager(var mCtx: Context) {

    //method to store user data
    fun storeUserInfo(userFirstName: String?, userLastName: String?, userEmail: String?, userPassword: String?) {
        val sharedPreferences: SharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString(USER_FIRST_NAME, userFirstName)
        editor.putString(USER_LAST_NAME, userLastName)
        editor.putString(USER_EMAIL, userEmail)
        editor.putString(USER_PASSWORD, userPassword)
        editor.apply()
    }

    //check if user is logged in
    val isLoggedIn: Boolean
        get() {
            val sharedPreferences: SharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
            return sharedPreferences.getString(USER_EMAIL, null) != null
        }

    //find logged in user
    fun LoggedInUser(): String? {
        val sharedPreferences: SharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
        return sharedPreferences.getString(USER_EMAIL, null)
    }

    //Logout user
    fun logout() {
        val sharedPreferences: SharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.apply()
        mCtx.startActivity(Intent(mCtx, LoginActivity::class.java))
    }

    companion object {
        //Storage File
        const val SHARED_PREF_NAME = "UserInfo"

        //Username
        const val USER_FIRST_NAME = "userFirstName"
        const val USER_LAST_NAME = "userLastName"
        const val USER_PASSWORD = "userPassword"
        const val USER_EMAIL = "userEmail"

        var mInstance: SessionManager? = null

        @Synchronized
        fun getInstance(context: Context): SessionManager? {
            if (mInstance == null) {
                mInstance = SessionManager(context)
            }
            return mInstance
        }
    }
}