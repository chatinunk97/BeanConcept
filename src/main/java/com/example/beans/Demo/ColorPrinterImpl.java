package com.example.beans.Demo;

import com.example.beans.Demo.colorPrinterInterface.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColorPrinterImpl {
    private final RedPrinter redPrinter;

    public ColorPrinterImpl(RedPrinter redPrinter) {
        this.redPrinter = redPrinter;
    }

    public String print(){
        return redPrinter.print();
    }
}
