package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*        ImageView first = (ImageView) findViewById(R.id.first);
        first.setTranslationY(-3000f);*/
    }

    public void fade(View view) {
        ImageView first = (ImageView) findViewById(R.id.first);
        first.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        first.animate().rotation(360).setDuration(1000);
        first.animate().scaleX(1f).scaleY(1f).setDuration(4000);
/*        ImageView second = (ImageView) findViewById(R.id.second);
        second.animate().alpha(0f).setDuration(50);
        first.animate().translationYBy(3000f).setDuration(2000);*/

//        ImageView second = (ImageView) findViewById(R.id.second);
//        ImageView third = (ImageView) findViewById(R.id.third);
//        ImageView fourth = (ImageView) findViewById(R.id.fourth);

//        second.animate().alpha(1f).setDuration(50);
//        second.animate().alpha(0f).setDuration(50);
//        third.animate().alpha(1f).setDuration(50);
//        third.animate().alpha(0f).setDuration(50);
//        fourth.animate().alpha(1f).setDuration(50);
//        fourth.animate().alpha(0f).setDuration(50);
//        first.animate().alpha(1f).setDuration(50);
    }
}