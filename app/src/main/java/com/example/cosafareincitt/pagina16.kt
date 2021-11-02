package com.example.cosafareincitt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import com.example.cosafareincitt.databinding.ActivityPagina10Binding
import com.example.cosafareincitt.databinding.ActivityPagina11Binding
import com.example.cosafareincitt.databinding.ActivityPagina13Binding

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.cosafareincitt.databinding.ActivityPagina16Binding
import java.util.*

class pagina16 : GenericPage(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityPagina16Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina16)
        binding = ActivityPagina16Binding.inflate(layoutInflater)

        //APRI UNA PAGINA CASUALE
        activityList = generatelistOfRandomPage(num_page)
        val button = findViewById<Button>(R.id.button3)
        openRandomPage(activityList,button,this)
        setActionBar()
        setMapFragment(this,R.id.map)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
//40.84942078243477, 14.370289811571972
        val verdenova = LatLng(40.84942078243477, 14.370289811571972)
        gestisci_mappa(mMap,verdenova,"Verdenova",this)

    }

}