package com.example.yuc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.nio.file.Files;
import java.nio.file.Path;

public class YUC_2 extends AppCompatActivity {

    private Button portfolie;
    private Button site;
    private Button activity;
    private Button set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yuc2);

        set = findViewById(R.id.set);
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YUC_2.this, set.class);
                startActivity(intent);
            }
        });

        activity = findViewById(R.id.activity);
        activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YUC_2.this, activity.class);
                startActivity(intent);
            }
        });

        site = findViewById(R.id.site);
        site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YUC_2.this, site.class);
                startActivity(intent);
            }
        });

        portfolie = findViewById(R.id.portfolie);
        portfolie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YUC_2.this, portfolie.class);
                startActivity(intent);
            }
        });

    }
}