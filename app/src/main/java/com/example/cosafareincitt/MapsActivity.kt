package com.example.cosafareincitt

import android.os.Bundle
import com.example.cosafareincitt.databinding.ActivityMapsBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class MapsActivity : GenericPage(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setActionBar()
        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setMapFragment(this,R.id.map)

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        gps = GPSTracker(this)
        val posizione_attuale = gps.getLocation()
        if (posizione_attuale != null) {
            val latitudine = posizione_attuale!!.latitude
            val longitudine = posizione_attuale.longitude
            val posizione = LatLng(latitudine, longitudine)

            val markerOption_pos = MarkerOptions().position(posizione).title("Posizione attuale").visible(true)

            markerOption_pos.icon(BitmapDescriptorFactory.fromResource(R.drawable.posizione_attuale_maps_activity))
            var marker_mia_posizione = mMap.addMarker(markerOption_pos)
            gps.stopUsingGPS()
        }
        val londonpark = LatLng(40.8744326054833351, 14.399813125066572)
        mMap.addMarker(MarkerOptions().position(londonpark).title("London Park"))
        val kloster = LatLng(40.779444469577776, 14.385775511570207)
        mMap.addMarker(MarkerOptions().position(kloster).title("Kloster Bier"))
        val bellini = LatLng(40.85036274999631, 14.252066990575303)
        mMap.addMarker(MarkerOptions().position(bellini).title("Piazza Bellini"))
        val orientale = LatLng(40.84591433267154, 14.25535927109041)
        mMap.addMarker(MarkerOptions().position(orientale).title("Orientale"))
        val caracciolo = LatLng(40.83144133429912, 14.227510798077724)
        mMap.addMarker(MarkerOptions().position(caracciolo).title("Via Caracciolo"))
        val antonio = LatLng(40.83022881298872, 14.245348853900767)
        mMap.addMarker(MarkerOptions().position(antonio).title("Antonio & Antonio"))
        val vanilla = LatLng(40.83090992981039, 14.244688071090074)
        mMap.addMarker(MarkerOptions().position(vanilla).title("Vanilla Cafè"))
        val dorian = LatLng(40.83166168229731, 14.346093535507789)
        mMap.addMarker(MarkerOptions().position(dorian).title("Dorian Gray"))
        val roof = LatLng(40.825875738439315, 14.357166069242181)
        mMap.addMarker(MarkerOptions().position(roof).title("Roof Garden"))
        val coce = LatLng(40.84178554431727, 14.365664069242525)
        mMap.addMarker(MarkerOptions().position(coce).title("Coce"))
        val marigliano = LatLng(40.83474659298823, 14.335369655748611)
        mMap.addMarker(MarkerOptions().position(marigliano).title("Casa Marigliano"))
        val bob = LatLng(40.85548281747464, 14.358204811572104)
        mMap.addMarker(MarkerOptions().position(bob).title("Panificio Michelangelo Bobb"))
        val tuttogelato = LatLng(40.83532744382091, 14.34679145574856)
        mMap.addMarker(MarkerOptions().position(tuttogelato).title("Tutto Gelato"))
        val salvo = LatLng(40.82588844815855, 14.330475725018992)
        mMap.addMarker(MarkerOptions().position(salvo).title("Pizzeria Salvo - San Giorgio a Cremano"))
        val francesco = LatLng(40.82466091968241, 14.329617418187794)
        mMap.addMarker(MarkerOptions().position(francesco).title("Paninoteca Da Francesco"))
        val molo = LatLng(40.80907595592394, 14.335822800284337)
        mMap.addMarker(MarkerOptions().position(molo).title("Porto del Granatello"))
        val verdenova = LatLng(40.84942078243477, 14.370289811571972)
        mMap.addMarker(MarkerOptions().position(verdenova).title("Verdenova"))
        val duegolfi = LatLng(40.82300634335707, 14.390635969242055)
        mMap.addMarker(MarkerOptions().position(duegolfi).title("Terrazza Due Golfi"))
        val wine = LatLng(40.907852248708744, 14.345831611573576)
        mMap.addMarker(MarkerOptions().position(wine).title("Pro Wine"))
        val cafestreet = LatLng(40.77251700522951, 14.38242004040537)
        mMap.addMarker(MarkerOptions().position(cafestreet).title("Cafè Street 45"))
        val eden = LatLng(40.81818166843114, 14.382528740406595)
        mMap.addMarker(MarkerOptions().position(eden).title("Eden Lounge Bar"))
        val black = LatLng(40.8753139284842, 14.346491996231187)
        mMap.addMarker(MarkerOptions().position(black).title("The Black Hole"))
        val george = LatLng(40.77750558803514, 14.390028525063912)
        mMap.addMarker(MarkerOptions().position(george).title("The George Best"))
        val nereis = LatLng(40.82031992478059, 14.072043969241985)
        mMap.addMarker(MarkerOptions().position(nereis).title("Nereis"))
        val roofsky = LatLng(40.794716381180955, 14.077933499924388)
        mMap.addMarker(MarkerOptions().position(roofsky).title("Roof and Sky"))
        val mm = LatLng(40.79005789143974, 14.35948715574741)
        mMap.addMarker(MarkerOptions().position(mm).title("MM LOUNGE RESTAURANT"))
        val trefontane = LatLng(40.82063667498192, 14.327038584583578)
        mMap.addMarker(MarkerOptions().position(trefontane).title("Resort Tre Fontane Luxury"))
        val fonderie = LatLng(40.816837591357015, 14.333609969241952)
        mMap.addMarker(MarkerOptions().position(fonderie).title("Fonderie"))
        val cratere = LatLng(40.821788931323255, 14.380388353900532)
        mMap.addMarker(MarkerOptions().position(cratere).title("Cratere"))
        val sozen = LatLng(40.75099896667913, 14.479334325063146)
        mMap.addMarker(MarkerOptions().position(sozen).title("So Zen"))
        val zenith = LatLng(40.81846692886326, 14.149614142254261)
        mMap.addMarker(MarkerOptions().position(zenith).title("Zenith"))
        val uci = LatLng(40.89774028323157, 14.315278725067154)
        mMap.addMarker(MarkerOptions().position(uci).title("UCI Cinema"))
        val laser = LatLng(40.933200122086895, 14.360372007878777)
        mMap.addMarker(MarkerOptions().position(laser).title("Laser Game"))
        val miramare = LatLng(40.76596321181451, 14.389569569240578)
        mMap.addMarker(MarkerOptions().position(miramare).title("Miramare"))
        val evergreen = LatLng(40.75871901391478, 14.404012726911182)
        mMap.addMarker(MarkerOptions().position(evergreen).title("Evergreen Cafè"))
        val renanera = LatLng(40.755195031239886, 14.441143284581754)
        mMap.addMarker(MarkerOptions().position(renanera).title("Renanera Beach"))
        val sign = LatLng(40.909077762485225, 14.395562884585956)
        mMap.addMarker(MarkerOptions().position(sign).title("The Sign 2.0"))
        val dublin = LatLng(40.91148499158032, 14.386250269244446)
        mMap.addMarker(MarkerOptions().position(dublin).title("Dublin Square"))
        val gandhi = LatLng(40.90328700565457, 14.400333157598174)
        mMap.addMarker(MarkerOptions().position(gandhi).title("Bar Gandhi 26"))
        val reves = LatLng(40.90886959607069, 14.389348226915182)
        mMap.addMarker(MarkerOptions().position(reves).title("Revès Local Bar"))
        val mascolo = LatLng(40.69161901281672, 14.522371511567783)
        mMap.addMarker(MarkerOptions().position(mascolo).title("Mascolo dal 1995"))
        val ruin = LatLng(40.856391889644335, 14.231558255749125)
        mMap.addMarker(MarkerOptions().position(ruin).title("Ruin Napoli"))
        val jemming = LatLng(40.865426566400515, 14.229391340407817)
        mMap.addMarker(MarkerOptions().position(jemming).title("Jemming"))
        val bayard = LatLng(40.808690678936124, 14.336382630377743)
        mMap.addMarker(MarkerOptions().position(bayard).title("Bayard Cafè"))
        val baylon = LatLng(40.80612099795318, 14.3358921269124)
        mMap.addMarker(MarkerOptions().position(baylon).title("Baylon Beach"))
        val centrocampania = LatLng(41.004430831848865, 14.32781000972844)
        mMap.addMarker(MarkerOptions().position(centrocampania).title("Centro Commerciale Campania"))
        val reggia = LatLng(41.00659222085141, 14.32135291157624)
        mMap.addMarker(MarkerOptions().position(reggia).title("La Reggia Designer Outlet"))
        val pokeria = LatLng(40.81482583699068, 14.335768940288789)
        mMap.addMarker(MarkerOptions().position(pokeria).title("La Pokeria"))
        val primopiano = LatLng(40.80832657879032, 14.336385184467405)
        mMap.addMarker(MarkerOptions().position(primopiano).title("Primo piano"))
        val miranapoli = LatLng(40.81479197741962, 14.206083399656803)
        mMap.addMarker(MarkerOptions().position(miranapoli).title("Miranapoli"))
        val porzio = LatLng(40.84147863100553, 14.198279338635485)
        mMap.addMarker(MarkerOptions().position(porzio).title("Pizzeria Porzio"))
        val vineapolis = LatLng(40.816540533213015, 14.167121353633483)
        mMap.addMarker(MarkerOptions().position(vineapolis).title("Vineapolis"))
        val penny = LatLng(40.8466587940647, 14.230292937123313)
        mMap.addMarker(MarkerOptions().position(penny).title("The Penny Black Pub"))
        val santantonio = LatLng(40.82817135285204, 14.218162624798516)
        mMap.addMarker(MarkerOptions().position(santantonio).title("Belvedere di Sant'Antonio a Posillipo"))
        val tammurriata = LatLng(40.89916483192596, 14.334265284317823)
        mMap.addMarker(MarkerOptions().position(tammurriata).title("Taverna la Tammurriata"))
        val esterina = LatLng(40.837664537916474, 14.24821755363408)
        mMap.addMarker(MarkerOptions().position(esterina).title("Antica Pizza Fritta da Zia Esterina Sorbillo"))
        val comandante = LatLng(40.84071947992807, 14.255690297810512)
        mMap.addMarker(MarkerOptions().position(comandante).title("Il Comandante Restaurant"))

        val napoli = LatLng(40.8, 14.3)
        val zoomLevel = 10.0f //This goes up to 21
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(napoli, zoomLevel))


    }


    }