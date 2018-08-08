package com.schach;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

import java.util.ArrayList;

public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        ArrayList<ImageButton> buttonList = new ArrayList<ImageButton>();
        ImageButton imgBA8 = (ImageButton) findViewById(R.id.imageButtonA8);
        buttonList.add(imgBA8);
        for(ImageButton imgB : buttonList){
            imgB.setMaxHeight(imgB.getWidth());
        }

    }
}
