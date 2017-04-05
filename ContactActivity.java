package com.example.android.taranoate;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

import static android.R.attr.phoneNumber;
import static com.example.android.taranoate.R.id.telephone;

/**
 * Created by mus on 3/25/17.
 */

public class ContactActivity extends AppCompatActivity {
    ViewFlipper viewFlipper2;
    Animation fadeIn, fadeOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_layout);

        //set view flipper

        viewFlipper2= (ViewFlipper) findViewById(R.id.viewFlipper_contact);
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

    public void address(View view){
        double latitude = 47.274289;
        double longitude = 11.442329;
        String label = "Tara-No-Ate";
        String uriBegin = "geo:" + latitude + "," + longitude;
        String query = latitude + "," + longitude + "(" + label + ")";
        String encodedQuery = Uri.encode(query);
        String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
        Uri uri = Uri.parse(uriString);
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, uri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void telephone(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel: 067761595607"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


}
