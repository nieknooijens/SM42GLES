package dg.maincode.gles_test;

import android.app.Activity;
import android.content.Intent;
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
				Intent startnext = new Intent(HomeActivity.this, MainActivity.class);
				startActivity(startnext);
			}
		});
	}
	
}