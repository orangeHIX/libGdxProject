package com.creaty.photonwar.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PhotonWarGame extends Game {
	public static final float MIN_SCENE_WIDTH = 800.0f;
	public static final float MIN_SCENE_HEIGHT = 600.0f;
	public static final float MAX_SCENE_WIDTH = 1280.0f;
	public static final float MAX_SCENE_HEIGHT = 720.0f;

	public SpriteBatch batch;
	public BitmapFont font;

	public void create() {
		batch = new SpriteBatch();
		//Use LibGDX's default Arial font.
		font = new BitmapFont();
		this.setScreen(new MainMenuScreen(this));
	}

	public void render() {
		super.render(); //important!
	}

	public void dispose() {
		batch.dispose();
		font.dispose();
	}
}
