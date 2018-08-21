package com.schach;

import android.graphics.Color;

public class Spielfigur {

    private String id; //Setzt sich zusammen aus s/w + k/d/l.. + nummerierung
    private char art; //k = König, d = Dame, b = Bauer, l = Läufer, s = Springer, t = Turm
    private boolean schwarz; //true = schwarz, false = weiß
    private int xPos; //0 ist links, 7 ist rechts
    private int yPos; //0 ist oben, 7 ist unten
    private boolean moved; //TODO: auf true setzen, wenn zug ausgeführt wird

    public Spielfigur(String id, boolean schwarz, char art, int xPos, int yPos){
        this.id = id;
        this.art = art;
        this.schwarz = schwarz;
        this.xPos = xPos;
        this.yPos = yPos;
        this.moved = false;
        Game.figuren[yPos][xPos] = this;
    }


    public String getId() {
        return id;
    }

    public char getArt() {
        return art;
    }

    public boolean isSchwarz() {
        return schwarz;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public boolean isMoved() {
        return moved;
    }

    public void setMoved(boolean moved) {
        this.moved = moved;
    }

    public void highlightFields() {
        Game.game[yPos][xPos].setBackgroundColor(Color.parseColor("#A3000DFF")); //TODO:Farbe austesten (hier blau transparent)
        switch(this.art){
            case 'k':
                highlightK();
                break;
            case 'd':
                highlightD();
                break;
            case 'b':
                if(this.schwarz){
                    highlightBlackB();
                }else{
                    highlightWhiteB();
                }
                break;
            case 'l':
                highlightL();
                break;
            case 's':
                highlightS();
                break;
            case 't':
                highlightT();
                break;
        }
    }

    public void highlightK(){
        checkField(this.xPos-1, this.yPos-1);
        checkField(this.xPos, this.yPos-1);
        checkField(this.xPos-1, this.yPos);
        checkField(this.xPos+1, this.yPos+1);
        checkField(this.xPos+1, this.yPos);
        checkField(this.xPos, this.yPos+1);
        checkField(this.xPos-1, this.yPos+1);
        checkField(this.xPos+1, this.yPos-1);
        //TODO: Rochade fehlt noch
    }

    public void highlightD(){
        highlightL();
        highlightT();
    }

    public void highlightBlackB(){
        if(Game.figuren[this.yPos+1][this.xPos] == null) {
            Game.game[this.yPos + 1][this.xPos].setBackgroundColor(Color.parseColor("#B4FFF200"));//TODO:Farbe austesten (hier gelb transparent)
            if(!this.moved && Game.figuren[this.yPos+2][this.xPos] == null){
                Game.game[this.yPos + 2][this.xPos].setBackgroundColor(Color.parseColor("#B4FFF200"));//TODO:Farbe austesten (hier gelb transparent)
            }
        }
        if(this.xPos <= 6 && this.xPos >= 1){
            if(!Game.figuren[yPos+1][this.xPos-1].schwarz){
                Game.game[yPos+1][this.xPos-1].setBackgroundColor(Color.parseColor("#7DFF0000"));//TODO:Farbe austesten (hier rot transparent)
            }
            if(!Game.figuren[yPos+1][this.xPos+1].schwarz){
                Game.game[yPos+1][this.xPos+1].setBackgroundColor(Color.parseColor("#7DFF0000"));//TODO:Farbe austesten (hier rot transparent)
            }
        }
        if(this.xPos == 0){
            if(!Game.figuren[yPos+1][this.xPos+1].schwarz){
                Game.game[yPos+1][this.xPos+1].setBackgroundColor(Color.parseColor("#7DFF0000"));//TODO:Farbe austesten (hier rot transparent)
            }
        }
        if(this.xPos == 7){
            if(!Game.figuren[yPos+1][this.xPos-1].schwarz){
                Game.game[yPos+1][this.xPos-1].setBackgroundColor(Color.parseColor("#7DFF0000"));//TODO:Farbe austesten (hier rot transparent)
            }
        }
        //TODO: En passant fehlt noch
    }

    public void highlightWhiteB(){
        if(Game.figuren[this.yPos-1][this.xPos] == null) {
            Game.game[this.yPos + 1][this.xPos].setBackgroundColor(Color.parseColor("#B4FFF200"));//TODO:Farbe austesten (hier gelb transparent)
            if(!this.moved && Game.figuren[this.yPos+2][this.xPos] == null){
                Game.game[this.yPos + 2][this.xPos].setBackgroundColor(Color.parseColor("#B4FFF200"));//TODO:Farbe austesten (hier gelb transparent)
            }
        }
        if(this.xPos <= 6 && this.xPos >= 1){
            if(Game.figuren[yPos-1][this.xPos-1].schwarz){
                Game.game[yPos-1][this.xPos-1].setBackgroundColor(Color.parseColor("#7DFF0000"));//TODO:Farbe austesten (hier rot transparent)
            }
            if(Game.figuren[yPos-1][this.xPos+1].schwarz){
                Game.game[yPos-1][this.xPos+1].setBackgroundColor(Color.parseColor("#7DFF0000"));//TODO:Farbe austesten (hier rot transparent)
            }
        }
        if(this.xPos == 0){
            if(Game.figuren[yPos-1][this.xPos+1].schwarz){
                Game.game[yPos-1][this.xPos+1].setBackgroundColor(Color.parseColor("#7DFF0000"));//TODO:Farbe austesten (hier rot transparent)
            }
        }
        if(this.xPos == 7){
            if(Game.figuren[yPos-1][this.xPos-1].schwarz){
                Game.game[yPos-1][this.xPos-1].setBackgroundColor(Color.parseColor("#7DFF0000"));//TODO:Farbe austesten (hier rot transparent)
            }
        }
        //TODO: En passant fehlt noch
    }

    public void highlightL(){
        for(int x = this.xPos-1, y = this.yPos-1; x >= 0 && y >= 0; y--, x--){
            checkField(x, y);
            if(Game.figuren[y][x] != null){
                break;
            }
        }
        for(int x = this.xPos+1, y = this.yPos-1; x <= 7 && y >= 0; y--, x++){
            checkField(x, y);
            if(Game.figuren[y][x] != null){
                break;
            }
        }
        for(int x = this.xPos+1, y = this.yPos+1; x <= 7 && y <= 7; y++, x++){
            checkField(x, y);
            if(Game.figuren[y][x] != null){
                break;
            }
        }
        for(int x = this.xPos-1, y = this.yPos+1; x >= 0 && y <= 7; y++, x--){
            checkField(x, y);
            if(Game.figuren[y][x] != null){
                break;
            }
        }
    }

    public void highlightS(){
        checkField(this.xPos-1, this.yPos-2);
        checkField(this.xPos-2, this.yPos-1);
        checkField(this.xPos+1, this.yPos-2);
        checkField(this.xPos+2, this.yPos-1);
        checkField(this.xPos-1, this.yPos+2);
        checkField(this.xPos-2, this.yPos+1);
        checkField(this.xPos+1, this.yPos+2);
        checkField(this.xPos+2, this.yPos+1);
    }

    public void highlightT(){
        for(int x = this.xPos-1; x >= 0; x--){
            checkField(x, this.yPos);
            if(Game.figuren[this.yPos][x] != null){
                break;
            }
        }
        for(int x = this.xPos+1; x <= 7; x++){
            checkField(x, this.yPos);
            if(Game.figuren[this.yPos][x] != null){
                break;
            }
        }
        for(int y = this.yPos-1; y >= 0; y--){
            checkField(this.xPos, y);
            if(Game.figuren[y][this.xPos] != null){
                break;
            }
        }
        for(int y = this.yPos+1; y <= 7; y++){
            checkField(this.xPos, y);
            if(Game.figuren[y][this.xPos] != null){
                break;
            }
        }
    }

    public void checkField(int x, int y){
        if(x > 7 || x < 0 || y > 7 || y < 0){
            return;
        }else{
            if(Game.figuren[y][x] == null){
                Game.game[y][x].setBackgroundColor(Color.parseColor("#B4FFF200"));//TODO:Farbe austesten (hier gelb transparent)
            }else{
                if(Game.figuren[y][x].isSchwarz() != this.isSchwarz()){
                    Game.game[y][x].setBackgroundColor(Color.parseColor("#7DFF0000"));//TODO:Farbe austesten (hier rot transparent)
                }
            }
        }
    }
}
