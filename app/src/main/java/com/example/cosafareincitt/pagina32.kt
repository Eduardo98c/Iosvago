package com.example.cosafareincitt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import com.example.cosafareincitt.databinding.ActivityPagina31Binding
import com.example.cosafareincitt.databinding.ActivityPagina32Binding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import java.util.*

class pagina32 : GenericPage(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityPagina32Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina32)
        binding = ActivityPagina32Binding.inflate(layoutInflater)

        //APRI UNA PAGINA CASUALE
        activityList = generatelistOfRandomPage(num_page)
        val button = findViewById<Button>(R.id.button3)
        openRandomPage(activityList,button,this)
        setActionBar()
        setMapFragment(this,R.id.map)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
//40.81846692886326, 14.149614142254261
        val pos = LatLng(40.81846692886326, 14.149614142254261)
        gestisci_mappa(mMap,pos,"Zenith",this)

    }

}