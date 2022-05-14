package com.example.yuc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.nio.file.Files;
import java.nio.file.Path;

public class YUC_2 extends AppCompatActivity {

    private Button app;
    private Button site;
    private Button action;
    private Button chan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yuc2);

        chan = findViewById(R.id.chan);
        chan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YUC_2.this, chan.class);
                startActivity(intent);
            }
        });

        action = findViewById(R.id.action);
        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YUC_2.this, action.class);
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

        app = findViewById(R.id.app);
        app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YUC_2.this, app.class);
                startActivity(intent);
            }
        });

    }
}