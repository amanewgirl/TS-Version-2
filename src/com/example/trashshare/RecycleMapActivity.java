package com.example.trashshare;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


public class RecycleMapActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/*setContentView(R.layout.activity_recycle_map);
		android.app.ActionBar actionBar = getActionBar();
		 
        // Enabling Up / Back navigation
        actionBar.setDisplayHomeAsUpEnabled(true);
	
	*/
		
		Uri uri = Uri.parse("http://humanitiesinafrika.org/recyclemap.html");
		 Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		 startActivity(intent);
		   finish();
		 
	}public void onfinish(Intent intent){
	

		Intent Home = new Intent(this, HomeActivity.class);
		Home.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		this.startActivity(Home);
		
	}
}
