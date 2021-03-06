package com.ecs.google.maps.v2.simple;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Fragment to be used in combination with a SherlockFragmentActivity.
 * 
 * Component is defined in the simple_sherlock_map_fragment.xml layout
 * 
 * @author ddewaele
 *
 */
public class SimpleAppMapFragment extends SupportMapFragment {

	private GoogleMap googleMap;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View root = super.onCreateView(inflater, container, savedInstanceState);
		googleMap = getMap();
		googleMap.setMyLocationEnabled(true);
		return root;
	}
	
}
