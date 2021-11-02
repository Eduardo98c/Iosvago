package com.example.cosafareincitt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.cosafareincitt.databinding.ActivityPagina6Binding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class pagina6 : GenericPage(), OnMapReadyCallback{

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityPagina6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //APRI UNA PAGINA CASUALE
        setContentView(R.layout.activity_pagina6)
        binding = ActivityPagina6Binding.inflate(layoutInflater)

        //APRI UNA PAGINA CASUALE
        activityList = generatelistOfRandomPage(num_page)
        val button = findViewById<Button>(R.id.button3)
        openRandomPage(activityList,button,this)

        setActionBar()

        setMapFragment(this,R.id.map)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        //40.83090992981039, 14.244688071090074
        val vanilla = LatLng(40.83090992981039, 14.244688071090074)
        gestisci_mappa(mMap,vanilla,"Vanilla Cafè",this)
        //inline fun ViewGroup.updateLayoutParams(block: LayoutParams.() -> Unit): Unit
    }

}