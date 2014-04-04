package dg.maincode.gles_test;

import android.app.Activity;
import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomeActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_activity_layout);
		Button startGLbutton = (Button) findViewById(R.id.ButtonStartGL);
		startGLbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//download stuff
				String servicestring = Context.DOWNLOAD_SERVICE;
			    DownloadManager downloadmanager;
			    downloadmanager = (DownloadManager) getSystemService(servicestring);
			    Uri uri = Uri.parse("https://www.google.nl/images/srpr/logo11w.png");
			    DownloadManager.Request request = new Request(uri);
			    Long reference = downloadmanager.enqueue(request);
				Intent startnext = new Intent(HomeActivity.this, MainActivity.class);
				startActivity(startnext);
			}
		});
		
	}
	
}