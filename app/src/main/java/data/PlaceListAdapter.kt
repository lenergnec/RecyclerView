package data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.databinding.ActivityMainBinding
import data.PlaceListAdapter.*
import model.Place

class PlaceListAdapter(private val list: ArrayList<Place>, private val context: Context): RecyclerView.Adapter<ViewHolder>(){

    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindItem(place:Place){
            var country: TextView = itemView.findViewById(R.id.country_ID) as TextView
            var city: TextView = itemView.findViewById(R.id.city_ID) as TextView


            country.text = place.CountryName
            city.text = place.CityName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(list[position])

    }

    override fun getItemCount(): Int {
        return list.size

    }




}