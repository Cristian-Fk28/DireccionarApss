package com.example.direccionarapss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton fb, wp, ne,ti,te,wa,ca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fb=findViewById(R.id.imageButton2);
        ne=findViewById(R.id.imageButton3);
        ti=findViewById(R.id.imageButton4);
        te=findViewById(R.id.imageButton5);
        wa=findViewById(R.id.imageButton6);
        ca=findViewById(R.id.imageButton7);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fbA= getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                startActivity(fbA);

            }
        });
        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ne= getPackageManager().getLaunchIntentForPackage("com.netflix.mediaclient");
                startActivity(ne);

            }
        });
        ti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ti= getPackageManager().getLaunchIntentForPackage("com.zhiliaoapp.musically");
                startActivity(ti);

            }
        });
        te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent te= getPackageManager().getLaunchIntentForPackage("org.telegram.messenger");
                startActivity(te);

            }
        });
        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wa= getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                startActivity(wa);

            }
        });
        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca= getPackageManager().getLaunchIntentForPackage("com.sec.android.app.camera");
                startActivity(ca);
            }
        });

    }
}
