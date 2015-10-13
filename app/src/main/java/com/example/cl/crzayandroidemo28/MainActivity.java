package com.example.cl.crzayandroidemo28;

import android.app.Activity;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RatingBar;


public class MainActivity extends Activity {
ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView) findViewById(R.id.image);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.rating);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            //当拖动条的滑块位置发生变化时触发该方法
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                //动态改变图片的透明度，其中255是星级评分的最大值
                //5个星星就代表最大值255
                image.setAlpha((int)(rating * 255/5));
            }
        });
    }
}
