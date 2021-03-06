import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);

        Elephant e = new Elephant();
        addObject(e, 300, 350);

        
        scoreLabel = new Label(score, 80);
        addObject(scoreLabel, 50, 50);

        spawnApple();

    }

    public void spawnApple(){
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }

    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
    }

    public void gameOver(){
        Label gameOverLabel = new Label("Game Over!", 80);
        addObject(gameOverLabel, 300, 200);
    }
}
