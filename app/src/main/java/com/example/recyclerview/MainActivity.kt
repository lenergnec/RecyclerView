package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ActivityMainBinding
import data.PlaceListAdapter
import model.Place

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.

        var adapter: PlaceListAdapter? = null
        var countryList: ArrayList<Place>? = null
        var layoutManager: RecyclerView.LayoutManager? = null

        countryList = ArrayList<Place>()
        layoutManager = LinearLayoutManager(this)
        adapter = PlaceListAdapter(countryList, this)

        binding.myRecyclerView.layoutManager = layoutManager
        binding.myRecyclerView.adapter = adapter

        val countryNameList: Array<String> =
            arrayOf("Nicaragua",
                "Costa rica",
                "Panama",
                "Honduras",
                "El Salvador",
                "Mexico",
                "Guatemala",
                "Belice",
                "Argentina",
                "Chile",
                "Colombia",
                "Venezuela",
                "Cuba",
                "Dominicana",
                "Canada")

        val citiesNameList: Array<String> =
            arrayOf("Managua",
                "San Jose",
                "Panama",
                "Tegucigalpa",
                "El Salvador",
                "Mexico",
                "Guatemala",
                "Belice",
                "Buenos Aires",
                "Santiago",
                "Bogota",
                "Caracas",
                "Habana",
                "Dominicana",
                "Otawa")

        for (i in 0..14) {
            val place = Place()
            place.CountryName = countryNameList[i]
            place.CityName = citiesNameList[i]
            countryList.add(place)
        }
        adapter.notifyDataSetChanged()
    }

}