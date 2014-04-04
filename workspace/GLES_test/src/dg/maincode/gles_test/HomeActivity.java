package dg.maincode.gles_test;

import android.app.Activity;
import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends Activity {
	DownLoadComplte mDownload;
	DownloadManager downloadmanager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_activity_layout);
		mDownload = new DownLoadComplte();
		Button startGLbutton = (Button) findViewById(R.id.ButtonStartGL);
		startGLbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//download stuff
				String servicestring = Context.DOWNLOAD_SERVICE;
				EditText urlbar = (EditText) findViewById(R.id.stl_url_bar);
			    downloadmanager = (DownloadManager) getSystemService(servicestring);
			    Uri uri = Uri.parse(urlbar.getText().toString());
			    DownloadManager.Request request = new Request(uri);
			    Long reference = downloadmanager.enqueue(request);
			    mDownload = new DownLoadComplte();
		        registerReceiver(mDownload, new IntentFilter(
		        DownloadManager.ACTION_DOWNLOAD_COMPLETE));
			}
		});
		
	}
	private class DownLoadComplte extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
        	String filename = "";
            if (intent.getAction().equalsIgnoreCase(
                    DownloadManager.ACTION_DOWNLOAD_COMPLETE)) {
                Toast.makeText(context, "Download Complete", Toast.LENGTH_LONG)
                        .show();
                Bundle extras = intent.getExtras();
                DownloadManager.Query q = new DownloadManager.Query();
                q.setFilterById(extras.getLong(DownloadManager.EXTRA_DOWNLOAD_ID));
                Cursor c = downloadmanager.query(q);
                if (c.moveToFirst()) {
                    int status = c.getInt(c.getColumnIndex(DownloadManager.COLUMN_STATUS));
                    if (status == DownloadManager.STATUS_SUCCESSFUL) {
                        // process download
                        filename = c.getString(c.getColumnIndex(DownloadManager.COLUMN_TITLE));
                        // get other required data by changing the constant passed to getColumnIndex
                    }
                }
                Intent startnext = new Intent(HomeActivity.this, MainActivity.class);
                startnext.putExtra("STLfile", "cube.stl");
				startActivity(startnext);
            }
        }
    }
}