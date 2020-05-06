package feri.com.belajarandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_hero.*

class DetailHero : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hero)
        val model = intent.getParcelableExtra<HeroModel>("data")
        nama.text = model.nama
        gender.text = model.gender
        role.text = model.role

    }
}
