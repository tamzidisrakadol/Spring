package com.example.learnspringframework.App01;

public class GameRunner {

    GamingConsole game;


    public GameRunner(GamingConsole game){
        this.game = game;
    }

    public void run(){
        System.out.println("This is GameRunenr class");
        game.down();
        game.up();
        
    }
    
}
