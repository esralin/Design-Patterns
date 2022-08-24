package com.company;

public class Main {

    public static void main(String[] args) {
	GamingComputerLine gamingComputer = new GamingComputerLine();
    OfficeComputerLine officeComputer = new OfficeComputerLine();

    ComputerBuildLine computerBuild = new ComputerBuildLine(gamingComputer,officeComputer);
    computerBuild.runLine();
    }
}
