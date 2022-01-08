package com.example.yuc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class site extends AppCompatActivity {

    private Button yuc_youtube;
    private Button yuc_Homepage;
    private Button yuc_facebook;
    private Button yuc_instagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site);


        yuc_instagram = (Button)findViewById(R.id.yuc_instagram);
        yuc_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/yeoulcom/?hl=ko"));
                startActivity(intent);
            }
        });


        yuc_facebook = (Button)findViewById(R.id.yuc_facebook);
        yuc_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/YEOULCOM/"));
                startActivity(intent);
            }
        });

        yuc_Homepage = (Button)findViewById(R.id.yuc_Homepage);
        yuc_Homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/view/yeoulcom"));
                startActivity(intent);
            }
        });


        yuc_youtube = (Button)findViewById(R.id.yuc_youtube);
        yuc_youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCk01qy1rhiP34tBQjK8Os_w"));
                startActivity(intent);
            }
        });
    }
}