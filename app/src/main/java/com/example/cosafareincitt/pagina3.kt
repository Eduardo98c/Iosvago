package com.example.cosafareincitt

import android.os.Bundle
import android.widget.Button
import com.example.cosafareincitt.databinding.ActivityPagina3Binding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class pagina3 : GenericPage(), OnMapReadyCallback{

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityPagina3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina3)
        binding = ActivityPagina3Binding.inflate(layoutInflater)

        //APRI UNA PAGINA CASUALE
        activityList = generatelistOfRandomPage(num_page)
        val button = findViewById<Button>(R.id.button3)
        openRandomPage(activityList,button,this)

        setActionBar()

        setMapFragment(this,R.id.map)

    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        //40.847193285981504, 14.25177715574888
        val piazzagesu = LatLng(40.847193285981504, 14.25177715574888)

        gestisci_mappa(mMap,piazzagesu,"Piazza del Gesu'",this)
        //inline fun ViewGroup.updateLayoutParams(block: LayoutParams.() -> Unit): Unit
    }
}