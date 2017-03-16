package jp.techacademy.takahiro.yoshimoto.jumpactiongame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class JumpActionGame extends Game {
	// publicにして，外からアクセスできるようにする
	public SpriteBatch batch;

	@Override
	public void create () {
		batch = new SpriteBatch();

		// GameScreenを表示する
		setScreen(new StartScreen(this));
	}
}
