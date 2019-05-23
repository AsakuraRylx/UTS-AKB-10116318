/*
    tanggal : 19 Mei 2019
    nim : 10116318
    nama : Syahril Asidiq Firdaus
    kelas : IF - 7
 */
package com.example.uts_syahril;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashScreen extends AppCompatActivity {
    private int splash_timeout = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(splash);
                finish();
            }
        },splash_timeout);
    }
}
