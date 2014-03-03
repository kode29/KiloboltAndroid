package com.kode29.framework.implementation;

import android.graphics.Bitmap;

import com.kode29.framework.Image;
import com.kode29.framework.Graphics.ImageFormat;

public class AndroidImage implements Image{
	Bitmap bitmap;
	ImageFormat format;
	
	public AndroidImage(Bitmap bitmap, ImageFormat format){
		this.bitmap = bitmap;
		this.format = format;
	}
	
	@Override
	public int getWidth(){
		return bitmap.getWidth();
	}
	
	@Override
	public int getHeight(){
		return bitmap.getHeight();
	}
	
	@Override
	public ImageFormat getFormat(){
		return format;
	}
	
	@Override
	public void dispose(){
		bitmap.recycle();
	}
}
