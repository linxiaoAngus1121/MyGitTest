package my.lx.mygit.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by 123456 on 2018/3/24.
 */

public class MButton extends android.support.v7.widget.AppCompatButton {


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("000", "执行了button的onTouchEvent方法");
        return true;
        //return super.onTouchEvent(event) ，return true 都会触发onTouch,onclick 事件
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i("000", "执行了button的dispatchTouchEvent方法");
        return true;    //不会触发onclick事件
        // return super.dispatchTouchEvent(event)
    }

    public MButton(Context context) {
        super(context);
    }

    public MButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
