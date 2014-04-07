package com.sovejo.lexdroidejemploimagenadaptador;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter
{
	private Context myContext;
	
	//Array con los IDs de las imagenes para poder manejarlas luego
	private Integer[] mImageIDs = {
			R.drawable.uno,
			R.drawable.dos,
			R.drawable.tres,
			R.drawable.cuatro,
			R.drawable.cinco
	};
	
	int mGalleryItemBackground;
	
	//Constructor
	public ImageAdapter(Context c)
	{
		myContext = c;
		TypedArray attr = myContext.obtainStyledAttributes(R.styleable.galeriaEstilo);
		mGalleryItemBackground = attr.getResourceId(R.styleable.galeriaEstilo_android_galleryItemBackground, 0);
		attr.recycle();
	}
	
	@Override
	public int getCount() 
	{
		// TODO Auto-generated method stub
		return mImageIDs.length;
	}

	@Override
	public Object getItem(int position) 
	{
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) 
	{
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) 
	{
		// TODO Auto-generated method stub
		ImageView imageView = new ImageView(myContext);
		
		imageView.setImageResource(mImageIDs[position]);
		imageView.setLayoutParams(new Gallery.LayoutParams(200, 200));
		imageView.setScaleType(ImageView.ScaleType.FIT_XY);
		imageView.setBackgroundResource(mGalleryItemBackground);
		
		return imageView;
	}
	
}
