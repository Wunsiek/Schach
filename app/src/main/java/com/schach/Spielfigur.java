package com.schach;

public class Spielfigur {

    private String id; //Setzt sich zusammen aus s/w + k/d/l.. + nummerierung
    private char art; //k = König, d = Dame, b = Bauer, l = Läufer, s = Springer, t = Turm
    private boolean schwarz; //true = schwarz, false = weiß
    private int xPos; //0 ist links, 7 ist rechts
    private int yPos; //0 ist oben, 7 ist unten
    private boolean moved;

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
        //Game.game[yPos][xPos].set
    }
}
