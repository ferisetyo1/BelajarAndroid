package feri.com.belajarandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navControl = findNavController(R.id.nav_view)
        bottomNavigationView.setupWithNavController(navControl)

        val login = SPMgr(this).getSudahLogin()
        Log.d("login",login.toString())
        if (!login) {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

    }
}
