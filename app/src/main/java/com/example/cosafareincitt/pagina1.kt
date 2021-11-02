package com.example.cosafareincitt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.cosafareincitt.databinding.ActivityPagina1Binding
import com.google.android.gms.internal.maps.zzx
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.coroutines.android.awaitFrame
import kotlinx.coroutines.awaitAll

class pagina1 : GenericPage(),OnMapReadyCallback{

    private lateinit var binding: ActivityPagina1Binding
    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina1)
        binding = ActivityPagina1Binding.inflate(layoutInflater)

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
        val bellini = LatLng(40.85036274999631, 14.252066990575303)
        gestisci_mappa(mMap,bellini,"Piazza Bellini",this)


        //inline fun ViewGroup.updateLayoutParams(block: LayoutParams.() -> Unit): Unit
    }
}