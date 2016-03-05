package com.harvnlenny.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button spotifyButton;
    private Button scoresButton;
    private Button libraryButton;
    private Button buildItButton;
    private Button xyzButton;
    private Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyButton = (Button) findViewById(R.id.spotifyButton);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my Spotify app!",Toast.LENGTH_SHORT).show();

            }
        });

        scoresButton = (Button) findViewById(R.id.scoresButton);
        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Scores app!", Toast.LENGTH_SHORT).show();
            }
        });

        libraryButton = (Button) findViewById(R.id.libraryButton);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Library app!", Toast.LENGTH_SHORT).show();
            }
        });

        buildItButton = (Button) findViewById(R.id.buildItButton);
        buildItButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Build It app!", Toast.LENGTH_SHORT).show();
            }
        });

        xyzButton = (Button) findViewById(R.id.xyzButton);
        xyzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my XYZ app!", Toast.LENGTH_SHORT).show();
            }
        });

        capstoneButton = (Button) findViewById(R.id.capstoneButton);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Capstone app!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
