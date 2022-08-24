package com.company;

public class OfficeComputerLine {
    static final int MAX_COMP = 5;
    int numberOfComp = 0;
    Computer[] computers;

    public OfficeComputerLine() {
        computers = new Computer[MAX_COMP];

        addItem("OfficeComputer", "low-end dual core cpu","energy efficient memory","energy efficient hdd");
    }

    public void addItem(String name, String cpu, String memory, String storage){
        Computer computer = new Computer(name,cpu,memory,storage);
        if(numberOfComp >= MAX_COMP){
            System.out.println("Sorry! It is full.");
        }
        else{
            computers[numberOfComp] = computer;
            numberOfComp = numberOfComp + 1;
        }
    }

    public Iterator createIterator(){
        return new OfficeComputerIterator(computers);
    }

}
