package com.example.cosafareincitt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import com.example.cosafareincitt.databinding.ActivityPagina1Binding

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.cosafareincitt.databinding.ActivityPagina9Binding
import java.util.*

class pagina9 : GenericPage(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityPagina9Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina9) // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        binding = ActivityPagina9Binding.inflate(layoutInflater)

        //APRI UNA PAGINA CASUALE
        activityList = generatelistOfRandomPage(num_page)
        val button = findViewById<Button>(R.id.button3)
        openRandomPage(activityList,button,this)
        setActionBar()
        setMapFragment(this,R.id.map)
    }
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
//40.84178554431727, 14.365664069242525
        val coce = LatLng(40.84178554431727, 14.365664069242525)
        gestisci_mappa(mMap,coce,"Coce",this)

        //inline fun ViewGroup.updateLayoutParams(block: LayoutParams.() -> Unit): Unit
    }

}