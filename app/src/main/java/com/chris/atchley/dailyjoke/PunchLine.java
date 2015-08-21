package com.chris.atchley.dailyjoke;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class PunchLine extends AppCompatActivity {
    private TextView mPunchlineTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punch_line);
        mPunchlineTextView=(TextView)findViewById(R.id.punchLine);
        String date = String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_YEAR));
        Typeface newFont = Typeface.createFromAsset(getAssets(),"fonts/BodoniFLF-Roman.ttf");
        mPunchlineTextView.setTypeface(newFont);
        mPunchlineTextView.setText("testing to see if a long string will look good on the screen or if it will go off");



    }


}
