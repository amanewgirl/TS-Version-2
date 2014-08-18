package com.example.trashshare;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;
import android.provider.MediaStore;
import android.hardware.Camera;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PixelFormat;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.ShutterCallback;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup.LayoutParams;



public class FashionUploadActivity extends Activity {
	
	
	
	EditText userName;
	EditText projectName;
	EditText projectDescript;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fashion_upload);
		ImageButton sharingButton = new ImageButton(this);
		sharingButton.setLayoutParams(new ViewGroup.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		sharingButton.setImageResource(R.drawable.bag);
		//Edit Text
		userName= (EditText) findViewById(R.id.editText1);
		projectName= (EditText) findViewById(R.id.editText2);
		projectDescript= (EditText) findViewById(R.id.editText3);
		
		//Upload Item
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Button btnPhoto = (Button)findViewById(R.id.button1);

		btnPhoto.setOnClickListener(new View.OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    	takePic(v);
		    }
		});}



		public void takePic(View v) {
			 Intent myIntent = new Intent(this, UploadPicActivity.class);
			 this.startActivity(myIntent); 
			     
			
		
		
	Button btnGallery = (Button)findViewById(R.id.button2);

	btnGallery.setOnClickListener(new View.OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    	//fjyugy
		    }
		});}



		public void openRNow(View v) {
		    // open button recycle map
			 Intent myIntent = new Intent(this, RecycleMapActivity.class);
			 this.startActivity(myIntent); 
		
		
		
Button btnUploadItem = (Button)findViewById(R.id.button3);

btnUploadItem.setOnClickListener(new View.OnClickListener() {
		    @Override
		    public void onClick(View v) {
		    	//hjkg
		    }
		});}



		public void openTtalk(View v) {
		    // open button for community
			 Intent myIntent = new Intent(this, CommunityActivity.class);
			 this.startActivity(myIntent); 
		

		

	}
		
		

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {

			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.fashion_upload, menu);
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
				else if(id == R.id.action_share){
					{
						//openCanRe(null);
						//Toast.makeText(this, "work", Toast.LENGTH_SHORT).show();
						return true;
							}

					
			}
			return super.onOptionsItemSelected(item);
		}}
			
        








           /* @Override
            public void onClick(View view) {
                // creating new product in background thread
                new CreateNewProduct().execute();
            }
        });*/
    
        
