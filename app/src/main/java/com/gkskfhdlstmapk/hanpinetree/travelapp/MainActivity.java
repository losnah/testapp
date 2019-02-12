package com.gkskfhdlstmapk.hanpinetree.travelapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv_sunchean = (ImageView)findViewById(R.id.iv_sunchean);
        ImageView iv_yeosu = (ImageView)findViewById(R.id.iv_yeosu);

        iv_sunchean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),suncheanActivity.class);
                startActivity(intent);
            }
        });

        iv_yeosu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),yeosuActivity.class);
                startActivity(intent);
            }
        });



    }
}
