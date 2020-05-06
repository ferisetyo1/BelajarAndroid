package feri.com.belajarandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.item_hero.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {


    private lateinit var list: java.util.ArrayList<HeroModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list = ArrayList<HeroModel>()
        list.addAll(
            arrayListOf(
                HeroModel("Miya","wanita","mm"),
                HeroModel("Miya","wanita","mm"),
                HeroModel("Miya","wanita","mm"),
                HeroModel("Miya","wanita","mm"),
                HeroModel("Miya","wanita","mm"),
                HeroModel("Miya","wanita","mm"),
                HeroModel("Lesley","wanita","mm"),
                HeroModel("Miya","wanita","mm"),
                HeroModel("Miya","wanita","mm"),
                HeroModel("Miya","wanita","mm"),
                HeroModel("Miya","wanita","mm"),
                HeroModel("Miya","wanita","mm"),
                HeroModel("Miya","wanita","mm"),
                HeroModel("Lesley","wanita","mm")
            )
        )

        rv_hero.adapter = HeroAdapter(requireContext(),list)

    }
}
