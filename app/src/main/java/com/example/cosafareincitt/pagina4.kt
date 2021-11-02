package com.example.cosafareincitt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.cosafareincitt.databinding.ActivityPagina4Binding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class pagina4 : GenericPage(), OnMapReadyCallback{

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityPagina4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina4)
        binding = ActivityPagina4Binding.inflate(layoutInflater)

        //APRI UNA PAGINA CASUALE
        activityList = generatelistOfRandomPage(num_page)
        val button = findViewById<Button>(R.id.button3)
        openRandomPage(activityList,button,this)

        setActionBar()

        setMapFragment(this,R.id.map)

    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        //40.83144133429912, 14.227510798077724
        val caracciolo = LatLng(40.83144133429912, 14.227510798077724)
        gestisci_mappa(mMap,caracciolo,"Via Francesco Caracciolo",this)
        //inline fun ViewGroup.updateLayoutParams(block: LayoutParams.() -> Unit): Unit
    }

}