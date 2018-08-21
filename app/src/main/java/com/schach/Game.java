package com.schach;

import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.widget.ImageButton;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Game extends AppCompatActivity {

    public static ImageButton[][] game = new ImageButton[8][8];
    public static Spielfigur[][] figuren = new Spielfigur[8][8]; //figuren[y][x] immer so einsetzen
    public static Spielfigur selectedFigure = null;
    
    Spielfigur st1 = new Spielfigur("st1", true, 't', 0, 0);
    Spielfigur ss1 = new Spielfigur("ss1", true, 's', 1, 0);
    Spielfigur sl1 = new Spielfigur("sl1", true, 'l', 2, 0);
    Spielfigur sd1 = new Spielfigur("sd1", true, 'd', 3, 0);
    Spielfigur sk1 = new Spielfigur("sk1", true, 'k', 4, 0);
    Spielfigur sl2 = new Spielfigur("sl2", true, 'l', 5, 0);
    Spielfigur ss2 = new Spielfigur("ss2", true, 's', 6, 0);
    Spielfigur st2 = new Spielfigur("st2", true, 't', 7, 0);
    Spielfigur sb1 = new Spielfigur("sb1", true, 'b', 0, 1);
    Spielfigur sb2 = new Spielfigur("sb2", true, 'b', 1, 1);
    Spielfigur sb3 = new Spielfigur("sb3", true, 'b', 2, 1);
    Spielfigur sb4 = new Spielfigur("sb4", true, 'b', 3, 1);
    Spielfigur sb5 = new Spielfigur("sb5", true, 'b', 4, 1);
    Spielfigur sb6 = new Spielfigur("sb6", true, 'b', 5, 1);
    Spielfigur sb7 = new Spielfigur("sb7", true, 'b', 6, 1);
    Spielfigur sb8 = new Spielfigur("sb8", true, 'b', 7, 1);
    Spielfigur wt1 = new Spielfigur("wt1", true, 't', 0, 7);
    Spielfigur ws1 = new Spielfigur("ws1", true, 's', 1, 7);
    Spielfigur wl1 = new Spielfigur("wl1", true, 'l', 2, 7);
    Spielfigur wd1 = new Spielfigur("wd1", true, 'd', 3, 7);
    Spielfigur wk1 = new Spielfigur("wk1", true, 'k', 4, 7);
    Spielfigur wl2 = new Spielfigur("wl2", true, 'l', 5, 7);
    Spielfigur ws2 = new Spielfigur("ws2", true, 's', 6, 7);
    Spielfigur wt2 = new Spielfigur("wt2", true, 't', 7, 7);
    Spielfigur wb1 = new Spielfigur("wb1", true, 'b', 0, 6);
    Spielfigur wb2 = new Spielfigur("wb2", true, 'b', 1, 6);
    Spielfigur wb3 = new Spielfigur("wb3", true, 'b', 2, 6);
    Spielfigur wb4 = new Spielfigur("wb4", true, 'b', 3, 6);
    Spielfigur wb5 = new Spielfigur("wb5", true, 'b', 4, 6);
    Spielfigur wb6 = new Spielfigur("wb6", true, 'b', 5, 6);
    Spielfigur wb7 = new Spielfigur("wb7", true, 'b', 6, 6);
    Spielfigur wb8 = new Spielfigur("wb8", true, 'b', 7, 6);   

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

        figuren[0][0] = st1;
        figuren[0][1] = ss1;
        figuren[0][2] = sl1;
        figuren[0][3] = sd1;
        figuren[0][4] = sk1;
        figuren[0][5] = sl2;
        figuren[0][6] = ss2;
        figuren[0][7] = st2;
        figuren[1][0] = sb1;
        figuren[1][1] = sb2;
        figuren[1][2] = sb3;
        figuren[1][3] = sb4;
        figuren[1][4] = sb5;
        figuren[1][5] = sb6;
        figuren[1][6] = sb7;
        figuren[1][7] = sb8;
        figuren[7][0] = wt1;
        figuren[7][1] = ws1;
        figuren[7][2] = wl1;
        figuren[7][3] = wd1;
        figuren[7][4] = wk1;
        figuren[7][5] = wl2;
        figuren[7][6] = ws2;
        figuren[7][7] = wt2;
        figuren[6][0] = wb1;
        figuren[6][1] = wb2;
        figuren[6][2] = wb3;
        figuren[6][3] = wb4;
        figuren[6][4] = wb5;
        figuren[6][5] = wb6;
        figuren[6][6] = wb7;
        figuren[6][7] = wb8;

        for(int i = 0; i <= 7; i++){
            for(int j = 0; j <= 7; j++){
                game[i][j].getLayoutParams().width = (screenWidth - 32)/8;
                game[i][j].getLayoutParams().height = (screenWidth - 32)/8;
            }
        }
    }


    public void onFieldClick(View view) {
        ImageButton btn = (ImageButton) view;
        int y = checkChar(btn.getContentDescription().charAt(0));
        int x = checkChar(btn.getContentDescription().charAt(1));
        if(selectedFigure == null) {
            if (figuren[y][x] != null) {
                figuren[y][x].highlightFields();
                selectedFigure = figuren[y][x];
            }else{
                return;
            }
        }else{
            if (figuren[y][x] != null) {
                figuren[y][x].highlightFields();
                selectedFigure = figuren[y][x];
            }else{

            }
        }
    }

    public void setUnclicked(){
        for(int i = 0; i <= 7; i++){
            for(int j = 0; j <= 7; j++){
                game[i][j].setBackgroundResource(0);
            }
        }
    }

    public int checkChar(char number){
        switch (number){
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            default:
                return 8;
        }
    }

}
