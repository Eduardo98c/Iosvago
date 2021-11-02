package com.example.cosafareincitt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import com.example.cosafareincitt.databinding.ActivityPagina20Binding
import com.example.cosafareincitt.databinding.ActivityPagina30Binding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import java.util.*

class pagina30 : GenericPage(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityPagina30Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina30)
        binding = ActivityPagina30Binding.inflate(layoutInflater)

        //APRI UNA PAGINA CASUALE
        activityList = generatelistOfRandomPage(num_page)
        val button = findViewById<Button>(R.id.button3)
        openRandomPage(activityList,button,this)
        setActionBar()
        setMapFragment(this,R.id.map)
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
//40.821788931323255, 14.380388353900532
        val pos = LatLng(40.821788931323255, 14.380388353900532)
        gestisci_mappa(mMap,pos,"Cratere",this)

    }
}