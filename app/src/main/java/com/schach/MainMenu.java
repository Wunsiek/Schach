package com.schach;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        play = findViewById(R.id.play);

    }

    public void onPlayClick(View view) {
        Intent intent = new Intent (this, Game.class);
        startActivity(intent);
    }
}
