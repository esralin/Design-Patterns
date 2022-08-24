package com.company;

public class Computer {
    String name;
    String cpu;
    String memory;
    String storage;

    public Computer(String name,String cpu, String memory, String storage) {
        this.name = name;
        this.cpu = cpu;
        this.memory = memory;
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMemory() {
        return memory;
    }

    public String getStorage() {
        return storage;
    }
}

