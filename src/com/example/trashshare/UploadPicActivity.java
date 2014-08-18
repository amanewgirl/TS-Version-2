package com.example.trashshare;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
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
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;


public class UploadPicActivity extends Activity {
	private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 100;
	private Uri fileUri;
	//private String picFile = fileUri.toString();
	//-----public static final int MEDIA_TYPE_IMAGE = 1;
		//find camera
		//once camera is found(set the screen and prepare it for the taking of pictures)
		//what do you do if you cant find a camera
		
		/*@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.comm_upload_pic);
	*/
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_upload_pic);

		 // create Intent to take a picture and return control to the calling application
	    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

	    fileUri = getOutputMediaFileUri(MEDIA_TYPE_IMAGE); // create a file to save the image
	    intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri); // set the image file name

	    // start the image capture Intent
	    startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    if (requestCode == CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE) {
	        if (resultCode == RESULT_OK) {
	           
	        	//Toast.makeText(this, fileUri.toString(), Toast.LENGTH_SHORT).show();
	        	bluePie();
	        	//Intent Filters = new Intent(this, Sif_Example_ImageFilter.class);
	    		//startActivity(Filters);
	        	//Image captured and saved to fileUri specified in the Intent
	            
	        	
	        	//Toast.makeText(this, "Image saved to:\n" +
	                   // data.getData(), Toast.LENGTH_LONG).show();
	        	
	        	
	        } else if (resultCode == RESULT_CANCELED) {
	            // User cancelled the image capture
	        } else return;}
	            // Image capture failed, advise user
	        }
	        public void bluePie() {
	        	//Toast.makeText(this, "Image saved to:\n" + fileUri.toString(), Toast.LENGTH_LONG).show();
	        String blue = null;
	        	Intent Filters = new Intent(this, Sif_Example_ImageFilter.class);
	        	Filters.putExtra(blue,fileUri);
	    		this.startActivity(Filters);
	}
			public static final int MEDIA_TYPE_IMAGE = 1;
	        public static final int MEDIA_TYPE_VIDEO = 2;

	        /** Create a file Uri for saving an image or video */
	        private static Uri getOutputMediaFileUri(int type){
	              return Uri.fromFile(getOutputMediaFile(type));
	        }

	        /** Create a File for saving an image or video */
	        private static File getOutputMediaFile(int type){
	            // To be safe, you should check that the SDCard is mounted
	            // using Environment.getExternalStorageState() before doing this.

	            File mediaStorageDir = new File(Environment.getExternalStoragePublicDirectory(
	                      Environment.DIRECTORY_PICTURES), "MyCameraApp");
	            // This location works best if you want the created images to be shared
	            // between applications and persist after your app has been uninstalled.

	            // Create the storage directory if it does not exist
	            if (! mediaStorageDir.exists()){
	                if (! mediaStorageDir.mkdirs()){
	                    Log.d("MyCameraApp", "failed to create directory");
	                    return null;
	                }
	            }

	            // Create a media file name
	            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	            File mediaFile;
	            if (type == MEDIA_TYPE_IMAGE){
	                mediaFile = new File(mediaStorageDir.getPath() + File.separator +
	                "IMG_"+ timeStamp + ".jpg");
	            } else if(type == MEDIA_TYPE_VIDEO) {
	                mediaFile = new File(mediaStorageDir.getPath() + File.separator +
	                "VID_"+ timeStamp + ".mp4");
	            } else {
	                return null;
	            }

	            return mediaFile;
	        }

	}