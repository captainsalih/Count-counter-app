package com.example.android.taranoate;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

/**
 * Created by mus on 3/30/17.
 */

public class ReservationActivity extends AppCompatActivity {
    ViewFlipper viewFlipper2;
    Animation fadeIn, fadeOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservation_layout);

        //set view flipper

        viewFlipper2 = (ViewFlipper) findViewById(R.id.viewFlipper_reservation);
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
    public void startChild(View view){
        startActivity(new Intent(this,ConfirmationActivity.class));

    }
}

