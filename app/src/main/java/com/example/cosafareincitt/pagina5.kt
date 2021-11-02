package com.example.cosafareincitt

import android.os.Bundle
import android.widget.Button
import com.example.cosafareincitt.databinding.ActivityPagina5Binding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class pagina5 : GenericPage(), OnMapReadyCallback{

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityPagina5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina5)
        binding = ActivityPagina5Binding.inflate(layoutInflater)

        //APRI UNA PAGINA CASUALE
        activityList = generatelistOfRandomPage(num_page)
        val button = findViewById<Button>(R.id.button3)
        openRandomPage(activityList,button,this)

        setActionBar()

        setMapFragment(this,R.id.map)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        //40.83022881298872, 14.245348853900767
        val antonio = LatLng(40.83022881298872, 14.245348853900767)
        gestisci_mappa(mMap,antonio,"Antonio & Antonio",this)
        //inline fun ViewGroup.updateLayoutParams(block: LayoutParams.() -> Unit): Unit
    }

}