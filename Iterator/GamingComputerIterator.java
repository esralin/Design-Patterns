package com.company;

import java.util.ArrayList;

public class GamingComputerIterator implements Iterator{
    ArrayList<Computer> computers;
    int position=0;

    public GamingComputerIterator(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    @Override
    public boolean hasNext() {
       if(position >= computers.size()){
           return false;
       }
       else{
           return true;
       }
    }

    @Override
    public Computer next() {
        Computer computerItem = computers.get(position);
        position = position +1;
        return computerItem;
    }
}
