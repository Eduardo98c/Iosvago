package com.example.cosafareincitt

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.location.Location
import android.location.LocationManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import java.util.*


abstract class GenericPage: AppCompatActivity(){

    companion object{
        var num_page: Int = 58
    }

    var activityList: ArrayList<Class<*>> = ArrayList()
    lateinit var gps: GPSTracker

    open fun gestisci_mappa(
        mMap: GoogleMap,
        luogo: LatLng,
        nome_luogo: String,
        context: Context
    ) :Boolean {
        var success :Boolean = false

        gps = GPSTracker(this)
        val location = Location(LocationManager.GPS_PROVIDER)
        location.latitude = luogo.latitude
        location.longitude = luogo.longitude

        mMap.addMarker(MarkerOptions().position(luogo).title(nome_luogo).visible(true))

        //-----------------------------------------------------
        val posizione_attuale = gps.getLocation()
        if (posizione_attuale != null) {
            val latitudine = posizione_attuale.latitude
            val longitudine = posizione_attuale.longitude
            val posizione = LatLng(latitudine, longitudine)

            val markerOption_pos = MarkerOptions().position(posizione).title("Posizione attuale").visible(true)

            markerOption_pos.icon(BitmapDescriptorFactory.fromResource(R.drawable.posizione_attuale))
            var marker_mia_posizione = mMap.addMarker(markerOption_pos)

            val latitudine_media = (location.latitude + latitudine) / 2
            val longitudine_media = (location.longitude + longitudine) / 2
            val punto_medio_posizioni = LatLng(latitudine_media, longitudine_media)

            val zoomLevel = 12.0f
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(punto_medio_posizioni, zoomLevel))
            success = true
        }
        else{
            val zoomLevel = 16.0f //This goes up to 21
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(luogo, zoomLevel))
        }
        gps.stopUsingGPS()
       return success


    }
    open fun setMapFragment(pagina: OnMapReadyCallback, map: Int) {
        val mapFragment = supportFragmentManager
            .findFragmentById(map) as SupportMapFragment
            mapFragment.getMapAsync(pagina)

    }
    open fun setActionBar(){
        //Actionbar per tornare indietro
        val actionbar = supportActionBar
        //Impostazione titolo dell'ActionBar
        actionbar!!.title = resources.getString(R.string.app_name)
        //attivazione del tasto Indietro nell'ActionBar
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        return true
    }

    open fun generatelistOfRandomPage(max_page: Int): ArrayList<Class<*>> {
        val extras = intent.extras


        if (extras != null) {
            activityList = extras.get("ACTIVITY_LIST") as ArrayList<Class<*>>
        }
        val page ="pagina"

        for (i: Int in 1..max_page){
            activityList.add(Class.forName("com.example.cosafareincitt."+page+i.toString()))
        }

        return activityList
    }
    open fun openRandomPage(activityListInput: ArrayList<Class<*>>, button: Button, activityInput: Activity){
        val max_page: Int
        button.setOnClickListener {

            if (activityListInput.size == 0) {
                print("activity list vuota")
            } else {
                // Now, the random number is generated between 1 and however many
                // activities we have remaining

                val number = Random().nextInt(activityListInput.size)+1
                val activity = activityListInput[number-1]
                val intent = Intent(activityInput,activity)
                activityInput.startActivity(intent)
            }

        }
    }



}