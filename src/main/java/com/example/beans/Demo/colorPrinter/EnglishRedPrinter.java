package com.example.beans.Demo.colorPrinter;

import com.example.beans.Demo.colorPrinterInterface.RedPrinter;

public class EnglishRedPrinter implements RedPrinter {
    @Override
    public String print(){
        return "red";
    }
}
