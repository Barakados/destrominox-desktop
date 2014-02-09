package com.destrominox.main;


import main.Destrominox;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Destrominox -  The Awoken";
		cfg.useGL20= false;
		cfg.width = 400;
		cfg.height = 400;
		
		new LwjglApplication(new Destrominox(), cfg);
	}
}
