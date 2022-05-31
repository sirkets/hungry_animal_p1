import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    private boolean isFacingRight = true;
    GreenfootImage rightImage;
    GreenfootImage leftImage;
    
    public Elephant()
    {
        rightImage = new GreenfootImage("images/elephant_idle/idle0.png");
        rightImage.scale(100,100);
        leftImage = new GreenfootImage("images/elephant_idle/idle0.png");
        leftImage.scale(100,100);
        leftImage.mirrorHorizontally();
        setImage(rightImage);
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("d")){
            isFacingRight = true;
            move(3);
        }
        if(Greenfoot.isKeyDown("a")){
            isFacingRight = false;
            move(-3);
        }
        
        if(isFacingRight){
            setImage(rightImage);
        } else {
            setImage(leftImage);
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
