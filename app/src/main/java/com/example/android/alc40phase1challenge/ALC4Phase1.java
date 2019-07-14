package com.example.android.alc40phase1challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ALC4Phase1 extends AppCompatActivity {
    Button aboutALC;
    Button myProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc4_phase1);

        aboutALC = findViewById(R.id.about);
        myProfile = findViewById(R.id.profile);

        aboutALC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutPage = new Intent(ALC4Phase1.this, AboutALC.class);
                startActivity(aboutPage);
            }
        });

        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutPage = new Intent(ALC4Phase1.this, MyProfile.class);
                startActivity(aboutPage);
            }
        });
    }
}
