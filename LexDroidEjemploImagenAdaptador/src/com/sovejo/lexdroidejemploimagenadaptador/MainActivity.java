package com.sovejo.lexdroidejemploimagenadaptador;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity
{
	Gallery galeria01;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		galeria01 = (Gallery) findViewById(R.id.galeria01);
		galeria01.setAdapter(new ImageAdapter(this));
		galeria01.setOnItemClickListener(new OnItemClickListener() 
		{
			public void onItemClick(AdapterView<?> parent, View v, int position, long id)
			{
				Toast.makeText(MainActivity.this, ""+position, Toast.LENGTH_LONG).show();
			}
		});
	}

}
