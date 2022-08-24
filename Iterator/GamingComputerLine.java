package com.company;

import java.util.ArrayList;

public class GamingComputerLine {
    ArrayList<Computer> computers;

    public GamingComputerLine() {
        computers = new ArrayList<Computer>();

        addItem("GamingComputer","high-end multi-core cpu", "high clock speed memory","ssd storage");
    }

    public void addItem(String name,String cpu, String memory, String storage){
        Computer computer = new Computer(name,cpu,memory,storage);
        computers.add(computer);
    }

    public Iterator createIterator(){
        return new GamingComputerIterator(computers);
    }
}
