package com.example.cosafareincitt

import android.os.Bundle
import android.widget.Button
import com.example.cosafareincitt.databinding.ActivityPagina2Binding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class pagina2 : GenericPage(), OnMapReadyCallback{

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityPagina2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina2)
        binding = ActivityPagina2Binding.inflate(layoutInflater)

        //APRI UNA PAGINA CASUALE
        activityList = generatelistOfRandomPage(num_page)
        val button = findViewById<Button>(R.id.button3)
        openRandomPage(activityList,button,this)

        setActionBar()

        setMapFragment(this,R.id.map)

    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        //40.84591433267154, 14.25535927109041
        val orientale = LatLng(40.84591433267154, 14.25535927109041)
        gestisci_mappa(mMap,orientale,"Orientale",this)
        //inline fun ViewGroup.updateLayoutParams(block: LayoutParams.() -> Unit): Unit
    }
}