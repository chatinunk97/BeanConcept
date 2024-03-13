package com.example.beans.Demo.config;

import com.example.beans.Demo.ColorPrinterImpl;
import com.example.beans.Demo.colorPrinter.EnglishRedPrinter;
import com.example.beans.Demo.colorPrinterInterface.RedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrintConfig {
    @Bean
    public RedPrinter redPrinter(){
        return new EnglishRedPrinter();
    }

}
