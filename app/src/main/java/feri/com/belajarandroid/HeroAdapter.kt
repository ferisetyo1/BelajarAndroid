package feri.com.belajarandroid

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_hero.view.*

class HeroAdapter(var context: Context, var list: ArrayList<HeroModel>) :
    RecyclerView.Adapter<HeroAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            context,
            LayoutInflater.from(context).inflate(R.layout.item_hero, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list.get(position))
    }

    class ViewHolder(val context: Context, itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txt_nama = itemView.nama_hero
        var txt_gender = itemView.gender_hero
        var txt_role = itemView.role_hero
        var lyt = itemView.lyt
        fun bind(model: HeroModel) {
            model.apply {
                txt_nama.text =nama
                txt_gender.text = gender
                txt_role.text = role
            }
            lyt.setOnClickListener {
                context.startActivity(
                    Intent(context, DetailHero::class.java).putExtra(
                        "data",
                        model
                    )
                )
            }
        }
    }

}
