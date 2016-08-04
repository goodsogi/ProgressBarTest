package com.seriouscompany.progressbartest;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        changeProgressBarColor();
//        changeHorizontalProgressBarColor();
    }

//    private void changeHorizontalProgressBarColor() {
//        ProgressBar progressBar = (ProgressBar) findViewById(R.id.horizontalProgressBar);
//        progressBar.getIndeterminateDrawable().setColorFilter(Color.BLUE, PorterDuff.Mode.MULTIPLY);
//    }
//
//    private void changeProgressBarColor() {
//        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
//        progressBar.getIndeterminateDrawable().setColorFilter(Color.BLUE, PorterDuff.Mode.MULTIPLY);
//    }
}
