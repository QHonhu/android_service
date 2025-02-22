package com.example.servicetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startButton=(Button)findViewById(R.id.start);
        Button endButton=(Button)findViewById(R.id.end);
        startButton.setOnClickListener(this);
        endButton.setOnClickListener(this);
        
    }
    @Override
	public void onClick(View view) {
		switch(view.getId()){
			case R.id.start:
				startService(new Intent(MainActivity.this,MusicService.class));
				break;
			case R.id.end:
				stopService(new Intent(MainActivity.this,MusicService.class));
				break;
		}
		
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
        return super.onOptionsItemSelected(item);
    }


	
}
