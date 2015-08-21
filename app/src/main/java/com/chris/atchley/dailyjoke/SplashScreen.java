package com.chris.atchley.dailyjoke;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Chris on 7/17/2015.
 */
public class SplashScreen extends Activity {
    private TextView splashText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash);

        splashText = (TextView) findViewById(R.id.splashScreenText);
        Typeface newFont = Typeface.createFromAsset(getAssets(),"fonts/BodoniFLF-Roman.ttf");
        splashText.setTypeface(newFont);
        String[] trial = getResources().getStringArray(R.array.TrialString);
        splashText.setText(trial[2]);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent i = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                }
            }
        };
        timerThread.start();
    }



    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}