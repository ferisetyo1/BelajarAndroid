package feri.com.belajarandroid

import android.content.Context
import android.content.SharedPreferences

class SPMgr(context: Context) {
    private val AppName = "BelajarAndroid"
    private val sudahLogin = "SudahLogin"
    var sp: SharedPreferences

    init {
        sp = context.getSharedPreferences(AppName, Context.MODE_PRIVATE)
    }

    fun clear(): SharedPreferences.Editor? {
        return sp.edit().clear()
    }

    fun saveSudahLogin(boolean: Boolean) {
        val spEdit = sp.edit()
        spEdit.putBoolean(sudahLogin, boolean)
        spEdit.apply()
    }

    fun getSudahLogin(): Boolean {
        return sp.getBoolean(sudahLogin, false)
    }
}