package com.company;

public class Song extends MusicComponent{
    String name;
    String bandName;
    int releaseDate;

    public Song(String name, String bandName, int releaseDate) {
        this.name = name;
        this.bandName = bandName;
        this.releaseDate = releaseDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBandName() {
        return bandName;
    }

    @Override
    public Integer getReleaseDate() {
        return releaseDate;
    }

    @Override
    public void print() {
        System.out.println(name +"was recorded by "+bandName+" in "+releaseDate);
    }
}
