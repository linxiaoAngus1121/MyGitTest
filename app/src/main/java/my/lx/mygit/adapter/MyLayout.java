package my.lx.mygit.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by 123456 on 2018/3/24.
 */

public class MyLayout extends LinearLayout {


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("000", "执行了onInterceptTouchEvent");
        return false;
        //return super.onInterceptTouchEvent(ev)，return true,拦截了子view的事件，所以button无法接收到点击事件,
        //return false; 子view就能获取事件了
    }


    public MyLayout(Context context) {
        super(context);
    }

    public MyLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
