package com.example.vaccinesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val vaccinesList: ArrayList<VaccineModel> = ArrayList()

        val v1: VaccineModel = VaccineModel(R.drawable.vaccine1, "COVID-19")
        val v2: VaccineModel = VaccineModel(R.drawable.vaccine4, "Hepatitis B")
        val v3: VaccineModel = VaccineModel(R.drawable.vaccine5, "Tatanus")
        val v4: VaccineModel = VaccineModel(R.drawable.vaccine6, "Pneumonia")
        val v5: VaccineModel = VaccineModel(R.drawable.vaccine7, "Rotavirus")
        val v6: VaccineModel = VaccineModel(R.drawable.vaccine8, "Caries")
        val v7: VaccineModel = VaccineModel(R.drawable.vaccine9, "Cancer")

        vaccinesList.add(v1)
        vaccinesList.add(v2)
        vaccinesList.add(v3)
        vaccinesList.add(v4)
        vaccinesList.add(v5)
        vaccinesList.add(v6)
        vaccinesList.add(v7)

        val adapter = MyAdapter(vaccinesList)

        recyclerView.adapter = adapter
    }
}