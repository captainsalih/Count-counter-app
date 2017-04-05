package com.example.android.taranoate;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by mus on 3/24/17.
 */

public class AboutActivity extends AppCompatActivity {
    ViewFlipper viewFlipper2;
    Animation fadeIn, fadeOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_layout);

        //set view flipper

        viewFlipper2= (ViewFlipper) findViewById(R.id.viewFlipper_about);
        fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        viewFlipper2.setAutoStart(true);
        viewFlipper2.setInAnimation(fadeIn);
        viewFlipper2.setOutAnimation(fadeOut);
        viewFlipper2.setFlipInterval(4000);
        viewFlipper2.startFlipping();


        // Enable the Up button

        getSupportActionBar().setDisplayShowHomeEnabled(true);


    }

}
