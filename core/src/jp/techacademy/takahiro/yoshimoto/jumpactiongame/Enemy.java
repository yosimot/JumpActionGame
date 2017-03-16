package jp.techacademy.takahiro.yoshimoto.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Yoshimoto Takahiro on 2017/03/16.
 */
public class Enemy extends GameObject {
    // 横幅・高さ
    public static final float ENEMY_WIDTH = 1.2f;
    public static final float ENEMY_HEIGHT = 1.2f;

    // タイプ（通常と動くタイプ）
    public static final int ENEMY_TYPE_STATIC = 0;
    public static final int ENEMY_TYPE_MOVING = 1;

    // 速度
    public static final float ENEMY_VELOCITY = 2.0f;

    int mType;

    public Enemy(int type, Texture texture, int srcX, int srcY, int srcWidth, int srcHeight){
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT);
        mType = type;
        if(mType == ENEMY_TYPE_MOVING){
            velocity.x = ENEMY_VELOCITY;
        }
    }

    // 座標を更新する
    public void update(float deltaTime){
        if(mType == ENEMY_TYPE_MOVING){
            setX(getX() + velocity.x * deltaTime);

            if(getX() < ENEMY_WIDTH / 2){
                velocity.x = -velocity.x;
                setX(ENEMY_WIDTH / 2);
            }
            if(getX() > GameScreen.WORLD_WIDTH - ENEMY_WIDTH / 2){
                velocity.x = -velocity.x;
                setX(GameScreen.WORLD_WIDTH - ENEMY_WIDTH / 2);
            }
        }
    }
}
