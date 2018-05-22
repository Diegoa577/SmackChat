package com.apps.diego.smack.Controller

import android.app.Application
import com.apps.diego.smack.Utilities.SharedPrefs


class App : Application() {

    companion object {
        lateinit var prefs: SharedPrefs
    }

    override fun onCreate() {
        prefs = SharedPrefs(applicationContext)
        super.onCreate()
    }
}