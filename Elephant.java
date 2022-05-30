import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    public Elephant()
    {
        GreenfootImage image = new GreenfootImage("images/elephant_idle/idle0.png");
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("d")){
            move(3);
        }
        if(Greenfoot.isKeyDown("a")){
            move(-3);
        }
        
        // check if we eat an apple
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnApple();
        }
    }
}
