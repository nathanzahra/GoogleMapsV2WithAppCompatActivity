package com.ecs.google.maps.v2.simple;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.ecs.google.maps.v2.actionbarnew.R;
import com.ecs.google.maps.v2.fragment.DirectionsInputActivity;
import com.ecs.google.maps.v2.util.GoogleMapUtis;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;

/**
 * 
 * Loads a layout containing a SimpleSherlockMapFragment component 
 * (defined in the simple_sherlock_map_fragment.xml layout)
 * 
 * @author ddewaele
 *
 */
public class SimpleAppFragmentActivity extends AppCompatActivity {

	private SupportMapFragment mapFragment;
	private GoogleMap googleMap;

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.support_map_fragment);
		
		mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        googleMap = mapFragment.getMap();
        googleMap.setMyLocationEnabled(true);
        
	}
	
	  @Override
	  public boolean onCreateOptionsMenu(Menu menu) {
		  getMenuInflater().inflate(R.menu.main_menu, menu);
	      return true;
	  } 
	  
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			Toast.makeText(this, "Clicked menu " + item.getItemId(), Toast.LENGTH_LONG).show();
		      return true;
		}	  
}
