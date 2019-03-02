package com.example.saddan.mapsactivity;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentContainer;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.Task;

public class MainActivity extends AppCompatActivity //implements OnMapReadyCallback
{
    private GoogleMap map;
    private GoogleMapOptions GMapOption;
    private Double longitude,latitude;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkPermission();
        /*GMapOption= new GoogleMapOptions();
        GMapOption.zoomControlsEnabled(true);

        SupportMapFragment supportMapFragment=SupportMapFragment.newInstance(GMapOption);
        FragmentTransaction fragmentT=getSupportFragmentManager().beginTransaction().
                replace(R.id.map_frameLayout,supportMapFragment);

        fragmentT.commit();
        supportMapFragment.getMapAsync(this);
*/

    }

  /*  @Override
    public void onMapReady(GoogleMap googleMap)
    {
        map = googleMap;

        checkPermission();
        map.setMyLocationEnabled(true);

        LatLng latLng=new LatLng(23.742131,90.382359);

        map.addMarker(new MarkerOptions().position(latLng).
                title("Meher plaza").
                snippet("Dhaka,Bangladesh"));

        map.moveCamera(CameraUpdateFactory.newLatLng(latLng));

        map.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() {
            @Override
            public void onMapLongClick(LatLng latLng)

            {
                map.clear();
                map.addMarker(new MarkerOptions().position(latLng).title("New place").snippet("Dhaka,Bangladesh"));
            }
        });
    }
*/
    private void checkPermission()
    {


        if((ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=PackageManager.PERMISSION_GRANTED))
        {
            ActivityCompat.requestPermissions(this,new String[] {Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission
                    .ACCESS_COARSE_LOCATION},100);
            return;
        }


    }

}
