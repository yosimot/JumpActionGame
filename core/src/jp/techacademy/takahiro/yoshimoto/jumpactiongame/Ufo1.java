package jp.techacademy.takahiro.yoshimoto.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Yoshimoto Takahiro on 2017/03/14.
 */
public class Ufo1 extends GameObject {
    // 横幅・高さ
    public static final float UFO_WIDTH = 2.0f;
    public static final float UFO_HEIGHT =2.0f;

    public Ufo1(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight){
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(UFO_WIDTH, UFO_HEIGHT);
    }
}
