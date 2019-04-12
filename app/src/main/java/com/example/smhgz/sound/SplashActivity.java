package com.example.smhgz.sound;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.graphics.Typeface;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class SplashActivity extends Activity {

/*    Typeface tf1;
    TextView splashVox = (TextView)findViewById(R.id.splashVox);*/

    private static int display_time=4000;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);

                finish();
            }
        },display_time);

/*        Typeface tf1 = Typeface.createFromAsset(getAssets(),"fonts/CormoMedium.ttf");
        TextView Vox = (TextView) findViewById(R.id.splashVox);

        Vox.setTypeface(tf1);*/


        // myTextView.setTypeface(tf1);

    }
}

