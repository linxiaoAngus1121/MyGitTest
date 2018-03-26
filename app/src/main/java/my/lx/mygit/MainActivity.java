package my.lx.mygit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import my.lx.mygit.adapter.MButton;
import my.lx.mygit.adapter.MyLayout;

public class MainActivity extends AppCompatActivity {

    private MyLayout mylayout;
    private MButton mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylayout = (MyLayout) findViewById(R.id.mylayout);
        mButton = (MButton) findViewById(R.id.custom_but);


        mylayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("000", "执行了自定义layout中mylayout的Onclick");
            }
        });


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("000", "执行了自定义按钮的Onclick");
            }
        });

        mButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.i("000", "执行了自定义按钮的onTouch事件");
                return false;   //触发click事件
                //return true //不会出发click
            }
        });

        mylayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.i("000", "执行了mylayout的OnTouch");
                return true;
            }
        });
    }


    public void name(View view) {
        Log.i("000", "你点击了按钮");
    }
}
