package com.sovejo.lexdroidejemploimagenadaptador;

import android.os.Bundle;
import android.view.Window;
import android.widget.Gallery;
import android.app.Activity;

public class MainActivity extends Activity 
{
	Gallery galeria01;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		galeria01 = (Gallery) findViewById(R.id.galeria01);
		//galeria01.setAdapter(new myAdapter(this));
	}

}
