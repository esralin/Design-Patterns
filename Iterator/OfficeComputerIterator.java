package com.company;

import java.util.ArrayList;

public class OfficeComputerIterator implements Iterator{
    Computer[] computers;
    int position = 0;

    public OfficeComputerIterator(Computer[] computer) {
        this.computers = computer;
    }

    @Override
    public boolean hasNext() {
      if(position >= computers.length || computers[position] == null){
          return false;
      }
      else
          return true;
    }

    @Override
    public Computer next() {
        Computer computerItem = computers[position];
        position = position + 1;
        return computerItem;
    }
}
