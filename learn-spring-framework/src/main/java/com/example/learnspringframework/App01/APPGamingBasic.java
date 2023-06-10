package com.example.learnspringframework.App01;

public class APPGamingBasic{

    public static void main(String[] args) {
       // var marioGame = new MarioGame();
        PacMan pacMan = new PacMan();
        var  runner = new GameRunner(pacMan);
        runner.run();
    
    }
}




/* the game runner class is tightly coupled to Mariogame class so if we have to changed then we have to change GamerRunner class contructor first 
     coupling is even more important in building a great software.
    creating a interface helps the Gamerunner class to loss coupling now i can pass any Game if its implemented with interface class
*/