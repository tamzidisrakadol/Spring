package com.example.learnspringframework.App01;

public class PacMan implements GamingConsole{

    @Override
    public void up() {
       System.out.println("Pac man Up");
    }

    @Override
    public void down() {
       System.out.println("Pac man down");
    }


    
}
