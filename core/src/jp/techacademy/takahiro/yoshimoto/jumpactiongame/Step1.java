package jp.techacademy.takahiro.yoshimoto.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Yoshimoto Takahiro on 2017/03/14.
 */
public class Step1 extends GameObject{
    // 横幅・高さ
    public static final float STEP_WIDTH = 1.8f;
    public static final float STEP_HEIGHT = 1.5f;

    // タイプ（通常と動くタイプ）
    public static final int STEP_TYPE_STATIC = 0;
    public static final int STEP_TYPE_MOVING = 1;

    // 状態(通常と消えた状態)
    public static final int STEP_STATE_NORMAL = 0;
    public static final int STEP_STATE_VANISH = 1;

    // 速度
    public static final float STEP_VELOCITY = 4.0f;

    int mType;
    int mState;

    public Step1(int type, Texture texture, int srcX, int srcY, int srcWidth, int srcHeight){
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(STEP_WIDTH, STEP_HEIGHT);
        mType = type;
        if(mType == STEP_TYPE_MOVING){
            velocity.x = STEP_VELOCITY;
        }
    }

    // 座標を更新する
    public void update(float deltaTime){
        if(mType == STEP_TYPE_MOVING){
            setX(getX() + velocity.x * deltaTime);

            if(getX() < STEP_WIDTH / 2){
                velocity.x = -velocity.x;
                setX(STEP_WIDTH / 2);
            }
            if(getX() > GameScreen.WORLD_WIDTH - STEP_WIDTH / 2){
                velocity.x = -velocity.x;
                setX(GameScreen.WORLD_WIDTH - STEP_WIDTH / 2);
            }
        }
    }

    // 消える
    public void vanish(){
        mState = STEP_STATE_VANISH;
        setAlpha(0);
        velocity.x = 0;
    }

}
