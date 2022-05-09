package com.example.yuc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class game extends AppCompatActivity {

    private Button rps;
    private Button storyGrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rps = findViewById(R.id.rps);
        rps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(game.this, rock_paper_scissors.class);
                startActivity(intent);
            }
        });

        storyGrame = findViewById(R.id.storyGame);
        storyGrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(game.this, storyGame.class);
                startActivity(intent);
            }
        });
    }
}