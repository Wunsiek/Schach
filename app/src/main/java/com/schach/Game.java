package com.schach;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Game extends AppCompatActivity {

    ImageButton[][] game = new ImageButton[8][8];

    @BindView(R.id.btn00)
    ImageButton btn00;
    @BindView(R.id.btn01)
    ImageButton btn01;
    @BindView(R.id.btn02)
    ImageButton btn02;
    @BindView(R.id.btn03)
    ImageButton btn03;
    @BindView(R.id.btn04)
    ImageButton btn04;
    @BindView(R.id.btn05)
    ImageButton btn05;
    @BindView(R.id.btn06)
    ImageButton btn06;
    @BindView(R.id.btn07)
    ImageButton btn07;
    @BindView(R.id.btn10)
    ImageButton btn10;
    @BindView(R.id.btn11)
    ImageButton btn11;
    @BindView(R.id.btn12)
    ImageButton btn12;
    @BindView(R.id.btn13)
    ImageButton btn13;
    @BindView(R.id.btn14)
    ImageButton btn14;
    @BindView(R.id.btn15)
    ImageButton btn15;
    @BindView(R.id.btn16)
    ImageButton btn16;
    @BindView(R.id.btn17)
    ImageButton btn17;
    @BindView(R.id.btn20)
    ImageButton btn20;
    @BindView(R.id.btn21)
    ImageButton btn21;
    @BindView(R.id.btn22)
    ImageButton btn22;
    @BindView(R.id.btn23)
    ImageButton btn23;
    @BindView(R.id.btn24)
    ImageButton btn24;
    @BindView(R.id.btn25)
    ImageButton btn25;
    @BindView(R.id.btn26)
    ImageButton btn26;
    @BindView(R.id.btn27)
    ImageButton btn27;
    @BindView(R.id.btn30)
    ImageButton btn30;
    @BindView(R.id.btn31)
    ImageButton btn31;
    @BindView(R.id.btn32)
    ImageButton btn32;
    @BindView(R.id.btn33)
    ImageButton btn33;
    @BindView(R.id.btn34)
    ImageButton btn34;
    @BindView(R.id.btn35)
    ImageButton btn35;
    @BindView(R.id.btn36)
    ImageButton btn36;
    @BindView(R.id.btn37)
    ImageButton btn37;
    @BindView(R.id.btn40)
    ImageButton btn40;
    @BindView(R.id.btn41)
    ImageButton btn41;
    @BindView(R.id.btn42)
    ImageButton btn42;
    @BindView(R.id.btn43)
    ImageButton btn43;
    @BindView(R.id.btn44)
    ImageButton btn44;
    @BindView(R.id.btn45)
    ImageButton btn45;
    @BindView(R.id.btn46)
    ImageButton btn46;
    @BindView(R.id.btn47)
    ImageButton btn47;
    @BindView(R.id.btn50)
    ImageButton btn50;
    @BindView(R.id.btn51)
    ImageButton btn51;
    @BindView(R.id.btn52)
    ImageButton btn52;
    @BindView(R.id.btn53)
    ImageButton btn53;
    @BindView(R.id.btn54)
    ImageButton btn54;
    @BindView(R.id.btn55)
    ImageButton btn55;
    @BindView(R.id.btn56)
    ImageButton btn56;
    @BindView(R.id.btn57)
    ImageButton btn57;
    @BindView(R.id.btn60)
    ImageButton btn60;
    @BindView(R.id.btn61)
    ImageButton btn61;
    @BindView(R.id.btn62)
    ImageButton btn62;
    @BindView(R.id.btn63)
    ImageButton btn63;
    @BindView(R.id.btn64)
    ImageButton btn64;
    @BindView(R.id.btn65)
    ImageButton btn65;
    @BindView(R.id.btn66)
    ImageButton btn66;
    @BindView(R.id.btn67)
    ImageButton btn67;
    @BindView(R.id.btn70)
    ImageButton btn70;
    @BindView(R.id.btn71)
    ImageButton btn71;
    @BindView(R.id.btn72)
    ImageButton btn72;
    @BindView(R.id.btn73)
    ImageButton btn73;
    @BindView(R.id.btn74)
    ImageButton btn74;
    @BindView(R.id.btn75)
    ImageButton btn75;
    @BindView(R.id.btn76)
    ImageButton btn76;
    @BindView(R.id.btn77)
    ImageButton btn77;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ButterKnife.bind(this);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int screenWidth = size.x;
        int screenHeight = size.y;

        game[0][0] = btn00;
        game[0][1] = btn01;
        game[0][2] = btn02;
        game[0][3] = btn03;
        game[0][4] = btn04;
        game[0][5] = btn05;
        game[0][6] = btn06;
        game[0][7] = btn07;
        game[1][0] = btn10;
        game[1][1] = btn11;
        game[1][2] = btn12;
        game[1][3] = btn13;
        game[1][4] = btn14;
        game[1][5] = btn15;
        game[1][6] = btn16;
        game[1][7] = btn17;
        game[2][0] = btn20;
        game[2][1] = btn21;
        game[2][2] = btn22;
        game[2][3] = btn23;
        game[2][4] = btn24;
        game[2][5] = btn25;
        game[2][6] = btn26;
        game[2][7] = btn27;
        game[3][0] = btn30;
        game[3][1] = btn31;
        game[3][2] = btn32;
        game[3][3] = btn33;
        game[3][4] = btn34;
        game[3][5] = btn35;
        game[3][6] = btn36;
        game[3][7] = btn37;
        game[4][0] = btn40;
        game[4][1] = btn41;
        game[4][2] = btn42;
        game[4][3] = btn43;
        game[4][4] = btn44;
        game[4][5] = btn45;
        game[4][6] = btn46;
        game[4][7] = btn47;
        game[5][0] = btn50;
        game[5][1] = btn51;
        game[5][2] = btn52;
        game[5][3] = btn53;
        game[5][4] = btn54;
        game[5][5] = btn55;
        game[5][6] = btn56;
        game[5][7] = btn57;
        game[6][0] = btn60;
        game[6][1] = btn61;
        game[6][2] = btn62;
        game[6][3] = btn63;
        game[6][4] = btn64;
        game[6][5] = btn65;
        game[6][6] = btn66;
        game[6][7] = btn67;
        game[7][0] = btn70;
        game[7][1] = btn71;
        game[7][2] = btn72;
        game[7][3] = btn73;
        game[7][4] = btn74;
        game[7][5] = btn75;
        game[7][6] = btn76;
        game[7][7] = btn77;

        for(int i = 0; i <= 7; i++){
            for(int j = 0; j <= 7; j++){
                game[i][j].getLayoutParams().width = (screenWidth - 32)/8;
                game[i][j].getLayoutParams().height = (screenWidth - 32)/8;
            }
        }

    }
}
