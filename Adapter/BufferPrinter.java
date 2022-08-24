package com.company;

public class BufferPrinter {

    public void printBuffer(String text) {
        char[] ch = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            ch[i] = text.charAt(i);
        }
        System.out.println(ch);
    }
}
