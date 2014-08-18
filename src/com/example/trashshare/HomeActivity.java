package com.example.trashshare;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class HomeActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new Fragment()).commit();
		}
	
	
	Button btn = (Button) findViewById(R.id.button1);

	btn.setOnClickListener(new View.OnClickListener() {
	    @Override
	    public void onClick(View v) {
	    	openCanRe(v);
	    }
	});}



	public void openCanRe(View v) {
	    // open button help me recycle
		 Intent myIntent = new Intent(this, HelpMeActivity.class);
		 this.startActivity(myIntent); 
	
	
	
	Button btn = (Button) findViewById(R.id.button2);

	btn.setOnClickListener(new View.OnClickListener() {
	    @Override
	    public void onClick(View v) {
	    	openRNow(v);
	    }
	});}



	public void openRNow(View v) {
	    // open button recycle map
		 Intent myIntent = new Intent(this, RecycleMapActivity.class);
		 this.startActivity(myIntent); 
	
	
	
	Button btn = (Button) findViewById(R.id.button3);

	btn.setOnClickListener(new View.OnClickListener() {
	    @Override
	    public void onClick(View v) {
	    	openTtalk(v);
	    }
	});}



	public void openTtalk(View v) {
	    // open button for community
		 Intent myIntent = new Intent(this, CommFashionActivity.class);
		 this.startActivity(myIntent); 
	

	

}
	
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}
	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			
				return true;
			}
				else if(id == R.id.action_about){
					{
						openAbout(null);
							}
					}

		
		return super.onOptionsItemSelected(item);
	}

	
	

	
	
	
	
	private void openAbout(Object object) {
		// TODO Auto-generated method stub
		// open button for community
				 Intent aboutapp = new Intent(this, AboutActivity.class);
				 this.startActivity(aboutapp); 
	}








	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_home, container,
					false);
			return rootView;
		}
	}}
	


