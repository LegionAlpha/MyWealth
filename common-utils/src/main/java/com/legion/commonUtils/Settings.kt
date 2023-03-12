package com.legion.commonUtils

import android.content.SharedPreferences
import androidx.core.content.edit

class Settings(private val sharedPreferences: SharedPreferences) {
    var applicationMode: ApplicationMode
        get() = ApplicationMode.fromStringValue(sharedPreferences.getString("applicationMode", ApplicationMode.Online.stringValue)!!)!!
        set(value) = sharedPreferences.edit(true) { putString("applicationMode", value.stringValue) }
}