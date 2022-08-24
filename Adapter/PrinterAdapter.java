package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrinterAdapter implements Printer{
    BufferPrinter bufferPrinter;
    CharPrinter charPrinter;
    


    @Override
    public void Display() {
        try
        {

            String text;
            String type;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter your text: ");
            text = bufferedReader.readLine();
            System.out.println("\n");
            System.out.print("Enter printer type: ");
            type = bufferedReader.readLine();
            System.out.println("Printing...");

            if(type == "char"){
                charPrinter.printChar(text);
            }

            if(type == "buffer"){
                bufferPrinter.printBuffer(text);
            }


        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
