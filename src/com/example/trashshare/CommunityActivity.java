package com.example.trashshare;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Build;

public class CommunityActivity extends ListActivity implements OnItemClickListener{

	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    String[] values = new String[] { "Fashion","Electrical","Gardening",
		         "Home","Kids" };
	   
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
	    		R.layout.com_categories, R.id.label, values);
	    setListAdapter(adapter);
	   
	    getListView().setOnItemClickListener(this);
	    android.app.ActionBar actionBar = getActionBar();
		 
        // Enabling Up / Back navigation
        actionBar.setDisplayHomeAsUpEnabled(true);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		 MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.community, menu);
		
		    return super.onCreateOptionsMenu(menu);
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
	
		return super.onOptionsItemSelected(item);
	}
	
	
		

	public void onItemClick (AdapterView<?> parent, View v, int position, long id){   
		
		
		String item = (String) getListAdapter().getItem(position);

		if (item.equals("Fashion"))
		{

		Intent intent = new Intent(this, CommFashionActivity.class);
		startActivity(intent);
		}
		/*else if (item.equals("Electrical"))
		{

		Intent intent = new Intent(this, CatElectricActivity.class);
		startActivity(intent);
		}
		else if (item.equals("Gardening"))
		{

		Intent intent = new Intent(this,CatGardenActivity.class);
		    startActivity(intent);
		}
		else if (item.equals("Home"))
		{

		Intent intent = new Intent(this, CatHomeActivity.class);
		    startActivity(intent);
		     }

		else if (item.equals("Kids"))
		{

		Intent intent = new Intent(this,CatKidsActivity.class);
		    startActivity(intent);
		     }*/

	}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//getSelectedItemId(); 
	//public void onListItemClick(AdapterView<?> parent, View view,
	     // int position, long id) {
	 
	 //switch (v) 
	 //{
           // case 0:
            // Intent newActivity0 = new Intent(this,CommFashionActivity.class);     
            // this.startActivity(newActivity0);
            //break;
            /*case 1:
             Intent newActivity1 = new Intent(this,CatElectricActivity.class);     
             startActivity(newActivity1);
            break;
            case 2:
             Intent newActivity2 = new Intent(this,CatGardenActivity.class);     
             startActivity(newActivity2);
            break;
            case 3:
             Intent newActivity3 = new Intent(this,CatHomeActivity.class);     
             startActivity(newActivity3);
            break;
            case 4:
	             Intent newActivity4 = new Intent(this,CatKidsActivity.class);     
	             startActivity(newActivity4);
	            break;
            default:
              // Nothing
          }
		

	  }
	 	

	 @Override
	  protected void onListItemClick(ListView l, View v, int position, long id) {
	    String item = (String) getListAdapter().getItem(position);
	    Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();*/




 
 
//}




