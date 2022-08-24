package com.company;

public class Main {

    public static void main(String[] args) {

	MusicComponent jazzMusic = new MusicGenre("Jazz is a music genre that originated in the African-American communities of New Orleans, Louisiana, United States in the late 19th and early 20th centuries, with its roots in blues and ragtime.");
    MusicComponent indieMusic = new MusicGenre("Indie rock is a genre of rock music that originated in the United States and United Kingdom in the 1970s.");
    MusicComponent rbMusic = new MusicGenre("R&B [Rhythm and blues] is a genre of popular music that originated in African-American communities in the 1940s.");

    MusicComponent allMusics = new MusicGenre("Song List Every Song Available");

    allMusics.add(jazzMusic);
    allMusics.add(indieMusic);
    allMusics.add(rbMusic);


    jazzMusic.add(new Song("Take the A Train ","Duke Ellington",1940));
    jazzMusic.add(new Song("So What was ","Miles Davis",1959));

    indieMusic.add(new Song("When The Sun Goes Down ","Arctic Monkeys",2006));
    indieMusic.add(new Song("Obstacle 1 ","Interpol",2002));

    rbMusic.add(new Song("No Diggity ","BlackStreet",1996));
    rbMusic.add(new Song("Can't Feel My Face ","The Weekend",2015));

    DJ dj = new DJ(allMusics);

    dj.printMusic();


    }
}
