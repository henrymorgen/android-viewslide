package com.example.liuwangshu.moonviewslide;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewSlideActivity extends AppCompatActivity {
    private CustomView mCustomView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_slide);
        mCustomView= (CustomView) this.findViewById(R.id.customview);
        //使用视图动画使view滑动
//        ObjectAnimator.ofFloat(mCustomView,"translationX",0,300).setDuration(1000).start();
        //使用Scroll来进行平滑移动
        mCustomView.smoothScollTo(-400,0);
    }
}
