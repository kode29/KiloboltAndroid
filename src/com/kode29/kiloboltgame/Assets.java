package com.kode29.kiloboltgame;

import com.kode29.framework.Image;
import com.kode29.framework.Music;
import com.kode29.framework.Sound;

public class Assets {
	public static Image menu, splash, background, character, character2,
			character3, heliboy, heliboy2, heliboy3, heliboy4, heliboy5;
	public static Image tiledirt, tilegrassTop, tilegrassBot, tilegrassLeft,
			tilegrassRight, characterJump, characterDown;
	public static Image button;
	public static Sound click;
	public static Music theme;

	public static void load(SampleGame sampleGame) {
		theme = sampleGame.getAudio().createMusic("menutheme.mp3");
		theme.setLooping(true);
		theme.setVolume(0.88f);
		theme.play();
	}
}
