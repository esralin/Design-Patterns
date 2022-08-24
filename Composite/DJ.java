package com.company;

public class DJ {
    MusicComponent allMusics;

    public DJ(MusicComponent allMusics) {
        this.allMusics = allMusics;
    }

    public void printMusic(){
        allMusics.print();
    }
}
