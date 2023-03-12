package com.legion.commonUtils

enum class ApplicationMode(val stringValue: String) {
    Online("Online"),
    Offline("Offline");

    companion object {
        fun fromStringValue(stringValue: String): ApplicationMode? {
            return enumValues<ApplicationMode>().firstOrNull { it.stringValue == stringValue }
        }
    }
}