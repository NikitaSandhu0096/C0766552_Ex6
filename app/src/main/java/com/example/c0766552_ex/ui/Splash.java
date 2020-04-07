package com.example.c0766552_ex.ui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.print.PageRange;
import android.widget.TextView;

import com.example.c0766552_ex.R;

import org.w3c.dom.Text;

public class Splash extends AppCompatActivity {    //https://www.youtube.com/watch?v=jXtof6OUtcE

    private int SPLASH_TIME_OUT = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ActionBar actBar = getSupportActionBar();
        actBar.setTitle("Love Canada Application");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent hint = new Intent(Splash.this, MainActivity.class);
                startActivity(hint);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
