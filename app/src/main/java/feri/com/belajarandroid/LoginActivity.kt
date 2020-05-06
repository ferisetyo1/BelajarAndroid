package feri.com.belajarandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun login(view: View) {
        if (email.text!!.toString().equals("admin",true)&&password.text!!.toString().equals("admin")){
            SPMgr(this).saveSudahLogin(true)
            startActivity(Intent(this, MainActivity::class.java).putExtra("nama", "feri"))
            finish()
        }
    }
}
