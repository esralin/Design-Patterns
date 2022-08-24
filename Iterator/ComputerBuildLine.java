package com.company;

public class ComputerBuildLine {
    GamingComputerLine gamingComputerLine;
    OfficeComputerLine officeComputerLine;

    public ComputerBuildLine(GamingComputerLine gamingComputerLine, OfficeComputerLine officeComputerLine) {
        this.gamingComputerLine = gamingComputerLine;
        this.officeComputerLine = officeComputerLine;
    }

    public void runLine(){
        Iterator gamingItertator = gamingComputerLine.createIterator();
        Iterator officeIterator = officeComputerLine.createIterator();

        System.out.println("GAMING COMPUTER");
        buildComputer(gamingItertator);
        System.out.println("\n");
        System.out.println("OFFICE COMPUTER");
        buildComputer(officeIterator);

    }


    private void buildComputer(Iterator iterator){
        while(iterator.hasNext()){
            Computer computer = (Computer) iterator.next();
            System.out.println(computer.getName()+", ");
            System.out.println(computer.getCpu()+", ");
            System.out.println(computer.getMemory()+", ");
            System.out.println(computer.getStorage());
        }

    }
}
