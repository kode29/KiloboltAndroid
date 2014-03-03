package com.kode29.kiloboltgame;

import com.kode29.framework.Game;
import com.kode29.framework.Graphics;
import com.kode29.framework.Screen;
import com.kode29.framework.Graphics.ImageFormat;

public class SplashLoadingScreen extends Screen {
	public SplashLoadingScreen(Game game){
		super(game);
	}
	
	@Override
	public void update(float deltaTime){
		Graphics g = game.getGraphics();
		Assets.splash = g.newImage("splash.jpg", ImageFormat.RGB565);
		game.setScreen(new LoadingScreen(game));
	}
	
	@Override
	public void paint(float deltaTime){
		
	}
	@Override
	public void pause(){
		
	}
	@Override
	public void resume(){
		
	}
	@Override
	public void dispose(){
		
	}
	@Override
	public void backButton(){
		
	}
}
