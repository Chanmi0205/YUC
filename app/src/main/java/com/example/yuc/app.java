package com.example.yuc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class app extends AppCompatActivity{

    private Button rps_;
    private Button myGrade;
    private Button timing;
    private Button notepad;
    private Button gun_;
    private Button lunchTime;
    private Button storyGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        storyGame = findViewById(R.id.storyGame);
        storyGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(app.this, com.example.yuc.storyGame.class);
                startActivity(intent);
            }
        });

        rps_ = findViewById(R.id.rps_);
        rps_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(app.this, rps_.class);
                startActivity(intent);
            }
        });

        myGrade = findViewById(R.id.myGrade);
        myGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(app.this, mygrade.class);
                startActivity(intent);
            }
        });

        timing = findViewById(R.id.timing);
        timing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(app.this, timing_rogo.class);
                startActivity(intent);
            }
        });

        notepad = findViewById(R.id.notepad);
        notepad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(app.this, notepad.class);
                startActivity(intent);
            }
        });

        gun_ = findViewById(R.id.gun_);
        gun_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(app.this, gunDrawing.class);
                startActivity(intent);
            }
        });

        lunchTime = findViewById(R.id.lunchTime);
        lunchTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(app.this, lunchTime.class);
                startActivity(intent);
            }
        });

    }
}