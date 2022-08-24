package com.company;

public abstract class MusicComponent {

    public void add(MusicComponent musicComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(MusicComponent musicComponent){
        throw new UnsupportedOperationException();
    }

    public MusicComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getBandName(){
        throw new UnsupportedOperationException();
    }

    public Integer getReleaseDate(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }


}
