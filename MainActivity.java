package com.example.android.taranoate;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ViewFlipper;
import android.view.animation.Animation;

import static android.R.attr.id;
import static android.R.attr.showText;

public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    Animation fadeIn, fadeOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);
        fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        viewFlipper.setAutoStart(true);
        viewFlipper.setInAnimation(fadeIn);
        viewFlipper.setOutAnimation(fadeOut);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();

        //this create the logo

       // android.support.v7.app.ActionBar actionBar = getSupportActionBar();
       // actionBar.setLogo(R.drawable.tara_no_ate11);
       // actionBar.setDisplayUseLogoEnabled(true);
      //  actionBar.setDisplayShowHomeEnabled(true);

    }

    //custom menu bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    //when bar menu was clicked
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.about_us:

                Intent intent = new Intent(this, AboutActivity.class);
                this.startActivity ( intent );
                return true;

            case  R.id.contact:
                Intent intent1 = new Intent(this, ContactActivity.class);
                this.startActivity( intent1);
                return true;

            case R.id.reservation:
                Intent intent2 = new Intent(this,ReservationActivity.class);
                this.startActivity(intent2);
                return true;

            default:

                return super.onOptionsItemSelected(item);
        }
    }
}


